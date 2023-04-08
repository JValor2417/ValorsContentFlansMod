//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HCOG
// Model Creator: 
// Created on: 15.05.2020 - 15:19:41
// Last changed on: 15.05.2020 - 15:19:41

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHCOG extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHCOG() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 03
		attachmentModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import 04
		attachmentModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import 05
		attachmentModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		attachmentModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		attachmentModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import 01
		attachmentModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		attachmentModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		attachmentModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		attachmentModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import 01
		attachmentModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import 01
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		attachmentModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		attachmentModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import 04
		attachmentModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import 05
		attachmentModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import 04
		attachmentModel[17] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import 05
		attachmentModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import 04
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 05

		attachmentModel[0].addBox(-16F, 0F, -6F, 2, 1, 6, 0F); // Import 01
		attachmentModel[0].setRotationPoint(-1.5F, -3F, 3F);

		attachmentModel[1].addBox(-16F, 20F, -8F, 34, 1, 20, 0F); // Import 03
		attachmentModel[1].setRotationPoint(-2.05F, -22.5F, -2F);

		attachmentModel[2].addBox(-16F, 4F, -9F, 34, 10, 2, 0F); // Import 04
		attachmentModel[2].setRotationPoint(-2F, -16.5F, -1F);

		attachmentModel[3].addBox(-16F, 4F, 8F, 34, 10, 2, 0F); // Import 05
		attachmentModel[3].setRotationPoint(-2F, -16.5F, 0F);

		attachmentModel[4].addBox(0F, -17F, 0F, 1, 33, 1, 0F); // Import Box0
		attachmentModel[4].setRotationPoint(-0.5F, -0.5F, 1.5F);
		attachmentModel[4].rotateAngleZ = 1.57079633F;

		attachmentModel[5].addBox(0F, -17F, 0F, 1, 33, 1, 0F); // Import Box0
		attachmentModel[5].setRotationPoint(-0.5F, -0.5F, -2.5F);
		attachmentModel[5].rotateAngleZ = 1.57079633F;

		attachmentModel[6].addBox(-16F, 0F, -6F, 1, 0, 5, 0F); // Import 01
		attachmentModel[6].setRotationPoint(-1F, -3.05F, 3.5F);

		attachmentModel[7].addBox(0F, -17F, 0F, 1, 1, 6, 0F); // Import Box0
		attachmentModel[7].setRotationPoint(0F, -11F, -7.5F);
		attachmentModel[7].rotateAngleZ = 1.57079633F;

		attachmentModel[8].addBox(0F, -17F, 0F, 1, 1, 6, 0F); // Import Box0
		attachmentModel[8].setRotationPoint(0F, -11F, 1.5F);
		attachmentModel[8].rotateAngleZ = 1.57079633F;

		attachmentModel[9].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		attachmentModel[9].setRotationPoint(0F, -7F, -0.5F);
		attachmentModel[9].rotateAngleZ = 1.57079633F;

		attachmentModel[10].addBox(-16F, 0F, -6F, 2, 1, 6, 0F); // Import 01
		attachmentModel[10].setRotationPoint(29.5F, -3F, 3F);

		attachmentModel[11].addBox(-16F, 0F, -6F, 1, 0, 5, 0F); // Import 01
		attachmentModel[11].setRotationPoint(30F, -3.05F, 3.5F);

		attachmentModel[12].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		attachmentModel[12].setRotationPoint(31F, -11F, -0.5F);
		attachmentModel[12].rotateAngleZ = 1.57079633F;

		attachmentModel[13].addBox(0F, -17F, 0F, 2, 33, 3, 0F); // Import Box0
		attachmentModel[13].setRotationPoint(-0.5F, 0F, -1.5F);
		attachmentModel[13].rotateAngleZ = 1.57079633F;

		attachmentModel[14].addBox(-16F, 4F, -9F, 33, 1, 1, 0F); // Import 04
		attachmentModel[14].setRotationPoint(-1.5F, -17F, -0.5F);

		attachmentModel[15].addBox(-16F, 4F, 8F, 33, 1, 1, 0F); // Import 05
		attachmentModel[15].setRotationPoint(-1.5F, -17F, 0.5F);

		attachmentModel[16].addBox(-16F, 4F, -9F, 1, 9, 1, 0F); // Import 04
		attachmentModel[16].setRotationPoint(-2.5F, -16F, -0.5F);

		attachmentModel[17].addBox(-16F, 4F, 8F, 1, 9, 1, 0F); // Import 05
		attachmentModel[17].setRotationPoint(-2.5F, -16F, 0.5F);

		attachmentModel[18].addBox(-16F, 4F, -9F, 1, 9, 1, 0F); // Import 04
		attachmentModel[18].setRotationPoint(31.5F, -16F, -0.5F);

		attachmentModel[19].addBox(-16F, 4F, 8F, 1, 9, 1, 0F); // Import 05
		attachmentModel[19].setRotationPoint(31.5F, -16F, 0.5F);



		flipAll();
	}
}