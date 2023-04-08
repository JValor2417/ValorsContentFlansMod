//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Predator37mm
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

public class ModelPredator37mm extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPredator37mm() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[61];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 15, 8, 6, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-23F, -32F, -3F);
		gunModel[0].rotateAngleZ = -0.12217305F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 24, 5, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-16F, -28F, -2.5F);
		gunModel[1].rotateAngleZ = 0.03490659F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 23, 4, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-18F, -25F, -2F);
		gunModel[2].rotateAngleZ = 0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 95, 8, 7, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-13F, 6F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 52, 9, 7, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-18F, -3F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 70, 11, 10, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-14F, -22F, 11.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 68, 8, 10, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-13F, -16F, -5F);

		gunModel[7].addBox(0F, -17F, 0F, 66, 3, 8, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-12F, -17F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 10, 41, 6, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(39F, 7F, -7F);

		gunModel[9].addBox(0F, -17F, 0F, 6, 17, 5, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(30F, 13F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 20, 13, 13, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(52F, -19F, -6.5F);

		gunModel[11].addBox(0F, -17F, 0F, 10, 4, 12, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(71F, -12F, -6F);

		gunModel[12].addBox(0F, -17F, 0F, 9, 8, 11, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(70F, -18.5F, -5.5F);
		gunModel[12].rotateAngleZ = -0.06981317F;

		gunModel[13].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(87F, -2F, -4F);

		gunModel[14].addBox(0F, -17F, 0F, 48, 11, 9, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(34F, -4F, -4.5F);

		gunModel[15].addBox(0F, -17F, 0F, 16, 2, 8, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(43F, 3.5F, 4F);

		gunModel[16].addBox(0F, -17F, 0F, 10, 41, 6, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(62F, 7F, -7F);

		gunModel[17].addBox(0F, -17F, 0F, 10, 2, 20, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(39F, 48F, -7F);

		gunModel[18].addBox(0F, -17F, 0F, 10, 2, 20, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(62F, 48F, -7F);

		gunModel[19].addBox(0F, -17F, 0F, 51, 7, 15, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(-5F, -14F, -7.5F);

		gunModel[20].addBox(0F, -17F, 0F, 95, 8, 7, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(-13F, -11F, -3.5F);

		gunModel[21].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(78F, 12F, 3.5F);

		gunModel[22].addBox(0F, -17F, 0F, 16, 1, 6, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(43F, 5.5F, 4F);

		gunModel[23].addBox(0F, -17F, 0F, 7, 5, 17, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(-4F, -13F, -8.5F);

		gunModel[24].addBox(0F, -17F, 0F, 7, 5, 17, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(6F, -13F, -8.5F);

		gunModel[25].addBox(0F, -17F, 0F, 7, 5, 17, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(16F, -13F, -8.5F);

		gunModel[26].addBox(0F, -17F, 0F, 7, 5, 17, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(26F, -13F, -8.5F);

		gunModel[27].addBox(0F, -17F, 0F, 7, 5, 17, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(36F, -13F, -8.5F);

		gunModel[28].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(87F, -2F, 2F);

		gunModel[29].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(87F, 4F, -4F);

		gunModel[30].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(87F, 4F, 2F);

		gunModel[31].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(87F, -3F, -1F);

		gunModel[32].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(87F, 5F, -1F);

		gunModel[33].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(87F, 1F, -5F);

		gunModel[34].addBox(0F, -17F, 0F, 90, 2, 2, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(87F, 1F, 3F);

		gunModel[35].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(78F, 24F, 3.5F);

		gunModel[36].addBox(0F, -17F, 0F, 4, 16, 2, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(108F, 12F, 3.5F);

		gunModel[37].addBox(0F, -17F, 0F, 4, 16, 2, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(74F, 12F, 3.5F);

		gunModel[38].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(78F, 12F, -5.5F);

		gunModel[39].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(78F, 24F, -5.5F);

		gunModel[40].addBox(0F, -17F, 0F, 4, 16, 2, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(108F, 12F, -5.5F);

		gunModel[41].addBox(0F, -17F, 0F, 4, 16, 2, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(74F, 12F, -5.5F);

		gunModel[42].addBox(0F, -17F, 0F, 70, 4, 2, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(112F, 16F, 3.5F);

		gunModel[43].addBox(0F, -17F, 0F, 70, 4, 2, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(112F, 24F, 3.5F);

		gunModel[44].addBox(0F, -17F, 0F, 4, 12, 2, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(182F, 16F, 3.5F);

		gunModel[45].addBox(0F, -17F, 0F, 70, 4, 2, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(112F, 16F, -5.5F);

		gunModel[46].addBox(0F, -17F, 0F, 70, 4, 2, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(112F, 24F, -5.5F);

		gunModel[47].addBox(0F, -17F, 0F, 4, 12, 2, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(182F, 16F, -5.5F);

		gunModel[48].addBox(0F, -17F, 0F, 16, 18, 17, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(82F, -7F, -8.5F);

		gunModel[49].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(89F, -6F, -1F);

		gunModel[50].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(89F, 8F, -1F);

		gunModel[51].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(89F, 1F, -8F);

		gunModel[52].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(89F, 1F, 6F);

		gunModel[53].addBox(0F, -17F, 0F, 4, 3, 17, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(157F, -6.5F, -8.5F);

		gunModel[54].addBox(0F, -17F, 0F, 4, 3, 17, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(157F, 7.5F, -8.5F);

		gunModel[55].addBox(0F, -17F, 0F, 4, 11, 3, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(157F, -3.5F, -8.5F);

		gunModel[56].addBox(0F, -17F, 0F, 4, 11, 3, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(157F, -3.5F, 5.5F);

		gunModel[57].addBox(0F, -17F, 0F, 16, 3, 7, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(-24F, -34F, -3.5F);
		gunModel[57].rotateAngleZ = -0.17453293F;

		gunModel[58].addBox(0F, -17F, 0F, 40, 13, 7, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(-11F, 17F, -3.5F);

		gunModel[59].addBox(0F, -17F, 0F, 6, 24, 5, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(-18F, 6F, -2.5F);

		gunModel[60].addBox(0F, -17F, 0F, 58, 3, 3, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(-20F, 22F, -1.5F);


		ammoModel = new ModelRendererTurbo[13];
		ammoModel[0] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import ImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import ImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import ImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 30, 34, 34, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(40.5F, 14F, 0F);

		ammoModel[1].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(44F, 9.5F, 15F);

		ammoModel[2].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(44F, 3.5F, 15F);

		ammoModel[3].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(44F, -0.5F, 10F);

		ammoModel[4].addBox(0F, -17F, 0F, 2, 32, 32, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(38.5F, 15F, 1F);

		ammoModel[5].addBox(0F, -17F, 0F, 2, 32, 32, 0F); // Import ImportBox0
		ammoModel[5].setRotationPoint(70.5F, 15F, 1F);

		ammoModel[6].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import ImportBox0
		ammoModel[6].setRotationPoint(44F, -0.5F, 4F);

		ammoModel[7].addBox(0F, -17F, 0F, 7, 14, 1, 0F); // Import ImportBox0
		ammoModel[7].setRotationPoint(45F, 1F, 16F);

		ammoModel[8].addBox(0F, -17F, 0F, 7, 1, 13, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(45F, 0F, 4F);

		ammoModel[9].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import ImportBox0
		ammoModel[9].setRotationPoint(49.5F, 10.5F, 16F);

		ammoModel[10].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import ImportBox0
		ammoModel[10].setRotationPoint(49.5F, 4.5F, 16F);

		ammoModel[11].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import ImportBox0
		ammoModel[11].setRotationPoint(49.5F, 0.5F, 11F);

		ammoModel[12].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import ImportBox0
		ammoModel[12].setRotationPoint(49.5F, 0.5F, 5F);



		barrelAttachPoint = new Vector3f(132F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(43 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}