//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: STARS
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

public class ModelSTARS extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSTARS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[50];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-11.5F, 15.5F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 25, 5, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-5F, -0.5F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 15, 3, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-11F, 1.5F, -1.5F);
		gunModel[2].rotateAngleZ = -0.43633231F;

		gunModel[3].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-5F, 0.5F, -2F);

		gunModel[4].addBox(0F, -17F, 0F, 43, 13, 11, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-9F, -10.5F, -5.5F);

		gunModel[5].addBox(0F, -17F, 0F, 43, 9, 4, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-8F, -25F, 12.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 86, 4, 7, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(90F, -17.5F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 90, 4, 12, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(88F, -12.5F, -5F);

		gunModel[8].addBox(0F, -17F, 0F, 88, 3, 10, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(89F, -13.5F, -4F);

		gunModel[9].addBox(0F, -17F, 0F, 20, 7, 8, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(-12F, 20.5F, -4F);

		gunModel[10].addBox(0F, -17F, 0F, 24, 7, 7, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(9F, 20.5F, -3.5F);
		gunModel[10].rotateAngleZ = 0.13962634F;

		gunModel[11].addBox(0F, -17F, 0F, 6, 23, 10, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(28F, 1.5F, -5F);

		gunModel[12].addBox(0F, -17F, 0F, 6, 39, 13, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(34F, -14F, -6.5F);

		gunModel[13].addBox(0F, -17F, 0F, 50, 5, 5, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(142F, 9F, -9.5F);

		gunModel[14].addBox(0F, -17F, 0F, 103, 16, 16, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(86F, -9.5F, -7F);

		gunModel[15].addBox(0F, -17F, 0F, 50, 5, 5, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(142F, 9F, 6.5F);

		gunModel[16].addBox(0F, -17F, 0F, 44, 4, 22, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(86F, 3.5F, -10F);

		gunModel[17].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(191F, 10F, -8.5F);

		gunModel[18].addBox(0F, -17F, 0F, 10, 15, 15, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(179.5F, -9F, -6.5F);

		gunModel[19].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(191F, 10F, 7.5F);

		gunModel[20].addBox(0F, -17F, 0F, 6, 32, 32, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(76F, -10.5F, -15F);

		gunModel[21].addBox(0F, -17F, 0F, 6, 32, 32, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(40F, -10.5F, -15F);

		gunModel[22].addBox(0F, -17F, 0F, 59, 6, 5, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(128F, 5.5F, -1.5F);

		gunModel[23].addBox(0F, -17F, 0F, 61, 4, 7, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(127F, 10.5F, -2.5F);

		gunModel[24].addBox(0F, -17F, 0F, 61, 4, 7, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(127F, 5.5F, -2.5F);

		gunModel[25].addBox(0F, -17F, 0F, 46, 8, 8, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(130F, 7.5F, -11F);

		gunModel[26].addBox(0F, -17F, 0F, 46, 8, 8, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(130F, 7.5F, 5F);

		gunModel[27].addBox(0F, -17F, 0F, 4, 38, 29, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(36F, -13.5F, -13.5F);

		gunModel[28].addBox(0F, -17F, 0F, 45, 14, 26, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(86F, 7F, -12F);

		gunModel[29].addBox(0F, -17F, 0F, 44, 4, 24, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(86F, 20.5F, -11F);

		gunModel[30].addBox(0F, -17F, 0F, 42, 4, 32, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(40F, 21.5F, -15F);

		gunModel[31].addBox(0F, -17F, 0F, 4, 31, 31, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(82F, -10F, -14.5F);

		gunModel[32].addBox(0F, -17F, 0F, 41, 7, 8, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(133F, 8F, -12F);

		gunModel[33].addBox(0F, -17F, 0F, 41, 7, 8, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(133F, 8F, 6F);

		gunModel[34].addBox(0F, -17F, 0F, 40, 4, 31, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(41F, 22.5F, -14.5F);

		gunModel[35].addBox(0F, -17F, 0F, 100, 15, 17, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(88F, -9F, -7.5F);

		gunModel[36].addBox(0F, -17F, 0F, 100, 16, 14, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(88F, -10.5F, -6F);

		gunModel[37].addBox(0F, -17F, 0F, 42, 4, 32, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(40F, -14.5F, -15F);

		gunModel[38].addBox(0F, -17F, 0F, 40, 2, 31, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(41F, -15.5F, -14.5F);

		gunModel[39].addBox(0F, -17F, 0F, 30, 32, 10, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(46F, -10.5F, -15F);

		gunModel[40].addBox(0F, -17F, 0F, 38, 36, 2, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(42F, -12.5F, -16F);

		gunModel[41].addBox(0F, -17F, 0F, 18, 5, 10, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(-11F, 21.5F, -5F);

		gunModel[42].addBox(0F, -17F, 0F, 23, 5, 9, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(8F, 21.5F, -4.5F);
		gunModel[42].rotateAngleZ = 0.13962634F;

		gunModel[43].addBox(0F, -17F, 0F, 38, 36, 2, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(42F, -12.5F, 16F);

		gunModel[44].addBox(0F, -17F, 0F, 42, 7, 4, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(-7F, -26F, 13.5F);
		gunModel[44].rotateAngleX = 1.57079633F;

		gunModel[45].addBox(0F, -17F, 0F, 32, 4, 5, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(2F, -17F, -2.5F);

		gunModel[46].addBox(0F, -17F, 0F, 170, 4, 4, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(2.5F, -21F, -2F);

		gunModel[47].addBox(0F, -17F, 0F, 43, 12, 27, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(87F, 8F, -12.5F);

		gunModel[48].addBox(0F, -17F, 0F, 9, 5, 4, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(3F, -14.75F, -2F);
		gunModel[48].rotateAngleZ = 0.50614548F;

		gunModel[49].addBox(0F, -17F, 0F, 41, 11, 13, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(-8F, -9.5F, -6.5F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 25, 11, 11, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(48F, -0.5F, -5.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 25, 10, 10, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(49F, 0F, -5F);

		ammoModel[2].addBox(0F, -17F, 0F, 2, 12, 12, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(46F, -1F, -6F);

		ammoModel[3].addBox(0F, -17F, 0F, 4, 9, 9, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(74F, 0.5F, -4.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 4, 7, 7, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(75F, 1.5F, -3.5F);



		barrelAttachPoint = new Vector3f(190F /16F, 18F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 38F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(104 /16F, -8F /16F, 0F /16F);


		gunSlideDistance = 4F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}