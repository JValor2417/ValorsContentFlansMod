//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SplitterCannon
// Model Creator: 
// Created on: 14.01.2021 - 01:55:13
// Last changed on: 14.01.2021 - 01:55:13

package com.flansmod.jamespostmoderntitans.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSplitterCannon extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSplitterCannon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 14, 8, 6, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-25F, 18F, -3F);
		gunModel[0].rotateAngleZ = -0.20943951F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 28, 5, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-18F, 0F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 4, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-23F, 9F, -2F);
		gunModel[2].rotateAngleZ = -0.38397244F;

		gunModel[3].addBox(0F, -17F, 0F, 60, 3, 7, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-6F, 4F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 30, 7, 7, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-38F, 18F, -3.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-12.5F, -1F, -2F);
		gunModel[5].rotateAngleZ = 0.38397244F;

		gunModel[6].addBox(0F, -17F, 0F, 65, 13, 9, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-11F, -9F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 19, 13, 8, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-29F, -9F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 37, 2, 9, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-24F, 10F, -4.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 54, 11, 6, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(5F, -17F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 60, 2, 5, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(50F, -4F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 32, 8, 7, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(-37F, -14F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 30, 3, 5, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(-36F, -15F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 56, 3, 7, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(62F, 5F, -3.5F);

		gunModel[14].addBox(0F, -17F, 0F, 37, 10, 9, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(-22F, 10F, -4.5F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 12, 7, 6, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(-7F, 24F, -3F);

		gunModel[16].addBox(0F, -17F, 0F, 10, 7, 5, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(7F, 24F, -2.5F);
		gunModel[16].rotateAngleZ = 0.2443461F;

		gunModel[17].addBox(0F, -17F, 0F, 6, 23, 6, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(12F, 7F, -3F);

		gunModel[18].addBox(0F, -17F, 0F, 106, 13, 12, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(10F, -8F, -6F);

		gunModel[19].addBox(0F, -17F, 0F, 60, 10, 14, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(60F, -3F, -7F);

		gunModel[20].addBox(0F, -17F, 0F, 42, 6, 6, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(81F, -6F, -3F);

		gunModel[21].addBox(0F, -17F, 0F, 56, 7, 10, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(4F, -14F, -5F);

		gunModel[22].addBox(0F, -17F, 0F, 50, 3, 8, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(-38F, -12F, -4F);

		gunModel[23].addBox(0F, -17F, 0F, 58, 8, 15, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(61F, -2F, -7.5F);

		gunModel[24].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(121.05F, -5.5F, -2.5F);

		gunModel[25].addBox(0F, -17F, 0F, 60, 2, 4, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(60F, -10F, -7F);

		gunModel[26].addBox(0F, -17F, 0F, 60, 2, 4, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(60F, -10F, 3F);

		gunModel[27].addBox(0F, -17F, 0F, 58, 1, 4, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(61F, -10.5F, -6F);

		gunModel[28].addBox(0F, -17F, 0F, 58, 1, 4, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(61F, -10.5F, 2F);

		gunModel[29].addBox(0F, -17F, 0F, 58, 4, 1, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(61F, -9F, -7.5F);

		gunModel[30].addBox(0F, -17F, 0F, 58, 4, 1, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(61F, -9F, 6.5F);

		gunModel[31].addBox(0F, -17F, 0F, 2, 4, 12, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(119F, 2F, -6F);

		gunModel[32].addBox(0F, -17F, 0F, 48, 11, 13, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(11F, -7F, -6.5F);

		gunModel[33].addBox(0F, -17F, 0F, 50, 1, 1, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(63.05F, -4.5F, -6.05F);

		gunModel[34].addBox(0F, -17F, 0F, 50, 1, 1, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(63.05F, -4.5F, 5.05F);

		gunModel[35].addBox(0F, -17F, 0F, 50, 1, 1, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(63.05F, -8.05F, -0.5F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 30, 24, 24, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(17.5F, 8F, -11.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 2, 20, 20, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(15.5F, 10F, -9.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 2, 20, 20, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(47.5F, 10F, -9.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 28, 22, 26, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(18.5F, 9F, -12.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 28, 26, 22, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(18.5F, 7F, -10.5F);



		barrelAttachPoint = new Vector3f(123F /16F, 20F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(32F /16F, 34F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(84 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}