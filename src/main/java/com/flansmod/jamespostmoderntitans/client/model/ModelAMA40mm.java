//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AMA40mm
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

public class ModelAMA40mm extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAMA40mm() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[67];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import ImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-12F, 19.5F, -3F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 5, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-7F, 5.5F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 4, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-12F, 7.5F, -2F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(0F, -17F, 0F, 90, 8, 8, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-7F, 1.5F, -4F);

		gunModel[4].addBox(0F, -17F, 0F, 38, 7, 7, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-39F, 19.5F, -3.5F);
		gunModel[4].rotateAngleZ = -0.2268928F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 9, 6, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-4F, -0.5F, -3F);
		gunModel[5].rotateAngleZ = 0.38397244F;

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-11F, -11.5F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 15, 9, 6, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-24F, -8.5F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 39, 3, 9, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-20F, 9.5F, -4.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 70, 12, 10, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(-36F, -20.5F, 11F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 16, 4, 2, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(56F, -16.5F, -6.5F);

		gunModel[11].addBox(0F, -17F, 0F, 2, 4, 4, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(72F, -16.5F, -8.5F);

		gunModel[12].addBox(0F, -17F, 0F, 40, 1, 6, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(35F, -20.5F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 62, 4, 10, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(-28F, -17.5F, -5F);

		gunModel[14].addBox(0F, -17F, 0F, 60, 1, 8, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(-27F, -18.5F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 81, 2, 7, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(84F, 13.5F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 38, 10, 8, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(-17F, 9.5F, -4F);
		gunModel[16].rotateAngleZ = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 30, 26, 13, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(40F, 2.5F, -7F);

		gunModel[18].addBox(0F, -17F, 0F, 14, 14, 9, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(70F, 7.5F, -4.5F);

		gunModel[19].addBox(0F, -17F, 0F, 30, 7, 6, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(0F, 28.5F, -3F);

		gunModel[20].addBox(0F, -17F, 0F, 10, 7, 5, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(30F, 28.5F, -2.5F);
		gunModel[20].rotateAngleZ = 0.2443461F;

		gunModel[21].addBox(0F, -17F, 0F, 6, 25, 7, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(34F, 8.5F, -3.5F);

		gunModel[22].addBox(0F, -17F, 0F, 11, 11, 11, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(71.5F, 9F, -5.5F);

		gunModel[23].addBox(0F, -17F, 0F, 30, 12, 13, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(76F, -19.55F, -6.5F);

		gunModel[24].addBox(0F, -17F, 0F, 60, 4, 12, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(106F, -14.5F, -6F);

		gunModel[25].addBox(0F, -17F, 0F, 45, 4, 11, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(104F, -17.5F, -5.5F);
		gunModel[25].rotateAngleZ = -0.06981317F;

		gunModel[26].addBox(0F, -17F, 0F, 31, 2, 10, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(134F, -15.5F, -5F);

		gunModel[27].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(148F, -4.5F, -2F);

		gunModel[28].addBox(0F, -17F, 0F, 42, 21, 9, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(34F, -19.5F, -4.5F);

		gunModel[29].addBox(0F, -17F, 0F, 6, 6, 12, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(74F, 11.5F, -6F);

		gunModel[30].addBox(0F, -17F, 0F, 32, 7, 2, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(40F, -14F, 2.55F);

		gunModel[31].addBox(0F, -17F, 0F, 14, 5, 5, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(196F, -5F, -2.5F);

		gunModel[32].addBox(0F, -17F, 0F, 12, 5, 4, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(197F, -6.5F, -2F);

		gunModel[33].addBox(0F, -17F, 0F, 16, 1, 4, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(197F, -0.5F, -2F);

		gunModel[34].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(197F, -4.5F, -4F);

		gunModel[35].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(197F, -4.5F, 0F);

		gunModel[36].addBox(0F, -17F, 0F, 30, 2, 12, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(40F, 28.5F, -6.5F);

		gunModel[37].addBox(0F, -17F, 0F, 10, 6, 8, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(-28F, -14.5F, -4F);
		gunModel[37].rotateAngleZ = 0.52359878F;

		gunModel[38].addBox(0F, -17F, 0F, 30, 2, 10, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(104F, -19F, -5F);
		gunModel[38].rotateAngleZ = -0.06981317F;

		gunModel[39].addBox(0F, -17F, 0F, 30, 2, 9, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(134F, -16.75F, -4.5F);

		gunModel[40].addBox(0F, -17F, 0F, 83, 6, 8, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(83F, 7.5F, -4F);

		gunModel[41].addBox(0F, -17F, 0F, 30, 12, 4, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(106F, -8.5F, -2F);

		gunModel[42].addBox(0F, -17F, 0F, 60, 2, 13, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(106F, -10.5F, -6.5F);

		gunModel[43].addBox(0F, -17F, 0F, 30, 5, 5, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(120F, -5F, -2.5F);

		gunModel[44].addBox(0F, -17F, 0F, 2, 27, 8, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(166F, -14F, -4F);

		gunModel[45].addBox(0F, -17F, 0F, 1, 25, 6, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(168F, -13F, -3F);

		gunModel[46].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(147.5F, -4.5F, -3F);

		gunModel[47].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(144.5F, -4.5F, -3F);

		gunModel[48].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(141.5F, -4.5F, -3F);

		gunModel[49].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(138.5F, -4.5F, -3F);

		gunModel[50].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(135.5F, -4.5F, -3F);

		gunModel[51].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(132.5F, -4.5F, -3F);

		gunModel[52].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(129.5F, -4.5F, -3F);

		gunModel[53].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(126.5F, -4.5F, -3F);

		gunModel[54].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(123.5F, -4.5F, -3F);

		gunModel[55].addBox(0F, -17F, 0F, 2, 4, 6, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(120.5F, -4.5F, -3F);

		gunModel[56].addBox(0F, -17F, 0F, 52, 3, 5, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(169F, 8F, -2.5F);

		gunModel[57].addBox(0F, -17F, 0F, 13, 1, 4, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(207F, 7F, -2F);

		gunModel[58].addBox(0F, -17F, 0F, 51, 2, 4, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(169F, 9.5F, -2F);

		gunModel[59].addBox(0F, -17F, 0F, 11, 3, 2, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(208F, 5F, -1F);

		gunModel[60].addBox(0F, -17F, 0F, 18, 1, 3, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(197F, 0.5F, -1.5F);

		gunModel[61].addBox(0F, -17F, 0F, 30, 15, 11, 0F); // Import ImportBox0
		gunModel[61].setRotationPoint(76F, -7.55F, -5.5F);

		gunModel[62].addBox(0F, -17F, 0F, 78, 4, 10, 0F); // Import ImportBox0
		gunModel[62].setRotationPoint(86F, 8.5F, -5F);

		gunModel[63].addBox(0F, -17F, 0F, 32, 4, 5, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(106F, 3.5F, -2.5F);

		gunModel[64].addBox(0F, -17F, 0F, 30, 1, 3, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(138F, 6.5F, -1.5F);

		gunModel[65].addBox(0F, -17F, 0F, 28, 1, 11, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(77F, -20.55F, -5.5F);

		gunModel[66].addBox(0F, -17F, 0F, 38, 1, 5, 0F); // Import ImportBox0
		gunModel[66].setRotationPoint(36F, -21F, -2.5F);


		ammoModel = new ModelRendererTurbo[52];
		ammoModel[0] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box0
		ammoModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		ammoModel[26] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Import Box0
		ammoModel[27] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		ammoModel[28] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		ammoModel[29] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import Box0
		ammoModel[30] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import Box0
		ammoModel[31] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		ammoModel[32] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import Box0
		ammoModel[33] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Import Box0
		ammoModel[34] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import Box0
		ammoModel[35] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Import Box0
		ammoModel[36] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		ammoModel[37] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Import Box0
		ammoModel[38] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		ammoModel[39] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box0
		ammoModel[40] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box0
		ammoModel[41] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Import Box0
		ammoModel[42] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		ammoModel[43] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box0
		ammoModel[44] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Import Box0
		ammoModel[45] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import Box0
		ammoModel[46] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import Box0
		ammoModel[47] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import Box0
		ammoModel[48] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import Box0
		ammoModel[49] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		ammoModel[50] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Import Box0
		ammoModel[51] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 39, 24, 31, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(35.5F, 2.5F, 7F);

		ammoModel[1].addBox(0F, -17F, 0F, 1, 22, 29, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(34.95F, 3.5F, 8F);

		ammoModel[2].addBox(0F, -17F, 0F, 2, 22, 29, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(74.05F, 3.5F, 8F);

		ammoModel[3].addBox(0F, -17F, 0F, 37, 22, 2, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(36.5F, 3.5F, 38F);

		ammoModel[4].addBox(0F, -17F, 0F, 37, 22, 2, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(36.5F, 3.5F, 6F);

		ammoModel[5].addBox(0F, -17F, 0F, 37, 2, 29, 0F); // Import ImportBox0
		ammoModel[5].setRotationPoint(36.5F, 25.5F, 8F);

		ammoModel[6].addBox(0F, -17F, 0F, 37, 2, 22, 0F); // Import ImportBox0
		ammoModel[6].setRotationPoint(36.5F, -26.5F, 14F);
		ammoModel[6].rotateAngleX = -1.04719755F;

		ammoModel[7].addBox(0F, -17F, 0F, 35, 2, 2, 0F); // Import ImportBox0
		ammoModel[7].setRotationPoint(37.5F, 1.5F, 37.5F);

		ammoModel[8].addBox(0F, -17F, 0F, 37, 1, 29, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(36.5F, 2.25F, 8F);

		ammoModel[9].addBox(0F, -17F, 0F, 6, 3, 3, 0F); // Import Box0
		ammoModel[9].setRotationPoint(60F, -12F, 4.5F);

		ammoModel[10].addBox(0F, -17F, 0F, 4, 2, 2, 0F); // Import Box0
		ammoModel[10].setRotationPoint(65F, -11.5F, 5F);

		ammoModel[11].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[11].setRotationPoint(42F, -12.5F, 4F);

		ammoModel[12].addBox(0F, -17F, 0F, 16, 3, 3, 0F); // Import Box0
		ammoModel[12].setRotationPoint(44F, -12F, 4.5F);

		ammoModel[13].addBox(0F, -17F, 0F, 6, 5, 5, 0F); // Import Box0
		ammoModel[13].setRotationPoint(47.75F, -13F, 3.5F);

		ammoModel[14].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[14].setRotationPoint(42.5F, -11.5F, 5F);

		ammoModel[15].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import Box0
		ammoModel[15].setRotationPoint(45.25F, -12.5F, 4F);

		ammoModel[16].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		ammoModel[16].setRotationPoint(68.5F, -11F, 5.5F);

		ammoModel[17].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		ammoModel[17].setRotationPoint(61F, -12.5F, 5F);

		ammoModel[18].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		ammoModel[18].setRotationPoint(61F, -11.5F, 4F);

		ammoModel[19].addBox(0F, -17F, 0F, 6, 3, 3, 0F); // Import Box0
		ammoModel[19].setRotationPoint(60F, -8F, 11.5F);

		ammoModel[20].addBox(0F, -17F, 0F, 4, 2, 2, 0F); // Import Box0
		ammoModel[20].setRotationPoint(65F, -7.5F, 12F);

		ammoModel[21].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[21].setRotationPoint(42F, -8.5F, 11F);

		ammoModel[22].addBox(0F, -17F, 0F, 16, 3, 3, 0F); // Import Box0
		ammoModel[22].setRotationPoint(44F, -8F, 11.5F);

		ammoModel[23].addBox(0F, -17F, 0F, 6, 5, 5, 0F); // Import Box0
		ammoModel[23].setRotationPoint(47.75F, -9F, 10.5F);

		ammoModel[24].addBox(0F, -17F, 0F, 6, 1, 2, 0F); // Import Box0
		ammoModel[24].setRotationPoint(47.75F, -9F, 8.5F);

		ammoModel[25].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[25].setRotationPoint(42.5F, -7.5F, 12F);

		ammoModel[26].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import Box0
		ammoModel[26].setRotationPoint(45.25F, -8.5F, 11F);

		ammoModel[27].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		ammoModel[27].setRotationPoint(68.5F, -7F, 12.5F);

		ammoModel[28].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		ammoModel[28].setRotationPoint(61F, -8.5F, 12F);

		ammoModel[29].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		ammoModel[29].setRotationPoint(61F, -7.5F, 11F);

		ammoModel[30].addBox(0F, -17F, 0F, 6, 3, 3, 0F); // Import Box0
		ammoModel[30].setRotationPoint(60F, -4F, 18.5F);

		ammoModel[31].addBox(0F, -17F, 0F, 4, 2, 2, 0F); // Import Box0
		ammoModel[31].setRotationPoint(65F, -3.5F, 19F);

		ammoModel[32].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[32].setRotationPoint(42F, -4.5F, 18F);

		ammoModel[33].addBox(0F, -17F, 0F, 16, 3, 3, 0F); // Import Box0
		ammoModel[33].setRotationPoint(44F, -4F, 18.5F);

		ammoModel[34].addBox(0F, -17F, 0F, 6, 5, 5, 0F); // Import Box0
		ammoModel[34].setRotationPoint(47.75F, -5F, 17.5F);

		ammoModel[35].addBox(0F, -17F, 0F, 6, 1, 2, 0F); // Import Box0
		ammoModel[35].setRotationPoint(47.75F, -5F, 15.5F);

		ammoModel[36].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[36].setRotationPoint(42.5F, -3.5F, 19F);

		ammoModel[37].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import Box0
		ammoModel[37].setRotationPoint(45.25F, -4.5F, 18F);

		ammoModel[38].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		ammoModel[38].setRotationPoint(68.5F, -3F, 19.5F);

		ammoModel[39].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		ammoModel[39].setRotationPoint(61F, -4.5F, 19F);

		ammoModel[40].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		ammoModel[40].setRotationPoint(61F, -3.5F, 18F);

		ammoModel[41].addBox(0F, -17F, 0F, 6, 3, 3, 0F); // Import Box0
		ammoModel[41].setRotationPoint(60F, 0F, 25.5F);

		ammoModel[42].addBox(0F, -17F, 0F, 4, 2, 2, 0F); // Import Box0
		ammoModel[42].setRotationPoint(65F, 0.5F, 26F);

		ammoModel[43].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[43].setRotationPoint(42F, -0.5F, 25F);

		ammoModel[44].addBox(0F, -17F, 0F, 16, 3, 3, 0F); // Import Box0
		ammoModel[44].setRotationPoint(44F, 0F, 25.5F);

		ammoModel[45].addBox(0F, -17F, 0F, 6, 5, 5, 0F); // Import Box0
		ammoModel[45].setRotationPoint(47.75F, -1F, 24.5F);

		ammoModel[46].addBox(0F, -17F, 0F, 6, 1, 2, 0F); // Import Box0
		ammoModel[46].setRotationPoint(47.75F, -1F, 22.5F);

		ammoModel[47].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		ammoModel[47].setRotationPoint(42.5F, 0.5F, 26F);

		ammoModel[48].addBox(0F, -17F, 0F, 12, 4, 4, 0F); // Import Box0
		ammoModel[48].setRotationPoint(45.25F, -0.5F, 25F);

		ammoModel[49].addBox(0F, -17F, 0F, 1, 1, 1, 0F); // Import Box0
		ammoModel[49].setRotationPoint(68.5F, 1F, 26.5F);

		ammoModel[50].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		ammoModel[50].setRotationPoint(61F, -0.5F, 26F);

		ammoModel[51].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		ammoModel[51].setRotationPoint(61F, 0.5F, 25F);



		barrelAttachPoint = new Vector3f(210F /16F, 20F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(56F /16F, 38F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(120 /16F, 1F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}