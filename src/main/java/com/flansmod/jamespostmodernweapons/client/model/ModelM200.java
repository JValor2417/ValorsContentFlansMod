//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M200
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

public class ModelM200 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM200() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[47];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 11, 5, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-28.5F, 19.75F, -3F);
		gunModel[0].rotateAngleZ = -0.38397244F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 17, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-21F, 10F, -1.5F);
		gunModel[1].rotateAngleZ = -0.2443461F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 13, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-23.5F, 9F, -1F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(3.5F, 5.75F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 60, 3, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(-14F, -2F, -3F);

		gunModel[5].addBox(0F, -17F, 0F, 140, 5, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(38F, -7.5F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-6.5F, 10.75F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 20, 5, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-14.5F, -11F, 14.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 51, 3, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-5F, -12F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 52, 8, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-6F, -19F, 13F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 52, 7, 1, 0F); // Import Box0
		gunModel[10].setRotationPoint(-6F, -25F, 13.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 13, 2, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(-19.5F, 10.75F, -3F);

		gunModel[12].addBox(0F, -17F, 0F, 14, 5, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-20F, 5.75F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 5, 5, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(-18.5F, 1.75F, -2F);

		gunModel[14].addBox(0F, -17F, 0F, 4, 15, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(-16.5F, 10.75F, -1F);
		gunModel[14].rotateAngleZ = -0.10471976F;

		gunModel[15].addBox(0F, -17F, 0F, 5, 13, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(-20F, 10F, -2.5F);
		gunModel[15].rotateAngleZ = -0.2443461F;

		gunModel[16].addBox(0F, -17F, 0F, 7, 5, 12, 0F); // Import Box0
		gunModel[16].setRotationPoint(5.5F, -4F, 14.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 16, 4, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(-12.5F, -11.5F, 10.5F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 50, 3, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(-62.5F, -12F, 11F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 50, 3, 3, 0F); // Import Box0
		gunModel[19].setRotationPoint(-62.5F, -12F, 20F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 2, 12, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(38.5F, -11.5F, 11F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 60, 10, 10, 0F); // Import Box0
		gunModel[21].setRotationPoint(46F, -17F, 12F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 18, 9, 9, 0F); // Import Box0
		gunModel[22].setRotationPoint(106F, -17.5F, 12.5F);
		gunModel[22].rotateAngleX = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 4, 5, 12, 0F); // Import Box0
		gunModel[23].setRotationPoint(38F, -5F, 14.5F);
		gunModel[23].rotateAngleX = 1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 37, 5, 4, 0F); // Import Box0
		gunModel[24].setRotationPoint(38F, -2F, 14.5F);
		gunModel[24].rotateAngleX = 1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 3, 5, 12, 0F); // Import Box0
		gunModel[25].setRotationPoint(70F, -5F, 14.5F);
		gunModel[25].rotateAngleX = 1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 16, 6, 4, 0F); // Import Box0
		gunModel[26].setRotationPoint(68.5F, -14F, 14F);
		gunModel[26].rotateAngleX = 1.57079633F;

		gunModel[27].addBox(0F, -17F, 0F, 2, 4, 16, 0F); // Import Box0
		gunModel[27].setRotationPoint(73.5F, -3F, 15F);
		gunModel[27].rotateAngleX = 1.57079633F;
		gunModel[27].rotateAngleZ = -0.52359878F;

		gunModel[28].addBox(0F, -17F, 0F, 2, 4, 5, 0F); // Import Box0
		gunModel[28].setRotationPoint(8.5F, 0F, 15F);
		gunModel[28].rotateAngleX = 1.57079633F;
		gunModel[28].rotateAngleZ = -0.27925268F;

		gunModel[29].addBox(0F, -17F, 0F, 1, 3, 2, 0F); // Import Box0
		gunModel[29].setRotationPoint(8.5F, 1.5F, 15.5F);
		gunModel[29].rotateAngleX = 1.57079633F;
		gunModel[29].rotateAngleZ = -0.27925268F;

		gunModel[30].addBox(0F, -17F, 0F, 1, 11, 3, 0F); // Import Box0
		gunModel[30].setRotationPoint(40.5F, -12F, 11.5F);
		gunModel[30].rotateAngleX = 1.57079633F;

		gunModel[31].addBox(0F, -17F, 0F, 5, 4, 12, 0F); // Import Box0
		gunModel[31].setRotationPoint(37.5F, -5F, 15F);
		gunModel[31].rotateAngleX = 1.57079633F;

		gunModel[32].addBox(0F, -17F, 0F, 4, 4, 12, 0F); // Import Box0
		gunModel[32].setRotationPoint(69.5F, -5F, 15F);
		gunModel[32].rotateAngleX = 1.57079633F;

		gunModel[33].addBox(0F, -17F, 0F, 39, 6, 4, 0F); // Import Box0
		gunModel[33].setRotationPoint(37F, -1.5F, 14F);
		gunModel[33].rotateAngleX = 1.57079633F;

		gunModel[34].addBox(0F, -17F, 0F, 2, 3, 16, 0F); // Import Box0
		gunModel[34].setRotationPoint(74.5F, -3F, 15.5F);
		gunModel[34].rotateAngleX = 1.57079633F;
		gunModel[34].rotateAngleZ = -0.52359878F;

		gunModel[35].addBox(0F, -17F, 0F, 16, 4, 4, 0F); // Import Box0
		gunModel[35].setRotationPoint(-12.5F, -11.5F, 19.5F);
		gunModel[35].rotateAngleX = 1.57079633F;

		gunModel[36].addBox(0F, -17F, 0F, 20, 4, 4, 0F); // Import Box0
		gunModel[36].setRotationPoint(-76.5F, -11.5F, 10.5F);
		gunModel[36].rotateAngleX = 1.57079633F;

		gunModel[37].addBox(0F, -17F, 0F, 20, 4, 4, 0F); // Import Box0
		gunModel[37].setRotationPoint(-76.5F, -11.5F, 19.5F);
		gunModel[37].rotateAngleX = 1.57079633F;

		gunModel[38].addBox(0F, -17F, 0F, 18, 11, 10, 0F); // Import Box0
		gunModel[38].setRotationPoint(-76.5F, -15.5F, 11.5F);
		gunModel[38].rotateAngleX = 1.57079633F;

		gunModel[39].addBox(0F, -17F, 0F, 30, 11, 4, 0F); // Import Box0
		gunModel[39].setRotationPoint(-76.5F, -25.5F, 11.5F);
		gunModel[39].rotateAngleX = 1.57079633F;

		gunModel[40].addBox(0F, -17F, 0F, 28, 10, 4, 0F); // Import Box0
		gunModel[40].setRotationPoint(-75.5F, -26.5F, 12F);
		gunModel[40].rotateAngleX = 1.57079633F;

		gunModel[41].addBox(0F, -17F, 0F, 4, 9, 24, 0F); // Import Box0
		gunModel[41].setRotationPoint(-80.5F, -5.5F, 12.5F);
		gunModel[41].rotateAngleX = 1.57079633F;

		gunModel[42].addBox(0F, -17F, 0F, 18, 9, 10, 0F); // Import Box0
		gunModel[42].setRotationPoint(-76.5F, -5.5F, 12.5F);
		gunModel[42].rotateAngleX = 1.57079633F;

		gunModel[43].addBox(0F, -17F, 0F, 1, 8, 24, 0F); // Import Box0
		gunModel[43].setRotationPoint(-81F, -5.5F, 13F);
		gunModel[43].rotateAngleX = 1.57079633F;

		gunModel[44].addBox(0F, -17F, 0F, 4, 8, 2, 0F); // Import Box0
		gunModel[44].setRotationPoint(-47.5F, -26.5F, 13F);
		gunModel[44].rotateAngleX = 1.57079633F;

		gunModel[45].addBox(0F, -17F, 0F, 17, 11, 11, 0F); // Import Box0
		gunModel[45].setRotationPoint(68F, -16.5F, 11.5F);
		gunModel[45].rotateAngleX = 1.57079633F;

		gunModel[46].addBox(0F, -17F, 0F, 18, 1, 4, 0F); // Import Box0
		gunModel[46].setRotationPoint(12.5F, -20.5F, 12.95F);
		gunModel[46].rotateAngleX = 1.57079633F;


		defaultBarrelModel = new ModelRendererTurbo[10];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 18, 6, 6, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(178F, -8F, -3F);

		defaultBarrelModel[1].addBox(0F, -17F, 0F, 1, 5, 5, 0F); // Import Box0
		defaultBarrelModel[1].setRotationPoint(195.05F, -7.5F, -2.5F);

		defaultBarrelModel[2].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[2].setRotationPoint(179F, -7.5F, -3.05F);

		defaultBarrelModel[3].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[3].setRotationPoint(179F, -7.5F, 2.05F);

		defaultBarrelModel[4].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[4].setRotationPoint(183F, -7.5F, -3.05F);

		defaultBarrelModel[5].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[5].setRotationPoint(183F, -7.5F, 2.05F);

		defaultBarrelModel[6].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[6].setRotationPoint(187F, -7.5F, -3.05F);

		defaultBarrelModel[7].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[7].setRotationPoint(187F, -7.5F, 2.05F);

		defaultBarrelModel[8].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[8].setRotationPoint(191F, -7.5F, -3.05F);

		defaultBarrelModel[9].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		defaultBarrelModel[9].setRotationPoint(191F, -7.5F, 2.05F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 24, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(12.5F, 0F, -2F);

		ammoModel[1].addBox(0F, -17F, 0F, 18, 2, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(13F, 24F, -1.5F);
		ammoModel[1].rotateAngleZ = 0.03490659F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 28, 5, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(-11F, -7F, -2.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 10, 0F); // Import Box0
		slideModel[1].setRotationPoint(-11F, -3F, -4.5F);
		slideModel[1].rotateAngleX = 0.43633231F;

		slideModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		slideModel[2].setRotationPoint(-12F, -2.5F, -14.5F);

		slideModel[3].addBox(0F, -17F, 0F, 3, 4, 4, 0F); // Import Box0
		slideModel[3].setRotationPoint(-13F, -6.5F, -2F);



		barrelAttachPoint = new Vector3f(196F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(16F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(56 /16F, 2F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}