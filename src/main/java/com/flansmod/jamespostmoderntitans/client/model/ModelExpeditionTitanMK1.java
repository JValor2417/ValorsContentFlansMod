//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ExpeditionTitanMK1
// Model Creator: 
// Created on: 03.07.2020 - 02:05:27
// Last changed on: 03.07.2020 - 02:05:27

package com.flansmod.jamespostmoderntitans.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelExpeditionTitanMK1 extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelExpeditionTitanMK1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Part_02
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Part_01
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Part_01
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Part_05
		bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Part_06
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Part_03
		bodyModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Part_04
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Part_03
		bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Part_04
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Part_03
		bodyModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Part_04
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Part_03
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Part_04
		bodyModel[13] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Part_05
		bodyModel[14] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Part_06
		bodyModel[15] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Part_02
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Part_03
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Part_04
		bodyModel[18] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Part_05
		bodyModel[19] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Part_06
		bodyModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Part_06
		bodyModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Part_06
		bodyModel[22] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import HUD
		bodyModel[23] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import HUD
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import HUD
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import HUD
		bodyModel[26] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import HUD
		bodyModel[27] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import HUD
		bodyModel[28] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import HUD
		bodyModel[29] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import HUD
		bodyModel[30] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import HUD
		bodyModel[31] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Import Part_02
		bodyModel[32] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Import Part_02
		bodyModel[33] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Import Part_02
		bodyModel[34] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Part_02

		bodyModel[0].addBox(-4F, 0F, -2F, 28, 30, 26, 0F); // Import Part_02
		bodyModel[0].setRotationPoint(-14F, -67F, 10F);
		bodyModel[0].rotateAngleY = -1.57079633F;

		bodyModel[1].addBox(-4F, -8F, -4F, 18, 9, 10, 0F); // Import Part_01
		bodyModel[1].setRotationPoint(19F, -37F, -5F);
		bodyModel[1].rotateAngleX = 0.20943951F;
		bodyModel[1].rotateAngleY = 1.57079633F;

		bodyModel[2].addBox(-4F, -8F, -4F, 22, 26, 20, 0F); // Import Part_01
		bodyModel[2].setRotationPoint(19F, -57F, -7F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-2F, 0F, -2F, 12, 8, 12, 0F); // Import Part_05
		bodyModel[3].setRotationPoint(-5F, -57F, -21F);

		bodyModel[4].addBox(-2F, 0F, -2F, 12, 8, 12, 0F); // Import Part_06
		bodyModel[4].setRotationPoint(-5F, -57F, 13F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 18, 4, 0F); // Import Part_03
		bodyModel[5].setRotationPoint(8F, -35F, 10F);
		bodyModel[5].rotateAngleZ = 1.29154365F;

		bodyModel[6].addBox(0F, 0F, 0F, 6, 18, 4, 0F); // Import Part_04
		bodyModel[6].setRotationPoint(8F, -35F, -14F);
		bodyModel[6].rotateAngleZ = 1.29154365F;

		bodyModel[7].addBox(0F, 0F, 0F, 8, 12, 6, 0F); // Import Part_03
		bodyModel[7].setRotationPoint(22F, -30F, 9F);
		bodyModel[7].rotateAngleZ = 1.43116999F;

		bodyModel[8].addBox(0F, 0F, 0F, 8, 12, 6, 0F); // Import Part_04
		bodyModel[8].setRotationPoint(22F, -30F, -15F);
		bodyModel[8].rotateAngleZ = 1.43116999F;

		bodyModel[9].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Import Part_03
		bodyModel[9].setRotationPoint(34F, -29F, 9F);
		bodyModel[9].rotateAngleZ = 1.43116999F;

		bodyModel[10].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Import Part_04
		bodyModel[10].setRotationPoint(34F, -29F, -15F);
		bodyModel[10].rotateAngleZ = 1.43116999F;

		bodyModel[11].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Import Part_03
		bodyModel[11].setRotationPoint(33F, -30F, 10F);
		bodyModel[11].rotateAngleZ = 1.43116999F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Import Part_04
		bodyModel[12].setRotationPoint(33F, -30F, -14F);
		bodyModel[12].rotateAngleZ = 1.43116999F;

		bodyModel[13].addBox(-2F, 0F, -2F, 16, 8, 16, 0F); // Import Part_05
		bodyModel[13].setRotationPoint(-6F, -54F, -24F);

		bodyModel[14].addBox(-2F, 0F, -2F, 16, 8, 16, 0F); // Import Part_06
		bodyModel[14].setRotationPoint(-6F, -54F, 12F);

		bodyModel[15].addBox(-4F, 0F, -2F, 20, 2, 20, 0F); // Import Part_02
		bodyModel[15].setRotationPoint(-10F, -68F, 6F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Import Part_03
		bodyModel[16].setRotationPoint(31F, -29F, 10F);
		bodyModel[16].rotateAngleZ = 1.43116999F;

		bodyModel[17].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Import Part_04
		bodyModel[17].setRotationPoint(31F, -29F, -14F);
		bodyModel[17].rotateAngleZ = 1.43116999F;

		bodyModel[18].addBox(-2F, 0F, -2F, 16, 2, 11, 0F); // Import Part_05
		bodyModel[18].setRotationPoint(-7F, -69F, -7F);

		bodyModel[19].addBox(-2F, 0F, -2F, 6, 11, 6, 0F); // Import Part_06
		bodyModel[19].setRotationPoint(1F, -78F, -5F);

		bodyModel[20].addBox(-2F, 0F, -2F, 2, 2, 4, 0F); // Import Part_06
		bodyModel[20].setRotationPoint(2F, -76F, -8.5F);

		bodyModel[21].addBox(-2F, 0F, -2F, 1, 1, 1, 0F); // Import Part_06
		bodyModel[21].setRotationPoint(3.25F, -75.5F, -8F);

		bodyModel[22].addBox(-4F, 0F, -2F, 16, 6, 6, 0F); // Import HUD
		bodyModel[22].setRotationPoint(14F, -48F, 4F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addBox(-4F, 0F, -2F, 1, 8, 1, 0F); // Import HUD
		bodyModel[23].setRotationPoint(18F, -52F, -9F);
		bodyModel[23].rotateAngleY = -1.57079633F;

		bodyModel[24].addBox(-4F, 0F, -2F, 2, 2, 2, 0F); // Import HUD
		bodyModel[24].setRotationPoint(17.5F, -53.25F, -8.5F);
		bodyModel[24].rotateAngleY = -1.57079633F;

		bodyModel[25].addBox(-4F, 0F, -2F, 2, 2, 2, 0F); // Import HUD
		bodyModel[25].setRotationPoint(16.5F, -48.25F, -6.5F);
		bodyModel[25].rotateAngleY = -1.57079633F;

		bodyModel[26].addBox(-4F, 0F, -2F, 4, 2, 3, 0F); // Import HUD
		bodyModel[26].setRotationPoint(15.5F, -49.25F, 1.5F);
		bodyModel[26].rotateAngleY = -1.57079633F;

		bodyModel[27].addBox(-4F, 0F, -2F, 22, 9, 2, 0F); // Import HUD
		bodyModel[27].setRotationPoint(20F, -51F, 7F);
		bodyModel[27].rotateAngleY = -1.57079633F;

		bodyModel[28].addBox(-4F, 0F, -2F, 2, 20, 24, 0F); // Import HUD
		bodyModel[28].setRotationPoint(-10F, -62F, 7.5F);
		bodyModel[28].rotateAngleY = -1.57079633F;

		bodyModel[29].addBox(-4F, 0F, -2F, 3, 20, 24, 0F); // Import HUD
		bodyModel[29].setRotationPoint(-10F, -62F, -12.5F);
		bodyModel[29].rotateAngleY = -1.57079633F;

		bodyModel[30].addBox(-4F, 0F, -2F, 22, 3, 32, 0F); // Import HUD
		bodyModel[30].setRotationPoint(-10F, -42F, 7F);
		bodyModel[30].rotateAngleY = -1.57079633F;

		bodyModel[31].addBox(-4F, 0F, -2F, 24, 20, 30, 0F); // Import Part_02
		bodyModel[31].setRotationPoint(-7F, -66F, 8F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addBox(-4F, 0F, -2F, 24, 2, 30, 0F); // Import Part_02
		bodyModel[32].setRotationPoint(-6F, -39F, 8F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addBox(-4F, 0F, -2F, 1, 10, 30, 0F); // Import Part_02
		bodyModel[33].setRotationPoint(-6F, -47F, 9F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addBox(-4F, 0F, -2F, 1, 10, 30, 0F); // Import Part_02
		bodyModel[34].setRotationPoint(-6F, -47F, -16F);
		bodyModel[34].rotateAngleY = -1.57079633F;


		leftLegModel = new ModelRendererTurbo[16];
		leftLegModel[0] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Import Part_06
		leftLegModel[1] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Part_06
		leftLegModel[2] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Part_06
		leftLegModel[3] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Part_06
		leftLegModel[4] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Part_06
		leftLegModel[5] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Import Part_06
		leftLegModel[6] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Import Part_06
		leftLegModel[7] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Import Part_06
		leftLegModel[8] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Import Part_06
		leftLegModel[9] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Part_06
		leftLegModel[10] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Import Part_06
		leftLegModel[11] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Import Part_06
		leftLegModel[12] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Import Part_06
		leftLegModel[13] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Import Part_06
		leftLegModel[14] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Part_06
		leftLegModel[15] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Part_06

		leftLegModel[0].addBox(-2F, 0F, -2F, 10, 20, 10, 0F); // Import Part_06
		leftLegModel[0].setRotationPoint(-4F, -44F, 15F);
		leftLegModel[0].rotateAngleZ = 0.52359878F;

		leftLegModel[1].addBox(-2F, 0F, -2F, 6, 16, 4, 0F); // Import Part_06
		leftLegModel[1].setRotationPoint(4F, -30F, 17F);
		leftLegModel[1].rotateAngleZ = -0.82030475F;

		leftLegModel[2].addBox(-2F, 0F, -2F, 6, 20, 2, 0F); // Import Part_06
		leftLegModel[2].setRotationPoint(-5F, -23F, 17F);
		leftLegModel[2].rotateAngleZ = 0.17453293F;

		leftLegModel[3].addBox(-2F, 0F, -2F, 6, 24, 6, 0F); // Import Part_06
		leftLegModel[3].setRotationPoint(-6F, -46F, 16F);
		leftLegModel[3].rotateAngleZ = 0.52359878F;

		leftLegModel[4].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Import Part_06
		leftLegModel[4].setRotationPoint(6F, -38F, 17F);
		leftLegModel[4].rotateAngleZ = 1.22173048F;

		leftLegModel[5].addBox(-2F, 0F, -2F, 12, 7, 7, 0F); // Import Part_06
		leftLegModel[5].setRotationPoint(7F, -29F, 15.5F);
		leftLegModel[5].rotateAngleZ = 1.15191731F;

		leftLegModel[6].addBox(-2F, 0F, -2F, 12, 18, 9, 0F); // Import Part_06
		leftLegModel[6].setRotationPoint(-11F, -30F, 15.5F);
		leftLegModel[6].rotateAngleZ = 0.2443461F;

		leftLegModel[7].addBox(-2F, 0F, -2F, 14, 10, 11, 0F); // Import Part_06
		leftLegModel[7].setRotationPoint(-9F, -11F, 14.5F);

		leftLegModel[8].addBox(-2F, 0F, -2F, 12, 16, 8, 0F); // Import Part_06
		leftLegModel[8].setRotationPoint(0F, -44F, 16F);
		leftLegModel[8].rotateAngleZ = 0.52359878F;

		leftLegModel[9].addBox(-2F, 0F, -2F, 4, 10, 4, 0F); // Import Part_06
		leftLegModel[9].setRotationPoint(-12F, -36F, 18F);
		leftLegModel[9].rotateAngleZ = 0.2443461F;

		leftLegModel[10].addBox(-2F, 0F, -2F, 6, 20, 2, 0F); // Import Part_06
		leftLegModel[10].setRotationPoint(-5F, -23F, 21F);
		leftLegModel[10].rotateAngleZ = 0.17453293F;

		leftLegModel[11].addBox(-2F, 0F, -2F, 6, 8, 5, 0F); // Import Part_06
		leftLegModel[11].setRotationPoint(-14.5F, -41F, 17.5F);
		leftLegModel[11].rotateAngleZ = 0.2443461F;

		leftLegModel[12].addBox(-2F, 0F, -2F, 14, 2, 11, 0F); // Import Part_06
		leftLegModel[12].setRotationPoint(-22F, -2F, 20.5F);

		leftLegModel[13].addBox(-2F, 0F, -2F, 14, 4, 2, 0F); // Import Part_06
		leftLegModel[13].setRotationPoint(-22F, -6F, 29.5F);

		leftLegModel[14].addBox(-2F, 0F, -2F, 14, 2, 11, 0F); // Import Part_06
		leftLegModel[14].setRotationPoint(1F, -2F, 20.5F);

		leftLegModel[15].addBox(-2F, 0F, -2F, 14, 4, 2, 0F); // Import Part_06
		leftLegModel[15].setRotationPoint(1F, -6F, 29.5F);


		rightLegModel = new ModelRendererTurbo[16];
		rightLegModel[0] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Import Part_05
		rightLegModel[1] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Import Part_05
		rightLegModel[2] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Import Part_05
		rightLegModel[3] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Import Part_05
		rightLegModel[4] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Import Part_05
		rightLegModel[5] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Import Part_05
		rightLegModel[6] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Import Part_05
		rightLegModel[7] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Import Part_05
		rightLegModel[8] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Import Part_05
		rightLegModel[9] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Import Part_05
		rightLegModel[10] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Import Part_05
		rightLegModel[11] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Import Part_05
		rightLegModel[12] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Import Part_05
		rightLegModel[13] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Import Part_05
		rightLegModel[14] = new ModelRendererTurbo(this, 1329, 17, textureX, textureY); // Import Part_05
		rightLegModel[15] = new ModelRendererTurbo(this, 1129, 17, textureX, textureY); // Import Part_05

		rightLegModel[0].addBox(-2F, 0F, -2F, 10, 20, 10, 0F); // Import Part_05
		rightLegModel[0].setRotationPoint(-4F, -44F, -21F);
		rightLegModel[0].rotateAngleZ = 0.52359878F;

		rightLegModel[1].addBox(-2F, 0F, -2F, 6, 16, 4, 0F); // Import Part_05
		rightLegModel[1].setRotationPoint(4F, -30F, -17F);
		rightLegModel[1].rotateAngleZ = -0.82030475F;

		rightLegModel[2].addBox(-2F, 0F, -2F, 6, 20, 2, 0F); // Import Part_05
		rightLegModel[2].setRotationPoint(-5F, -23F, -19F);
		rightLegModel[2].rotateAngleZ = 0.17453293F;

		rightLegModel[3].addBox(-2F, 0F, -2F, 6, 24, 6, 0F); // Import Part_05
		rightLegModel[3].setRotationPoint(-6F, -46F, -18F);
		rightLegModel[3].rotateAngleZ = 0.52359878F;

		rightLegModel[4].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Import Part_05
		rightLegModel[4].setRotationPoint(6F, -38F, -17F);
		rightLegModel[4].rotateAngleZ = 1.22173048F;

		rightLegModel[5].addBox(-2F, 0F, -2F, 12, 7, 7, 0F); // Import Part_05
		rightLegModel[5].setRotationPoint(7F, -29F, -18.5F);
		rightLegModel[5].rotateAngleZ = 1.15191731F;

		rightLegModel[6].addBox(-2F, 0F, -2F, 12, 18, 9, 0F); // Import Part_05
		rightLegModel[6].setRotationPoint(-11F, -30F, -20.5F);
		rightLegModel[6].rotateAngleZ = 0.2443461F;

		rightLegModel[7].addBox(-2F, 0F, -2F, 14, 10, 11, 0F); // Import Part_05
		rightLegModel[7].setRotationPoint(-9F, -11F, -21.5F);

		rightLegModel[8].addBox(-2F, 0F, -2F, 12, 16, 8, 0F); // Import Part_05
		rightLegModel[8].setRotationPoint(0F, -44F, -20F);
		rightLegModel[8].rotateAngleZ = 0.52359878F;

		rightLegModel[9].addBox(-2F, 0F, -2F, 4, 10, 4, 0F); // Import Part_05
		rightLegModel[9].setRotationPoint(-12F, -36F, -18F);
		rightLegModel[9].rotateAngleZ = 0.2443461F;

		rightLegModel[10].addBox(-2F, 0F, -2F, 6, 20, 2, 0F); // Import Part_05
		rightLegModel[10].setRotationPoint(-5F, -23F, -15F);
		rightLegModel[10].rotateAngleZ = 0.17453293F;

		rightLegModel[11].addBox(-2F, 0F, -2F, 6, 8, 5, 0F); // Import Part_05
		rightLegModel[11].setRotationPoint(-14.5F, -41F, -18.5F);
		rightLegModel[11].rotateAngleZ = 0.2443461F;

		rightLegModel[12].addBox(-2F, 0F, -2F, 14, 2, 11, 0F); // Import Part_05
		rightLegModel[12].setRotationPoint(-22F, -2F, -27.5F);

		rightLegModel[13].addBox(-2F, 0F, -2F, 14, 4, 2, 0F); // Import Part_05
		rightLegModel[13].setRotationPoint(-22F, -6F, -27.5F);

		rightLegModel[14].addBox(-2F, 0F, -2F, 14, 2, 11, 0F); // Import Part_05
		rightLegModel[14].setRotationPoint(1F, -2F, -27.5F);

		rightLegModel[15].addBox(-2F, 0F, -2F, 14, 4, 2, 0F); // Import Part_05
		rightLegModel[15].setRotationPoint(1F, -6F, -27.5F);


		leftFootModel = new ModelRendererTurbo[3];
		leftFootModel[0] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Import Part_06
		leftFootModel[1] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Import Part_06
		leftFootModel[2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Part_06

		leftFootModel[0].addBox(-2F, 0F, -2F, 32, 6, 15, 0F); // Import Part_06
		leftFootModel[0].setRotationPoint(-20F, -6F, 12.5F);

		leftFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import Part_06
		leftFootModel[1].setRotationPoint(12F, -8F, 14.5F);

		leftFootModel[2].addBox(-2F, 0F, -2F, 8, 4, 11, 0F); // Import Part_06
		leftFootModel[2].setRotationPoint(-26F, -4F, 14.5F);


		rightFootModel = new ModelRendererTurbo[3];
		rightFootModel[0] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Part_05
		rightFootModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Part_05
		rightFootModel[2] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Part_05

		rightFootModel[0].addBox(-2F, 0F, -2F, 32, 6, 15, 0F); // Import Part_05
		rightFootModel[0].setRotationPoint(-20F, -6F, -23.5F);

		rightFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import Part_05
		rightFootModel[1].setRotationPoint(12F, -8F, -21.5F);

		rightFootModel[2].addBox(-2F, 0F, -2F, 8, 4, 11, 0F); // Import Part_05
		rightFootModel[2].setRotationPoint(-26F, -4F, -21.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}