//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OppressorTitan
// Model Creator: 
// Created on: 05.01.2021 - 23:29:48
// Last changed on: 05.01.2021 - 23:29:48

package com.flansmod.jamespostmoderntitans.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOppressorTitan extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelOppressorTitan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportHUD
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[8] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[9] = new ModelRendererTurbo(this, 1377, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[10] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import ImportPart_01
		bodyModel[11] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[12] = new ModelRendererTurbo(this, 1577, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[13] = new ModelRendererTurbo(this, 1433, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[14] = new ModelRendererTurbo(this, 1889, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[15] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[16] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[17] = new ModelRendererTurbo(this, 1881, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[18] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[19] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[20] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[21] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[22] = new ModelRendererTurbo(this, 1225, 25, textureX, textureY); // Import ImportPart_02
		bodyModel[23] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[24] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[25] = new ModelRendererTurbo(this, 1449, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[26] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[27] = new ModelRendererTurbo(this, 1497, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[28] = new ModelRendererTurbo(this, 1505, 25, textureX, textureY); // Import ImportPart_02
		bodyModel[29] = new ModelRendererTurbo(this, 1753, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[30] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[31] = new ModelRendererTurbo(this, 1385, 49, textureX, textureY); // Import ImportPart_02
		bodyModel[32] = new ModelRendererTurbo(this, 1761, 49, textureX, textureY); // Import ImportPart_02
		bodyModel[33] = new ModelRendererTurbo(this, 1089, 57, textureX, textureY); // Import ImportPart_02
		bodyModel[34] = new ModelRendererTurbo(this, 1201, 57, textureX, textureY); // Import ImportPart_01
		bodyModel[35] = new ModelRendererTurbo(this, 1313, 57, textureX, textureY); // Import ImportPart_01
		bodyModel[36] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Import ImportPart_02
		bodyModel[37] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[38] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[39] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[40] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Import ImportPart_01

		bodyModel[0].addBox(-4F, 0F, -2F, 26, 30, 38, 0F); // Import ImportPart_02
		bodyModel[0].setRotationPoint(-9F, -143F, 9F);
		bodyModel[0].rotateAngleY = -1.57079633F;

		bodyModel[1].addBox(-4F, 0F, -2F, 16, 10, 16, 0F); // Import ImportPart_02
		bodyModel[1].setRotationPoint(-1F, -106F, 4F);
		bodyModel[1].rotateAngleY = -1.57079633F;

		bodyModel[2].addBox(-4F, -8F, -4F, 20, 13, 10, 0F); // Import ImportPart_01
		bodyModel[2].setRotationPoint(30F, -110F, -6F);
		bodyModel[2].rotateAngleX = 0.2443461F;
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-4F, -8F, -4F, 20, 18, 8, 0F); // Import ImportPart_01
		bodyModel[3].setRotationPoint(24F, -136F, -6F);
		bodyModel[3].rotateAngleX = -1.36135682F;
		bodyModel[3].rotateAngleY = 1.57079633F;

		bodyModel[4].addBox(-4F, 0F, -2F, 20, 4, 34, 0F); // Import ImportPart_02
		bodyModel[4].setRotationPoint(-7F, -147F, 6F);
		bodyModel[4].rotateAngleY = -1.57079633F;

		bodyModel[5].addBox(-4F, -8F, -4F, 2, 2, 2, 0F); // Import ImportPart_01
		bodyModel[5].setRotationPoint(37F, -118.5F, 0.5F);
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addBox(-4F, 0F, -2F, 10, 2, 3, 0F); // Import ImportHUD
		bodyModel[6].setRotationPoint(24.75F, -135F, 1F);
		bodyModel[6].rotateAngleY = -1.57079633F;

		bodyModel[7].addBox(-4F, -8F, -4F, 8, 10, 6, 0F); // Import ImportPart_01
		bodyModel[7].setRotationPoint(36.75F, -119F, 0F);
		bodyModel[7].rotateAngleY = 1.57079633F;

		bodyModel[8].addBox(-4F, -8F, -4F, 21, 18, 10, 0F); // Import ImportPart_01
		bodyModel[8].setRotationPoint(33F, -124.5F, -6.5F);
		bodyModel[8].rotateAngleY = 1.57079633F;

		bodyModel[9].addBox(-4F, -8F, -4F, 17, 14, 16, 0F); // Import ImportPart_01
		bodyModel[9].setRotationPoint(34F, -121.5F, -4.5F);
		bodyModel[9].rotateAngleY = 1.57079633F;

		bodyModel[10].addBox(-4F, -8F, -4F, 1, 9, 6, 0F); // Import ImportPart_01
		bodyModel[10].setRotationPoint(36.5F, -118.5F, -1F);
		bodyModel[10].rotateAngleY = 1.57079633F;

		bodyModel[11].addBox(-4F, -8F, -4F, 1, 9, 6, 0F); // Import ImportPart_01
		bodyModel[11].setRotationPoint(36.5F, -118.5F, 8F);
		bodyModel[11].rotateAngleY = 1.57079633F;

		bodyModel[12].addBox(-4F, -8F, -4F, 19, 3, 3, 0F); // Import ImportPart_01
		bodyModel[12].setRotationPoint(41F, -129F, -5.5F);
		bodyModel[12].rotateAngleX = -1.36135682F;
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addBox(-4F, -8F, -4F, 2, 6, 6, 0F); // Import ImportPart_01
		bodyModel[13].setRotationPoint(34.5F, -114.5F, 11.5F);
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addBox(-4F, -8F, -4F, 2, 6, 6, 0F); // Import ImportPart_01
		bodyModel[14].setRotationPoint(34.5F, -114.5F, -5.5F);
		bodyModel[14].rotateAngleY = 1.57079633F;

		bodyModel[15].addBox(-4F, -8F, -4F, 16, 12, 34, 0F); // Import ImportPart_01
		bodyModel[15].setRotationPoint(14F, -134F, -22F);
		bodyModel[15].rotateAngleY = 1.57079633F;

		bodyModel[16].addBox(-4F, -8F, -4F, 16, 12, 34, 0F); // Import ImportPart_01
		bodyModel[16].setRotationPoint(14F, -134F, 14F);
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addBox(-4F, -8F, -4F, 8, 6, 28, 0F); // Import ImportPart_01
		bodyModel[17].setRotationPoint(12F, -138F, -12F);
		bodyModel[17].rotateAngleY = 1.57079633F;
		bodyModel[17].rotateAngleZ = 0.17453293F;

		bodyModel[18].addBox(-4F, -8F, -4F, 8, 6, 28, 0F); // Import ImportPart_01
		bodyModel[18].setRotationPoint(12F, -138F, 12F);
		bodyModel[18].rotateAngleY = 1.57079633F;
		bodyModel[18].rotateAngleZ = -0.17453293F;

		bodyModel[19].addBox(-4F, -8F, -4F, 8, 10, 30, 0F); // Import ImportPart_01
		bodyModel[19].setRotationPoint(13F, -136F, -18F);
		bodyModel[19].rotateAngleY = 1.57079633F;

		bodyModel[20].addBox(-4F, -8F, -4F, 8, 10, 30, 0F); // Import ImportPart_01
		bodyModel[20].setRotationPoint(13F, -136F, 18F);
		bodyModel[20].rotateAngleY = 1.57079633F;

		bodyModel[21].addBox(-4F, -8F, -4F, 16, 14, 3, 0F); // Import ImportPart_01
		bodyModel[21].setRotationPoint(26F, -138F, -4F);
		bodyModel[21].rotateAngleX = -1.43116999F;
		bodyModel[21].rotateAngleY = 1.57079633F;

		bodyModel[22].addBox(-4F, 0F, -2F, 19, 1, 32, 0F); // Import ImportPart_02
		bodyModel[22].setRotationPoint(-5.5F, -148F, 5.5F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addBox(-4F, -8F, -4F, 13, 14, 2, 0F); // Import ImportPart_01
		bodyModel[23].setRotationPoint(26.05F, -137.5F, -2.5F);
		bodyModel[23].rotateAngleX = -1.43116999F;
		bodyModel[23].rotateAngleY = 1.57079633F;

		bodyModel[24].addBox(-4F, -8F, -4F, 4, 6, 18, 0F); // Import ImportPart_01
		bodyModel[24].setRotationPoint(9F, -129F, -25F);
		bodyModel[24].rotateAngleY = 1.57079633F;

		bodyModel[25].addBox(-4F, -8F, -4F, 4, 6, 18, 0F); // Import ImportPart_01
		bodyModel[25].setRotationPoint(9F, -129F, 29F);
		bodyModel[25].rotateAngleY = 1.57079633F;

		bodyModel[26].addBox(-4F, -8F, -4F, 4, 14, 14, 0F); // Import ImportPart_01
		bodyModel[26].setRotationPoint(26F, -124F, 14F);
		bodyModel[26].rotateAngleY = 1.57079633F;

		bodyModel[27].addBox(-4F, -8F, -4F, 4, 14, 14, 0F); // Import ImportPart_01
		bodyModel[27].setRotationPoint(26F, -124F, -10F);
		bodyModel[27].rotateAngleY = 1.57079633F;

		bodyModel[28].addBox(-4F, 0F, -2F, 24, 9, 35, 0F); // Import ImportPart_02
		bodyModel[28].setRotationPoint(-7.5F, -114F, 8F);
		bodyModel[28].rotateAngleY = -1.57079633F;

		bodyModel[29].addBox(-4F, -8F, -4F, 10, 10, 10, 0F); // Import ImportPart_01
		bodyModel[29].setRotationPoint(25F, -123F, 18F);
		bodyModel[29].rotateAngleY = 1.57079633F;

		bodyModel[30].addBox(-4F, -8F, -4F, 10, 10, 10, 0F); // Import ImportPart_01
		bodyModel[30].setRotationPoint(25F, -123F, -20F);
		bodyModel[30].rotateAngleY = 1.57079633F;

		bodyModel[31].addBox(-4F, 0F, -2F, 22, 27, 14, 0F); // Import ImportPart_02
		bodyModel[31].setRotationPoint(-22F, -141F, 7F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addBox(-4F, 0F, -2F, 14, 4, 12, 0F); // Import ImportPart_02
		bodyModel[32].setRotationPoint(-19F, -114F, 3F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addBox(-4F, 0F, -2F, 18, 4, 18, 0F); // Import ImportPart_02
		bodyModel[33].setRotationPoint(-2F, -97F, 5F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addBox(-4F, -8F, -4F, 1, 4, 16, 0F); // Import ImportPart_01
		bodyModel[34].setRotationPoint(10F, -128F, -24F);
		bodyModel[34].rotateAngleY = 1.57079633F;

		bodyModel[35].addBox(-4F, -8F, -4F, 1, 4, 16, 0F); // Import ImportPart_01
		bodyModel[35].setRotationPoint(10F, -128F, 31F);
		bodyModel[35].rotateAngleY = 1.57079633F;

		bodyModel[36].addBox(-4F, 0F, -2F, 13, 4, 13, 0F); // Import ImportPart_02
		bodyModel[36].setRotationPoint(-17F, -113F, 2.5F);
		bodyModel[36].rotateAngleX = -0.34906585F;
		bodyModel[36].rotateAngleY = -1.57079633F;

		bodyModel[37].addBox(-4F, -8F, -4F, 2, 2, 2, 0F); // Import ImportPart_01
		bodyModel[37].setRotationPoint(37F, -115.5F, 0.5F);
		bodyModel[37].rotateAngleY = 1.57079633F;

		bodyModel[38].addBox(-4F, -8F, -4F, 2, 2, 2, 0F); // Import ImportPart_01
		bodyModel[38].setRotationPoint(37F, -112.5F, 0.5F);
		bodyModel[38].rotateAngleY = 1.57079633F;

		bodyModel[39].addBox(-4F, -8F, -4F, 4, 4, 2, 0F); // Import ImportPart_01
		bodyModel[39].setRotationPoint(37F, -116.5F, 3F);
		bodyModel[39].rotateAngleY = 1.57079633F;

		bodyModel[40].addBox(-4F, -8F, -4F, 3, 3, 1, 0F); // Import ImportPart_01
		bodyModel[40].setRotationPoint(37.25F, -116F, 3.5F);
		bodyModel[40].rotateAngleY = 1.57079633F;


		hipsModel = new ModelRendererTurbo[26];
		hipsModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[3] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[4] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[5] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[6] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportPart_02
		hipsModel[8] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Import ImportPart_02
		hipsModel[9] = new ModelRendererTurbo(this, 1801, 49, textureX, textureY); // Import ImportPart_02
		hipsModel[10] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import ImportPart_02
		hipsModel[11] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Import ImportPart_02
		hipsModel[12] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Import ImportPart_02
		hipsModel[13] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import ImportPart_02
		hipsModel[14] = new ModelRendererTurbo(this, 1665, 57, textureX, textureY); // Import ImportPart_02
		hipsModel[15] = new ModelRendererTurbo(this, 1929, 57, textureX, textureY); // Import ImportPart_02
		hipsModel[16] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[17] = new ModelRendererTurbo(this, 1353, 65, textureX, textureY); // Import ImportPart_02
		hipsModel[18] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[19] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[20] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[21] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[22] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[23] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[24] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Import ImportPart_02
		hipsModel[25] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import ImportPart_02

		hipsModel[0].addBox(-4F, 0F, -2F, 10, 10, 12, 0F); // Import ImportPart_02
		hipsModel[0].setRotationPoint(2F, -94F, 1F);
		hipsModel[0].rotateAngleY = -1.57079633F;

		hipsModel[1].addBox(-4F, 0F, -2F, 12, 11, 26, 0F); // Import ImportPart_02
		hipsModel[1].setRotationPoint(-6F, -90F, 2F);
		hipsModel[1].rotateAngleY = -1.57079633F;

		hipsModel[2].addBox(-4F, 0F, -2F, 12, 12, 6, 0F); // Import ImportPart_02
		hipsModel[2].setRotationPoint(22F, -100F, 2F);
		hipsModel[2].rotateAngleX = 0.2443461F;
		hipsModel[2].rotateAngleY = -1.57079633F;

		hipsModel[3].addBox(-4F, 0F, -2F, 4, 11, 26, 0F); // Import ImportPart_02
		hipsModel[3].setRotationPoint(-4F, -103F, 15F);
		hipsModel[3].rotateAngleY = -1.57079633F;

		hipsModel[4].addBox(-4F, 0F, -2F, 4, 11, 26, 0F); // Import ImportPart_02
		hipsModel[4].setRotationPoint(-4F, -103F, -19F);
		hipsModel[4].rotateAngleY = -1.57079633F;

		hipsModel[5].addBox(-4F, 0F, -2F, 26, 6, 6, 0F); // Import ImportPart_02
		hipsModel[5].setRotationPoint(4F, -86F, 9F);
		hipsModel[5].rotateAngleY = -1.57079633F;

		hipsModel[6].addBox(-4F, 0F, -2F, 27, 2, 2, 0F); // Import ImportPart_02
		hipsModel[6].setRotationPoint(1F, -96F, 9.5F);
		hipsModel[6].rotateAngleY = -1.57079633F;

		hipsModel[7].addBox(-4F, 0F, -2F, 6, 9, 2, 0F); // Import ImportPart_02
		hipsModel[7].setRotationPoint(21F, -102.5F, 14F);
		hipsModel[7].rotateAngleY = -1.57079633F;

		hipsModel[8].addBox(-4F, 0F, -2F, 6, 9, 2, 0F); // Import ImportPart_02
		hipsModel[8].setRotationPoint(21F, -102.5F, -16F);
		hipsModel[8].rotateAngleY = -1.57079633F;

		hipsModel[9].addBox(-4F, 0F, -2F, 4, 8, 20, 0F); // Import ImportPart_02
		hipsModel[9].setRotationPoint(-1F, -101F, 16F);
		hipsModel[9].rotateAngleY = -1.57079633F;

		hipsModel[10].addBox(-4F, 0F, -2F, 4, 8, 20, 0F); // Import ImportPart_02
		hipsModel[10].setRotationPoint(-1F, -101F, -20F);
		hipsModel[10].rotateAngleY = -1.57079633F;

		hipsModel[11].addBox(-4F, 0F, -2F, 8, 18, 4, 0F); // Import ImportPart_02
		hipsModel[11].setRotationPoint(-5F, -102F, 14F);
		hipsModel[11].rotateAngleX = -0.20943951F;
		hipsModel[11].rotateAngleY = -1.57079633F;

		hipsModel[12].addBox(-4F, 0F, -2F, 8, 18, 4, 0F); // Import ImportPart_02
		hipsModel[12].setRotationPoint(-5F, -102F, -14F);
		hipsModel[12].rotateAngleX = -0.20943951F;
		hipsModel[12].rotateAngleY = -1.57079633F;

		hipsModel[13].addBox(-4F, 0F, -2F, 27, 2, 2, 0F); // Import ImportPart_02
		hipsModel[13].setRotationPoint(12F, -96F, 9.5F);
		hipsModel[13].rotateAngleY = -1.57079633F;

		hipsModel[14].addBox(-4F, 0F, -2F, 14, 14, 6, 0F); // Import ImportPart_02
		hipsModel[14].setRotationPoint(20F, -101F, 3F);
		hipsModel[14].rotateAngleY = -1.57079633F;

		hipsModel[15].addBox(-4F, 0F, -2F, 8, 4, 12, 0F); // Import ImportPart_02
		hipsModel[15].setRotationPoint(8F, -96F, 0F);
		hipsModel[15].rotateAngleY = -1.57079633F;

		hipsModel[16].addBox(-4F, 0F, -2F, 10, 10, 6, 0F); // Import ImportPart_02
		hipsModel[16].setRotationPoint(20.75F, -90F, 1F);
		hipsModel[16].rotateAngleX = -0.6981317F;
		hipsModel[16].rotateAngleY = -1.57079633F;

		hipsModel[17].addBox(-4F, 0F, -2F, 10, 18, 2, 0F); // Import ImportPart_02
		hipsModel[17].setRotationPoint(-6F, -91F, 15F);
		hipsModel[17].rotateAngleX = -0.20943951F;
		hipsModel[17].rotateAngleY = -1.57079633F;

		hipsModel[18].addBox(-4F, 0F, -2F, 10, 18, 2, 0F); // Import ImportPart_02
		hipsModel[18].setRotationPoint(-6F, -91F, -13F);
		hipsModel[18].rotateAngleX = -0.20943951F;
		hipsModel[18].rotateAngleY = -1.57079633F;

		hipsModel[19].addBox(-4F, 0F, -2F, 7, 16, 4, 0F); // Import ImportPart_02
		hipsModel[19].setRotationPoint(-6F, -101F, 13.5F);
		hipsModel[19].rotateAngleX = -0.20943951F;
		hipsModel[19].rotateAngleY = -1.57079633F;

		hipsModel[20].addBox(-4F, 0F, -2F, 7, 16, 4, 0F); // Import ImportPart_02
		hipsModel[20].setRotationPoint(-6F, -101F, -14.5F);
		hipsModel[20].rotateAngleX = -0.20943951F;
		hipsModel[20].rotateAngleY = -1.57079633F;

		hipsModel[21].addBox(-4F, 0F, -2F, 12, 12, 4, 0F); // Import ImportPart_02
		hipsModel[21].setRotationPoint(-12F, -102F, 2F);
		hipsModel[21].rotateAngleX = -0.17453293F;
		hipsModel[21].rotateAngleY = -1.57079633F;

		hipsModel[22].addBox(-4F, 0F, -2F, 14, 14, 6, 0F); // Import ImportPart_02
		hipsModel[22].setRotationPoint(-12F, -103F, 3F);
		hipsModel[22].rotateAngleY = -1.57079633F;

		hipsModel[23].addBox(-4F, 0F, -2F, 10, 10, 6, 0F); // Import ImportPart_02
		hipsModel[23].setRotationPoint(-11.25F, -92F, 1F);
		hipsModel[23].rotateAngleX = 0.6981317F;
		hipsModel[23].rotateAngleY = -1.57079633F;

		hipsModel[24].addBox(-4F, 0F, -2F, 11, 11, 24, 0F); // Import ImportPart_02
		hipsModel[24].setRotationPoint(-5F, -89F, 1.5F);
		hipsModel[24].rotateAngleY = -1.57079633F;

		hipsModel[25].addBox(-4F, 0F, -2F, 20, 9, 3, 0F); // Import ImportPart_02
		hipsModel[25].setRotationPoint(21F, -100F, 6F);
		hipsModel[25].rotateAngleX = 0.13962634F;
		hipsModel[25].rotateAngleY = -1.57079633F;


		leftArmModel = new ModelRendererTurbo[41];
		leftArmModel[0] = new ModelRendererTurbo(this, 1961, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[1] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[2] = new ModelRendererTurbo(this, 1105, 17, textureX, textureY); // Import ImportPart_01
		leftArmModel[3] = new ModelRendererTurbo(this, 1153, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[4] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[5] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[6] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[7] = new ModelRendererTurbo(this, 1593, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[8] = new ModelRendererTurbo(this, 1929, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[9] = new ModelRendererTurbo(this, 2025, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[10] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[11] = new ModelRendererTurbo(this, 1345, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[12] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Import ImportPart_01
		leftArmModel[13] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[14] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import ImportPart_01
		leftArmModel[15] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[16] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[17] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[18] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[19] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[20] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[21] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[22] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[23] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[24] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[25] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[26] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 218
		leftArmModel[28] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[29] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[30] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Import ImportPart_01
		leftArmModel[31] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import ImportPart_01
		leftArmModel[32] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[33] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[34] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[35] = new ModelRendererTurbo(this, 1521, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[36] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[37] = new ModelRendererTurbo(this, 1881, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[38] = new ModelRendererTurbo(this, 1513, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[39] = new ModelRendererTurbo(this, 1561, 73, textureX, textureY); // Import ImportPart_01
		leftArmModel[40] = new ModelRendererTurbo(this, 1025, 73, textureX, textureY); // Import ImportPart_01

		leftArmModel[0].addBox(-4F, -8F, -4F, 12, 15, 16, 0F); // Import ImportPart_01
		leftArmModel[0].setRotationPoint(2F, 0F, 5F);
		leftArmModel[0].rotateAngleX = 1.57079633F;
		leftArmModel[0].rotateAngleY = 1.57079633F;

		leftArmModel[1].addBox(-4F, -8F, -4F, 10, 9, 13, 0F); // Import ImportPart_01
		leftArmModel[1].setRotationPoint(-13F, -1F, 6F);
		leftArmModel[1].rotateAngleX = 1.57079633F;
		leftArmModel[1].rotateAngleY = 1.57079633F;

		leftArmModel[2].addBox(-4F, -8F, -4F, 2, 16, 18, 0F); // Import ImportPart_01
		leftArmModel[2].setRotationPoint(4F, -1F, 16F);
		leftArmModel[2].rotateAngleX = 1.57079633F;
		leftArmModel[2].rotateAngleY = 1.57079633F;

		leftArmModel[3].addBox(-4F, -8F, -4F, 10, 13, 16, 0F); // Import ImportPart_01
		leftArmModel[3].setRotationPoint(1F, 1F, 6F);
		leftArmModel[3].rotateAngleX = 1.57079633F;
		leftArmModel[3].rotateAngleY = 1.57079633F;

		leftArmModel[4].addBox(-4F, -8F, -4F, 10, 17, 14, 0F); // Import ImportPart_01
		leftArmModel[4].setRotationPoint(-28F, 12F, 6F);
		leftArmModel[4].rotateAngleX = -2.7925268F;
		leftArmModel[4].rotateAngleY = 1.57079633F;

		leftArmModel[5].addBox(-4F, -8F, -4F, 8, 17, 9, 0F); // Import ImportPart_01
		leftArmModel[5].setRotationPoint(-28F, 24F, 7F);
		leftArmModel[5].rotateAngleX = -2.7925268F;
		leftArmModel[5].rotateAngleY = 1.57079633F;

		leftArmModel[6].addBox(-4F, -8F, -4F, 9, 10, 12, 0F); // Import ImportPart_01
		leftArmModel[6].setRotationPoint(-31F, 25.5F, 6.5F);
		leftArmModel[6].rotateAngleX = -2.7925268F;
		leftArmModel[6].rotateAngleY = 1.57079633F;

		leftArmModel[7].addBox(-4F, -8F, -4F, 8, 14, 4, 0F); // Import ImportPart_01
		leftArmModel[7].setRotationPoint(-17F, 15F, 7F);
		leftArmModel[7].rotateAngleX = -2.7925268F;
		leftArmModel[7].rotateAngleY = 1.57079633F;

		leftArmModel[8].addBox(-4F, -8F, -4F, 8, 14, 5, 0F); // Import ImportPart_01
		leftArmModel[8].setRotationPoint(-31F, 9F, 7F);
		leftArmModel[8].rotateAngleX = -2.7925268F;
		leftArmModel[8].rotateAngleY = 1.57079633F;

		leftArmModel[9].addBox(-4F, -8F, -4F, 9, 17, 2, 0F); // Import ImportPart_01
		leftArmModel[9].setRotationPoint(-33F, 10F, 6.5F);
		leftArmModel[9].rotateAngleX = -2.7925268F;
		leftArmModel[9].rotateAngleY = 1.57079633F;

		leftArmModel[10].addBox(-4F, -8F, -4F, 8, 14, 1, 0F); // Import ImportPart_01
		leftArmModel[10].setRotationPoint(-33F, 8F, 7F);
		leftArmModel[10].rotateAngleX = -2.7925268F;
		leftArmModel[10].rotateAngleY = 1.57079633F;

		leftArmModel[11].addBox(-4F, -8F, -4F, 8, 14, 8, 0F); // Import ImportPart_01
		leftArmModel[11].setRotationPoint(-21F, 5F, 7F);
		leftArmModel[11].rotateAngleX = -2.7925268F;
		leftArmModel[11].rotateAngleY = 1.57079633F;

		leftArmModel[12].addBox(-4F, -8F, -4F, 9, 10, 9, 0F); // Import ImportPart_01
		leftArmModel[12].setRotationPoint(-21F, -3F, 6.5F);
		leftArmModel[12].rotateAngleX = 1.57079633F;
		leftArmModel[12].rotateAngleY = 1.57079633F;

		leftArmModel[13].addBox(-4F, -8F, -4F, 4, 10, 6, 0F); // Import ImportPart_01
		leftArmModel[13].setRotationPoint(-29F, 30F, 9F);
		leftArmModel[13].rotateAngleX = -2.7925268F;
		leftArmModel[13].rotateAngleY = 1.57079633F;

		leftArmModel[14].addBox(-4F, -8F, -4F, 5, 8, 8, 0F); // Import ImportPart_01
		leftArmModel[14].setRotationPoint(-32F, 35.5F, 8.5F);
		leftArmModel[14].rotateAngleX = -2.7925268F;
		leftArmModel[14].rotateAngleY = 1.57079633F;

		leftArmModel[15].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		leftArmModel[15].setRotationPoint(-27F, 41.5F, 8F);
		leftArmModel[15].rotateAngleX = -2.7925268F;
		leftArmModel[15].rotateAngleY = 1.57079633F;

		leftArmModel[16].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		leftArmModel[16].setRotationPoint(-30F, 41.5F, 8F);
		leftArmModel[16].rotateAngleX = -2.7925268F;
		leftArmModel[16].rotateAngleY = 1.57079633F;

		leftArmModel[17].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		leftArmModel[17].setRotationPoint(-33F, 39.5F, 8F);
		leftArmModel[17].rotateAngleX = -2.7925268F;
		leftArmModel[17].rotateAngleY = 1.57079633F;

		leftArmModel[18].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		leftArmModel[18].setRotationPoint(-27F, 41.5F, 4.5F);
		leftArmModel[18].rotateAngleX = -2.7925268F;
		leftArmModel[18].rotateAngleY = 1.57079633F;

		leftArmModel[19].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		leftArmModel[19].setRotationPoint(-30F, 41.5F, 4.5F);
		leftArmModel[19].rotateAngleX = -2.7925268F;
		leftArmModel[19].rotateAngleY = 1.57079633F;

		leftArmModel[20].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		leftArmModel[20].setRotationPoint(-33F, 39.5F, 4.5F);
		leftArmModel[20].rotateAngleX = -2.7925268F;
		leftArmModel[20].rotateAngleY = 1.57079633F;

		leftArmModel[21].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		leftArmModel[21].setRotationPoint(-27F, 43.5F, 5.5F);
		leftArmModel[21].rotateAngleX = -2.7925268F;
		leftArmModel[21].rotateAngleY = 1.57079633F;

		leftArmModel[22].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		leftArmModel[22].setRotationPoint(-30F, 43.5F, 5.5F);
		leftArmModel[22].rotateAngleX = -2.7925268F;
		leftArmModel[22].rotateAngleY = 1.57079633F;

		leftArmModel[23].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		leftArmModel[23].setRotationPoint(-33F, 41.5F, 5.5F);
		leftArmModel[23].rotateAngleX = -2.7925268F;
		leftArmModel[23].rotateAngleY = 1.57079633F;

		leftArmModel[24].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		leftArmModel[24].setRotationPoint(-27F, 35.5F, 8F);
		leftArmModel[24].rotateAngleX = -3.36848546F;
		leftArmModel[24].rotateAngleY = 1.57079633F;

		leftArmModel[25].addBox(-4F, -8F, -4F, 1, 4, 2, 0F); // Import ImportPart_01
		leftArmModel[25].setRotationPoint(-27F, 36F, 5.5F);
		leftArmModel[25].rotateAngleX = -3.36848546F;
		leftArmModel[25].rotateAngleY = 1.57079633F;

		leftArmModel[26].addBox(-4F, -8F, -4F, 3, 2, 1, 0F); // Import ImportPart_01
		leftArmModel[26].setRotationPoint(-26F, 37F, 6.5F);
		leftArmModel[26].rotateAngleX = -3.36848546F;
		leftArmModel[26].rotateAngleY = 1.57079633F;

		leftArmModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		leftArmModel[27].setRotationPoint(-1F, 0F, 0F);

		leftArmModel[28].addBox(-4F, -8F, -4F, 10, 14, 10, 0F); // Import ImportPart_01
		leftArmModel[28].setRotationPoint(-24F, 11F, 7F);
		leftArmModel[28].rotateAngleX = -2.7925268F;
		leftArmModel[28].rotateAngleY = 1.57079633F;

		leftArmModel[29].addBox(-4F, -8F, -4F, 7, 16, 10, 0F); // Import ImportPart_01
		leftArmModel[29].setRotationPoint(1F, -12F, 7.5F);
		leftArmModel[29].rotateAngleX = 1.57079633F;
		leftArmModel[29].rotateAngleY = 1.57079633F;

		leftArmModel[30].addBox(-4F, -8F, -4F, 6, 8, 10, 0F); // Import ImportPart_01
		leftArmModel[30].setRotationPoint(-11F, -9F, 8F);
		leftArmModel[30].rotateAngleX = 1.22173048F;
		leftArmModel[30].rotateAngleY = 1.57079633F;

		leftArmModel[31].addBox(-4F, -8F, -4F, 2, 8, 9, 0F); // Import ImportPart_01
		leftArmModel[31].setRotationPoint(-33F, 36.5F, 12.5F);
		leftArmModel[31].rotateAngleX = -2.7925268F;
		leftArmModel[31].rotateAngleY = 1.57079633F;

		leftArmModel[32].addBox(-4F, -8F, -4F, 4, 15, 17, 0F); // Import ImportPart_01
		leftArmModel[32].setRotationPoint(3.5F, -1.5F, 17F);
		leftArmModel[32].rotateAngleX = 1.57079633F;
		leftArmModel[32].rotateAngleY = 1.57079633F;

		leftArmModel[33].addBox(-4F, -8F, -4F, 6, 9, 5, 0F); // Import ImportPart_01
		leftArmModel[33].setRotationPoint(-19F, -14F, 8F);
		leftArmModel[33].rotateAngleX = -2.26892803F;
		leftArmModel[33].rotateAngleY = 1.57079633F;

		leftArmModel[34].addBox(-4F, -8F, -4F, 9, 12, 2, 0F); // Import ImportPart_01
		leftArmModel[34].setRotationPoint(-21F, -14F, 6.5F);
		leftArmModel[34].rotateAngleX = -2.26892803F;
		leftArmModel[34].rotateAngleY = 1.57079633F;

		leftArmModel[35].addBox(-4F, -8F, -4F, 8, 9, 1, 0F); // Import ImportPart_01
		leftArmModel[35].setRotationPoint(-21F, -15F, 7F);
		leftArmModel[35].rotateAngleX = -2.26892803F;
		leftArmModel[35].rotateAngleY = 1.57079633F;

		leftArmModel[36].addBox(-4F, -8F, -4F, 4, 6, 7, 0F); // Import ImportPart_01
		leftArmModel[36].setRotationPoint(-15F, -11F, 9F);
		leftArmModel[36].rotateAngleX = -2.26892803F;
		leftArmModel[36].rotateAngleY = 1.57079633F;

		leftArmModel[37].addBox(-4F, -8F, -4F, 7, 2, 6, 0F); // Import ImportPart_01
		leftArmModel[37].setRotationPoint(-19.5F, -14F, 7.5F);
		leftArmModel[37].rotateAngleX = 1.57079633F;
		leftArmModel[37].rotateAngleY = 1.57079633F;

		leftArmModel[38].addBox(-4F, -8F, -4F, 6, 7, 6, 0F); // Import ImportPart_01
		leftArmModel[38].setRotationPoint(14F, -11F, 8F);
		leftArmModel[38].rotateAngleX = -1.22173048F;
		leftArmModel[38].rotateAngleY = 1.57079633F;

		leftArmModel[39].addBox(-4F, -8F, -4F, 9, 4, 15, 0F); // Import ImportPart_01
		leftArmModel[39].setRotationPoint(5.25F, -2F, 6.5F);
		leftArmModel[39].rotateAngleX = 1.57079633F;
		leftArmModel[39].rotateAngleY = 1.57079633F;

		leftArmModel[40].addBox(-4F, -8F, -4F, 8, 2, 15, 0F); // Import ImportPart_01
		leftArmModel[40].setRotationPoint(7.25F, -5F, 7F);
		leftArmModel[40].rotateAngleX = 1.57079633F;
		leftArmModel[40].rotateAngleY = 1.57079633F;


		rightArmModel = new ModelRendererTurbo[41];
		rightArmModel[0] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[1] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[2] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Import ImportPart_01
		rightArmModel[3] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[4] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[5] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[6] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[7] = new ModelRendererTurbo(this, 1849, 25, textureX, textureY); // Import ImportPart_01
		rightArmModel[8] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[9] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[10] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[11] = new ModelRendererTurbo(this, 1721, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[12] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import ImportPart_01
		rightArmModel[13] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[14] = new ModelRendererTurbo(this, 1025, 49, textureX, textureY); // Import ImportPart_01
		rightArmModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[16] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[17] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[18] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[19] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[20] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[21] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[22] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[23] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[24] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[25] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[26] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[27] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 218
		rightArmModel[28] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[29] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[30] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import ImportPart_01
		rightArmModel[31] = new ModelRendererTurbo(this, 1745, 57, textureX, textureY); // Import ImportPart_01
		rightArmModel[32] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[33] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[34] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[35] = new ModelRendererTurbo(this, 1193, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[36] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[37] = new ModelRendererTurbo(this, 1257, 65, textureX, textureY); // Import ImportPart_01
		rightArmModel[38] = new ModelRendererTurbo(this, 1545, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[39] = new ModelRendererTurbo(this, 1753, 73, textureX, textureY); // Import ImportPart_01
		rightArmModel[40] = new ModelRendererTurbo(this, 1057, 81, textureX, textureY); // Import ImportPart_01

		rightArmModel[0].addBox(-4F, -8F, -4F, 12, 15, 16, 0F); // Import ImportPart_01
		rightArmModel[0].setRotationPoint(2F, 0F, -8F);
		rightArmModel[0].rotateAngleX = 1.57079633F;
		rightArmModel[0].rotateAngleY = 1.57079633F;

		rightArmModel[1].addBox(-4F, -8F, -4F, 10, 9, 13, 0F); // Import ImportPart_01
		rightArmModel[1].setRotationPoint(-13F, -1F, -7F);
		rightArmModel[1].rotateAngleX = 1.57079633F;
		rightArmModel[1].rotateAngleY = 1.57079633F;

		rightArmModel[2].addBox(-4F, -8F, -4F, 2, 16, 18, 0F); // Import ImportPart_01
		rightArmModel[2].setRotationPoint(4F, -1F, -9F);
		rightArmModel[2].rotateAngleX = 1.57079633F;
		rightArmModel[2].rotateAngleY = 1.57079633F;

		rightArmModel[3].addBox(-4F, -8F, -4F, 10, 13, 16, 0F); // Import ImportPart_01
		rightArmModel[3].setRotationPoint(1F, 1F, -7F);
		rightArmModel[3].rotateAngleX = 1.57079633F;
		rightArmModel[3].rotateAngleY = 1.57079633F;

		rightArmModel[4].addBox(-4F, -8F, -4F, 10, 17, 14, 0F); // Import ImportPart_01
		rightArmModel[4].setRotationPoint(-28F, 12F, -7F);
		rightArmModel[4].rotateAngleX = -2.7925268F;
		rightArmModel[4].rotateAngleY = 1.57079633F;

		rightArmModel[5].addBox(-4F, -8F, -4F, 8, 17, 9, 0F); // Import ImportPart_01
		rightArmModel[5].setRotationPoint(-28F, 24F, -6F);
		rightArmModel[5].rotateAngleX = -2.7925268F;
		rightArmModel[5].rotateAngleY = 1.57079633F;

		rightArmModel[6].addBox(-4F, -8F, -4F, 9, 10, 12, 0F); // Import ImportPart_01
		rightArmModel[6].setRotationPoint(-31F, 25.5F, -6.5F);
		rightArmModel[6].rotateAngleX = -2.7925268F;
		rightArmModel[6].rotateAngleY = 1.57079633F;

		rightArmModel[7].addBox(-4F, -8F, -4F, 8, 14, 4, 0F); // Import ImportPart_01
		rightArmModel[7].setRotationPoint(-17F, 15F, -6F);
		rightArmModel[7].rotateAngleX = -2.7925268F;
		rightArmModel[7].rotateAngleY = 1.57079633F;

		rightArmModel[8].addBox(-4F, -8F, -4F, 8, 14, 5, 0F); // Import ImportPart_01
		rightArmModel[8].setRotationPoint(-31F, 9F, -6F);
		rightArmModel[8].rotateAngleX = -2.7925268F;
		rightArmModel[8].rotateAngleY = 1.57079633F;

		rightArmModel[9].addBox(-4F, -8F, -4F, 9, 17, 2, 0F); // Import ImportPart_01
		rightArmModel[9].setRotationPoint(-33F, 10F, -6.5F);
		rightArmModel[9].rotateAngleX = -2.7925268F;
		rightArmModel[9].rotateAngleY = 1.57079633F;

		rightArmModel[10].addBox(-4F, -8F, -4F, 8, 14, 1, 0F); // Import ImportPart_01
		rightArmModel[10].setRotationPoint(-33F, 8F, -6F);
		rightArmModel[10].rotateAngleX = -2.7925268F;
		rightArmModel[10].rotateAngleY = 1.57079633F;

		rightArmModel[11].addBox(-4F, -8F, -4F, 8, 14, 8, 0F); // Import ImportPart_01
		rightArmModel[11].setRotationPoint(-21F, 5F, -6F);
		rightArmModel[11].rotateAngleX = -2.7925268F;
		rightArmModel[11].rotateAngleY = 1.57079633F;

		rightArmModel[12].addBox(-4F, -8F, -4F, 9, 10, 9, 0F); // Import ImportPart_01
		rightArmModel[12].setRotationPoint(-21F, -3F, -6.5F);
		rightArmModel[12].rotateAngleX = 1.57079633F;
		rightArmModel[12].rotateAngleY = 1.57079633F;

		rightArmModel[13].addBox(-4F, -8F, -4F, 4, 10, 6, 0F); // Import ImportPart_01
		rightArmModel[13].setRotationPoint(-29F, 30F, -4F);
		rightArmModel[13].rotateAngleX = -2.7925268F;
		rightArmModel[13].rotateAngleY = 1.57079633F;

		rightArmModel[14].addBox(-4F, -8F, -4F, 5, 8, 8, 0F); // Import ImportPart_01
		rightArmModel[14].setRotationPoint(-32F, 35.5F, -4.5F);
		rightArmModel[14].rotateAngleX = -2.7925268F;
		rightArmModel[14].rotateAngleY = 1.57079633F;

		rightArmModel[15].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		rightArmModel[15].setRotationPoint(-27F, 41.5F, -1F);
		rightArmModel[15].rotateAngleX = -2.7925268F;
		rightArmModel[15].rotateAngleY = 1.57079633F;

		rightArmModel[16].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		rightArmModel[16].setRotationPoint(-30F, 41.5F, -1F);
		rightArmModel[16].rotateAngleX = -2.7925268F;
		rightArmModel[16].rotateAngleY = 1.57079633F;

		rightArmModel[17].addBox(-4F, -8F, -4F, 2, 6, 2, 0F); // Import ImportPart_01
		rightArmModel[17].setRotationPoint(-33F, 39.5F, -1F);
		rightArmModel[17].rotateAngleX = -2.7925268F;
		rightArmModel[17].rotateAngleY = 1.57079633F;

		rightArmModel[18].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		rightArmModel[18].setRotationPoint(-27F, 41.5F, 2.5F);
		rightArmModel[18].rotateAngleX = -2.7925268F;
		rightArmModel[18].rotateAngleY = 1.57079633F;

		rightArmModel[19].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		rightArmModel[19].setRotationPoint(-30F, 41.5F, 2.5F);
		rightArmModel[19].rotateAngleX = -2.7925268F;
		rightArmModel[19].rotateAngleY = 1.57079633F;

		rightArmModel[20].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		rightArmModel[20].setRotationPoint(-33F, 39.5F, 2.5F);
		rightArmModel[20].rotateAngleX = -2.7925268F;
		rightArmModel[20].rotateAngleY = 1.57079633F;

		rightArmModel[21].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		rightArmModel[21].setRotationPoint(-27F, 43.5F, -0.5F);
		rightArmModel[21].rotateAngleX = -2.7925268F;
		rightArmModel[21].rotateAngleY = 1.57079633F;

		rightArmModel[22].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		rightArmModel[22].setRotationPoint(-30F, 43.5F, -0.5F);
		rightArmModel[22].rotateAngleX = -2.7925268F;
		rightArmModel[22].rotateAngleY = 1.57079633F;

		rightArmModel[23].addBox(-4F, -8F, -4F, 4, 2, 1, 0F); // Import ImportPart_01
		rightArmModel[23].setRotationPoint(-33F, 41.5F, -0.5F);
		rightArmModel[23].rotateAngleX = -2.7925268F;
		rightArmModel[23].rotateAngleY = 1.57079633F;

		rightArmModel[24].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		rightArmModel[24].setRotationPoint(-27F, 35.5F, -1F);
		rightArmModel[24].rotateAngleX = -3.36848546F;
		rightArmModel[24].rotateAngleY = 1.57079633F;

		rightArmModel[25].addBox(-4F, -8F, -4F, 1, 4, 2, 0F); // Import ImportPart_01
		rightArmModel[25].setRotationPoint(-27F, 36F, 2.5F);
		rightArmModel[25].rotateAngleX = -3.36848546F;
		rightArmModel[25].rotateAngleY = 1.57079633F;

		rightArmModel[26].addBox(-4F, -8F, -4F, 3, 2, 1, 0F); // Import ImportPart_01
		rightArmModel[26].setRotationPoint(-26F, 37F, -0.5F);
		rightArmModel[26].rotateAngleX = -3.36848546F;
		rightArmModel[26].rotateAngleY = 1.57079633F;

		rightArmModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		rightArmModel[27].setRotationPoint(-1F, 0F, 0F);

		rightArmModel[28].addBox(-4F, -8F, -4F, 10, 14, 10, 0F); // Import ImportPart_01
		rightArmModel[28].setRotationPoint(-24F, 11F, -8F);
		rightArmModel[28].rotateAngleX = -2.7925268F;
		rightArmModel[28].rotateAngleY = 1.57079633F;

		rightArmModel[29].addBox(-4F, -8F, -4F, 7, 16, 10, 0F); // Import ImportPart_01
		rightArmModel[29].setRotationPoint(1F, -12F, -5.5F);
		rightArmModel[29].rotateAngleX = 1.57079633F;
		rightArmModel[29].rotateAngleY = 1.57079633F;

		rightArmModel[30].addBox(-4F, -8F, -4F, 6, 8, 10, 0F); // Import ImportPart_01
		rightArmModel[30].setRotationPoint(-11F, -9F, -5F);
		rightArmModel[30].rotateAngleX = 1.22173048F;
		rightArmModel[30].rotateAngleY = 1.57079633F;

		rightArmModel[31].addBox(-4F, -8F, -4F, 2, 8, 9, 0F); // Import ImportPart_01
		rightArmModel[31].setRotationPoint(-33F, 36.5F, -5.5F);
		rightArmModel[31].rotateAngleX = -2.7925268F;
		rightArmModel[31].rotateAngleY = 1.57079633F;

		rightArmModel[32].addBox(-4F, -8F, -4F, 4, 15, 17, 0F); // Import ImportPart_01
		rightArmModel[32].setRotationPoint(3.5F, -1.5F, -12F);
		rightArmModel[32].rotateAngleX = 1.57079633F;
		rightArmModel[32].rotateAngleY = 1.57079633F;

		rightArmModel[33].addBox(-4F, -8F, -4F, 6, 9, 5, 0F); // Import ImportPart_01
		rightArmModel[33].setRotationPoint(-19F, -14F, -5F);
		rightArmModel[33].rotateAngleX = -2.26892803F;
		rightArmModel[33].rotateAngleY = 1.57079633F;

		rightArmModel[34].addBox(-4F, -8F, -4F, 9, 12, 2, 0F); // Import ImportPart_01
		rightArmModel[34].setRotationPoint(-21F, -14F, -6.5F);
		rightArmModel[34].rotateAngleX = -2.26892803F;
		rightArmModel[34].rotateAngleY = 1.57079633F;

		rightArmModel[35].addBox(-4F, -8F, -4F, 8, 9, 1, 0F); // Import ImportPart_01
		rightArmModel[35].setRotationPoint(-21F, -15F, -6F);
		rightArmModel[35].rotateAngleX = -2.26892803F;
		rightArmModel[35].rotateAngleY = 1.57079633F;

		rightArmModel[36].addBox(-4F, -8F, -4F, 4, 6, 7, 0F); // Import ImportPart_01
		rightArmModel[36].setRotationPoint(-15F, -11F, -4F);
		rightArmModel[36].rotateAngleX = -2.26892803F;
		rightArmModel[36].rotateAngleY = 1.57079633F;

		rightArmModel[37].addBox(-4F, -8F, -4F, 7, 2, 6, 0F); // Import ImportPart_01
		rightArmModel[37].setRotationPoint(-19.5F, -14F, -5.5F);
		rightArmModel[37].rotateAngleX = 1.57079633F;
		rightArmModel[37].rotateAngleY = 1.57079633F;

		rightArmModel[38].addBox(-4F, -8F, -4F, 6, 7, 6, 0F); // Import ImportPart_01
		rightArmModel[38].setRotationPoint(14F, -11F, -5F);
		rightArmModel[38].rotateAngleX = -1.22173048F;
		rightArmModel[38].rotateAngleY = 1.57079633F;

		rightArmModel[39].addBox(-4F, -8F, -4F, 9, 4, 15, 0F); // Import ImportPart_01
		rightArmModel[39].setRotationPoint(5.25F, -2F, -6.5F);
		rightArmModel[39].rotateAngleX = 1.57079633F;
		rightArmModel[39].rotateAngleY = 1.57079633F;

		rightArmModel[40].addBox(-4F, -8F, -4F, 8, 2, 15, 0F); // Import ImportPart_01
		rightArmModel[40].setRotationPoint(7.25F, -5F, -6F);
		rightArmModel[40].rotateAngleX = 1.57079633F;
		rightArmModel[40].rotateAngleY = 1.57079633F;


		leftLegModel = new ModelRendererTurbo[23];
		leftLegModel[0] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[2] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[3] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[4] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[5] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[6] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[7] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[8] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[11] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[12] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[13] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[14] = new ModelRendererTurbo(this, 1865, 57, textureX, textureY); // Import ImportPart_06
		leftLegModel[15] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import ImportPart_06
		leftLegModel[16] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Import ImportPart_06
		leftLegModel[17] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Import ImportPart_06
		leftLegModel[18] = new ModelRendererTurbo(this, 1225, 65, textureX, textureY); // Import ImportPart_06
		leftLegModel[19] = new ModelRendererTurbo(this, 1617, 65, textureX, textureY); // Import ImportPart_06
		leftLegModel[20] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Import ImportPart_06
		leftLegModel[21] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportPart_06
		leftLegModel[22] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import ImportPart_06

		leftLegModel[0].addBox(-2F, 0F, -2F, 17, 16, 12, 0F); // Import ImportPart_06
		leftLegModel[0].setRotationPoint(-2F, -84F, 13F);
		leftLegModel[0].rotateAngleZ = 0.41887902F;

		leftLegModel[1].addBox(-2F, 0F, -2F, 8, 20, 2, 0F); // Import ImportPart_06
		leftLegModel[1].setRotationPoint(2F, -28F, 18F);
		leftLegModel[1].rotateAngleZ = 0.17453293F;

		leftLegModel[2].addBox(-2F, 0F, -2F, 16, 8, 11, 0F); // Import ImportPart_06
		leftLegModel[2].setRotationPoint(21F, -49F, 12.5F);
		leftLegModel[2].rotateAngleZ = 1.36135682F;

		leftLegModel[3].addBox(-2F, 0F, -2F, 13, 18, 12, 0F); // Import ImportPart_06
		leftLegModel[3].setRotationPoint(2F, -33F, 13F);
		leftLegModel[3].rotateAngleZ = 0.20943951F;

		leftLegModel[4].addBox(-2F, 0F, -2F, 18, 4, 11, 0F); // Import ImportPart_06
		leftLegModel[4].setRotationPoint(1F, -10F, 13.5F);

		leftLegModel[5].addBox(-2F, 0F, -2F, 16, 14, 8, 0F); // Import ImportPart_06
		leftLegModel[5].setRotationPoint(-1F, -82F, 15F);

		leftLegModel[6].addBox(-2F, 0F, -2F, 10, 16, 6, 0F); // Import ImportPart_06
		leftLegModel[6].setRotationPoint(4F, -48F, 16F);

		leftLegModel[7].addBox(-2F, 0F, -2F, 8, 20, 2, 0F); // Import ImportPart_06
		leftLegModel[7].setRotationPoint(2F, -28F, 22F);
		leftLegModel[7].rotateAngleZ = 0.17453293F;

		leftLegModel[8].addBox(-2F, 0F, -2F, 18, 2, 11, 0F); // Import ImportPart_06
		leftLegModel[8].setRotationPoint(-3F, -2F, 19.5F);

		leftLegModel[9].addBox(-2F, 0F, -2F, 9, 3, 2, 0F); // Import ImportPart_06
		leftLegModel[9].setRotationPoint(-2F, -5F, 28.5F);

		leftLegModel[10].addBox(-2F, 0F, -2F, 5, 4, 2, 0F); // Import ImportPart_06
		leftLegModel[10].setRotationPoint(9F, -6F, 28.5F);

		leftLegModel[11].addBox(-2F, 0F, -2F, 12, 20, 11, 0F); // Import ImportPart_06
		leftLegModel[11].setRotationPoint(20F, -56F, 13.5F);
		leftLegModel[11].rotateAngleZ = -1.18682389F;

		leftLegModel[12].addBox(-2F, 0F, -2F, 10, 6, 4, 0F); // Import ImportPart_06
		leftLegModel[12].setRotationPoint(1F, -36F, 17F);

		leftLegModel[13].addBox(-2F, 0F, -2F, 16, 10, 14, 0F); // Import ImportPart_06
		leftLegModel[13].setRotationPoint(10F, -55F, 12F);

		leftLegModel[14].addBox(-2F, 0F, -2F, 22, 24, 18, 0F); // Import ImportPart_06
		leftLegModel[14].setRotationPoint(-2F, -69F, 10F);
		leftLegModel[14].rotateAngleZ = 0.41887902F;

		leftLegModel[15].addBox(-2F, 0F, -2F, 15, 20, 20, 0F); // Import ImportPart_06
		leftLegModel[15].setRotationPoint(2F, -69F, 9F);
		leftLegModel[15].rotateAngleZ = 0.41887902F;

		leftLegModel[16].addBox(-2F, 0F, -2F, 4, 8, 7, 0F); // Import ImportPart_06
		leftLegModel[16].setRotationPoint(-3F, -38F, 15.5F);
		leftLegModel[16].rotateAngleZ = -0.87266463F;

		leftLegModel[17].addBox(-2F, 0F, -2F, 13, 19, 15, 0F); // Import ImportPart_06
		leftLegModel[17].setRotationPoint(-2F, -31F, 11.5F);
		leftLegModel[17].rotateAngleZ = 0.20943951F;

		leftLegModel[18].addBox(-2F, 0F, -2F, 6, 22, 14, 0F); // Import ImportPart_06
		leftLegModel[18].setRotationPoint(17F, -76F, 12F);
		leftLegModel[18].rotateAngleZ = 0.41887902F;

		leftLegModel[19].addBox(-2F, 0F, -2F, 12, 6, 14, 0F); // Import ImportPart_06
		leftLegModel[19].setRotationPoint(13F, -21F, 12F);
		leftLegModel[19].rotateAngleZ = -0.06981317F;

		leftLegModel[20].addBox(-2F, 0F, -2F, 2, 6, 11, 0F); // Import ImportPart_06
		leftLegModel[20].setRotationPoint(20.95F, -25F, 13.5F);
		leftLegModel[20].rotateAngleZ = 0.20943951F;

		leftLegModel[21].addBox(-2F, 0F, -2F, 10, 4, 3, 0F); // Import ImportPart_06
		leftLegModel[21].setRotationPoint(-4F, -36F, 17.5F);
		leftLegModel[21].rotateAngleZ = -0.55850536F;

		leftLegModel[22].addBox(-2F, 0F, -2F, 8, 14, 8, 0F); // Import ImportPart_06
		leftLegModel[22].setRotationPoint(14F, -87F, 15F);
		leftLegModel[22].rotateAngleZ = -0.13962634F;


		rightLegModel = new ModelRendererTurbo[23];
		rightLegModel[0] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[1] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[2] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[3] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[4] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[5] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[6] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[7] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[8] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[9] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[11] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[12] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[13] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[14] = new ModelRendererTurbo(this, 1953, 57, textureX, textureY); // Import ImportPart_05
		rightLegModel[15] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Import ImportPart_05
		rightLegModel[16] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Import ImportPart_05
		rightLegModel[17] = new ModelRendererTurbo(this, 1153, 65, textureX, textureY); // Import ImportPart_05
		rightLegModel[18] = new ModelRendererTurbo(this, 1273, 65, textureX, textureY); // Import ImportPart_05
		rightLegModel[19] = new ModelRendererTurbo(this, 1697, 65, textureX, textureY); // Import ImportPart_05
		rightLegModel[20] = new ModelRendererTurbo(this, 2017, 49, textureX, textureY); // Import ImportPart_05
		rightLegModel[21] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import ImportPart_05
		rightLegModel[22] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Import ImportPart_05

		rightLegModel[0].addBox(-2F, 0F, -2F, 17, 16, 12, 0F); // Import ImportPart_05
		rightLegModel[0].setRotationPoint(-2F, -84F, -21F);
		rightLegModel[0].rotateAngleZ = 0.41887902F;

		rightLegModel[1].addBox(-2F, 0F, -2F, 8, 20, 2, 0F); // Import ImportPart_05
		rightLegModel[1].setRotationPoint(2F, -28F, -20F);
		rightLegModel[1].rotateAngleZ = 0.17453293F;

		rightLegModel[2].addBox(-2F, 0F, -2F, 16, 8, 11, 0F); // Import ImportPart_05
		rightLegModel[2].setRotationPoint(21F, -49F, -19.5F);
		rightLegModel[2].rotateAngleZ = 1.36135682F;

		rightLegModel[3].addBox(-2F, 0F, -2F, 13, 18, 12, 0F); // Import ImportPart_05
		rightLegModel[3].setRotationPoint(2F, -33F, -21F);
		rightLegModel[3].rotateAngleZ = 0.20943951F;

		rightLegModel[4].addBox(-2F, 0F, -2F, 18, 4, 11, 0F); // Import ImportPart_05
		rightLegModel[4].setRotationPoint(1F, -10F, -20.5F);

		rightLegModel[5].addBox(-2F, 0F, -2F, 16, 14, 8, 0F); // Import ImportPart_05
		rightLegModel[5].setRotationPoint(-1F, -82F, -19F);

		rightLegModel[6].addBox(-2F, 0F, -2F, 10, 16, 6, 0F); // Import ImportPart_05
		rightLegModel[6].setRotationPoint(4F, -48F, -18F);

		rightLegModel[7].addBox(-2F, 0F, -2F, 8, 20, 2, 0F); // Import ImportPart_05
		rightLegModel[7].setRotationPoint(2F, -28F, -15F);
		rightLegModel[7].rotateAngleZ = 0.17453293F;

		rightLegModel[8].addBox(-2F, 0F, -2F, 18, 2, 11, 0F); // Import ImportPart_05
		rightLegModel[8].setRotationPoint(-3F, -2F, -26.5F);

		rightLegModel[9].addBox(-2F, 0F, -2F, 9, 3, 2, 0F); // Import ImportPart_05
		rightLegModel[9].setRotationPoint(-2F, -5F, -26.5F);

		rightLegModel[10].addBox(-2F, 0F, -2F, 5, 4, 2, 0F); // Import ImportPart_05
		rightLegModel[10].setRotationPoint(9F, -6F, -26.5F);

		rightLegModel[11].addBox(-2F, 0F, -2F, 12, 20, 11, 0F); // Import ImportPart_05
		rightLegModel[11].setRotationPoint(20F, -56F, -20.5F);
		rightLegModel[11].rotateAngleZ = -1.18682389F;

		rightLegModel[12].addBox(-2F, 0F, -2F, 10, 6, 4, 0F); // Import ImportPart_05
		rightLegModel[12].setRotationPoint(1F, -36F, -17F);

		rightLegModel[13].addBox(-2F, 0F, -2F, 16, 10, 14, 0F); // Import ImportPart_05
		rightLegModel[13].setRotationPoint(10F, -55F, -22F);

		rightLegModel[14].addBox(-2F, 0F, -2F, 22, 24, 18, 0F); // Import ImportPart_05
		rightLegModel[14].setRotationPoint(-2F, -69F, -24F);
		rightLegModel[14].rotateAngleZ = 0.41887902F;

		rightLegModel[15].addBox(-2F, 0F, -2F, 15, 20, 20, 0F); // Import ImportPart_05
		rightLegModel[15].setRotationPoint(2F, -69F, -25F);
		rightLegModel[15].rotateAngleZ = 0.41887902F;

		rightLegModel[16].addBox(-2F, 0F, -2F, 4, 8, 7, 0F); // Import ImportPart_05
		rightLegModel[16].setRotationPoint(-3F, -38F, -18.5F);
		rightLegModel[16].rotateAngleZ = -0.87266463F;

		rightLegModel[17].addBox(-2F, 0F, -2F, 13, 19, 15, 0F); // Import ImportPart_05
		rightLegModel[17].setRotationPoint(-2F, -31F, -22.5F);
		rightLegModel[17].rotateAngleZ = 0.20943951F;

		rightLegModel[18].addBox(-2F, 0F, -2F, 6, 22, 14, 0F); // Import ImportPart_05
		rightLegModel[18].setRotationPoint(17F, -76F, -22F);
		rightLegModel[18].rotateAngleZ = 0.41887902F;

		rightLegModel[19].addBox(-2F, 0F, -2F, 12, 6, 14, 0F); // Import ImportPart_05
		rightLegModel[19].setRotationPoint(13F, -21F, -22F);
		rightLegModel[19].rotateAngleZ = -0.06981317F;

		rightLegModel[20].addBox(-2F, 0F, -2F, 2, 6, 11, 0F); // Import ImportPart_05
		rightLegModel[20].setRotationPoint(20.95F, -25F, -20.5F);
		rightLegModel[20].rotateAngleZ = 0.20943951F;

		rightLegModel[21].addBox(-2F, 0F, -2F, 10, 4, 3, 0F); // Import ImportPart_05
		rightLegModel[21].setRotationPoint(-4F, -36F, -16.5F);
		rightLegModel[21].rotateAngleZ = -0.55850536F;

		rightLegModel[22].addBox(-2F, 0F, -2F, 8, 14, 8, 0F); // Import ImportPart_05
		rightLegModel[22].setRotationPoint(14F, -87F, -19F);
		rightLegModel[22].rotateAngleZ = -0.13962634F;


		leftFootModel = new ModelRendererTurbo[7];
		leftFootModel[0] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[1] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[2] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[3] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[4] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[5] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[6] = new ModelRendererTurbo(this, 1481, 25, textureX, textureY); // Import ImportPart_06

		leftFootModel[0].addBox(-2F, 0F, -2F, 34, 6, 15, 0F); // Import ImportPart_06
		leftFootModel[0].setRotationPoint(-10F, -6F, 11.5F);

		leftFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import ImportPart_06
		leftFootModel[1].setRotationPoint(23F, -8F, 13.5F);

		leftFootModel[2].addBox(-2F, 0F, -2F, 4, 4, 11, 0F); // Import ImportPart_06
		leftFootModel[2].setRotationPoint(-14.05F, -4F, 13.5F);

		leftFootModel[3].addBox(-2F, 0F, -2F, 1, 2, 9, 0F); // Import ImportPart_06
		leftFootModel[3].setRotationPoint(23F, -10F, 14.5F);
		leftFootModel[3].rotateAngleZ = 0.17453293F;

		leftFootModel[4].addBox(-2F, 0F, -2F, 7, 3, 7, 0F); // Import ImportPart_06
		leftFootModel[4].setRotationPoint(24F, -3F, 9.5F);

		leftFootModel[5].addBox(-2F, 0F, -2F, 7, 3, 7, 0F); // Import ImportPart_06
		leftFootModel[5].setRotationPoint(24F, -3F, 21.5F);

		leftFootModel[6].addBox(-2F, 0F, -2F, 1, 3, 9, 0F); // Import ImportPart_06
		leftFootModel[6].setRotationPoint(-14.5F, -6F, 14.5F);
		leftFootModel[6].rotateAngleZ = 0.26179939F;


		rightFootModel = new ModelRendererTurbo[7];
		rightFootModel[0] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[1] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Import ImportPart_05
		rightFootModel[2] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import ImportPart_05
		rightFootModel[3] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[4] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import ImportPart_05
		rightFootModel[5] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Import ImportPart_05
		rightFootModel[6] = new ModelRendererTurbo(this, 1641, 33, textureX, textureY); // Import ImportPart_05

		rightFootModel[0].addBox(-2F, 0F, -2F, 34, 6, 15, 0F); // Import ImportPart_05
		rightFootModel[0].setRotationPoint(-10F, -6F, -22.5F);

		rightFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import ImportPart_05
		rightFootModel[1].setRotationPoint(23F, -8F, -20.5F);

		rightFootModel[2].addBox(-2F, 0F, -2F, 4, 4, 11, 0F); // Import ImportPart_05
		rightFootModel[2].setRotationPoint(-14.05F, -4F, -20.5F);

		rightFootModel[3].addBox(-2F, 0F, -2F, 1, 2, 9, 0F); // Import ImportPart_05
		rightFootModel[3].setRotationPoint(23F, -10F, -19.5F);
		rightFootModel[3].rotateAngleZ = 0.17453293F;

		rightFootModel[4].addBox(-2F, 0F, -2F, 7, 3, 7, 0F); // Import ImportPart_05
		rightFootModel[4].setRotationPoint(24F, -3F, -24.5F);

		rightFootModel[5].addBox(-2F, 0F, -2F, 7, 3, 7, 0F); // Import ImportPart_05
		rightFootModel[5].setRotationPoint(24F, -3F, -12.5F);

		rightFootModel[6].addBox(-2F, 0F, -2F, 1, 3, 9, 0F); // Import ImportPart_05
		rightFootModel[6].setRotationPoint(-14.5F, -6F, -19.5F);
		rightFootModel[6].rotateAngleZ = 0.26179939F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}