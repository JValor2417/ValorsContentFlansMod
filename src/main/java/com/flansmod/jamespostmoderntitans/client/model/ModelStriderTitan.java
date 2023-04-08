//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: StriderTitan
// Model Creator: 
// Created on: 05.01.2021 - 23:29:48
// Last changed on: 05.01.2021 - 23:29:48

package com.flansmod.jamespostmoderntitans.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStriderTitan extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelStriderTitan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportPart_02
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportHUD
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportHUD
		bodyModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportPart_06
		bodyModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportPart_06
		bodyModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[12] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[13] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[14] = new ModelRendererTurbo(this, 1505, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[15] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[16] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[17] = new ModelRendererTurbo(this, 1617, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[18] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[19] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[20] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[21] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[22] = new ModelRendererTurbo(this, 1849, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[23] = new ModelRendererTurbo(this, 2025, 17, textureX, textureY); // Import ImportPart_01
		bodyModel[24] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[25] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[26] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[27] = new ModelRendererTurbo(this, 1313, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[28] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[29] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[30] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[31] = new ModelRendererTurbo(this, 1393, 25, textureX, textureY); // Import ImportPart_02
		bodyModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportPart_01
		bodyModel[33] = new ModelRendererTurbo(this, 1633, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[34] = new ModelRendererTurbo(this, 1681, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[35] = new ModelRendererTurbo(this, 1729, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[36] = new ModelRendererTurbo(this, 1777, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[37] = new ModelRendererTurbo(this, 1833, 25, textureX, textureY); // Import ImportPart_02
		bodyModel[38] = new ModelRendererTurbo(this, 1921, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[39] = new ModelRendererTurbo(this, 1961, 25, textureX, textureY); // Import ImportPart_01
		bodyModel[40] = new ModelRendererTurbo(this, 1041, 41, textureX, textureY); // Import ImportPart_06
		bodyModel[41] = new ModelRendererTurbo(this, 1289, 41, textureX, textureY); // Import ImportPart_06
		bodyModel[42] = new ModelRendererTurbo(this, 1113, 49, textureX, textureY); // Import ImportPart_06
		bodyModel[43] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Import ImportPart_06
		bodyModel[44] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Import ImportPart_02
		bodyModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportPart_02
		bodyModel[46] = new ModelRendererTurbo(this, 1953, 49, textureX, textureY); // Import ImportPart_02
		bodyModel[47] = new ModelRendererTurbo(this, 1609, 41, textureX, textureY); // Import ImportPart_01
		bodyModel[48] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import ImportPart_01
		bodyModel[49] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Import ImportPart_01
		bodyModel[50] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import ImportPart_01
		bodyModel[51] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import ImportPart_01
		bodyModel[52] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import ImportPart_01
		bodyModel[53] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportPart_01

		bodyModel[0].addBox(-4F, 0F, -2F, 26, 35, 38, 0F); // Import ImportPart_02
		bodyModel[0].setRotationPoint(-9F, -143F, 9F);
		bodyModel[0].rotateAngleY = -1.57079633F;

		bodyModel[1].addBox(-4F, 0F, -2F, 16, 8, 16, 0F); // Import ImportPart_02
		bodyModel[1].setRotationPoint(-1F, -102F, 4F);
		bodyModel[1].rotateAngleY = -1.57079633F;

		bodyModel[2].addBox(-4F, -8F, -4F, 16, 25, 10, 0F); // Import ImportPart_01
		bodyModel[2].setRotationPoint(29F, -118F, -4F);
		bodyModel[2].rotateAngleX = 0.10471976F;
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-4F, -8F, -4F, 12, 18, 4, 0F); // Import ImportPart_01
		bodyModel[3].setRotationPoint(21F, -141F, -2F);
		bodyModel[3].rotateAngleX = -1.36135682F;
		bodyModel[3].rotateAngleY = 1.57079633F;

		bodyModel[4].addBox(-4F, -8F, -4F, 14, 18, 10, 0F); // Import ImportPart_01
		bodyModel[4].setRotationPoint(32F, -132.5F, -3F);
		bodyModel[4].rotateAngleY = 1.57079633F;

		bodyModel[5].addBox(-4F, 0F, -2F, 20, 5, 30, 0F); // Import ImportPart_02
		bodyModel[5].setRotationPoint(-5F, -148F, 6F);
		bodyModel[5].rotateAngleY = -1.57079633F;

		bodyModel[6].addBox(-4F, -8F, -4F, 2, 5, 2, 0F); // Import ImportPart_01
		bodyModel[6].setRotationPoint(35F, -127.5F, 3F);
		bodyModel[6].rotateAngleY = 1.57079633F;

		bodyModel[7].addBox(-4F, 0F, -2F, 6, 1, 1, 0F); // Import ImportHUD
		bodyModel[7].setRotationPoint(22.5F, -126.75F, -12F);
		bodyModel[7].rotateAngleY = -2.7925268F;
		bodyModel[7].rotateAngleZ = 0.78539816F;

		bodyModel[8].addBox(-4F, 0F, -2F, 6, 1, 1, 0F); // Import ImportHUD
		bodyModel[8].setRotationPoint(21.5F, -126.75F, 9F);
		bodyModel[8].rotateAngleY = -3.4906585F;
		bodyModel[8].rotateAngleZ = 0.78539816F;

		bodyModel[9].addBox(-2F, 0F, -2F, 4, 26, 6, 0F); // Import ImportPart_06
		bodyModel[9].setRotationPoint(-10F, -162F, -14.5F);
		bodyModel[9].rotateAngleZ = 0.31415927F;

		bodyModel[10].addBox(-2F, 0F, -2F, 4, 26, 6, 0F); // Import ImportPart_06
		bodyModel[10].setRotationPoint(-10F, -162F, 12.5F);
		bodyModel[10].rotateAngleZ = 0.31415927F;

		bodyModel[11].addBox(-4F, -8F, -4F, 6, 7, 20, 0F); // Import ImportPart_01
		bodyModel[11].setRotationPoint(34.75F, -129F, 1F);
		bodyModel[11].rotateAngleY = 1.57079633F;

		bodyModel[12].addBox(-4F, -8F, -4F, 2, 14, 10, 0F); // Import ImportPart_01
		bodyModel[12].setRotationPoint(31F, -131.5F, 11F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addBox(-4F, -8F, -4F, 2, 14, 10, 0F); // Import ImportPart_01
		bodyModel[13].setRotationPoint(31F, -131.5F, -5F);
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addBox(-4F, -8F, -4F, 18, 14, 10, 0F); // Import ImportPart_01
		bodyModel[14].setRotationPoint(30F, -117.5F, -5F);
		bodyModel[14].rotateAngleY = 1.57079633F;

		bodyModel[15].addBox(-4F, -8F, -4F, 12, 11, 16, 0F); // Import ImportPart_01
		bodyModel[15].setRotationPoint(31F, -116.5F, -2F);
		bodyModel[15].rotateAngleY = 1.57079633F;

		bodyModel[16].addBox(-4F, -8F, -4F, 2, 10, 10, 0F); // Import ImportPart_01
		bodyModel[16].setRotationPoint(28F, -128.5F, 13F);
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addBox(-4F, -8F, -4F, 2, 10, 10, 0F); // Import ImportPart_01
		bodyModel[17].setRotationPoint(28F, -128.5F, -7F);
		bodyModel[17].rotateAngleY = 1.57079633F;

		bodyModel[18].addBox(-4F, -8F, -4F, 10, 14, 4, 0F); // Import ImportPart_01
		bodyModel[18].setRotationPoint(24F, -141F, -1F);
		bodyModel[18].rotateAngleX = -1.36135682F;
		bodyModel[18].rotateAngleY = 1.57079633F;

		bodyModel[19].addBox(-4F, -8F, -4F, 1, 4, 20, 0F); // Import ImportPart_01
		bodyModel[19].setRotationPoint(34.5F, -127F, 0F);
		bodyModel[19].rotateAngleY = 1.57079633F;

		bodyModel[20].addBox(-4F, -8F, -4F, 1, 4, 20, 0F); // Import ImportPart_01
		bodyModel[20].setRotationPoint(34.5F, -127F, 7F);
		bodyModel[20].rotateAngleY = 1.57079633F;

		bodyModel[21].addBox(-4F, -8F, -4F, 11, 3, 3, 0F); // Import ImportPart_01
		bodyModel[21].setRotationPoint(38F, -137F, -1.5F);
		bodyModel[21].rotateAngleX = -1.36135682F;
		bodyModel[21].rotateAngleY = 1.57079633F;

		bodyModel[22].addBox(-4F, -8F, -4F, 2, 18, 6, 0F); // Import ImportPart_01
		bodyModel[22].setRotationPoint(30.5F, -123.5F, 12.5F);
		bodyModel[22].rotateAngleY = 1.57079633F;

		bodyModel[23].addBox(-4F, -8F, -4F, 2, 18, 6, 0F); // Import ImportPart_01
		bodyModel[23].setRotationPoint(30.5F, -123.5F, -6.5F);
		bodyModel[23].rotateAngleY = 1.57079633F;

		bodyModel[24].addBox(-4F, -8F, -4F, 6, 20, 20, 0F); // Import ImportPart_01
		bodyModel[24].setRotationPoint(14F, -134F, -15F);
		bodyModel[24].rotateAngleY = 1.57079633F;

		bodyModel[25].addBox(-4F, -8F, -4F, 6, 20, 20, 0F); // Import ImportPart_01
		bodyModel[25].setRotationPoint(14F, -134F, 17F);
		bodyModel[25].rotateAngleY = 1.57079633F;

		bodyModel[26].addBox(-4F, -8F, -4F, 8, 10, 19, 0F); // Import ImportPart_01
		bodyModel[26].setRotationPoint(12F, -138F, -12F);
		bodyModel[26].rotateAngleY = 1.57079633F;
		bodyModel[26].rotateAngleZ = 0.17453293F;

		bodyModel[27].addBox(-4F, -8F, -4F, 8, 10, 19, 0F); // Import ImportPart_01
		bodyModel[27].setRotationPoint(12F, -138F, 12F);
		bodyModel[27].rotateAngleY = 1.57079633F;
		bodyModel[27].rotateAngleZ = -0.17453293F;

		bodyModel[28].addBox(-4F, -8F, -4F, 4, 10, 21, 0F); // Import ImportPart_01
		bodyModel[28].setRotationPoint(10F, -136F, -14F);
		bodyModel[28].rotateAngleY = 1.57079633F;

		bodyModel[29].addBox(-4F, -8F, -4F, 4, 10, 21, 0F); // Import ImportPart_01
		bodyModel[29].setRotationPoint(10F, -136F, 18F);
		bodyModel[29].rotateAngleY = 1.57079633F;

		bodyModel[30].addBox(-4F, -8F, -4F, 8, 14, 6, 0F); // Import ImportPart_01
		bodyModel[30].setRotationPoint(22F, -143F, 0F);
		bodyModel[30].rotateAngleX = -1.43116999F;
		bodyModel[30].rotateAngleY = 1.57079633F;

		bodyModel[31].addBox(-4F, 0F, -2F, 19, 3, 28, 0F); // Import ImportPart_02
		bodyModel[31].setRotationPoint(-3.5F, -151F, 5.5F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addBox(-4F, -8F, -4F, 7, 14, 2, 0F); // Import ImportPart_01
		bodyModel[32].setRotationPoint(22F, -142.5F, 0.5F);
		bodyModel[32].rotateAngleX = -1.43116999F;
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addBox(-4F, -8F, -4F, 4, 12, 16, 0F); // Import ImportPart_01
		bodyModel[33].setRotationPoint(11F, -133F, -19F);
		bodyModel[33].rotateAngleY = 1.57079633F;

		bodyModel[34].addBox(-4F, -8F, -4F, 4, 12, 16, 0F); // Import ImportPart_01
		bodyModel[34].setRotationPoint(11F, -133F, 23F);
		bodyModel[34].rotateAngleY = 1.57079633F;

		bodyModel[35].addBox(-4F, -8F, -4F, 6, 14, 14, 0F); // Import ImportPart_01
		bodyModel[35].setRotationPoint(26F, -124F, 13F);
		bodyModel[35].rotateAngleY = 1.57079633F;

		bodyModel[36].addBox(-4F, -8F, -4F, 6, 14, 14, 0F); // Import ImportPart_01
		bodyModel[36].setRotationPoint(26F, -124F, -11F);
		bodyModel[36].rotateAngleY = 1.57079633F;

		bodyModel[37].addBox(-4F, 0F, -2F, 23, 9, 35, 0F); // Import ImportPart_02
		bodyModel[37].setRotationPoint(-7F, -108F, 7.5F);
		bodyModel[37].rotateAngleY = -1.57079633F;

		bodyModel[38].addBox(-4F, -8F, -4F, 10, 8, 8, 0F); // Import ImportPart_01
		bodyModel[38].setRotationPoint(24F, -122F, 19F);
		bodyModel[38].rotateAngleY = 1.57079633F;

		bodyModel[39].addBox(-4F, -8F, -4F, 10, 8, 8, 0F); // Import ImportPart_01
		bodyModel[39].setRotationPoint(24F, -122F, -21F);
		bodyModel[39].rotateAngleY = 1.57079633F;

		bodyModel[40].addBox(-2F, 0F, -2F, 3, 22, 7, 0F); // Import ImportPart_06
		bodyModel[40].setRotationPoint(-9F, -161F, -15F);
		bodyModel[40].rotateAngleZ = 0.31415927F;

		bodyModel[41].addBox(-2F, 0F, -2F, 3, 22, 7, 0F); // Import ImportPart_06
		bodyModel[41].setRotationPoint(-9F, -161F, 12F);
		bodyModel[41].rotateAngleZ = 0.31415927F;

		bodyModel[42].addBox(-2F, 0F, -2F, 5, 14, 4, 0F); // Import ImportPart_06
		bodyModel[42].setRotationPoint(-4F, -145F, -14.5F);
		bodyModel[42].rotateAngleZ = 1.50098316F;

		bodyModel[43].addBox(-2F, 0F, -2F, 5, 14, 4, 0F); // Import ImportPart_06
		bodyModel[43].setRotationPoint(-4F, -145F, 14.5F);
		bodyModel[43].rotateAngleZ = 1.50098316F;

		bodyModel[44].addBox(-4F, 0F, -2F, 19, 28, 7, 0F); // Import ImportPart_02
		bodyModel[44].setRotationPoint(-15F, -141F, 5F);
		bodyModel[44].rotateAngleY = -1.57079633F;

		bodyModel[45].addBox(-4F, 0F, -2F, 11, 4, 6, 0F); // Import ImportPart_02
		bodyModel[45].setRotationPoint(-13F, -114F, 1F);
		bodyModel[45].rotateAngleY = -1.57079633F;

		bodyModel[46].addBox(-4F, 0F, -2F, 16, 4, 19, 0F); // Import ImportPart_02
		bodyModel[46].setRotationPoint(-1F, -94F, 4F);
		bodyModel[46].rotateAngleY = -1.57079633F;

		bodyModel[47].addBox(-4F, -8F, -4F, 2, 4, 16, 0F); // Import ImportPart_01
		bodyModel[47].setRotationPoint(12F, -132F, -18F);
		bodyModel[47].rotateAngleY = 1.57079633F;

		bodyModel[48].addBox(-4F, -8F, -4F, 2, 4, 16, 0F); // Import ImportPart_01
		bodyModel[48].setRotationPoint(12F, -132F, 24F);
		bodyModel[48].rotateAngleY = 1.57079633F;

		bodyModel[49].addBox(-4F, -8F, -4F, 2, 4, 16, 0F); // Import ImportPart_01
		bodyModel[49].setRotationPoint(12F, -127F, -18F);
		bodyModel[49].rotateAngleY = 1.57079633F;

		bodyModel[50].addBox(-4F, -8F, -4F, 2, 4, 16, 0F); // Import ImportPart_01
		bodyModel[50].setRotationPoint(12F, -127F, 24F);
		bodyModel[50].rotateAngleY = 1.57079633F;

		bodyModel[51].addBox(-4F, -8F, -4F, 5, 6, 5, 0F); // Import ImportPart_01
		bodyModel[51].setRotationPoint(17F, -149F, -4.5F);
		bodyModel[51].rotateAngleY = 1.57079633F;

		bodyModel[52].addBox(-4F, -8F, -4F, 2, 1, 2, 0F); // Import ImportPart_01
		bodyModel[52].setRotationPoint(18F, -148F, -4F);
		bodyModel[52].rotateAngleY = 1.57079633F;

		bodyModel[53].addBox(-4F, -8F, -4F, 2, 2, 2, 0F); // Import ImportPart_01
		bodyModel[53].setRotationPoint(18F, -146.5F, -4F);
		bodyModel[53].rotateAngleY = 1.57079633F;


		hipsModel = new ModelRendererTurbo[15];
		hipsModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[1] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[2] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[3] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[4] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[5] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[6] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[7] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[8] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import ImportPart_02
		hipsModel[9] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Import ImportPart_02
		hipsModel[10] = new ModelRendererTurbo(this, 1113, 49, textureX, textureY); // Import ImportPart_02
		hipsModel[11] = new ModelRendererTurbo(this, 1713, 25, textureX, textureY); // Import ImportPart_02
		hipsModel[12] = new ModelRendererTurbo(this, 1761, 25, textureX, textureY); // Import ImportPart_02
		hipsModel[13] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import ImportPart_02
		hipsModel[14] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import ImportPart_02

		hipsModel[0].addBox(-4F, 0F, -2F, 10, 10, 12, 0F); // Import ImportPart_02
		hipsModel[0].setRotationPoint(2F, -90F, 1F);
		hipsModel[0].rotateAngleY = -1.57079633F;

		hipsModel[1].addBox(-4F, 0F, -2F, 12, 14, 26, 0F); // Import ImportPart_02
		hipsModel[1].setRotationPoint(-6F, -89F, 2F);
		hipsModel[1].rotateAngleY = -1.57079633F;

		hipsModel[2].addBox(-4F, 0F, -2F, 8, 13, 8, 0F); // Import ImportPart_02
		hipsModel[2].setRotationPoint(16F, -87F, 0F);
		hipsModel[2].rotateAngleX = 0.06981317F;
		hipsModel[2].rotateAngleY = -1.57079633F;

		hipsModel[3].addBox(-4F, 0F, -2F, 4, 9, 26, 0F); // Import ImportPart_02
		hipsModel[3].setRotationPoint(-4F, -96.5F, 10F);
		hipsModel[3].rotateAngleY = -1.57079633F;

		hipsModel[4].addBox(-4F, 0F, -2F, 4, 9, 26, 0F); // Import ImportPart_02
		hipsModel[4].setRotationPoint(-4F, -96.5F, -14F);
		hipsModel[4].rotateAngleY = -1.57079633F;

		hipsModel[5].addBox(-4F, 0F, -2F, 26, 6, 6, 0F); // Import ImportPart_02
		hipsModel[5].setRotationPoint(4F, -83F, 9F);
		hipsModel[5].rotateAngleY = -1.57079633F;

		hipsModel[6].addBox(-4F, 0F, -2F, 21, 2, 2, 0F); // Import ImportPart_02
		hipsModel[6].setRotationPoint(4F, -93F, 6.5F);
		hipsModel[6].rotateAngleY = -1.57079633F;

		hipsModel[7].addBox(-4F, 0F, -2F, 6, 8, 2, 0F); // Import ImportPart_02
		hipsModel[7].setRotationPoint(21F, -96F, 9F);
		hipsModel[7].rotateAngleY = -1.57079633F;

		hipsModel[8].addBox(-4F, 0F, -2F, 6, 8, 2, 0F); // Import ImportPart_02
		hipsModel[8].setRotationPoint(21F, -96F, -11F);
		hipsModel[8].rotateAngleY = -1.57079633F;

		hipsModel[9].addBox(-4F, 0F, -2F, 4, 7, 20, 0F); // Import ImportPart_02
		hipsModel[9].setRotationPoint(-1F, -95.5F, 11F);
		hipsModel[9].rotateAngleY = -1.57079633F;

		hipsModel[10].addBox(-4F, 0F, -2F, 4, 7, 20, 0F); // Import ImportPart_02
		hipsModel[10].setRotationPoint(-1F, -95.5F, -15F);
		hipsModel[10].rotateAngleY = -1.57079633F;

		hipsModel[11].addBox(-4F, 0F, -2F, 6, 8, 2, 0F); // Import ImportPart_02
		hipsModel[11].setRotationPoint(-5F, -96F, 9F);
		hipsModel[11].rotateAngleY = -1.57079633F;

		hipsModel[12].addBox(-4F, 0F, -2F, 6, 8, 2, 0F); // Import ImportPart_02
		hipsModel[12].setRotationPoint(-5F, -96F, -11F);
		hipsModel[12].rotateAngleY = -1.57079633F;

		hipsModel[13].addBox(-4F, 0F, -2F, 21, 2, 2, 0F); // Import ImportPart_02
		hipsModel[13].setRotationPoint(15F, -93F, 6.5F);
		hipsModel[13].rotateAngleY = -1.57079633F;

		hipsModel[14].addBox(-4F, 0F, -2F, 10, 14, 26, 0F); // Import ImportPart_02
		hipsModel[14].setRotationPoint(-4F, -86F, 1F);
		hipsModel[14].rotateAngleY = -1.57079633F;


		leftArmModel = new ModelRendererTurbo[28];
		leftArmModel[0] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[1] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[2] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[3] = new ModelRendererTurbo(this, 1241, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[4] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[5] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[6] = new ModelRendererTurbo(this, 1353, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[7] = new ModelRendererTurbo(this, 1825, 25, textureX, textureY); // Import ImportPart_01
		leftArmModel[8] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[9] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[10] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import ImportPart_01
		leftArmModel[11] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[12] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import ImportPart_01
		leftArmModel[13] = new ModelRendererTurbo(this, 1601, 33, textureX, textureY); // Import ImportPart_01
		leftArmModel[14] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Import ImportPart_01
		leftArmModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[16] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[17] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[18] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[19] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[20] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[22] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[23] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[24] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[25] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[26] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Import ImportPart_01
		leftArmModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 218

		leftArmModel[0].addBox(-4F, -8F, -4F, 12, 15, 13, 0F); // Import ImportPart_01
		leftArmModel[0].setRotationPoint(2F, -3F, 5F);
		leftArmModel[0].rotateAngleX = 1.57079633F;
		leftArmModel[0].rotateAngleY = 1.57079633F;

		leftArmModel[1].addBox(-4F, -8F, -4F, 10, 12, 10, 0F); // Import ImportPart_01
		leftArmModel[1].setRotationPoint(-13F, -4F, 6F);
		leftArmModel[1].rotateAngleX = 1.57079633F;
		leftArmModel[1].rotateAngleY = 1.57079633F;

		leftArmModel[2].addBox(-4F, -8F, -4F, 2, 12, 10, 0F); // Import ImportPart_01
		leftArmModel[2].setRotationPoint(3F, -7F, 16F);
		leftArmModel[2].rotateAngleX = 1.57079633F;
		leftArmModel[2].rotateAngleY = 1.57079633F;

		leftArmModel[3].addBox(-4F, -8F, -4F, 10, 13, 13, 0F); // Import ImportPart_01
		leftArmModel[3].setRotationPoint(1F, -2F, 6F);
		leftArmModel[3].rotateAngleX = 1.57079633F;
		leftArmModel[3].rotateAngleY = 1.57079633F;

		leftArmModel[4].addBox(-4F, -8F, -4F, 10, 17, 12, 0F); // Import ImportPart_01
		leftArmModel[4].setRotationPoint(-26F, 13F, 6F);
		leftArmModel[4].rotateAngleX = -2.7925268F;
		leftArmModel[4].rotateAngleY = 1.57079633F;

		leftArmModel[5].addBox(-4F, -8F, -4F, 6, 15, 7, 0F); // Import ImportPart_01
		leftArmModel[5].setRotationPoint(-27F, 24F, 8F);
		leftArmModel[5].rotateAngleX = -2.7925268F;
		leftArmModel[5].rotateAngleY = 1.57079633F;

		leftArmModel[6].addBox(-4F, -8F, -4F, 7, 7, 8, 0F); // Import ImportPart_01
		leftArmModel[6].setRotationPoint(-28F, 25.5F, 7.5F);
		leftArmModel[6].rotateAngleX = -2.7925268F;
		leftArmModel[6].rotateAngleY = 1.57079633F;

		leftArmModel[7].addBox(-4F, -8F, -4F, 6, 14, 4, 0F); // Import ImportPart_01
		leftArmModel[7].setRotationPoint(-17F, 15F, 8F);
		leftArmModel[7].rotateAngleX = -2.7925268F;
		leftArmModel[7].rotateAngleY = 1.57079633F;

		leftArmModel[8].addBox(-4F, -8F, -4F, 6, 14, 5, 0F); // Import ImportPart_01
		leftArmModel[8].setRotationPoint(-29F, 10F, 8F);
		leftArmModel[8].rotateAngleX = -2.7925268F;
		leftArmModel[8].rotateAngleY = 1.57079633F;

		leftArmModel[9].addBox(-4F, -8F, -4F, 8, 19, 1, 0F); // Import ImportPart_01
		leftArmModel[9].setRotationPoint(-31F, 12F, 7F);
		leftArmModel[9].rotateAngleX = -2.7925268F;
		leftArmModel[9].rotateAngleY = 1.57079633F;

		leftArmModel[10].addBox(-4F, -8F, -4F, 6, 14, 2, 0F); // Import ImportPart_01
		leftArmModel[10].setRotationPoint(-32F, 9F, 8F);
		leftArmModel[10].rotateAngleX = -2.7925268F;
		leftArmModel[10].rotateAngleY = 1.57079633F;

		leftArmModel[11].addBox(-4F, -8F, -4F, 6, 14, 6, 0F); // Import ImportPart_01
		leftArmModel[11].setRotationPoint(-20F, 5F, 8F);
		leftArmModel[11].rotateAngleX = -2.7925268F;
		leftArmModel[11].rotateAngleY = 1.57079633F;

		leftArmModel[12].addBox(-4F, -8F, -4F, 9, 10, 10, 0F); // Import ImportPart_01
		leftArmModel[12].setRotationPoint(-19F, -3F, 6.5F);
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
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[28];
		rightArmModel[0] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[1] = new ModelRendererTurbo(this, 1065, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[2] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[3] = new ModelRendererTurbo(this, 1553, 33, textureX, textureY); // Import ImportPart_01
		rightArmModel[4] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[5] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[6] = new ModelRendererTurbo(this, 1665, 25, textureX, textureY); // Import ImportPart_01
		rightArmModel[7] = new ModelRendererTurbo(this, 2001, 25, textureX, textureY); // Import ImportPart_01
		rightArmModel[8] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[9] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[10] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[11] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[12] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Import ImportPart_01
		rightArmModel[13] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[14] = new ModelRendererTurbo(this, 1209, 41, textureX, textureY); // Import ImportPart_01
		rightArmModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[16] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[17] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[18] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[19] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[20] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[21] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[22] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[23] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[24] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[25] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[26] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Import ImportPart_01
		rightArmModel[27] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 218

		rightArmModel[0].addBox(-4F, -8F, -4F, 12, 15, 13, 0F); // Import ImportPart_01
		rightArmModel[0].setRotationPoint(2F, -3F, -8F);
		rightArmModel[0].rotateAngleX = 1.57079633F;
		rightArmModel[0].rotateAngleY = 1.57079633F;

		rightArmModel[1].addBox(-4F, -8F, -4F, 10, 12, 10, 0F); // Import ImportPart_01
		rightArmModel[1].setRotationPoint(-13F, -4F, -7F);
		rightArmModel[1].rotateAngleX = 1.57079633F;
		rightArmModel[1].rotateAngleY = 1.57079633F;

		rightArmModel[2].addBox(-4F, -8F, -4F, 2, 12, 10, 0F); // Import ImportPart_01
		rightArmModel[2].setRotationPoint(3F, -7F, -9F);
		rightArmModel[2].rotateAngleX = 1.57079633F;
		rightArmModel[2].rotateAngleY = 1.57079633F;

		rightArmModel[3].addBox(-4F, -8F, -4F, 10, 13, 13, 0F); // Import ImportPart_01
		rightArmModel[3].setRotationPoint(1F, -2F, -7F);
		rightArmModel[3].rotateAngleX = 1.57079633F;
		rightArmModel[3].rotateAngleY = 1.57079633F;

		rightArmModel[4].addBox(-4F, -8F, -4F, 10, 17, 12, 0F); // Import ImportPart_01
		rightArmModel[4].setRotationPoint(-26F, 13F, -7F);
		rightArmModel[4].rotateAngleX = -2.7925268F;
		rightArmModel[4].rotateAngleY = 1.57079633F;

		rightArmModel[5].addBox(-4F, -8F, -4F, 6, 15, 7, 0F); // Import ImportPart_01
		rightArmModel[5].setRotationPoint(-27F, 24F, -5F);
		rightArmModel[5].rotateAngleX = -2.7925268F;
		rightArmModel[5].rotateAngleY = 1.57079633F;

		rightArmModel[6].addBox(-4F, -8F, -4F, 7, 7, 8, 0F); // Import ImportPart_01
		rightArmModel[6].setRotationPoint(-28F, 25.5F, -5.5F);
		rightArmModel[6].rotateAngleX = -2.7925268F;
		rightArmModel[6].rotateAngleY = 1.57079633F;

		rightArmModel[7].addBox(-4F, -8F, -4F, 6, 14, 4, 0F); // Import ImportPart_01
		rightArmModel[7].setRotationPoint(-17F, 15F, -5F);
		rightArmModel[7].rotateAngleX = -2.7925268F;
		rightArmModel[7].rotateAngleY = 1.57079633F;

		rightArmModel[8].addBox(-4F, -8F, -4F, 6, 14, 5, 0F); // Import ImportPart_01
		rightArmModel[8].setRotationPoint(-29F, 10F, -5F);
		rightArmModel[8].rotateAngleX = -2.7925268F;
		rightArmModel[8].rotateAngleY = 1.57079633F;

		rightArmModel[9].addBox(-4F, -8F, -4F, 8, 19, 1, 0F); // Import ImportPart_01
		rightArmModel[9].setRotationPoint(-31F, 12F, -6F);
		rightArmModel[9].rotateAngleX = -2.7925268F;
		rightArmModel[9].rotateAngleY = 1.57079633F;

		rightArmModel[10].addBox(-4F, -8F, -4F, 6, 14, 2, 0F); // Import ImportPart_01
		rightArmModel[10].setRotationPoint(-32F, 9F, -5F);
		rightArmModel[10].rotateAngleX = -2.7925268F;
		rightArmModel[10].rotateAngleY = 1.57079633F;

		rightArmModel[11].addBox(-4F, -8F, -4F, 6, 14, 6, 0F); // Import ImportPart_01
		rightArmModel[11].setRotationPoint(-20F, 5F, -5F);
		rightArmModel[11].rotateAngleX = -2.7925268F;
		rightArmModel[11].rotateAngleY = 1.57079633F;

		rightArmModel[12].addBox(-4F, -8F, -4F, 9, 10, 10, 0F); // Import ImportPart_01
		rightArmModel[12].setRotationPoint(-19F, -3F, -6.5F);
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
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[17];
		leftLegModel[0] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[2] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[3] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[4] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[5] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[6] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[7] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[10] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[11] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[12] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Import ImportPart_06
		leftLegModel[13] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import ImportPart_06
		leftLegModel[14] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import ImportPart_06
		leftLegModel[15] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import ImportPart_06
		leftLegModel[16] = new ModelRendererTurbo(this, 1393, 57, textureX, textureY); // Import ImportPart_06

		leftLegModel[0].addBox(-2F, 0F, -2F, 14, 24, 10, 0F); // Import ImportPart_06
		leftLegModel[0].setRotationPoint(-2F, -81F, 14F);
		leftLegModel[0].rotateAngleZ = 0.41887902F;

		leftLegModel[1].addBox(-2F, 0F, -2F, 8, 24, 2, 0F); // Import ImportPart_06
		leftLegModel[1].setRotationPoint(0F, -33F, 16F);
		leftLegModel[1].rotateAngleZ = 0.17453293F;

		leftLegModel[2].addBox(-2F, 0F, -2F, 13, 28, 11, 0F); // Import ImportPart_06
		leftLegModel[2].setRotationPoint(-2F, -47F, 13.5F);
		leftLegModel[2].rotateAngleZ = 0.12217305F;

		leftLegModel[3].addBox(-2F, 0F, -2F, 18, 6, 11, 0F); // Import ImportPart_06
		leftLegModel[3].setRotationPoint(-4F, -12F, 13.5F);

		leftLegModel[4].addBox(-2F, 0F, -2F, 10, 8, 8, 0F); // Import ImportPart_06
		leftLegModel[4].setRotationPoint(6F, -83F, 15F);

		leftLegModel[5].addBox(-2F, 0F, -2F, 10, 10, 8, 0F); // Import ImportPart_06
		leftLegModel[5].setRotationPoint(-11F, -51F, 15F);
		leftLegModel[5].rotateAngleZ = -0.13962634F;

		leftLegModel[6].addBox(-2F, 0F, -2F, 8, 24, 2, 0F); // Import ImportPart_06
		leftLegModel[6].setRotationPoint(0F, -33F, 20F);
		leftLegModel[6].rotateAngleZ = 0.17453293F;

		leftLegModel[7].addBox(-2F, 0F, -2F, 18, 2, 11, 0F); // Import ImportPart_06
		leftLegModel[7].setRotationPoint(-3F, -2F, 19.5F);

		leftLegModel[8].addBox(-2F, 0F, -2F, 8, 4, 2, 0F); // Import ImportPart_06
		leftLegModel[8].setRotationPoint(-2F, -6F, 28.5F);

		leftLegModel[9].addBox(-2F, 0F, -2F, 4, 3, 2, 0F); // Import ImportPart_06
		leftLegModel[9].setRotationPoint(9F, -5F, 28.5F);

		leftLegModel[10].addBox(-2F, 0F, -2F, 12, 20, 9, 0F); // Import ImportPart_06
		leftLegModel[10].setRotationPoint(4F, -62F, 14.5F);
		leftLegModel[10].rotateAngleZ = -0.55850536F;

		leftLegModel[11].addBox(-2F, 0F, -2F, 10, 10, 4, 0F); // Import ImportPart_06
		leftLegModel[11].setRotationPoint(-3F, -38F, 17F);

		leftLegModel[12].addBox(-2F, 0F, -2F, 10, 8, 8, 0F); // Import ImportPart_06
		leftLegModel[12].setRotationPoint(14F, -64F, 15F);

		leftLegModel[13].addBox(-2F, 0F, -2F, 16, 24, 12, 0F); // Import ImportPart_06
		leftLegModel[13].setRotationPoint(-4F, -76F, 13F);
		leftLegModel[13].rotateAngleZ = 0.41887902F;

		leftLegModel[14].addBox(-2F, 0F, -2F, 9, 20, 16, 0F); // Import ImportPart_06
		leftLegModel[14].setRotationPoint(0F, -76F, 11F);
		leftLegModel[14].rotateAngleZ = 0.41887902F;

		leftLegModel[15].addBox(-2F, 0F, -2F, 4, 16, 11, 0F); // Import ImportPart_06
		leftLegModel[15].setRotationPoint(-9F, -55F, 13.5F);
		leftLegModel[15].rotateAngleZ = -0.48869219F;

		leftLegModel[16].addBox(-2F, 0F, -2F, 13, 26, 10, 0F); // Import ImportPart_06
		leftLegModel[16].setRotationPoint(-6F, -48F, 14F);
		leftLegModel[16].rotateAngleZ = 0.12217305F;


		rightLegModel = new ModelRendererTurbo[17];
		rightLegModel[0] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[1] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[2] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[3] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[4] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[5] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[6] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[7] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[8] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[10] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[11] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[12] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Import ImportPart_05
		rightLegModel[13] = new ModelRendererTurbo(this, 1313, 57, textureX, textureY); // Import ImportPart_05
		rightLegModel[14] = new ModelRendererTurbo(this, 1049, 57, textureX, textureY); // Import ImportPart_05
		rightLegModel[15] = new ModelRendererTurbo(this, 1169, 57, textureX, textureY); // Import ImportPart_05
		rightLegModel[16] = new ModelRendererTurbo(this, 1441, 57, textureX, textureY); // Import ImportPart_05

		rightLegModel[0].addBox(-2F, 0F, -2F, 14, 24, 10, 0F); // Import ImportPart_05
		rightLegModel[0].setRotationPoint(-2F, -81F, -20F);
		rightLegModel[0].rotateAngleZ = 0.41887902F;

		rightLegModel[1].addBox(-2F, 0F, -2F, 8, 24, 2, 0F); // Import ImportPart_05
		rightLegModel[1].setRotationPoint(0F, -33F, -18F);
		rightLegModel[1].rotateAngleZ = 0.17453293F;

		rightLegModel[2].addBox(-2F, 0F, -2F, 13, 28, 11, 0F); // Import ImportPart_05
		rightLegModel[2].setRotationPoint(-2F, -47F, -20.5F);
		rightLegModel[2].rotateAngleZ = 0.12217305F;

		rightLegModel[3].addBox(-2F, 0F, -2F, 18, 6, 11, 0F); // Import ImportPart_05
		rightLegModel[3].setRotationPoint(-4F, -12F, -20.5F);

		rightLegModel[4].addBox(-2F, 0F, -2F, 10, 8, 8, 0F); // Import ImportPart_05
		rightLegModel[4].setRotationPoint(6F, -83F, -19F);

		rightLegModel[5].addBox(-2F, 0F, -2F, 10, 10, 8, 0F); // Import ImportPart_05
		rightLegModel[5].setRotationPoint(-11F, -51F, -19F);
		rightLegModel[5].rotateAngleZ = -0.13962634F;

		rightLegModel[6].addBox(-2F, 0F, -2F, 8, 24, 2, 0F); // Import ImportPart_05
		rightLegModel[6].setRotationPoint(0F, -33F, -14F);
		rightLegModel[6].rotateAngleZ = 0.17453293F;

		rightLegModel[7].addBox(-2F, 0F, -2F, 18, 2, 11, 0F); // Import ImportPart_05
		rightLegModel[7].setRotationPoint(-3F, -2F, -26.5F);

		rightLegModel[8].addBox(-2F, 0F, -2F, 8, 4, 2, 0F); // Import ImportPart_05
		rightLegModel[8].setRotationPoint(-2F, -6F, -26.5F);

		rightLegModel[9].addBox(-2F, 0F, -2F, 4, 3, 2, 0F); // Import ImportPart_05
		rightLegModel[9].setRotationPoint(9F, -5F, -26.5F);

		rightLegModel[10].addBox(-2F, 0F, -2F, 12, 20, 9, 0F); // Import ImportPart_05
		rightLegModel[10].setRotationPoint(4F, -62F, -19.5F);
		rightLegModel[10].rotateAngleZ = -0.55850536F;

		rightLegModel[11].addBox(-2F, 0F, -2F, 10, 10, 4, 0F); // Import ImportPart_05
		rightLegModel[11].setRotationPoint(-3F, -38F, -17F);

		rightLegModel[12].addBox(-2F, 0F, -2F, 10, 8, 8, 0F); // Import ImportPart_05
		rightLegModel[12].setRotationPoint(14F, -64F, -19F);

		rightLegModel[13].addBox(-2F, 0F, -2F, 16, 24, 12, 0F); // Import ImportPart_05
		rightLegModel[13].setRotationPoint(-4F, -76F, -21F);
		rightLegModel[13].rotateAngleZ = 0.41887902F;

		rightLegModel[14].addBox(-2F, 0F, -2F, 9, 20, 16, 0F); // Import ImportPart_05
		rightLegModel[14].setRotationPoint(0F, -76F, -23F);
		rightLegModel[14].rotateAngleZ = 0.41887902F;

		rightLegModel[15].addBox(-2F, 0F, -2F, 4, 16, 11, 0F); // Import ImportPart_05
		rightLegModel[15].setRotationPoint(-9F, -55F, -20.5F);
		rightLegModel[15].rotateAngleZ = -0.48869219F;

		rightLegModel[16].addBox(-2F, 0F, -2F, 13, 26, 10, 0F); // Import ImportPart_05
		rightLegModel[16].setRotationPoint(-6F, -48F, -20F);
		rightLegModel[16].rotateAngleZ = 0.12217305F;


		leftFootModel = new ModelRendererTurbo[6];
		leftFootModel[0] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[1] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[2] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[3] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[4] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import ImportPart_06
		leftFootModel[5] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Import ImportPart_06

		leftFootModel[0].addBox(-2F, 0F, -2F, 34, 6, 15, 0F); // Import ImportPart_06
		leftFootModel[0].setRotationPoint(-14F, -6F, 11.5F);

		leftFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import ImportPart_06
		leftFootModel[1].setRotationPoint(19F, -8F, 13.5F);

		leftFootModel[2].addBox(-2F, 0F, -2F, 2, 8, 11, 0F); // Import ImportPart_06
		leftFootModel[2].setRotationPoint(-15F, -8F, 13.5F);

		leftFootModel[3].addBox(-2F, 0F, -2F, 1, 5, 9, 0F); // Import ImportPart_06
		leftFootModel[3].setRotationPoint(20F, -12F, 14.5F);

		leftFootModel[4].addBox(-2F, 0F, -2F, 7, 3, 5, 0F); // Import ImportPart_06
		leftFootModel[4].setRotationPoint(20F, -3F, 10.5F);

		leftFootModel[5].addBox(-2F, 0F, -2F, 7, 3, 5, 0F); // Import ImportPart_06
		leftFootModel[5].setRotationPoint(20F, -3F, 22.5F);


		rightFootModel = new ModelRendererTurbo[6];
		rightFootModel[0] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[1] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[2] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[3] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Import ImportPart_05
		rightFootModel[4] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Import ImportPart_05
		rightFootModel[5] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Import ImportPart_05

		rightFootModel[0].addBox(-2F, 0F, -2F, 34, 6, 15, 0F); // Import ImportPart_05
		rightFootModel[0].setRotationPoint(-14F, -6F, -22.5F);

		rightFootModel[1].addBox(-2F, 0F, -2F, 3, 6, 11, 0F); // Import ImportPart_05
		rightFootModel[1].setRotationPoint(19F, -8F, -20.5F);

		rightFootModel[2].addBox(-2F, 0F, -2F, 2, 8, 11, 0F); // Import ImportPart_05
		rightFootModel[2].setRotationPoint(-15F, -8F, -20.5F);

		rightFootModel[3].addBox(-2F, 0F, -2F, 1, 5, 9, 0F); // Import ImportPart_05
		rightFootModel[3].setRotationPoint(20F, -12F, -19.5F);

		rightFootModel[4].addBox(-2F, 0F, -2F, 7, 3, 5, 0F); // Import ImportPart_05
		rightFootModel[4].setRotationPoint(20F, -3F, -23.5F);

		rightFootModel[5].addBox(-2F, 0F, -2F, 7, 3, 5, 0F); // Import ImportPart_05
		rightFootModel[5].setRotationPoint(20F, -3F, -11.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}