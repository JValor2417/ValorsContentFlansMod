//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LeadWall
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

public class ModelLeadWall extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeadWall() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[66];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-12.5F, 25F, -1.5F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 5, 13, 2, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-13F, 12F, -1F);
		gunModel[1].rotateAngleZ = -0.41887902F;

		gunModel[2].addBox(0F, -17F, 0F, 48, 4, 35, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(38F, -3F, -16.5F);

		gunModel[3].addBox(0F, -17F, 0F, 40, 7, 5, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-41F, 23F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 6, 4, 3, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-9F, 13F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-11F, 2F, -3.5F);

		gunModel[6].addBox(0F, -17F, 0F, 19, 9, 6, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-29F, 5F, -3F);

		gunModel[7].addBox(0F, -17F, 0F, 36, 6, 7, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-22F, 17F, -3.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 71, 11, 10, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-39F, -10F, 11.5F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 40, 6, 9, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(32F, -9F, -4.5F);

		gunModel[10].addBox(0F, -17F, 0F, 64, 8, 12, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(-32F, -10F, -6F);

		gunModel[11].addBox(0F, -17F, 0F, 62, 3, 10, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(-31F, -11F, -5F);

		gunModel[12].addBox(0F, -17F, 0F, 36, 10, 7, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(-16F, 17F, -3.5F);
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 20, 7, 4, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(0F, 31F, -2F);

		gunModel[14].addBox(0F, -17F, 0F, 10, 7, 3, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(22F, 31F, -1.5F);
		gunModel[14].rotateAngleZ = 0.2443461F;

		gunModel[15].addBox(0F, -17F, 0F, 6, 22, 5, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(26F, 15F, -2.5F);

		gunModel[16].addBox(0F, -17F, 0F, 6, 38, 11, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(32F, -3F, -5.5F);

		gunModel[17].addBox(0F, -17F, 0F, 50, 8, 8, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(86F, 5F, -14F);

		gunModel[18].addBox(0F, -17F, 0F, 50, 8, 8, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(86F, 5F, -3F);

		gunModel[19].addBox(0F, -17F, 0F, 50, 8, 8, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(86F, 5F, 8F);

		gunModel[20].addBox(0F, -17F, 0F, 40, 12, 32, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(86F, 3F, -15F);

		gunModel[21].addBox(0F, -17F, 0F, 10, 7, 7, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(128F, 5.5F, -13.5F);

		gunModel[22].addBox(0F, -17F, 0F, 10, 7, 7, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(128F, 5.5F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 10, 7, 7, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(128F, 5.5F, 8.5F);

		gunModel[24].addBox(0F, -17F, 0F, 6, 34, 34, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(80F, 1F, -16F);

		gunModel[25].addBox(0F, -17F, 0F, 6, 34, 34, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(38F, 1F, -16F);

		gunModel[26].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(86F, -8F, -13F);

		gunModel[27].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(92F, -8F, -13F);

		gunModel[28].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(98F, -8F, -13F);

		gunModel[29].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(104F, -8F, -13F);

		gunModel[30].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(110F, -8F, -13F);

		gunModel[31].addBox(0F, -17F, 0F, 4, 12, 28, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(116F, -8F, -13F);

		gunModel[32].addBox(0F, -17F, 0F, 10, 5, 5, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(116F, -5F, -2.5F);

		gunModel[33].addBox(0F, -17F, 0F, 36, 6, 28, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(86F, 15F, -13F);

		gunModel[34].addBox(0F, -17F, 0F, 10, 8, 5, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(108F, 21F, -2.5F);

		gunModel[35].addBox(0F, -17F, 0F, 33, 4, 7, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(86F, 29F, -3.5F);

		gunModel[36].addBox(0F, -17F, 0F, 12, 3, 7, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(107F, 21F, -3.5F);

		gunModel[37].addBox(0F, -17F, 0F, 31, 3, 6, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(87F, 31F, -3F);

		gunModel[38].addBox(0F, -17F, 0F, 10, 6, 6, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(128.05F, 6F, -13F);

		gunModel[39].addBox(0F, -17F, 0F, 10, 6, 6, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(128.05F, 6F, -2F);

		gunModel[40].addBox(0F, -17F, 0F, 10, 6, 6, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(128.05F, 6F, 9F);

		gunModel[41].addBox(0F, -17F, 0F, 60, 1, 9, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(-30F, -11.5F, -4.5F);

		gunModel[42].addBox(0F, -17F, 0F, 9, 6, 10, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(-27F, -7F, -5F);
		gunModel[42].rotateAngleZ = 0.71558499F;

		gunModel[43].addBox(0F, -17F, 0F, 36, 2, 8, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(-24F, 17F, -4F);
		gunModel[43].rotateAngleZ = 1.57079633F;

		gunModel[44].addBox(0F, -17F, 0F, 48, 4, 7, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(71F, -7F, -3.5F);

		gunModel[45].addBox(0F, -17F, 0F, 38, 5, 7, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(33F, -14F, -3.5F);

		gunModel[46].addBox(0F, -17F, 0F, 36, 1, 5, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(34F, -15F, -2.5F);

		gunModel[47].addBox(0F, -17F, 0F, 32, 4, 7, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(86F, -1F, -3.5F);

		gunModel[48].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(87F, -8.5F, -13.5F);

		gunModel[49].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(93F, -8.5F, -13.5F);

		gunModel[50].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(99F, -8.5F, -13.5F);

		gunModel[51].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(105F, -8.5F, -13.5F);

		gunModel[52].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(111F, -8.5F, -13.5F);

		gunModel[53].addBox(0F, -17F, 0F, 2, 12, 29, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(117F, -8.5F, -13.5F);

		gunModel[54].addBox(0F, -17F, 0F, 1, 3, 4, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(126F, -4F, -2F);

		gunModel[55].addBox(0F, -17F, 0F, 5, 20, 4, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(-7F, 12F, -2F);
		gunModel[55].rotateAngleZ = -0.27925268F;

		gunModel[56].addBox(0F, -17F, 0F, 38, 10, 33, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(86F, 4F, -15.5F);

		gunModel[57].addBox(0F, -17F, 0F, 5, 34, 35, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(80.5F, 1.5F, -16.5F);

		gunModel[58].addBox(0F, -17F, 0F, 5, 34, 35, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(38.5F, 1.5F, -16.5F);

		gunModel[59].addBox(0F, -17F, 0F, 40, 6, 6, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(-41F, 23.5F, -3F);
		gunModel[59].rotateAngleZ = -0.19198622F;

		gunModel[60].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(0F, 31.5F, -2.5F);

		gunModel[61].addBox(0F, -17F, 0F, 10, 6, 4, 0F); // Import ImportBox0
		gunModel[61].setRotationPoint(22F, 31.5F, -2F);
		gunModel[61].rotateAngleZ = 0.2443461F;

		gunModel[62].addBox(0F, -17F, 0F, 69, 12, 7, 0F); // Import ImportBox0
		gunModel[62].setRotationPoint(-38F, -11F, 11F);
		gunModel[62].rotateAngleX = 1.57079633F;

		gunModel[63].addBox(0F, -17F, 0F, 46, 1, 33, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(39F, -3.5F, -15.5F);

		gunModel[64].addBox(0F, -17F, 0F, 5, 20, 3, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(-6.5F, 12F, -1.5F);
		gunModel[64].rotateAngleZ = -0.27925268F;

		gunModel[65].addBox(0F, -17F, 0F, 8, 6, 9, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(-27F, -8.5F, -4.5F);
		gunModel[65].rotateAngleZ = 0.71558499F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 28, 32, 32, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(48F, 2F, -15F);

		ammoModel[1].addBox(0F, -17F, 0F, 6, 30, 30, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(44F, 3F, -14F);

		ammoModel[2].addBox(0F, -17F, 0F, 6, 30, 30, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(74F, 3F, -14F);



		barrelAttachPoint = new Vector3f(132F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 32F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(103 /16F, -17F /16F, 0F /16F);


		gunSlideDistance = 4F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}