//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AK47
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.client.model.YourPackage; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAK47 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAK47() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[53];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 50, 4, 8, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, -4F, -3.5F);

		gunModel[1].addBox(0F, -17F, 0F, 4, 9, 6, 0F); // Import Box0
		gunModel[1].setRotationPoint(17F, -1F, -2.5F);
		gunModel[1].rotateAngleZ = -0.06981317F;

		gunModel[2].addBox(0F, -17F, 0F, 50, 2, 6, 0F); // Import Box0
		gunModel[2].setRotationPoint(-7.5F, -10F, -2.5F);

		gunModel[3].addBox(0F, -17F, 0F, 80, 3, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(44.5F, -8.5F, -1F);

		gunModel[4].addBox(0F, -17F, 0F, 39, 6, 8, 0F); // Import Box0
		gunModel[4].setRotationPoint(42.5F, -8.5F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 45, 4, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-2.5F, -14F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(7F, 6F, -1F);

		gunModel[7].addBox(0F, -17F, 0F, 10, 6, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(42.5F, -17F, 14.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 9, 5, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(43F, -16.5F, 15F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 50, 2, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(44.5F, -12.5F, -0.5F);

		gunModel[10].addBox(0F, -17F, 0F, 38, 5, 9, 0F); // Import Box0
		gunModel[10].setRotationPoint(43.5F, -8F, -4F);

		gunModel[11].addBox(0F, -17F, 0F, 50, 4, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-7.5F, -8F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(3.75F, -14.2F, -1.5F);
		gunModel[12].rotateAngleZ = 0.6981317F;

		gunModel[13].addBox(0F, -17F, 0F, 8, 4, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(93.5F, -9F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 6, 4, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(93.5F, -13.5F, -1F);

		gunModel[15].addBox(0F, -17F, 0F, 5, 1, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(93.5F, -10F, -0.5F);

		gunModel[16].addBox(0F, -17F, 0F, 5, 11, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(-7.05F, 9F, -2.5F);
		gunModel[16].rotateAngleZ = -0.08726646F;

		gunModel[17].addBox(0F, -17F, 0F, 8, 20, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(-5.5F, 0F, -2F);
		gunModel[17].rotateAngleZ = -0.17453293F;

		gunModel[18].addBox(0F, -17F, 0F, 3, 12, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(-7.25F, -2F, -1.5F);
		gunModel[18].rotateAngleZ = -0.34906585F;

		gunModel[19].addBox(0F, -17F, 0F, 2, 9, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(-7.55F, 10F, -1.5F);
		gunModel[19].rotateAngleZ = -0.08726646F;

		gunModel[20].addBox(0F, -17F, 0F, 3, 11, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(0.75F, 10F, -1.5F);
		gunModel[20].rotateAngleZ = 0.03490659F;

		gunModel[21].addBox(0F, -17F, 0F, 13, 4, 7, 0F); // Import Box0
		gunModel[21].setRotationPoint(-8F, -2F, -3F);
		gunModel[21].rotateAngleZ = -0.08726646F;

		gunModel[22].addBox(0F, -17F, 0F, 2, 9, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(5F, -1F, -1F);

		gunModel[23].addBox(0F, -17F, 0F, 2, 4, 5, 0F); // Import Box0
		gunModel[23].setRotationPoint(18F, 8F, -2F);
		gunModel[23].rotateAngleZ = -0.06981317F;

		gunModel[24].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(130.55F, -8F, -0.5F);

		gunModel[25].addBox(0F, -17F, 0F, 2, 9, 3, 0F); // Import Box0
		gunModel[25].setRotationPoint(17F, -1F, -1F);

		gunModel[26].addBox(0F, -17F, 0F, 38, 7, 1, 0F); // Import Box0
		gunModel[26].setRotationPoint(43F, -19F, 14F);
		gunModel[26].rotateAngleX = 1.57079633F;

		gunModel[27].addBox(0F, -17F, 0F, 26, 8, 3, 0F); // Import Box0
		gunModel[27].setRotationPoint(55.5F, -25.5F, 13.5F);
		gunModel[27].rotateAngleX = 1.57079633F;

		gunModel[28].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		gunModel[28].setRotationPoint(72F, -9.75F, 3.55F);

		gunModel[29].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		gunModel[29].setRotationPoint(62F, -9.75F, 3.55F);

		gunModel[30].addBox(0F, -17F, 0F, 26, 7, 1, 0F); // Import Box0
		gunModel[30].setRotationPoint(55.5F, -28.5F, 14F);
		gunModel[30].rotateAngleX = 1.57079633F;

		gunModel[31].addBox(0F, -17F, 0F, 26, 6, 1, 0F); // Import Box0
		gunModel[31].setRotationPoint(55.5F, -29.5F, 14.5F);
		gunModel[31].rotateAngleX = 1.57079633F;

		gunModel[32].addBox(0F, -17F, 0F, 13, 8, 7, 0F); // Import Box0
		gunModel[32].setRotationPoint(42.5F, -14.5F, -3F);

		gunModel[33].addBox(0F, -17F, 0F, 12, 1, 6, 0F); // Import Box0
		gunModel[33].setRotationPoint(43F, -15F, -2.5F);

		gunModel[34].addBox(0F, -17F, 0F, 26, 4, 1, 0F); // Import Box0
		gunModel[34].setRotationPoint(55F, -30F, 15.5F);
		gunModel[34].rotateAngleX = 1.57079633F;

		gunModel[35].addBox(0F, -17F, 0F, 8, 4, 4, 0F); // Import Box0
		gunModel[35].setRotationPoint(123.5F, -9F, -1.5F);

		gunModel[36].addBox(0F, -17F, 0F, 4, 5, 3, 0F); // Import Box0
		gunModel[36].setRotationPoint(125F, -13.5F, -1F);

		gunModel[37].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		gunModel[37].setRotationPoint(124F, -13F, -0.5F);

		gunModel[38].addBox(0F, -17F, 0F, 34, 4, 4, 0F); // Import Box0
		gunModel[38].setRotationPoint(-45.5F, 3.5F, -1.5F);
		gunModel[38].rotateAngleZ = 0.13962634F;

		gunModel[39].addBox(0F, -17F, 0F, 8, 4, 2, 0F); // Import Box0
		gunModel[39].setRotationPoint(-31.5F, -8.25F, -0.5F);
		gunModel[39].rotateAngleZ = 0.06981317F;

		gunModel[40].addBox(0F, -17F, 0F, 18, 6, 3, 0F); // Import Box0
		gunModel[40].setRotationPoint(-47.5F, -7.5F, -1F);
		gunModel[40].rotateAngleZ = 0.06981317F;

		gunModel[41].addBox(0F, -17F, 0F, 34, 8, 5, 0F); // Import Box0
		gunModel[41].setRotationPoint(-46F, -1.5F, -2F);
		gunModel[41].rotateAngleZ = 0.13962634F;

		gunModel[42].addBox(0F, -17F, 0F, 6, 4, 1, 0F); // Import Box0
		gunModel[42].setRotationPoint(-32.5F, -10.2F, 0F);
		gunModel[42].rotateAngleZ = -0.45378561F;

		gunModel[43].addBox(0F, -17F, 0F, 32, 2, 4, 0F); // Import Box0
		gunModel[43].setRotationPoint(-44.5F, -3.5F, -1.5F);
		gunModel[43].rotateAngleZ = 0.13962634F;

		gunModel[44].addBox(0F, -17F, 0F, 32, 7, 6, 0F); // Import Box0
		gunModel[44].setRotationPoint(-44.5F, -1F, -2.5F);
		gunModel[44].rotateAngleZ = 0.13962634F;

		gunModel[45].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		gunModel[45].setRotationPoint(72F, -9.75F, -3.55F);

		gunModel[46].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		gunModel[46].setRotationPoint(62F, -9.75F, -3.55F);

		gunModel[47].addBox(0F, -17F, 0F, 3, 16, 4, 0F); // Import Box0
		gunModel[47].setRotationPoint(-50.5F, -8F, -1.5F);

		gunModel[48].addBox(0F, -17F, 0F, 2, 15, 3, 0F); // Import Box0
		gunModel[48].setRotationPoint(-51F, -7.5F, -1F);

		gunModel[49].addBox(0F, -17F, 0F, 10, 4, 3, 0F); // Import Box0
		gunModel[49].setRotationPoint(-13F, -1.5F, -1F);
		gunModel[49].rotateAngleZ = 0.13962634F;

		gunModel[50].addBox(0F, -17F, 0F, 10, 6, 4, 0F); // Import Box0
		gunModel[50].setRotationPoint(-13F, -5.5F, -1.5F);
		gunModel[50].rotateAngleZ = 0.13962634F;

		gunModel[51].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import Box0
		gunModel[51].setRotationPoint(-14F, -7F, -1F);
		gunModel[51].rotateAngleZ = 0.13962634F;

		gunModel[52].addBox(0F, -17F, 0F, 10, 5, 5, 0F); // Import Box0
		gunModel[52].setRotationPoint(-12F, -5F, -2F);
		gunModel[52].rotateAngleZ = 0.13962634F;


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(142.5F, -28.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(143.5F, -32.5F, 1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(143.5F, -32.5F, -1.5F);
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
		defaultScopeModel[8].setRotationPoint(143F, -30.5F, 1.5F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(143F, -30.5F, -1.5F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 13, 19, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(23F, -1F, -2F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addBox(0F, -17F, 0F, 12, 5, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(37.5F, 26F, -1F);
		ammoModel[1].rotateAngleZ = 0.55850536F;

		ammoModel[2].addBox(0F, -17F, 0F, 13, 12, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(29.5F, 16.75F, -1.5F);
		ammoModel[2].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 15, 3, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(25.5F, -8.05F, -3.55F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(39.5F, -7.55F, -5.55F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(152.5F /16F, 24F /16F, 0.5F /16F);

		scopeAttachPoint = new Vector3f(14F /16F, 31F /16F, 0.5F /16F);

		gripAttachPoint = new Vector3f(66 /16F, 19F /16F, 0.5F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		scopeIsOnSlide = true;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}