//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GenericGrenadeFired
// Model Creator:
// Created on:21.06.2020 - 21:25:37
// Last changed on: 21.06.2020 - 21:25:37

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelGenericGrenadeFired extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGenericGrenadeFired()
	{
		genericgrenadefiredModel = new ModelRendererTurbo[2];
		genericgrenadefiredModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		genericgrenadefiredModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 

		genericgrenadefiredModel[0].addBox(-2F, 0F, -3F, 3, 4, 3, 0F); // Import 
		genericgrenadefiredModel[0].setRotationPoint(0.5F, 0F, 2.5F);

		genericgrenadefiredModel[1].addBox(-2F, 0F, -3F, 2, 1, 2, 0F); // Import 
		genericgrenadefiredModel[1].setRotationPoint(1F, -0.25F, 3F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			genericgrenadefiredModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo genericgrenadefiredModel[];
}