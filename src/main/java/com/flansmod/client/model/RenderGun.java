package com.flansmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.vector.Vector3f;

public class RenderGun implements CustomItemRenderer
{
	private static TextureManager renderEngine;
	
	public static float smoothing;
	public static boolean bindTextures = true;
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data)
	{
		//Avoid any broken cases by returning
		if(!(item.getItem() instanceof ItemGun))
			return;
		
		GunType gunType = ((ItemGun)item.getItem()).GetType();
		if(gunType == null)
			return;
		
		ModelGun model = gunType.model;
		if(model == null)
			return;
		
		//Render main hand gun
		GunAnimations animations =
				(type == CustomItemRenderType.ENTITY || type == CustomItemRenderType.INVENTORY)
						? new GunAnimations()
						: FlansModClient.getGunAnimations((EntityLivingBase)data[1], hand);
		renderGun(type, item, gunType, animations, hand, data);
	}
	
	//Render off-hand gun in 3rd person
	public void renderOffHandGun(EntityPlayer player, ItemStack offHandItemStack)
	{
		GunAnimations animations = FlansModClient.gunAnimationsLeft.get(player);
		if(animations == null)
		{
			animations = new GunAnimations();
			FlansModClient.gunAnimationsLeft.put(player, animations);
		}
		GunType offHandGunType = ((ItemGun)offHandItemStack.getItem()).GetType();
		renderGun(CustomItemRenderType.INVENTORY, offHandItemStack, offHandGunType, animations, EnumHand.OFF_HAND, player);
	}
	
	private void renderGun(CustomItemRenderType type, ItemStack item, GunType gunType, GunAnimations animations, EnumHand hand, Object... data)
	{
		//The model scale
		float f = 1F / 16F;
		ModelGun model = gunType.model;
		
		int flip = hand == EnumHand.OFF_HAND ? -1 : 1;
		
		GlStateManager.pushMatrix();
		{
			//Get the reload animation rotation
			float reloadRotate = 0F;
			
			//Setup transforms based on gun position
			switch(type)
			{
				case ENTITY:
				{
					//EntityItem entity = (EntityItem)data[1];
					//GlStateManager.rotate(entity.getAge() + (entity.getAge() == 0 ? 0 : smoothing), 0F, 1F, 0F);
					GlStateManager.translate(-0.45F + model.itemFrameOffset.x, -0.05F + model.itemFrameOffset.y, model.itemFrameOffset.z);
					break;
				}
				case INVENTORY:
				{
					GlStateManager.translate(model.itemFrameOffset.x, model.itemFrameOffset.y, model.itemFrameOffset.z);
					break;
				}
				case EQUIPPED:
				{
					if(hand == EnumHand.OFF_HAND)
					{
						GlStateManager.rotate(-70F, 1F, 0F, 0F);
						GlStateManager.rotate(48F, 0F, 0F, 1F);
						GlStateManager.rotate(105F, 0F, 1F, 0F);
						GlStateManager.translate(-0.1F, -0.22F, -0.15F);
					}
					else
					{
						GlStateManager.rotate(90F, 0F, 0F, 1F);
						GlStateManager.rotate(-90F, 1F, 0F, 0F);
						GlStateManager.translate(0.2F, 0.05F, -0F);
						GlStateManager.scale(1F, 1F, -1F);
					}
					GlStateManager.translate(model.thirdPersonOffset.x, model.thirdPersonOffset.y, model.thirdPersonOffset.z);
					/*
					if(animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress < gunType.meleePath.size()) 
					{
						Vector3f meleePos = gunType.meleePath.get(animations.meleeAnimationProgress);
						Vector3f nextMeleePos = animations.meleeAnimationProgress + 1 < gunType.meleePath.size() ? gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new Vector3f();
						GlStateManager.translate(meleePos.x + (nextMeleePos.x - meleePos.x) * smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * smoothing, meleePos.z + (nextMeleePos.z - meleePos.z) * smoothing);
					}
					*/
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					IScope scope = gunType.getCurrentScope(item);
					if(FlansModClient.zoomProgress > 0.9F && scope.hasZoomOverlay() && scope.overlayUnrendersGun())
					{
						GlStateManager.popMatrix();
						return;
					}
					float adsSwitch = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;//0F;//((float)Math.sin((FlansMod.ticker) / 10F) + 1F) / 2F;
					
					if(hand == EnumHand.OFF_HAND)
					{
						GlStateManager.rotate(45F, 0F, 1F, 0F);
						GlStateManager.translate(-1F, 0.675F, -1.8F);
					}
					else
					{
						GlStateManager.rotate(45F, 0F, 1F, 0F);
						GlStateManager.rotate(0F - 5F * adsSwitch, 0F, 0F, 1F);
						
						GlStateManager.translate(-1F, 0.675F + 0.180F * adsSwitch, -1F - 0.395F * adsSwitch);
						if(gunType.hasScopeOverlay && gunType.overlayUnrendersGun())
							// Not entirely sure why this is here to be honest.
							// Seems to only run in cases when the gun doesn't actually render
							GlStateManager.translate(-0.7F * adsSwitch, -0.12F * adsSwitch, -0.05F * adsSwitch);
						GlStateManager.rotate(4.5F * adsSwitch, 0F, 0F, 1F);
						GlStateManager.translate(0F, -0.03F * adsSwitch, 0F);
					}
					
					if(animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress < gunType.meleePath.size())
					{
						Vector3f meleePos = gunType.meleePath.get(animations.meleeAnimationProgress);
						Vector3f nextMeleePos = animations.meleeAnimationProgress + 1 < gunType.meleePath.size() ? gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new Vector3f();
						GlStateManager.translate(meleePos.x + (nextMeleePos.x - meleePos.x) * smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * smoothing, meleePos.z + (nextMeleePos.z - meleePos.z) * smoothing);
						Vector3f meleeAngles = gunType.meleePathAngles.get(animations.meleeAnimationProgress);
						Vector3f nextMeleeAngles = animations.meleeAnimationProgress + 1 < gunType.meleePathAngles.size() ? gunType.meleePathAngles.get(animations.meleeAnimationProgress + 1) : new Vector3f();
						GlStateManager.rotate(meleeAngles.y + (nextMeleeAngles.y - meleeAngles.y) * smoothing, 0F, 1F, 0F);
						GlStateManager.rotate(meleeAngles.z + (nextMeleeAngles.z - meleeAngles.z) * smoothing, 0F, 0F, 1F);
						GlStateManager.rotate(meleeAngles.x + (nextMeleeAngles.x - meleeAngles.x) * smoothing, 1F, 0F, 0F);
					}
					
					// Look at gun stuff
					float interp = animations.lookAtTimer + smoothing;
					interp /= animations.lookAtTimes[animations.lookAt.ordinal()];
					
					final Vector3f idlePos = new Vector3f(0.0f, 0.0f, 0.0f);
					final Vector3f look1Pos = new Vector3f(0.25f, 0.25f, 0.0f);
					final Vector3f look2Pos = new Vector3f(0.25f, 0.25f, -0.5f);
					final Vector3f idleAngles = new Vector3f(0.0f, 0.0f, 0.0f);
					final Vector3f look1Angles = new Vector3f(0.0f, 70.0f, 0.0f);
					final Vector3f look2Angles = new Vector3f(0.0f, -60.0f, 60.0f);
					Vector3f startPos, endPos, startAngles, endAngles;
					
					switch(animations.lookAt)
					{
						default:
						case NONE:
							startPos = endPos = idlePos;
							startAngles = endAngles = idleAngles;
							break;
						case LOOK1:
							startPos = endPos = look1Pos;
							startAngles = endAngles = look1Angles;
							break;
						case LOOK2:
							startPos = endPos = look2Pos;
							startAngles = endAngles = look2Angles;
							break;
						case TILT1:
							startPos = idlePos;
							startAngles = idleAngles;
							endPos = look1Pos;
							endAngles = look1Angles;
							break;
						case TILT2:
							startPos = look1Pos;
							startAngles = look1Angles;
							endPos = look2Pos;
							endAngles = look2Angles;
							break;
						case UNTILT:
							startPos = look2Pos;
							startAngles = look2Angles;
							endPos = idlePos;
							endAngles = idleAngles;
							break;
					}
					
					GlStateManager.rotate(startAngles.y + (endAngles.y - startAngles.y) * interp, 0f, 1f, 0f);
					GlStateManager.rotate(startAngles.z + (endAngles.z - startAngles.z) * interp, 0f, 0f, 1f);
					GlStateManager.translate(startPos.x + (endPos.x - startPos.x) * interp,
							startPos.y + (endPos.y - startPos.y) * interp,
							startPos.z + (endPos.z - startPos.z) * interp);
					
					
					//GlStateManager.rotate(70f, 0f, 1f, 0f);
					//GlStateManager.translate(0.25f, 0.25f, 0f);
					
					//GlStateManager.rotate(-60f, 0f, 1f, 0f);
					//GlStateManager.rotate(60f, 0f, 0f, 1f);
					//GlStateManager.translate(0.25f, 0.25f, -0.5f);
					
					GlStateManager.rotate(-animations.recoilAngle * (float)Math.sqrt(gunType.recoil.get(1).y) * 1.5f, 0F, 0F, 1F);
					GlStateManager.translate(animations.recoilOffset.x, animations.recoilOffset.y, animations.recoilOffset.z);
					
					if(model.spinningCocking)
					{
						GlStateManager.translate(model.spinPoint.x, model.spinPoint.y, model.spinPoint.z);
						float pumped = (animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing);
						GlStateManager.rotate(pumped * 180F + 180F, 0F, 0F, 1F);
						GlStateManager.translate(-model.spinPoint.x, -model.spinPoint.y, -model.spinPoint.z);
					}
					
					if(animations.reloading)
					{
						//Calculate the amount of tilt required for the reloading animation
						float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
						reloadRotate = 1F;
						if(effectiveReloadAnimationProgress < model.tiltGunTime)
							reloadRotate = effectiveReloadAnimationProgress / model.tiltGunTime;
						if(effectiveReloadAnimationProgress > model.tiltGunTime + model.unloadClipTime + model.loadClipTime)
							reloadRotate = 1F - (effectiveReloadAnimationProgress - (model.tiltGunTime + model.unloadClipTime + model.loadClipTime)) / model.untiltGunTime;
						
						//Rotate the gun dependent on the animation type
						switch(model.animationType)
						{
							case BOTTOM_CLIP: case PISTOL_CLIP: case SHOTGUN: case END_LOADED:
						{
							GlStateManager.rotate(60F * reloadRotate, 0F, 0F, 1F);
							GlStateManager.rotate(30F * reloadRotate * flip, 1F, 0F, 0F);
							GlStateManager.translate(0.25F * reloadRotate, 0F, 0F);
							break;
						}
							case BACK_LOADED:
							{
								GlStateManager.rotate(-75F * reloadRotate, 0F, 0F, 1F);
								GlStateManager.rotate(-30F * reloadRotate * flip, 1F, 0F, 0F);
								GlStateManager.translate(0.5F * reloadRotate, 0F, 0F);
								break;
							}
							case BULLPUP:
							{
								GlStateManager.rotate(70F * reloadRotate, 0F, 0F, 1F);
								GlStateManager.rotate(10F * reloadRotate * flip, 1F, 0F, 0F);
								GlStateManager.translate(0.5F * reloadRotate, -0.2F * reloadRotate, 0F);
								break;
							}
							case RIFLE:
							{
								GlStateManager.rotate(30F * reloadRotate, 0F, 0F, 1F);
								GlStateManager.rotate(-30F * reloadRotate * flip, 1F, 0F, 0F);
								GlStateManager.translate(0.5F * reloadRotate, 0F, -0.5F * reloadRotate);
								break;
							}
							case RIFLE_TOP: case REVOLVER:
						{
							GlStateManager.rotate(30F * reloadRotate, 0F, 0F, 1F);
							GlStateManager.rotate(10F * reloadRotate, 0F, 1F, 0F);
							GlStateManager.rotate(-10F * reloadRotate * flip, 1F, 0F, 0F);
							GlStateManager.translate(0.1F * reloadRotate, -0.2F * reloadRotate, -0.1F * reloadRotate);
							break;
						}
							case ALT_PISTOL_CLIP:
							{
								GlStateManager.rotate(60F * reloadRotate * flip, 0F, 1F, 0F);
								GlStateManager.translate(0.15F * reloadRotate, 0.25F * reloadRotate, 0F);
								break;
							}
							case STRIKER:
							{
								GlStateManager.rotate(-35F * reloadRotate * flip, 1F, 0F, 0F);
								GlStateManager.translate(0.2F * reloadRotate, 0F, -0.1F * reloadRotate);
								break;
							}
							case GENERIC:
							{
								//Gun reloads partly or completely off-screen.
								GlStateManager.rotate(45F * reloadRotate, 0F, 0F, 1F);
								GlStateManager.translate(-0.2F * reloadRotate, -0.5F * reloadRotate, 0F);
								break;
							}
							case CUSTOM:
							{
								GlStateManager.rotate(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
								GlStateManager.rotate(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
								GlStateManager.rotate(model.tiltGun * reloadRotate, 1F, 0F, 0F);
								GlStateManager.translate(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
								break;
							}
							default: break;
						}
					}
					break;
				}
				default: break;
			}
			
			renderGun(item, gunType, f, model, animations, reloadRotate);
		}
		GlStateManager.popMatrix();
	}
	
	/**
	 * Gun render method, seperated from transforms so that mecha renderer may also call this
	 */
	public void renderGun(ItemStack item, GunType type, float f, ModelGun model, GunAnimations animations, float reloadRotate)
	{
		//Make sure we actually have the renderEngine
		if(renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;
		
		//If we have no animation variables, use defaults
		if(animations == null)
			animations = GunAnimations.defaults;
		
		// Do we have a muzzle flash
		ModelMuzzleFlash mfModel = type.muzzleFlashModel;
		boolean renderMuzzleFlash = mfModel != null && animations.muzzleFlash > 0;
		
		//Get all the attachments that we may need to render
		AttachmentType scopeAttachment = type.getScope(item);
		AttachmentType barrelAttachment = type.getBarrel(item);
		AttachmentType stockAttachment = type.getStock(item);
		AttachmentType gripAttachment = type.getGrip(item);
		
		ItemStack scopeItemStack = type.getScopeItemStack(item);
		ItemStack barrelItemStack = type.getBarrelItemStack(item);
		ItemStack stockItemStack = type.getStockItemStack(item);
		ItemStack gripItemStack = type.getGripItemStack(item);
		
		ItemStack[] bulletStacks = new ItemStack[type.numAmmoItemsInGun];
		boolean empty = true;
		for(int i = 0; i < type.numAmmoItemsInGun; i++)
		{
			bulletStacks[i] = ((ItemGun)item.getItem()).getBulletItemStack(item, i);
			if(bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemBullet && bulletStacks[i].getItemDamage() < bulletStacks[i].getMaxDamage())
				empty = false;
		}
		
		//Load texture
		//renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(type.getPaintjob(item.getTagCompound().getString("Paint"))));
		Paintjob paintjob = type.getPaintjob(item.getItemDamage());
		if(bindTextures)
		{
			if(PaintableType.HasCustomPaintjob(item))
			{
				renderEngine.bindTexture(PaintableType.GetCustomPaintjobSkinResource(item));
			}
			else
			{
				renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(paintjob));
			}
		}
		
		if(scopeAttachment != null)
			GlStateManager.translate(0F, -scopeAttachment.model.renderOffset / 16F, 0F);
		
		//Render the gun and default attachment models
		GlStateManager.pushMatrix();
		{
			GlStateManager.scale(type.modelScale, type.modelScale, type.modelScale);
			
			model.renderGun(f);
			model.renderCustom(f, animations);
			if(scopeAttachment == null && !model.scopeIsOnSlide && !model.scopeIsOnBreakAction)
				model.renderDefaultScope(f);
			if(barrelAttachment == null)
				model.renderDefaultBarrel(f);
			if(stockAttachment == null)
				model.renderDefaultStock(f);
			if(gripAttachment == null && !model.gripIsOnPump)
				model.renderDefaultGrip(f);
			
			//Render various shoot / reload animated parts
			//Render the slide
			GlStateManager.pushMatrix();
			{
				GlStateManager.translate(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
				model.renderSlide(f);
				if(scopeAttachment == null && model.scopeIsOnSlide)
					model.renderDefaultScope(f);
			}
			GlStateManager.popMatrix();
			
			//Render the break action
			GlStateManager.pushMatrix();
			{
				GlStateManager.translate(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
				GlStateManager.rotate(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
				GlStateManager.translate(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
				model.renderBreakAction(f);
				if(scopeAttachment == null && model.scopeIsOnBreakAction)
					model.renderDefaultScope(f);
			}
			GlStateManager.popMatrix();
			
			//Render the pump-action handle
			GlStateManager.pushMatrix();
			{
				GlStateManager.translate(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
				model.renderPump(f);
				if(gripAttachment == null && model.gripIsOnPump)
					model.renderDefaultGrip(f);
			}
			GlStateManager.popMatrix();
			
			//Render the minigun barrels
			if(type.mode == EnumFireMode.MINIGUN)
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(model.minigunBarrelOrigin.x, model.minigunBarrelOrigin.y, model.minigunBarrelOrigin.z);
				GlStateManager.rotate(animations.minigunBarrelRotation, 1F, 0F, 0F);
				GlStateManager.translate(-model.minigunBarrelOrigin.x, -model.minigunBarrelOrigin.y, -model.minigunBarrelOrigin.z);
				model.renderMinigunBarrel(f);
				GlStateManager.popMatrix();
			}
			
			//Render the cocking handle
			
			//Render the revolver barrel
			GlStateManager.pushMatrix();
			{
				GlStateManager.translate(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
				GlStateManager.rotate(reloadRotate * model.revolverFlipAngle, 1F, 0F, 0F);
				GlStateManager.translate(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
				model.renderRevolverBarrel(f);
			}
			GlStateManager.popMatrix();
			
			//Render the clip
			GlStateManager.pushMatrix();
			{
				boolean shouldRender = true;
				//Check to see if the ammo should be rendered first
				switch(model.animationType)
				{
					case END_LOADED: case BACK_LOADED:
				{
					if(empty)
						shouldRender = false;
					break;
				}
					default: break;
				}
				//If it should be rendered, do the transformations required
				if(shouldRender && animations.reloading && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0)
				{
					//Calculate the amount of tilt required for the reloading animation
					float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
					float clipPosition = 0F;
					if(effectiveReloadAnimationProgress > model.tiltGunTime && effectiveReloadAnimationProgress < model.tiltGunTime + model.unloadClipTime)
						clipPosition = (effectiveReloadAnimationProgress - model.tiltGunTime) / model.unloadClipTime;
					if(effectiveReloadAnimationProgress >= model.tiltGunTime + model.unloadClipTime && effectiveReloadAnimationProgress < model.tiltGunTime + model.unloadClipTime + model.loadClipTime)
						clipPosition = 1F - (effectiveReloadAnimationProgress - (model.tiltGunTime + model.unloadClipTime)) / model.loadClipTime;
					
					float loadOnlyClipPosition = Math.max(0F, Math.min(1F, 1F - ((effectiveReloadAnimationProgress - model.tiltGunTime) / (model.unloadClipTime + model.loadClipTime))));
					
					//Rotate the gun dependent on the animation type
					switch(model.animationType)
					{
						case BREAK_ACTION:
						{
							GlStateManager.translate(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
							GlStateManager.rotate(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
							GlStateManager.translate(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
							GlStateManager.translate(-1F * clipPosition, 0F, 0F);
							break;
						}
						case REVOLVER:
						{
							GlStateManager.translate(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
							GlStateManager.rotate(reloadRotate * model.revolverFlipAngle, 1F, 0F, 0F);
							GlStateManager.translate(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
							GlStateManager.translate(-1F * clipPosition, 0F, 0F);
							break;
						}
						case BOTTOM_CLIP:
						{
							GlStateManager.rotate(-180F * clipPosition, 0F, 0F, 1F);
							GlStateManager.rotate(60F * clipPosition, 1F, 0F, 0F);
							GlStateManager.translate(0.5F * clipPosition, 0F, 0F);
							break;
						}
						case PISTOL_CLIP:
						{
							GlStateManager.rotate(-90F * clipPosition * clipPosition, 0F, 0F, 1F);
							GlStateManager.translate(0F, -1F * clipPosition, 0F);
							break;
						}
						case ALT_PISTOL_CLIP:
						{
							GlStateManager.rotate(5F * clipPosition, 0F, 0F, 1F);
							GlStateManager.translate(0F, -3F * clipPosition, 0F);
							break;
						}
						case SIDE_CLIP:
						{
							GlStateManager.rotate(180F * clipPosition, 0F, 1F, 0F);
							GlStateManager.rotate(60F * clipPosition, 0F, 1F, 0F);
							GlStateManager.translate(0.5F * clipPosition, 0F, 0F);
							break;
						}
						case BULLPUP:
						{
							GlStateManager.rotate(-150F * clipPosition, 0F, 0F, 1F);
							GlStateManager.rotate(60F * clipPosition, 1F, 0F, 0F);
							GlStateManager.translate(1F * clipPosition, -0.5F * clipPosition, 0F);
							break;
						}
						case P90:
						{
							GlStateManager.rotate(-15F * reloadRotate * reloadRotate, 0F, 0F, 1F);
							GlStateManager.translate(0F, 0.075F * reloadRotate, 0F);
							GlStateManager.translate(-2F * clipPosition, -0.3F * clipPosition, 0.5F * clipPosition);
							break;
						}
						case RIFLE:
						{
							float thing = clipPosition * model.numBulletsInReloadAnimation;
							int bulletNum = MathHelper.floor(thing);
							float bulletProgress = thing - bulletNum;
							
							GlStateManager.rotate(bulletProgress * 15F, 0F, 1F, 0F);
							GlStateManager.rotate(bulletProgress * 15F, 0F, 0F, 1F);
							GlStateManager.translate(bulletProgress * -1F, 0F, bulletProgress * 0.5F);
							
							break;
						}
						case RIFLE_TOP:
						{
							float thing = clipPosition * model.numBulletsInReloadAnimation;
							int bulletNum = MathHelper.floor(thing);
							float bulletProgress = thing - bulletNum;
							
							GlStateManager.rotate(bulletProgress * 55F, 0F, 1F, 0F);
							GlStateManager.rotate(bulletProgress * 95F, 0F, 0F, 1F);
							GlStateManager.translate(bulletProgress * -0.1F, bulletProgress * 1F, bulletProgress * 0.5F);
							
							break;
						}
						case SHOTGUN: case STRIKER:
					{
						float thing = clipPosition * model.numBulletsInReloadAnimation;
						int bulletNum = MathHelper.floor(thing);
						float bulletProgress = thing - bulletNum;
						
						GlStateManager.rotate(bulletProgress * -30F, 0F, 0F, 1F);
						GlStateManager.translate(bulletProgress * -0.5F, bulletProgress * -1F, 0F);
						
						break;
					}
						case CUSTOM:
						{
							GlStateManager.rotate(model.rotateClipVertical * clipPosition, 0F, 0F, 1F);
							GlStateManager.rotate(model.rotateClipHorizontal * clipPosition, 0F, 1F, 0F);
							GlStateManager.rotate(model.tiltClip * clipPosition, 1F, 0F, 0F);
							GlStateManager.translate(model.translateClip.x * clipPosition, model.translateClip.y * clipPosition, model.translateClip.z * clipPosition);
							break;
						}
						case END_LOADED:
						{
							//float bulletProgress = 1F;
							//if(effectiveReloadAnimationProgress > model.tiltGunTime)
							//	bulletProgress = 1F - Math.min((effectiveReloadAnimationProgress - model.tiltGunTime) / (model.unloadClipTime + model.loadClipTime), 1);
							
							
							float dYaw = (loadOnlyClipPosition > 0.5F ? loadOnlyClipPosition * 2F - 1F : 0F);
							
							
							GlStateManager.rotate(-45F * dYaw, 0F, 0F, 1F);
							GlStateManager.translate(-model.endLoadedAmmoDistance * dYaw, -0.5F * dYaw, 0F);
							
							float xDisplacement = (loadOnlyClipPosition < 0.5F ? loadOnlyClipPosition * 2F : 1F);
							
							GlStateManager.translate(model.endLoadedAmmoDistance * xDisplacement, 0F, 0F);
							
							/*
							GlStateManager.translate(1F * bulletProgress, -3F * bulletProgress, 0F);
							if(bulletProgress > 0.5F)
								GlStateManager.rotate(-90F * (bulletProgress * 2F), 0F, 0F, 1F);	
							
							if(bulletProgress < 0.5F)
							{
								GlStateManager.translate(-3F * (bulletProgress - 0.5F), 0F, 0F);
								
							}
							*/
							
							
							break;
						}
						case BACK_LOADED:
						{
							float dYaw = (loadOnlyClipPosition > 0.5F ? loadOnlyClipPosition * 2F - 1F : 0F);
							
							
							//GlStateManager.rotate(-45F * dYaw, 0F, 0F, 1F);
							GlStateManager.translate(model.endLoadedAmmoDistance * dYaw, -0.5F * dYaw, 0F);
							
							float xDisplacement = (loadOnlyClipPosition < 0.5F ? loadOnlyClipPosition * 2F : 1F);
							
							GlStateManager.translate(-model.endLoadedAmmoDistance * xDisplacement, 0F, 0F);
						}
						
						default: break;
					}
				}
				
				if(shouldRender)
					model.renderAmmo(f);
			}
			GlStateManager.popMatrix();
		}
		GlStateManager.popMatrix();
		
		//Render static attachments
		//Scope
		if(scopeAttachment != null)
		{
			GlStateManager.pushMatrix();
			{
				Paintjob scopepaintjob = scopeAttachment.getPaintjob(scopeItemStack.getItemDamage());
				renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(scopepaintjob));
				if(model.scopeIsOnBreakAction)
				{
					GlStateManager.translate(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
					GlStateManager.rotate(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
					GlStateManager.translate(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
				}
				GlStateManager.translate(model.scopeAttachPoint.x * type.modelScale, model.scopeAttachPoint.y * type.modelScale, model.scopeAttachPoint.z * type.modelScale);
				
				if(model.scopeIsOnSlide)
					GlStateManager.translate(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
				GlStateManager.scale(scopeAttachment.modelScale, scopeAttachment.modelScale, scopeAttachment.modelScale);
				ModelAttachment scopeModel = scopeAttachment.model;
				if(scopeModel != null)
					scopeModel.renderAttachment(f);
			}
			GlStateManager.popMatrix();
		}
		
		//Grip
		if(gripAttachment != null)
		{
			GlStateManager.pushMatrix();
			{
				Paintjob grippaintjob = gripAttachment.getPaintjob(gripItemStack.getItemDamage());
				renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(grippaintjob));
				GlStateManager.translate(model.gripAttachPoint.x * type.modelScale, model.gripAttachPoint.y * type.modelScale, model.gripAttachPoint.z * type.modelScale);
				if(model.gripIsOnPump)
					GlStateManager.translate(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
				GlStateManager.scale(gripAttachment.modelScale, gripAttachment.modelScale, gripAttachment.modelScale);
				ModelAttachment gripModel = gripAttachment.model;
				if(gripModel != null)
					gripModel.renderAttachment(f);
			}
			GlStateManager.popMatrix();
		}
		
		//Barrel
		if(barrelAttachment != null)
		{
			GlStateManager.pushMatrix();
			{
				Paintjob barrelpaintjob = barrelAttachment.getPaintjob(barrelItemStack.getItemDamage());
				renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(barrelpaintjob));
				GlStateManager.translate(model.barrelAttachPoint.x * type.modelScale, model.barrelAttachPoint.y * type.modelScale, model.barrelAttachPoint.z * type.modelScale);
				GlStateManager.scale(barrelAttachment.modelScale, barrelAttachment.modelScale, barrelAttachment.modelScale);
				ModelAttachment barrelModel = barrelAttachment.model;
				if(barrelModel != null)
					barrelModel.renderAttachment(f);
			}
			GlStateManager.popMatrix();
		}
		
		//Stock
		if(stockAttachment != null)
		{
			GlStateManager.pushMatrix();
			{
				Paintjob stockpaintjob = stockAttachment.getPaintjob(stockItemStack.getItemDamage());
				renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(stockpaintjob));
				GlStateManager.translate(model.stockAttachPoint.x * type.modelScale, model.stockAttachPoint.y * type.modelScale, model.stockAttachPoint.z * type.modelScale);
				GlStateManager.scale(stockAttachment.modelScale, stockAttachment.modelScale, stockAttachment.modelScale);
				ModelAttachment stockModel = stockAttachment.model;
				if(stockModel != null)
					stockModel.renderAttachment(f);
			}
			GlStateManager.popMatrix();
		}
		
		if(renderMuzzleFlash)
		{
			Vector3f mfPoint = model.muzzleFlashPoint;
			if(mfPoint == ModelGun.invalid)
			{
				mfPoint = model.barrelAttachPoint;
			}
			if(barrelAttachment != null)
			{
				Vector3f.add(model.barrelAttachPoint, barrelAttachment.model.muzzleFlashPoint, mfPoint);
			}
			
			GlStateManager.pushMatrix();
			{
				
				GlStateManager.disableLighting();
		        GlStateManager.enableBlend();
		        GlStateManager.disableAlpha();
		        GlStateManager.depthMask(false);
		        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
				 int i = 61680;
			        int j = i % 65536;
			        int k = i / 65536;
			        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
				GlStateManager.color(1f, 1f, 1f);
				renderEngine.bindTexture(mfModel.GetTexture());
				GlStateManager.translate(mfPoint.x * type.modelScale, mfPoint.y * type.modelScale, mfPoint.z * type.modelScale);
				mfModel.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f);
				GlStateManager.enableLighting();
				GlStateManager.disableBlend();
				GlStateManager.enableAlpha();
				GlStateManager.depthMask(true);
			}
			GlStateManager.popMatrix();
		}
	}
}
