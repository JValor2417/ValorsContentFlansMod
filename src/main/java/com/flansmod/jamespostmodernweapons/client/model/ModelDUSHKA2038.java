//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DUSHKA2038
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDUSHKA2038 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelDUSHKA2038() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[44];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-53F, 0F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-50F, -1F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 8, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-53F, 4F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-56F, -4F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-54F, 1F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 90, 3, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(50F, 12.5F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 60, 11, 2, 0F); // Import Box0
		gunModel[6].setRotationPoint(-8.5F, 8.5F, 11.5F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 16, 11, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(35.5F, -5.5F, 11.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 59, 13, 10, 0F); // Import Box0
		gunModel[8].setRotationPoint(-8F, 11F, -5F);

		gunModel[9].addBox(0F, -17F, 0F, 5, 5, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(137.5F, -0.5F, -2F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(50F, 16.5F, -1F);

		gunModel[11].addBox(0F, -17F, 0F, 5, 6, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(128.5F, 3.5F, -2F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 5, 6, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(112.5F, 3.5F, -2F);
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 20, 3, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(100F, 16.5F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 4, 6, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(128.5F, -1.5F, -2.5F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 4, 6, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(112.5F, -1.5F, -2.5F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 10, 2, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(82F, 27.5F, 2F);

		gunModel[17].addBox(0F, -17F, 0F, 20, 3, 3, 0F); // Import Box0
		gunModel[17].setRotationPoint(68F, 27F, 1.5F);

		gunModel[18].addBox(0F, -17F, 0F, 22, 2, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(48F, 27.5F, 2F);

		gunModel[19].addBox(0F, -17F, 0F, 10, 2, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(82F, 27.5F, -4F);

		gunModel[20].addBox(0F, -17F, 0F, 20, 3, 3, 0F); // Import Box0
		gunModel[20].setRotationPoint(68F, 27F, -4.5F);

		gunModel[21].addBox(0F, -17F, 0F, 22, 2, 2, 0F); // Import Box0
		gunModel[21].setRotationPoint(48F, 27.5F, -4F);

		gunModel[22].addBox(0F, -17F, 0F, 10, 3, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(50F, 22.5F, -1.5F);

		gunModel[23].addBox(0F, -17F, 0F, 12, 5, 9, 0F); // Import Box0
		gunModel[23].setRotationPoint(50F, 25.5F, -4.5F);

		gunModel[24].addBox(0F, -17F, 0F, 59, 6, 10, 0F); // Import Box0
		gunModel[24].setRotationPoint(-8F, 25F, -5F);

		gunModel[25].addBox(0F, -17F, 0F, 8, 1, 2, 0F); // Import Box0
		gunModel[25].setRotationPoint(-43F, 9F, -1F);
		gunModel[25].rotateAngleZ = -0.05235988F;

		gunModel[26].addBox(0F, -17F, 0F, 1, 5, 2, 0F); // Import Box0
		gunModel[26].setRotationPoint(-36F, 4.5F, -1F);
		gunModel[26].rotateAngleZ = -0.05235988F;

		gunModel[27].addBox(0F, -17F, 0F, 8, 1, 2, 0F); // Import Box0
		gunModel[27].setRotationPoint(-43F, 3F, -1F);
		gunModel[27].rotateAngleZ = -0.05235988F;

		gunModel[28].addBox(0F, -17F, 0F, 20, 4, 10, 0F); // Import Box0
		gunModel[28].setRotationPoint(-28F, 25F, -5F);

		gunModel[29].addBox(0F, -17F, 0F, 42, 9, 6, 0F); // Import Box0
		gunModel[29].setRotationPoint(-48.5F, 8.5F, 12.5F);
		gunModel[29].rotateAngleX = 1.57079633F;

		gunModel[30].addBox(0F, -17F, 0F, 22, 3, 8, 0F); // Import Box0
		gunModel[30].setRotationPoint(-48F, 25F, -4F);

		gunModel[31].addBox(0F, -17F, 0F, 40, 2, 2, 0F); // Import Box0
		gunModel[31].setRotationPoint(-44.5F, -19.5F, 11.5F);
		gunModel[31].rotateAngleX = 1.57079633F;
		gunModel[31].rotateAngleZ = -0.20943951F;

		gunModel[32].addBox(0F, -17F, 0F, 40, 2, 2, 0F); // Import Box0
		gunModel[32].setRotationPoint(-44.5F, -19.5F, 20.5F);
		gunModel[32].rotateAngleX = 1.57079633F;
		gunModel[32].rotateAngleZ = -0.20943951F;

		gunModel[33].addBox(0F, -17F, 0F, 12, 6, 8, 0F); // Import Box0
		gunModel[33].setRotationPoint(-51F, -5F, -4F);

		gunModel[34].addBox(0F, -17F, 0F, 6, 7, 8, 0F); // Import Box0
		gunModel[34].setRotationPoint(-7F, 3F, -4F);

		gunModel[35].addBox(0F, -17F, 0F, 14, 8, 8, 0F); // Import Box0
		gunModel[35].setRotationPoint(-52F, 17F, -4F);

		gunModel[36].addBox(0F, -17F, 0F, 5, 6, 4, 0F); // Import Box0
		gunModel[36].setRotationPoint(15.5F, -7.5F, -2F);
		gunModel[36].rotateAngleZ = 1.57079633F;

		gunModel[37].addBox(0F, -17F, 0F, 26, 8, 8, 0F); // Import Box0
		gunModel[37].setRotationPoint(18.5F, 28F, -4F);

		gunModel[38].addBox(0F, -17F, 0F, 2, 3, 26, 0F); // Import Box0
		gunModel[38].setRotationPoint(44.5F, 31F, -2F);

		gunModel[39].addBox(0F, -17F, 0F, 2, 3, 26, 0F); // Import Box0
		gunModel[39].setRotationPoint(16.5F, 31F, -2F);

		gunModel[40].addBox(0F, -17F, 0F, 16, 4, 2, 0F); // Import Box0
		gunModel[40].setRotationPoint(22.5F, 14F, 3.05F);

		gunModel[41].addBox(0F, -17F, 0F, 14, 9, 6, 0F); // Import Box0
		gunModel[41].setRotationPoint(35.5F, -6.5F, 12.5F);
		gunModel[41].rotateAngleX = 1.57079633F;
		gunModel[41].rotateAngleZ = -0.34906585F;

		gunModel[42].addBox(0F, -17F, 0F, 20, 10, 6, 0F); // Import Box0
		gunModel[42].setRotationPoint(17.5F, -6.5F, 12F);
		gunModel[42].rotateAngleX = 1.57079633F;

		gunModel[43].addBox(0F, -17F, 0F, 28, 11, 2, 0F); // Import Box0
		gunModel[43].setRotationPoint(-8.5F, -5.5F, 11.5F);
		gunModel[43].rotateAngleX = 1.57079633F;


		defaultBarrelModel = new ModelRendererTurbo[2];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 2, 6, 6, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(139F, 11F, -3F);

		defaultBarrelModel[1].addBox(0F, -17F, 0F, 4, 8, 8, 0F); // Import Box0
		defaultBarrelModel[1].setRotationPoint(141F, 10F, -4F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 20, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(139F, -9.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(138F, -5.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 1, 1, 5, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(18F, -27.5F, -2.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(18F, -28.5F, -3F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(18F, -28.5F, 2F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 1, 1, 5, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(18F, -33.5F, -2.5F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 16, 3, 2, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(17F, -11.5F, -1F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 10, 1, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(10F, -5.5F, -0.5F);
		defaultScopeModel[7].rotateAngleZ = 1.06465084F;


		ammoModel = new ModelRendererTurbo[24];
		ammoModel[0] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 22, 20, 24, 0F); // Import Box0
		ammoModel[0].setRotationPoint(20.5F, 24F, 12F);

		ammoModel[1].addBox(0F, -17F, 0F, 20, 18, 2, 0F); // Import Box0
		ammoModel[1].setRotationPoint(21.5F, 25F, 11F);

		ammoModel[2].addBox(0F, -17F, 0F, 20, 18, 2, 0F); // Import Box0
		ammoModel[2].setRotationPoint(21.5F, 25F, 35F);

		ammoModel[3].addBox(0F, -17F, 0F, 20, 20, 1, 0F); // Import Box0
		ammoModel[3].setRotationPoint(21.5F, 28F, 31F);
		ammoModel[3].rotateAngleX = 1.57079633F;

		ammoModel[4].addBox(0F, -17F, 0F, 20, 18, 1, 0F); // Import Box0
		ammoModel[4].setRotationPoint(21.5F, 6F, 36F);
		ammoModel[4].rotateAngleX = 0.59341195F;

		ammoModel[5].addBox(0F, -17F, 0F, 21, 2, 2, 0F); // Import Box0
		ammoModel[5].setRotationPoint(21F, 23F, 34.5F);

		ammoModel[6].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		ammoModel[6].setRotationPoint(42.5F, 30F, 21F);

		ammoModel[7].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		ammoModel[7].setRotationPoint(18.5F, 30F, 21F);

		ammoModel[8].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		ammoModel[8].setRotationPoint(24.5F, 14.5F, 6.5F);

		ammoModel[9].addBox(0F, -17F, 0F, 20, 20, 1, 0F); // Import Box0
		ammoModel[9].setRotationPoint(21.5F, 7.95F, 31F);
		ammoModel[9].rotateAngleX = 1.57079633F;

		ammoModel[10].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		ammoModel[10].setRotationPoint(27F, 14F, 5F);

		ammoModel[11].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		ammoModel[11].setRotationPoint(27F, 14F, 6F);

		ammoModel[12].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		ammoModel[12].setRotationPoint(24.5F, 16.5F, 10.5F);

		ammoModel[13].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		ammoModel[13].setRotationPoint(27F, 16F, 9F);

		ammoModel[14].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		ammoModel[14].setRotationPoint(27F, 16F, 10F);

		ammoModel[15].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		ammoModel[15].setRotationPoint(24.5F, 18.5F, 14.5F);

		ammoModel[16].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		ammoModel[16].setRotationPoint(27F, 18F, 13F);

		ammoModel[17].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		ammoModel[17].setRotationPoint(27F, 18F, 14F);

		ammoModel[18].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		ammoModel[18].setRotationPoint(24.5F, 20.5F, 18.5F);

		ammoModel[19].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		ammoModel[19].setRotationPoint(27F, 20F, 17F);

		ammoModel[20].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		ammoModel[20].setRotationPoint(27F, 20F, 18F);

		ammoModel[21].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		ammoModel[21].setRotationPoint(24.5F, 22.5F, 22.5F);

		ammoModel[22].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		ammoModel[22].setRotationPoint(27F, 22F, 21F);

		ammoModel[23].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		ammoModel[23].setRotationPoint(27F, 22F, 22F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 26, 4, 3, 0F); // Import Box0
		slideModel[0].setRotationPoint(24F, 11.5F, -6.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(25F, 12F, -10.5F);

		slideModel[2].addBox(0F, -17F, 0F, 3, 4, 4, 0F); // Import Box0
		slideModel[2].setRotationPoint(24.5F, 11.5F, -14.5F);



		barrelAttachPoint = new Vector3f(145F /16F, 3F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(43F /16F, 23F /16F, 5F /16F);

		scopeAttachPoint = new Vector3f(27F /16F, 13F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}