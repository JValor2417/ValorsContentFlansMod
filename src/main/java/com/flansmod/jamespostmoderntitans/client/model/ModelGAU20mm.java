//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GAU20mm
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

public class ModelGAU20mm extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGAU20mm() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-12F, 20F, -3F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 5, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-7F, 6F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 4, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-12F, 8F, -2F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(0F, -17F, 0F, 90, 8, 8, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-7F, 2F, -4F);

		gunModel[4].addBox(0F, -17F, 0F, 44, 7, 7, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-44F, 20F, -3.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 9, 6, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-4F, 0F, -3F);
		gunModel[5].rotateAngleZ = 0.38397244F;

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-11F, -11F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 19, 9, 6, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-29F, -8F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 38, 4, 9, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-26F, 10F, -4.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 74, 11, 10, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(-41F, -20F, 11.5F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 18, 4, 2, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(49F, -8F, -6.5F);

		gunModel[11].addBox(0F, -17F, 0F, 2, 5, 4, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(67F, -8.5F, -8.5F);

		gunModel[12].addBox(0F, -17F, 0F, 74, 4, 6, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(29F, -15F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 65, 4, 10, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(-32F, -17F, -5F);

		gunModel[14].addBox(0F, -17F, 0F, 63, 1, 8, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(-31F, -18F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 78, 2, 7, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(84F, 10F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 38, 10, 8, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(-22F, 10F, -4F);
		gunModel[16].rotateAngleZ = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 30, 26, 11, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(40F, 3F, -6F);

		gunModel[18].addBox(0F, -17F, 0F, 14, 14, 9, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(70F, 6F, -4.5F);

		gunModel[19].addBox(0F, -17F, 0F, 30, 7, 6, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(0F, 29F, -3F);

		gunModel[20].addBox(0F, -17F, 0F, 10, 7, 5, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(30F, 29F, -2.5F);
		gunModel[20].rotateAngleZ = 0.2443461F;

		gunModel[21].addBox(0F, -17F, 0F, 6, 25, 7, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(34F, 9F, -3.5F);

		gunModel[22].addBox(0F, -17F, 0F, 13, 13, 11, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(70.5F, 6.5F, -5.5F);

		gunModel[23].addBox(0F, -17F, 0F, 30, 18, 13, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(76F, -12.05F, -6.5F);

		gunModel[24].addBox(0F, -17F, 0F, 60, 12, 12, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(106F, -6F, -6F);

		gunModel[25].addBox(0F, -17F, 0F, 40, 8, 11, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(103F, -10F, -5.5F);
		gunModel[25].rotateAngleZ = -0.10471976F;

		gunModel[26].addBox(0F, -17F, 0F, 31, 2, 10, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(134F, -7F, -5F);

		gunModel[27].addBox(0F, -17F, 0F, 56, 4, 4, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(118F, -3F, -2F);

		gunModel[28].addBox(0F, -17F, 0F, 42, 13, 9, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(34F, -11F, -4.5F);

		gunModel[29].addBox(0F, -17F, 0F, 8, 8, 12, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(73F, 9F, -6F);

		gunModel[30].addBox(0F, -17F, 0F, 30, 5, 2, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(40F, -9.5F, 2.55F);

		gunModel[31].addBox(0F, -17F, 0F, 16, 5, 5, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(174F, -3.5F, -2.5F);

		gunModel[32].addBox(0F, -17F, 0F, 12, 5, 4, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(175F, -4F, -2F);

		gunModel[33].addBox(0F, -17F, 0F, 12, 5, 4, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(175F, -3F, -2F);

		gunModel[34].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(175F, -3F, -3F);

		gunModel[35].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(175F, -3F, -1F);

		gunModel[36].addBox(0F, -17F, 0F, 30, 2, 10, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(40F, 29F, -5.5F);

		gunModel[37].addBox(0F, -17F, 0F, 10, 6, 8, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(-32F, -14F, -4F);
		gunModel[37].rotateAngleZ = 0.52359878F;

		gunModel[38].addBox(0F, -17F, 0F, 30, 6, 10, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(103F, -12F, -5F);
		gunModel[38].rotateAngleZ = -0.10471976F;

		gunModel[39].addBox(0F, -17F, 0F, 30, 3, 9, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(134F, -8.25F, -4.5F);

		gunModel[40].addBox(0F, -17F, 0F, 80, 4, 8, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(83F, 6F, -4F);

		gunModel[41].addBox(0F, -17F, 0F, 58, 6, 13, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(107F, -1F, -6.5F);


		ammoModel = new ModelRendererTurbo[36];
		ammoModel[0] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import ImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import ImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import ImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		ammoModel[13] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		ammoModel[25] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box0
		ammoModel[26] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import Box0
		ammoModel[27] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box0
		ammoModel[28] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box0
		ammoModel[29] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import Box0
		ammoModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		ammoModel[31] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box0
		ammoModel[32] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import Box0
		ammoModel[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		ammoModel[34] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Import Box0
		ammoModel[35] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 30, 24, 24, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(40.5F, 3F, 6F);

		ammoModel[1].addBox(0F, -17F, 0F, 1, 22, 22, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(39.95F, 4F, 7F);

		ammoModel[2].addBox(0F, -17F, 0F, 2, 22, 22, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(69.05F, 4F, 7F);

		ammoModel[3].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		ammoModel[3].setRotationPoint(58F, 1F, 19F);

		ammoModel[4].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		ammoModel[4].setRotationPoint(64F, 1.5F, 19.5F);

		ammoModel[5].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[5].setRotationPoint(46.5F, 0.5F, 18.5F);

		ammoModel[6].addBox(0F, -17F, 0F, 11, 3, 3, 0F); // Import Box0
		ammoModel[6].setRotationPoint(47.75F, 0.5F, 18.5F);

		ammoModel[7].addBox(0F, -17F, 0F, 28, 22, 2, 0F); // Import ImportBox0
		ammoModel[7].setRotationPoint(41.5F, 4F, 29F);

		ammoModel[8].addBox(0F, -17F, 0F, 28, 22, 2, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(41.5F, 4F, 5F);

		ammoModel[9].addBox(0F, -17F, 0F, 28, 2, 22, 0F); // Import ImportBox0
		ammoModel[9].setRotationPoint(41.5F, 26F, 7F);

		ammoModel[10].addBox(0F, -17F, 0F, 28, 2, 22, 0F); // Import ImportBox0
		ammoModel[10].setRotationPoint(41.5F, -19F, 4F);
		ammoModel[10].rotateAngleX = -0.78539816F;

		ammoModel[11].addBox(0F, -17F, 0F, 26, 2, 2, 0F); // Import ImportBox0
		ammoModel[11].setRotationPoint(42.5F, 2F, 28.5F);

		ammoModel[12].addBox(0F, -17F, 0F, 28, 1, 22, 0F); // Import ImportBox0
		ammoModel[12].setRotationPoint(41.5F, 2.75F, 7F);

		ammoModel[13].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		ammoModel[13].setRotationPoint(49.75F, 0F, 18F);

		ammoModel[14].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		ammoModel[14].setRotationPoint(49.75F, 0F, 17F);

		ammoModel[15].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		ammoModel[15].setRotationPoint(58F, -2F, 14F);

		ammoModel[16].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		ammoModel[16].setRotationPoint(64F, -1.5F, 14.5F);

		ammoModel[17].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[17].setRotationPoint(46.5F, -2.5F, 13.5F);

		ammoModel[18].addBox(0F, -17F, 0F, 11, 3, 3, 0F); // Import Box0
		ammoModel[18].setRotationPoint(47.75F, -2.5F, 13.5F);

		ammoModel[19].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		ammoModel[19].setRotationPoint(49.75F, -3F, 13F);

		ammoModel[20].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		ammoModel[20].setRotationPoint(49.75F, -3F, 12F);

		ammoModel[21].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[21].setRotationPoint(47F, 1F, 19F);

		ammoModel[22].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[22].setRotationPoint(47F, -2F, 14F);

		ammoModel[23].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		ammoModel[23].setRotationPoint(58F, -5F, 9F);

		ammoModel[24].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		ammoModel[24].setRotationPoint(64F, -4.5F, 9.5F);

		ammoModel[25].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[25].setRotationPoint(46.5F, -5.5F, 8.5F);

		ammoModel[26].addBox(0F, -17F, 0F, 11, 3, 3, 0F); // Import Box0
		ammoModel[26].setRotationPoint(47.75F, -5.5F, 8.5F);

		ammoModel[27].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		ammoModel[27].setRotationPoint(49.75F, -6F, 8F);

		ammoModel[28].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		ammoModel[28].setRotationPoint(49.75F, -6F, 7F);

		ammoModel[29].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		ammoModel[29].setRotationPoint(58F, -8F, 4F);

		ammoModel[30].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		ammoModel[30].setRotationPoint(64F, -7.5F, 4.5F);

		ammoModel[31].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[31].setRotationPoint(46.5F, -8.5F, 3.5F);

		ammoModel[32].addBox(0F, -17F, 0F, 11, 3, 3, 0F); // Import Box0
		ammoModel[32].setRotationPoint(47.75F, -8.5F, 3.5F);

		ammoModel[33].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		ammoModel[33].setRotationPoint(49.75F, -9F, 3F);

		ammoModel[34].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[34].setRotationPoint(47F, -5F, 9F);

		ammoModel[35].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[35].setRotationPoint(47F, -8F, 4F);



		barrelAttachPoint = new Vector3f(132F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(43 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}