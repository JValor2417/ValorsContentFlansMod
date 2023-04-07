//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: UnderBarrelLaser
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelUnderBarrelLaser extends ModelAttachment //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelUnderBarrelLaser() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		attachmentModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		attachmentModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		attachmentModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		attachmentModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		attachmentModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		attachmentModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		attachmentModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		attachmentModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0

		attachmentModel[0].addBox(0F, -17F, 0F, 2, 4, 4, 0F); // Import Box0
		attachmentModel[0].setRotationPoint(11.5F, 1.5F, -2F);
		attachmentModel[0].rotateAngleZ = 1.57079633F;

		attachmentModel[1].addBox(0F, -17F, 0F, 1, 2000, 1, 0F); // Import Box0
		attachmentModel[1].setRotationPoint(16.5F, 1F, -0.5F);
		attachmentModel[1].rotateAngleZ = 1.57079633F;

		attachmentModel[2].addBox(0F, -17F, 0F, 3, 5, 3, 0F); // Import Box0
		attachmentModel[2].setRotationPoint(11F, 2F, -1.5F);
		attachmentModel[2].rotateAngleZ = 1.57079633F;

		attachmentModel[3].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		attachmentModel[3].setRotationPoint(15.1F, 1F, -0.5F);
		attachmentModel[3].rotateAngleZ = 1.57079633F;

		attachmentModel[4].addBox(0F, -17F, 0F, 2, 1, 2, 0F); // Import Box0
		attachmentModel[4].setRotationPoint(15.05F, 1.5F, -1F);
		attachmentModel[4].rotateAngleZ = 1.57079633F;

		attachmentModel[5].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		attachmentModel[5].setRotationPoint(12F, 1F, 1.05F);
		attachmentModel[5].rotateAngleZ = 1.57079633F;

		attachmentModel[6].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		attachmentModel[6].setRotationPoint(13F, 1F, 1.05F);
		attachmentModel[6].rotateAngleZ = 1.57079633F;

		attachmentModel[7].addBox(0F, -17F, 0F, 1, 2000, 1, 0F); // Import Box0
		attachmentModel[7].setRotationPoint(2016.5F, 1F, -0.5F);
		attachmentModel[7].rotateAngleZ = 1.57079633F;

		attachmentModel[8].addBox(0F, -17F, 0F, 1, 2000, 1, 0F); // Import Box0
		attachmentModel[8].setRotationPoint(4016.5F, 1F, -0.5F);
		attachmentModel[8].rotateAngleZ = 1.57079633F;

		attachmentModel[9].addBox(0F, -17F, 0F, 1, 6, 2, 0F); // Import Box0
		attachmentModel[9].setRotationPoint(10.5F, -0.5F, -1F);
		attachmentModel[9].rotateAngleZ = 1.57079633F;



		flipAll();
	}
}