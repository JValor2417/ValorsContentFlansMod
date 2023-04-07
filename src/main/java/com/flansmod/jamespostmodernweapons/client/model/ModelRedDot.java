//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RedDot
// Model Creator: 
// Created on: 19.05.2020 - 20:50:06
// Last changed on: 19.05.2020 - 20:50:06

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRedDot extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRedDot() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[20];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 02
		attachmentModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 03
		attachmentModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import 04
		attachmentModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import 05
		attachmentModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import 01
		attachmentModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import 02
		attachmentModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 04
		attachmentModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 05
		attachmentModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import 01
		attachmentModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import 03
		attachmentModel[11] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import 03
		attachmentModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import 03
		attachmentModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import 04
		attachmentModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import 05
		attachmentModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		attachmentModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		attachmentModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		attachmentModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 02
		attachmentModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import 03

		attachmentModel[0].addBox(-16F, 0F, -6F, 5, 1, 14, 0F); // Import 01
		attachmentModel[0].setRotationPoint(42F, -31F, -1F);

		attachmentModel[1].addBox(-16F, 3F, -8F, 6, 1, 16, 0F); // Import 02
		attachmentModel[1].setRotationPoint(41.5F, -33F, 0F);

		attachmentModel[2].addBox(-16F, 20F, -8F, 32, 6, 18, 0F); // Import 03
		attachmentModel[2].setRotationPoint(15.5F, -27F, -1F);

		attachmentModel[3].addBox(-16F, 4F, -9F, 6, 21, 2, 0F); // Import 04
		attachmentModel[3].setRotationPoint(41.5F, -33F, 0.5F);

		attachmentModel[4].addBox(-16F, 4F, 8F, 6, 21, 2, 0F); // Import 05
		attachmentModel[4].setRotationPoint(41.5F, -33F, -1.5F);

		attachmentModel[5].addBox(-16F, 0F, -6F, 8, 1, 8, 0F); // Import 01
		attachmentModel[5].setRotationPoint(17.5F, -8F, 2F);

		attachmentModel[6].addBox(-16F, 3F, -8F, 6, 1, 18, 0F); // Import 02
		attachmentModel[6].setRotationPoint(41.5F, -11F, -1F);

		attachmentModel[7].addBox(-16F, 4F, -9F, 6, 14, 1, 0F); // Import 04
		attachmentModel[7].setRotationPoint(37.5F, -2F, 1F);
		attachmentModel[7].rotateAngleZ = -1.04719755F;

		attachmentModel[8].addBox(-16F, 4F, 8F, 6, 14, 1, 0F); // Import 05
		attachmentModel[8].setRotationPoint(37.5F, -2F, -1F);
		attachmentModel[8].rotateAngleZ = -1.04719755F;

		attachmentModel[9].addBox(-16F, 0F, -6F, 6, 1, 6, 0F); // Import 01
		attachmentModel[9].setRotationPoint(18.5F, -8.05F, 3F);

		attachmentModel[10].addBox(-16F, 20F, -8F, 1, 5, 17, 0F); // Import 03
		attachmentModel[10].setRotationPoint(15F, -26.5F, -0.5F);

		attachmentModel[11].addBox(-16F, 20F, -8F, 31, 5, 1, 0F); // Import 03
		attachmentModel[11].setRotationPoint(16F, -26.5F, 16.5F);

		attachmentModel[12].addBox(-16F, 20F, -8F, 31, 5, 1, 0F); // Import 03
		attachmentModel[12].setRotationPoint(16F, -26.5F, -1.5F);

		attachmentModel[13].addBox(-16F, 4F, -9F, 5, 20, 1, 0F); // Import 04
		attachmentModel[13].setRotationPoint(42F, -32.5F, -0.5F);

		attachmentModel[14].addBox(-16F, 4F, 8F, 5, 20, 1, 0F); // Import 05
		attachmentModel[14].setRotationPoint(42F, -32.5F, 0.5F);

		attachmentModel[15].addBox(0F, -17F, 0F, 2, 31, 3, 0F); // Import Box0
		attachmentModel[15].setRotationPoint(17F, 0F, -1.5F);
		attachmentModel[15].rotateAngleZ = 1.57079633F;

		attachmentModel[16].addBox(0F, -17F, 0F, 1, 30, 1, 0F); // Import Box0
		attachmentModel[16].setRotationPoint(17.5F, -0.5F, 1.5F);
		attachmentModel[16].rotateAngleZ = 1.57079633F;

		attachmentModel[17].addBox(0F, -17F, 0F, 1, 30, 1, 0F); // Import Box0
		attachmentModel[17].setRotationPoint(17.5F, -0.5F, -2.5F);
		attachmentModel[17].rotateAngleZ = 1.57079633F;

		attachmentModel[18].addBox(-16F, 3F, -8F, 1, 2, 2, 0F); // Import 02
		attachmentModel[18].setRotationPoint(46.5F, -22F, 7F);

		attachmentModel[19].addBox(-16F, 20F, -8F, 1, 5, 17, 0F); // Import 03
		attachmentModel[19].setRotationPoint(47F, -26.5F, -0.5F);



		renderOffset = 1F;


		flipAll();
	}
}