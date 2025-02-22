package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lwjgl.input.Mouse;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketMGFire;
import com.flansmod.common.network.PacketMGMount;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

public class EntityMG extends Entity implements IEntityAdditionalSpawnData
{
	public int blockX, blockY, blockZ;
	public int direction;
	public GunType type;
	public ItemStack ammo = ItemStack.EMPTY.copy();
	public int reloadTimer;
	public int soundDelay;
	public float shootDelay;
	public static List<EntityMG> mgs = new ArrayList<>();
	public EntityPlayer gunner;
	//Server side
	public boolean isShooting;
	//Client side
	public boolean wasShooting = false;
	
	public int ticksSinceUsed = 0;
	
	public EntityMG(World world)
	{
		super(world);
		setSize(1.0F, 1.0F);
		ignoreFrustumCheck = true;
	}
	
	public EntityMG(World world, int x, int y, int z, int dir, GunType gunType)
	{
		super(world);
		setSize(1.0F, 1.0F);
		blockX = x;
		blockY = y;
		blockZ = z;
		prevPosX = x + 0.5D;
		prevPosY = y;
		prevPosZ = z + 0.5D;
		setPosition(x + 0.5D, y, z + 0.5D);
		direction = dir;
		rotationYaw = 0;
		rotationPitch = -60;
		type = gunType;
		ignoreFrustumCheck = true;
		mgs.add(this);
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		prevPosX = posX = blockX + 0.5f;
		prevPosY = posY = blockY;
		prevPosZ = posZ = blockZ + 0.5f;
		
		ticksSinceUsed++;
		if(TeamsManager.mgLife > 0 && ticksSinceUsed > TeamsManager.mgLife * 20)
		{
			setDead();
		}
		if(world.getBlockState(new BlockPos(blockX, blockY - 1, blockZ)).getBlock() == Blocks.AIR)
		{
			if(!world.isRemote)
			{
				setDead();
			}
		}
		prevRotationYaw = rotationYaw;
		prevRotationPitch = rotationPitch;
		if(gunner != null)
		{
			ticksSinceUsed = 0;
			rotationYaw = gunner.rotationYaw - direction * 90;
			for(; rotationYaw < -180; rotationYaw += 360)
			{
			}
			for(; rotationYaw > 180; rotationYaw -= 360)
			{
			}
			rotationPitch = gunner.rotationPitch;
			// Keep it within reasonable angles
			if(rotationYaw > type.sideViewLimit)
				prevRotationYaw = rotationYaw = type.sideViewLimit;
			if(rotationYaw < -type.sideViewLimit)
				prevRotationYaw = rotationYaw = -type.sideViewLimit;
			
			// Keep user standing behind the gun
			float angle = direction * 90F + rotationYaw;
			double dX = (type.standBackDist * Math.sin(angle * 3.1415926535F / 180F));
			double dZ = -(type.standBackDist * Math.cos(angle * 3.1415926535F / 180F));
			gunner.setPosition((blockX + 0.5D + dX), blockY - 1.0d, (blockZ + 0.5D + dZ));
			// gunner.setPosition((double)(blockX + (direction == 1 ? 1 : 0) -
			// (direction == 3 ? 1 : 0)) + 0.5D, blockY + gunner.getYOffset() -
			// 0.5D, (double)(blockZ - (direction == 0 ? 1 : 0) + (direction ==
			// 2 ? 1 : 0)) + 0.5D);
		}
		else
		{
			rotationPitch--;
		}
		
		if(rotationPitch < -type.topViewLimit)
			rotationPitch = -type.topViewLimit;
		if(rotationPitch > type.bottomViewLimit)
			rotationPitch = type.bottomViewLimit;
		
		if(shootDelay > 0)
			shootDelay--;
		
		// Decrement the reload timer and reload
		if(reloadTimer > 0)
			reloadTimer--;
		if(!ammo.isEmpty() && ammo.getItemDamage() == ammo.getMaxDamage())
		{
			ammo = ItemStack.EMPTY.copy();
			// Scrap metal output?
		}
		if(ammo.isEmpty() && gunner != null)
		{
			int slot = findAmmo(gunner);
			if(slot >= 0)
			{
				ammo = gunner.inventory.getStackInSlot(slot);
				if(!gunner.capabilities.isCreativeMode)
					gunner.inventory.setInventorySlotContents(slot, ItemStack.EMPTY.copy());
				reloadTimer = type.reloadTime;
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.reloadSound, false);
			}
		}
		if(world.isRemote && gunner != null && gunner == FMLClientHandler.instance().getClient().player && type.mode == EnumFireMode.FULLAUTO)
		{
			//Send a packet!
			checkForShooting();
		}
		if(!world.isRemote && isShooting)
		{
			fire();
		}
		if(soundDelay > 0)
			soundDelay--;
	}
	
	@SideOnly(Side.CLIENT)
	private void checkForShooting()
	{
		if(Mouse.isButtonDown(0) && !wasShooting && !FlansMod.proxy.isScreenOpen())
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(true));
			wasShooting = true;
		}
		else if(!Mouse.isButtonDown(0) && wasShooting)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(false));
			wasShooting = false;
		}
	}
	
	//Server side setter to be called upon receiving a packet
	public void mouseHeld(boolean held)
	{
		isShooting = held;
	}
	
	private void fire()
	{
		if(gunner == null || gunner.isDead)
			isShooting = false;
		// Check for ammo / reloading
		if(ammo.isEmpty() || reloadTimer > 0 || shootDelay > 0)
		{
			return;
		}
		// Fire
		BulletType bullet = BulletType.getBullet(ammo.getItem());
		ShootBulletHandler handler = isExtraBullet ->
		{
			if(gunner != null && !gunner.capabilities.isCreativeMode)
				ammo.damageItem(1, gunner);
		};
		shootDelay = type.shootDelay;
		ItemShootable shootableItem = (ItemShootable)ammo.getItem();
		ShootableType shootableType = shootableItem.type;


		Double radianYaw = Math.toRadians(direction * 90F + rotationYaw);
		Double radianPitch = Math.toRadians(rotationPitch);
		Vector3f shootingDirection = new Vector3f(-Math.sin(radianYaw), -Math.sin(radianPitch), Math.cos(radianYaw));
		Vector3f position = new Vector3f(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D);

		FireableGun gun = new FireableGun(type, type.damage, type.bulletSpread, type.bulletSpeed, type.spreadPattern);
		FiredShot shot = new FiredShot(gun, bullet, shootingDirection.toVec3(), this, (EntityPlayerMP) gunner);
		ShotHandler.fireGun(world, shot, type.numBullets*shootableType.numBullets, position, handler);
		
		if(soundDelay <= 0)
		{
			soundDelay = type.shootSoundLength;
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound, type.distortSound);
		}
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if(damagesource.damageType.equals("player"))
		{
			Entity player = damagesource.getTrueSource();
			if(player == gunner)
			{
				// Player left clicked on the gun
				if(type.mode == EnumFireMode.FULLAUTO)
					return true;
				
				fire();
			}
			else if(gunner != null)
			{
				return gunner.attackEntityFrom(damagesource, i);
			}
			else if(TeamsManager.canBreakGuns)
			{
				setDead();
			}
		}
		return true;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		// Player right clicked on gun
		// Mount gun
		if(gunner != null && gunner != player)
		{
			return true;
		}
		if(!world.isRemote)
		{
			//If this is the player currently using this MG, dismount
			if(gunner == player)
			{
				mountGun(player, false);
				FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, false), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
				return true;
			}
			
			//If this person is already mounting a gun, dismount it first
			if(PlayerHandler.getPlayerData(player).mountingGun != null && !PlayerHandler.getPlayerData(player).mountingGun.isDead)
			{
				PlayerHandler.getPlayerData(player).mountingGun.mountGun(player, false);
				return true;
			}
			
			//Spectators can't mount guns
			if(TeamsManager.instance.currentRound != null && PlayerHandler.getPlayerData(player).team == Team.spectators)
				return true;
			
			//None of the above applied, so mount the gun
			mountGun(player, true);
			FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, true), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			if(ammo.isEmpty())
			{
				int slot = findAmmo(player);
				if(slot >= 0)
				{
					ammo = player.inventory.getStackInSlot(slot).splitStack(1);
					reloadTimer = type.reloadTime;
					playSound(FlansModResourceHandler.getSoundEvent(type.reloadSound), 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
			
		}
		return true;
	}
	
	public void mountGun(EntityPlayer player, boolean mounting)
	{
		if(player == null)
			return;
		Side side = world.isRemote ? Side.CLIENT : Side.SERVER;
		if(PlayerHandler.getPlayerData(player, side) == null)
			return;
		if(mounting)
		{
			gunner = player;
			PlayerHandler.getPlayerData(player, side).mountingGun = this;
		}
		else
		{
			PlayerHandler.getPlayerData(player, side).mountingGun = null;
			gunner = null;
		}
	}
	
	public int findAmmo(EntityPlayer player)
	{
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if(type.isCorrectAmmo(stack))
			{
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void setDead()
	{
		// Drop gun
		if(!world.isRemote)
		{
			if(TeamsManager.weaponDrops == 2)
			{
				EntityGunItem gunEntity = new EntityGunItem(world, posX, posY, posZ, new ItemStack(type.getItem()), Arrays.asList(ammo));
				world.spawnEntity(gunEntity);
			}
			else if(TeamsManager.weaponDrops == 1)
			{
				dropItem(type.getItem(), 1);
				// Drop ammo box
				if(!ammo.isEmpty())
					entityDropItem(ammo, 0.5F);
			}
		}
		if(gunner != null && PlayerHandler.getPlayerData(gunner) != null)
			PlayerHandler.getPlayerData(gunner).mountingGun = null;
		
		super.setDead();
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setString("Type", type.shortName);
		nbttagcompound.setTag("Ammo", ammo.writeToNBT(new NBTTagCompound()));
		nbttagcompound.setInteger("BlockX", blockX);
		nbttagcompound.setInteger("BlockY", blockY);
		nbttagcompound.setInteger("BlockZ", blockZ);
		nbttagcompound.setByte("Dir", (byte)direction);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		type = GunType.getGun(nbttagcompound.getString("Type"));
		blockX = nbttagcompound.getInteger("BlockX");
		blockY = nbttagcompound.getInteger("BlockY");
		blockZ = nbttagcompound.getInteger("BlockZ");
		direction = nbttagcompound.getByte("Dir");
		ammo = new ItemStack(nbttagcompound.getCompoundTag("Ammo"));
	}
	
	@Override
	protected void entityInit()
	{
	}
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, type.shortName);
		data.writeInt(direction);
		data.writeInt(blockX);
		data.writeInt(blockY);
		data.writeInt(blockZ);
		ByteBufUtils.writeItemStack(data, ammo);
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			type = GunType.getGun(ByteBufUtils.readUTF8String(data));
			direction = data.readInt();
			blockX = data.readInt();
			blockY = data.readInt();
			blockZ = data.readInt();
			ammo = ByteBufUtils.readItemStack(data);
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to retreive gun type from server.");
			super.setDead();
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		return new ItemStack(type.item, 1, 0);
	}
}
