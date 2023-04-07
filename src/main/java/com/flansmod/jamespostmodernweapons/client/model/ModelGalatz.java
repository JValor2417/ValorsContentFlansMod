//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Galatz
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

public class ModelGalatz extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGalatz() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[47];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 40, 6, 8, 0F); // Import Box0
		gunModel[0].setRotationPoint(-13F, -4F, -4F);

		gunModel[1].addBox(0F, -17F, 0F, 2, 11, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(12F, 0F, -2.5F);
		gunModel[1].rotateAngleZ = -0.06981317F;

		gunModel[2].addBox(0F, -17F, 0F, 46, 2, 6, 0F); // Import Box0
		gunModel[2].setRotationPoint(-13F, -10F, -3F);

		gunModel[3].addBox(0F, -17F, 0F, 100, 3, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(28F, -10.5F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 44, 10, 9, 0F); // Import Box0
		gunModel[4].setRotationPoint(33F, -11.5F, -4.5F);

		gunModel[5].addBox(0F, -17F, 0F, 41, 4, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-8F, -14F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(4F, 7F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 50, 2, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(32F, -13.5F, -1F);

		gunModel[8].addBox(0F, -17F, 0F, 30, 8, 0, 0F); // Import Box0
		gunModel[8].setRotationPoint(34F, -28F, 13.5F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 3, 10, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-16F, -8F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 36, 8, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(40F, -17F, 13F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 35, 6, 1, 0F); // Import Box0
		gunModel[11].setRotationPoint(40.5F, -16.5F, 14F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 55, 2, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(26F, -5.5F, -1F);

		gunModel[13].addBox(0F, -17F, 0F, 1, 1, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(32F, -11F, 0.5F);
		gunModel[13].rotateAngleX = 0.55850536F;

		gunModel[14].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[14].setRotationPoint(32.05F, -8.75F, -8.5F);

		gunModel[15].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		gunModel[15].setRotationPoint(38.05F, -7.75F, -8.5F);

		gunModel[16].addBox(0F, -17F, 0F, 11, 3, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(25.05F, -4.5F, -9.5F);

		gunModel[17].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[17].setRotationPoint(32.05F, -3.75F, -8.5F);

		gunModel[18].addBox(0F, -17F, 0F, 12, 6, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(26F, -5.6F, -3F);
		gunModel[18].rotateAngleZ = 0.26179939F;

		gunModel[19].addBox(0F, -17F, 0F, 42, 8, 10, 0F); // Import Box0
		gunModel[19].setRotationPoint(34F, -10.5F, -5F);

		gunModel[20].addBox(0F, -17F, 0F, 46, 4, 8, 0F); // Import Box0
		gunModel[20].setRotationPoint(-13F, -8F, -4F);

		gunModel[21].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(-1.75F, -14.2F, -2F);
		gunModel[21].rotateAngleZ = 0.6981317F;

		gunModel[22].addBox(0F, -17F, 0F, 8, 4, 4, 0F); // Import Box0
		gunModel[22].setRotationPoint(78F, -11F, -2F);

		gunModel[23].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		gunModel[23].setRotationPoint(78F, -6F, -1.5F);

		gunModel[24].addBox(0F, -17F, 0F, 6, 1, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(78F, -7F, -1F);

		gunModel[25].addBox(0F, -17F, 0F, 5, 4, 3, 0F); // Import Box0
		gunModel[25].setRotationPoint(78F, -14F, -1.5F);

		gunModel[26].addBox(0F, -17F, 0F, 5, 11, 6, 0F); // Import Box0
		gunModel[26].setRotationPoint(-10.5F, 11F, -3F);
		gunModel[26].rotateAngleZ = -0.08726646F;

		gunModel[27].addBox(0F, -17F, 0F, 8, 20, 5, 0F); // Import Box0
		gunModel[27].setRotationPoint(-9F, 2F, -2.5F);
		gunModel[27].rotateAngleZ = -0.17453293F;

		gunModel[28].addBox(0F, -17F, 0F, 3, 12, 4, 0F); // Import Box0
		gunModel[28].setRotationPoint(-10.75F, 1F, -2F);
		gunModel[28].rotateAngleZ = -0.34906585F;

		gunModel[29].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[29].setRotationPoint(-11F, 12F, -2.5F);
		gunModel[29].rotateAngleZ = -0.08726646F;

		gunModel[30].addBox(0F, -17F, 0F, 3, 11, 4, 0F); // Import Box0
		gunModel[30].setRotationPoint(-2.75F, 12F, -2F);
		gunModel[30].rotateAngleZ = 0.03490659F;

		gunModel[31].addBox(0F, -17F, 0F, 13, 5, 6, 0F); // Import Box0
		gunModel[31].setRotationPoint(-9.5F, 0F, -3F);
		gunModel[31].rotateAngleZ = -0.08726646F;

		gunModel[32].addBox(0F, -17F, 0F, 2, 5, 3, 0F); // Import Box0
		gunModel[32].setRotationPoint(4F, 2F, -1.5F);

		gunModel[33].addBox(0F, -17F, 0F, 1, 3, 4, 0F); // Import Box0
		gunModel[33].setRotationPoint(11.5F, 10F, -2F);
		gunModel[33].rotateAngleZ = -0.06981317F;

		gunModel[34].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import Box0
		gunModel[34].setRotationPoint(127.05F, -10F, -1F);

		gunModel[35].addBox(0F, -17F, 0F, 3, 24, 6, 0F); // Import Box0
		gunModel[35].setRotationPoint(-69F, -8F, -3F);

		gunModel[36].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		gunModel[36].setRotationPoint(-66F, -2F, -2F);

		gunModel[37].addBox(0F, -17F, 0F, 40, 4, 2, 0F); // Import Box0
		gunModel[37].setRotationPoint(-65F, 0F, -1F);

		gunModel[38].addBox(0F, -17F, 0F, 34, 13, 3, 0F); // Import Box0
		gunModel[38].setRotationPoint(-57F, 2F, -1.5F);
		gunModel[38].rotateAngleZ = 0.41887902F;

		gunModel[39].addBox(0F, -17F, 0F, 8, 14, 4, 0F); // Import Box0
		gunModel[39].setRotationPoint(-66F, 2F, -2F);

		gunModel[40].addBox(0F, -17F, 0F, 50, 5, 6, 0F); // Import Box0
		gunModel[40].setRotationPoint(-66F, -7F, -3F);

		gunModel[41].addBox(0F, -17F, 0F, 2, 23, 5, 0F); // Import Box0
		gunModel[41].setRotationPoint(-69.5F, -7.5F, -2.5F);

		gunModel[42].addBox(0F, -17F, 0F, 10, 4, 1, 0F); // Import Box0
		gunModel[42].setRotationPoint(-22.5F, -0.5F, -0.5F);
		gunModel[42].rotateAngleZ = 0.20943951F;

		gunModel[43].addBox(0F, -17F, 0F, 50, 2, 4, 0F); // Import Box0
		gunModel[43].setRotationPoint(-66F, -8F, -2F);

		gunModel[44].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[44].setRotationPoint(-57F, -12F, -3.5F);

		gunModel[45].addBox(0F, -17F, 0F, 29, 1, 6, 0F); // Import Box0
		gunModel[45].setRotationPoint(-56.5F, -13F, -3F);

		gunModel[46].addBox(0F, -17F, 0F, 28, 4, 8, 0F); // Import Box0
		gunModel[46].setRotationPoint(-56F, -11F, -4F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(95.5F, -28.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(96.5F, -32.5F, 1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(96.5F, -32.5F, -2F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -30.5F, -1.5F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(16F, -32F, 1.5F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(16F, -32F, -2.5F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -31F, 1.5F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -31F, -2.5F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;

		defaultScopeModel[8].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(96F, -30.5F, 1F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(96F, -30.5F, -2F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 16, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(17.5F, 1F, -2F);
		ammoModel[0].rotateAngleZ = 0.2268928F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 6, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(22.5F, 15F, -1.5F);
		ammoModel[1].rotateAngleZ = 0.31415927F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 13, 3, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(15F, -9F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(16F, -8.5F, -6.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(102F /16F, 26F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(10F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(45 /16F, 18F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}