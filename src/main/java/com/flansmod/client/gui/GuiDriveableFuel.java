package com.flansmod.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.FlansConfig;
import com.flansmod.common.driveables.fuel.InternalFuelTank;
import com.flansmod.common.driveables.fuel.LiquidFuelTank;
import com.flansmod.common.driveables.fuel.VehicleBattery;
import com.google.common.collect.Lists;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.EntityDriveable;


public class GuiDriveableFuel extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/planeFuel.png");

	public World world;
	public InventoryPlayer inventory;
	public EntityDriveable plane;
	private int anim = 0;
	private long lastTime;
	
	public GuiDriveableFuel(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane)
	{
		super(new ContainerDriveableMenu(inventoryplayer, world1, true, entPlane));
		plane = entPlane;
		ySize = 161;
		world = world1;
		inventory = inventoryplayer;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		if (plane.driveableData.fuelTank instanceof VehicleBattery) {
			fontRenderer.drawString(plane.getDriveableType().name + " - Charge", 6, 6, 0x404040);
		} else {
			fontRenderer.drawString(plane.getDriveableType().name + " - Fuel", 6, 6, 0x404040);
		}
		fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
	{
		long newTime = mc.world.getWorldInfo().getWorldTime();
		if(newTime > lastTime)
		{
			lastTime = newTime;
			if(newTime % 5 == 0)
				anim++;
		}
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

		mc.renderEngine.bindTexture(texture);

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		float fuelTankSize = plane.driveableData.fuelTank.getMaxFillLevel();
		float fuelInTank = plane.driveableData.fuelTank.getFillLevel();
		if(plane.fuelling)
			drawTexturedModalRect(j + 15, k + 44, 176 + 15 * (anim % 4), 0, 15, 16);
		if(fuelInTank < fuelTankSize / 8 && (anim % 4) > 1)
			drawTexturedModalRect(j + 16, k + 25, 176, 16, 6, 6);
		if(fuelInTank > 0)
			drawTexturedModalRect(j + 26, k + 21, 0, 161, (int)((129 * fuelInTank) / fuelTankSize), 15);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);

		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;

		InternalFuelTank fuelTank = plane.driveableData.fuelTank;
		int fuelInTank = (int)fuelTank.getFillLevel();
		int fuelTankSize = (int)fuelTank.getMaxFillLevel();
		if (mouseX >= i + 26 && mouseX <= i + 155 && mouseY >= j + 21 && mouseY <= j + 36)
		{
			List<String> lines = new ArrayList<>();
			if (fuelTank instanceof LiquidFuelTank)
			{
				lines.add(String.format("%d / %d mb", fuelInTank, fuelTankSize));
			}
			else
			{
				lines.add(String.format("%d / %d RF", fuelInTank, fuelTankSize));
			}

			this.drawHoveringText(lines, mouseX, mouseY);
		}
	}
	
	@Override
	protected void mouseClicked(int i, int j, int k) throws IOException
	{
		super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(m > 161 && m < 171 && n > 5 && n < 15)
		{
			mc.displayGuiScreen(new GuiDriveableMenu(inventory, world, plane));
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
