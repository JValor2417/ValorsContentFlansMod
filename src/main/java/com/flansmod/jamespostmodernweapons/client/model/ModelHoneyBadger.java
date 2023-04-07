//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HoneyBadger
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

public class ModelHoneyBadger extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHoneyBadger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[68];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 45, 3, 8, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3.5F, -2.5F, -3.5F);

		gunModel[1].addBox(0F, -17F, 0F, 18, 8, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(23.5F, 0.5F, -3F);

		gunModel[2].addBox(0F, -17F, 0F, 38, 9, 8, 0F); // Import Box0
		gunModel[2].setRotationPoint(3.5F, -11.5F, -3.5F);

		gunModel[3].addBox(0F, -17F, 0F, 39, 6, 1, 0F); // Import Box0
		gunModel[3].setRotationPoint(45F, -9.5F, 3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 39, 6, 1, 0F); // Import Box0
		gunModel[4].setRotationPoint(45F, -9.5F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 39, 6, 1, 0F); // Import Box0
		gunModel[5].setRotationPoint(45F, -26.5F, 14.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 39, 6, 1, 0F); // Import Box0
		gunModel[6].setRotationPoint(45F, -19.5F, 14.5F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 44, 3, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-2.5F, -14F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(-4F, -28.5F, 16F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 7, 3, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(10F, -28.5F, 4F);
		gunModel[9].rotateAngleX = 1.57079633F;
		gunModel[9].rotateAngleY = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 2, 2, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(17.5F, -8F, -5F);
		gunModel[10].rotateAngleY = -0.73303829F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(17F, -9F, -4F);
		gunModel[11].rotateAngleY = -0.73303829F;

		gunModel[12].addBox(0F, -17F, 0F, 7, 9, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3.5F, -11.5F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 3, 3, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(41.5F, -2.5F, -3F);

		gunModel[14].addBox(0F, -17F, 0F, 3, 9, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(41.5F, -11.5F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(41.5F, -14F, -2F);

		gunModel[16].addBox(0F, -17F, 0F, 47, 6, 10, 0F); // Import Box0
		gunModel[16].setRotationPoint(-3F, -10F, -4.5F);

		gunModel[17].addBox(0F, -17F, 0F, 27, 3, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(-3.5F, 0.5F, -3F);

		gunModel[18].addBox(0F, -17F, 0F, 4, 15, 7, 0F); // Import Box0
		gunModel[18].setRotationPoint(-7.5F, -11.5F, -3F);

		gunModel[19].addBox(0F, -17F, 0F, 8, 5, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-13.5F, -3.25F, -2F);
		gunModel[19].rotateAngleZ = -0.45378561F;

		gunModel[20].addBox(0F, -17F, 0F, 10, 3, 1, 0F); // Import Box0
		gunModel[20].setRotationPoint(9.5F, -29F, 5.5F);
		gunModel[20].rotateAngleX = 1.57079633F;
		gunModel[20].rotateAngleY = -1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 1, 15, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(-8.5F, -11.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 19, 4, 8, 0F); // Import Box0
		gunModel[22].setRotationPoint(24.25F, 7.5F, -3.5F);
		gunModel[22].rotateAngleZ = 0.06981317F;

		gunModel[23].addBox(0F, -17F, 0F, 10, 5, 8, 0F); // Import Box0
		gunModel[23].setRotationPoint(-11F, 22.5F, -3.5F);
		gunModel[23].rotateAngleZ = -0.17453293F;

		gunModel[24].addBox(0F, -17F, 0F, 9, 22, 6, 0F); // Import Box0
		gunModel[24].setRotationPoint(-5.5F, 3.5F, -2.5F);
		gunModel[24].rotateAngleZ = -0.34906585F;

		gunModel[25].addBox(0F, -17F, 0F, 3, 17, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(-8F, 5.5F, -2F);
		gunModel[25].rotateAngleZ = -0.41887902F;

		gunModel[26].addBox(0F, -17F, 0F, 1, 4, 6, 0F); // Import Box0
		gunModel[26].setRotationPoint(-11.75F, 22.5F, -2.5F);
		gunModel[26].rotateAngleZ = -0.17453293F;

		gunModel[27].addBox(0F, -17F, 0F, 3, 13, 5, 0F); // Import Box0
		gunModel[27].setRotationPoint(-0.25F, 16.5F, -2F);
		gunModel[27].rotateAngleZ = -0.13962634F;

		gunModel[28].addBox(0F, -17F, 0F, 10, 8, 8, 0F); // Import Box0
		gunModel[28].setRotationPoint(-1.5F, 3.5F, -3.5F);

		gunModel[29].addBox(0F, -17F, 0F, 13, 2, 4, 0F); // Import Box0
		gunModel[29].setRotationPoint(10.5F, 9.45F, -1.5F);

		gunModel[30].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		gunModel[30].setRotationPoint(-5F, 4.5F, -3F);
		gunModel[30].rotateAngleZ = -0.34906585F;

		gunModel[31].addBox(0F, -17F, 0F, 26, 2, 6, 0F); // Import Box0
		gunModel[31].setRotationPoint(-36.5F, -2F, -2.5F);

		gunModel[32].addBox(0F, -17F, 0F, 26, 8, 7, 0F); // Import Box0
		gunModel[32].setRotationPoint(-36.5F, -10F, -3F);

		gunModel[33].addBox(0F, -17F, 0F, 26, 2, 6, 0F); // Import Box0
		gunModel[33].setRotationPoint(-36.5F, -11F, -2.5F);

		gunModel[34].addBox(0F, -17F, 0F, 16, 4, 12, 0F); // Import Box0
		gunModel[34].setRotationPoint(-26.5F, -7F, -5.5F);

		gunModel[35].addBox(0F, -17F, 0F, 3, 24, 6, 0F); // Import Box0
		gunModel[35].setRotationPoint(-39.5F, -11.5F, -2.5F);

		gunModel[36].addBox(0F, -17F, 0F, 2, 23, 5, 0F); // Import Box0
		gunModel[36].setRotationPoint(-40F, -11F, -2F);

		gunModel[37].addBox(0F, -17F, 0F, 26, 2, 4, 0F); // Import Box0
		gunModel[37].setRotationPoint(-36.5F, -11.5F, -1.5F);

		gunModel[38].addBox(0F, -17F, 0F, 2, 9, 6, 0F); // Import Box0
		gunModel[38].setRotationPoint(-10.5F, -11.5F, -2.5F);

		gunModel[39].addBox(0F, -17F, 0F, 2, 6, 6, 0F); // Import Box0
		gunModel[39].setRotationPoint(-10.5F, -2.5F, -2.5F);

		gunModel[40].addBox(0F, -17F, 0F, 34, 6, 6, 0F); // Import Box0
		gunModel[40].setRotationPoint(49.5F, -9.5F, -2.5F);

		gunModel[41].addBox(0F, -17F, 0F, 40, 7, 1, 0F); // Import Box0
		gunModel[41].setRotationPoint(44.5F, -10F, 4.5F);

		gunModel[42].addBox(0F, -17F, 0F, 40, 7, 1, 0F); // Import Box0
		gunModel[42].setRotationPoint(44.5F, -10F, -4.5F);

		gunModel[43].addBox(0F, -17F, 0F, 40, 7, 1, 0F); // Import Box0
		gunModel[43].setRotationPoint(44.5F, -27.5F, 14F);
		gunModel[43].rotateAngleX = 1.57079633F;

		gunModel[44].addBox(0F, -17F, 0F, 40, 7, 1, 0F); // Import Box0
		gunModel[44].setRotationPoint(44.5F, -18.5F, 14F);
		gunModel[44].rotateAngleX = 1.57079633F;

		gunModel[45].addBox(0F, -17F, 0F, 39, 4, 1, 0F); // Import Box0
		gunModel[45].setRotationPoint(45F, -9F, -5F);

		gunModel[46].addBox(0F, -17F, 0F, 39, 4, 1, 0F); // Import Box0
		gunModel[46].setRotationPoint(45F, -9F, 5F);

		gunModel[47].addBox(0F, -17F, 0F, 39, 5, 1, 0F); // Import Box0
		gunModel[47].setRotationPoint(45F, -28F, 15F);
		gunModel[47].rotateAngleX = 1.57079633F;

		gunModel[48].addBox(0F, -17F, 0F, 39, 5, 1, 0F); // Import Box0
		gunModel[48].setRotationPoint(45F, -18F, 15F);
		gunModel[48].rotateAngleX = 1.57079633F;

		gunModel[49].addBox(0F, -17F, 0F, 2, 8, 8, 0F); // Import Box0
		gunModel[49].setRotationPoint(8.5F, 3.5F, -3.5F);

		gunModel[50].addBox(0F, -17F, 0F, 39, 4, 2, 0F); // Import Box0
		gunModel[50].setRotationPoint(45.05F, -28.5F, 15.5F);
		gunModel[50].rotateAngleX = 1.57079633F;

		gunModel[51].addBox(0F, -17F, 0F, 20, 6, 6, 0F); // Import Box0
		gunModel[51].setRotationPoint(83.5F, -9.5F, -2.5F);

		gunModel[52].addBox(0F, -17F, 0F, 20, 5, 7, 0F); // Import Box0
		gunModel[52].setRotationPoint(83.55F, -9F, -3F);

		gunModel[53].addBox(0F, -17F, 0F, 20, 7, 5, 0F); // Import Box0
		gunModel[53].setRotationPoint(83.45F, -10F, -2F);

		gunModel[54].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		gunModel[54].setRotationPoint(102.55F, -8F, -1F);

		gunModel[55].addBox(0F, -17F, 0F, 25, 3, 2, 0F); // Import Box0
		gunModel[55].setRotationPoint(-11.5F, -6.5F, 4F);

		gunModel[56].addBox(0F, -17F, 0F, 25, 3, 2, 0F); // Import Box0
		gunModel[56].setRotationPoint(-11.5F, -6.5F, -5F);

		gunModel[57].addBox(0F, -17F, 0F, 3, 14, 5, 0F); // Import Box0
		gunModel[57].setRotationPoint(-38F, -2F, -2F);
		gunModel[57].rotateAngleZ = -0.08726646F;

		gunModel[58].addBox(0F, -17F, 0F, 4, 3, 11, 0F); // Import Box0
		gunModel[58].setRotationPoint(-29.5F, -6.5F, -5F);

		gunModel[59].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[59].setRotationPoint(-14.5F, -1F, -1.5F);

		gunModel[60].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[60].setRotationPoint(47F, -8F, 5.05F);

		gunModel[61].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[61].setRotationPoint(59F, -8F, 5.05F);

		gunModel[62].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[62].setRotationPoint(71F, -8F, 5.05F);

		gunModel[63].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[63].setRotationPoint(47F, -8F, -5.05F);

		gunModel[64].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[64].setRotationPoint(59F, -8F, -5.05F);

		gunModel[65].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[65].setRotationPoint(71F, -8F, -5.05F);

		gunModel[66].addBox(0F, -17F, 0F, 20, 4, 1, 0F); // Import Box0
		gunModel[66].setRotationPoint(3.5F, -9.5F, -4.65F);

		gunModel[67].addBox(0F, -17F, 0F, 18, 3, 1, 0F); // Import Box0
		gunModel[67].setRotationPoint(23.55F, -9F, -4.55F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(97F, -28.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(98F, -32.5F, 1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(98F, -32.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -30.5F, -1F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(16F, -32F, 2F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(16F, -32F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -31F, 2F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -31F, -2F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;

		defaultScopeModel[8].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(97.5F, -30.5F, 1.5F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(97.5F, -30.5F, -1.5F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 12, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(26F, 8.5F, -1.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 15, 16, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(29.5F, 19.5F, -1F);
		ammoModel[1].rotateAngleZ = 0.17453293F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 18, 3, 1, 0F); // Import Box0
		slideModel[0].setRotationPoint(23.5F, -9F, -4.6F);



		barrelAttachPoint = new Vector3f(97.5F /16F, 23.5F /16F, 0.5F /16F);

		scopeAttachPoint = new Vector3f(8F /16F, 31F /16F, 0.5F /16F);

		gripAttachPoint = new Vector3f(54 /16F, 18F /16F, 0.5F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}