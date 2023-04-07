//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AlarmTrap
// Model Creator:
// Created on:21.06.2020 - 21:25:37
// Last changed on: 21.06.2020 - 21:25:37

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAlarmTrap extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelAlarmTrap()
	{
		alarmtrapModel = new ModelRendererTurbo[2];
		alarmtrapModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		alarmtrapModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 

		alarmtrapModel[0].addBox(-2F, 0F, -3F, 2, 2, 2, 0F); // Import 
		alarmtrapModel[0].setRotationPoint(0F, 0F, 2F);

		alarmtrapModel[1].addBox(-2F, 0F, -3F, 1, 3, 1, 0F); // Import 
		alarmtrapModel[1].setRotationPoint(0.5F, -0.5F, 2.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			alarmtrapModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo alarmtrapModel[];
}