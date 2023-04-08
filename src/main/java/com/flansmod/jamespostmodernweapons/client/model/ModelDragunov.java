//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dragunov
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

public class ModelDragunov extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelDragunov() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[56];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 50, 4, 8, 0F); // Import Box0
		gunModel[0].setRotationPoint(-13F, -4F, -4F);

		gunModel[1].addBox(0F, -17F, 0F, 2, 6, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(17F, 0F, -2.5F);
		gunModel[1].rotateAngleZ = -0.06981317F;

		gunModel[2].addBox(0F, -17F, 0F, 50, 2, 6, 0F); // Import Box0
		gunModel[2].setRotationPoint(-13F, -10F, -3F);

		gunModel[3].addBox(0F, -17F, 0F, 110, 3, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(37F, -8.5F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 50, 7, 9, 0F); // Import Box0
		gunModel[4].setRotationPoint(37F, -11.5F, -4.5F);

		gunModel[5].addBox(0F, -17F, 0F, 45, 4, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-8F, -14F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-1F, 5F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 21, 11, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(37F, -20F, 11.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 20, 9, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(37.5F, -19.5F, 12.5F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 58, 2, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(37F, -12.5F, -1F);

		gunModel[10].addBox(0F, -17F, 0F, 48, 5, 10, 0F); // Import Box0
		gunModel[10].setRotationPoint(38F, -10.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 50, 4, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-13F, -8F, -4F);

		gunModel[12].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-1.75F, -14.2F, -2F);
		gunModel[12].rotateAngleZ = 0.6981317F;

		gunModel[13].addBox(0F, -17F, 0F, 8, 4, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(94F, -9F, -2F);

		gunModel[14].addBox(0F, -17F, 0F, 6, 4, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(94F, -13.5F, -1.5F);

		gunModel[15].addBox(0F, -17F, 0F, 5, 1, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(94F, -10F, -1F);

		gunModel[16].addBox(0F, -17F, 0F, 5, 11, 8, 0F); // Import Box0
		gunModel[16].setRotationPoint(-15.5F, 9F, -4F);
		gunModel[16].rotateAngleZ = -0.08726646F;

		gunModel[17].addBox(0F, -17F, 0F, 8, 20, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(-14F, 0F, -3.5F);
		gunModel[17].rotateAngleZ = -0.17453293F;

		gunModel[18].addBox(0F, -17F, 0F, 3, 12, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(-15.75F, -1F, -3F);
		gunModel[18].rotateAngleZ = -0.34906585F;

		gunModel[19].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-16F, 10F, -2.5F);
		gunModel[19].rotateAngleZ = -0.08726646F;

		gunModel[20].addBox(0F, -17F, 0F, 3, 11, 6, 0F); // Import Box0
		gunModel[20].setRotationPoint(-7.75F, 10F, -3F);
		gunModel[20].rotateAngleZ = 0.03490659F;

		gunModel[21].addBox(0F, -17F, 0F, 11, 4, 8, 0F); // Import Box0
		gunModel[21].setRotationPoint(-14.5F, -1F, -4F);
		gunModel[21].rotateAngleZ = -0.08726646F;

		gunModel[22].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(-3F, 0F, -1.5F);

		gunModel[23].addBox(0F, -17F, 0F, 1, 3, 4, 0F); // Import Box0
		gunModel[23].setRotationPoint(17F, 5F, -2F);
		gunModel[23].rotateAngleZ = -0.06981317F;

		gunModel[24].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(146.05F, -8F, -1F);

		gunModel[25].addBox(0F, -17F, 0F, 2, 28, 8, 0F); // Import Box0
		gunModel[25].setRotationPoint(-81F, -4F, -4F);

		gunModel[26].addBox(0F, -17F, 0F, 2, 27, 7, 0F); // Import Box0
		gunModel[26].setRotationPoint(-81.5F, -3.5F, -3.5F);

		gunModel[27].addBox(0F, -17F, 0F, 22, 6, 8, 0F); // Import Box0
		gunModel[27].setRotationPoint(-57F, -6F, -4F);

		gunModel[28].addBox(0F, -17F, 0F, 21, 1, 7, 0F); // Import Box0
		gunModel[28].setRotationPoint(-56.5F, -7F, -3.5F);

		gunModel[29].addBox(0F, -17F, 0F, 20, 4, 9, 0F); // Import Box0
		gunModel[29].setRotationPoint(-56F, -5F, -4.5F);

		gunModel[30].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		gunModel[30].setRotationPoint(7F, 0F, -1.5F);

		gunModel[31].addBox(0F, -17F, 0F, 49, 8, 1, 0F); // Import Box0
		gunModel[31].setRotationPoint(37.5F, -21F, 13F);
		gunModel[31].rotateAngleX = 1.57079633F;

		gunModel[32].addBox(0F, -17F, 0F, 49, 8, 2, 0F); // Import Box0
		gunModel[32].setRotationPoint(37.5F, -27F, 13F);
		gunModel[32].rotateAngleX = 1.57079633F;

		gunModel[33].addBox(0F, -17F, 0F, 13, 7, 9, 0F); // Import Box0
		gunModel[33].setRotationPoint(-16F, -6F, -4.5F);
		gunModel[33].rotateAngleZ = -0.08726646F;

		gunModel[34].addBox(0F, -17F, 0F, 64, 5, 7, 0F); // Import Box0
		gunModel[34].setRotationPoint(-76F, -4F, -3.5F);

		gunModel[35].addBox(0F, -17F, 0F, 64, 5, 7, 0F); // Import Box0
		gunModel[35].setRotationPoint(-75.5F, 19F, -3.5F);
		gunModel[35].rotateAngleZ = 0.08726646F;

		gunModel[36].addBox(0F, -17F, 0F, 64, 6, 5, 0F); // Import Box0
		gunModel[36].setRotationPoint(-76F, -4.5F, -2.5F);

		gunModel[37].addBox(0F, -17F, 0F, 64, 6, 5, 0F); // Import Box0
		gunModel[37].setRotationPoint(-75.5F, 18.5F, -2.5F);
		gunModel[37].rotateAngleZ = 0.08726646F;

		gunModel[38].addBox(0F, -17F, 0F, 18, 9, 6, 0F); // Import Box0
		gunModel[38].setRotationPoint(-76F, 10.5F, -3F);

		gunModel[39].addBox(0F, -17F, 0F, 14, 18, 6, 0F); // Import Box0
		gunModel[39].setRotationPoint(-58F, 1.5F, -3F);

		gunModel[40].addBox(0F, -17F, 0F, 3, 10, 3, 0F); // Import Box0
		gunModel[40].setRotationPoint(-68F, 1.5F, -1.5F);

		gunModel[41].addBox(0F, -17F, 0F, 3, 28, 8, 0F); // Import Box0
		gunModel[41].setRotationPoint(-79F, -4F, -4F);

		gunModel[42].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[42].setRotationPoint(80.5F, -8.75F, 4.05F);

		gunModel[43].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[43].setRotationPoint(72.5F, -8.75F, 4.05F);

		gunModel[44].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[44].setRotationPoint(64.5F, -8.75F, 4.05F);

		gunModel[45].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[45].setRotationPoint(77.5F, -6.75F, 4.05F);

		gunModel[46].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[46].setRotationPoint(69.5F, -6.75F, 4.05F);

		gunModel[47].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[47].setRotationPoint(61.5F, -6.75F, 4.05F);

		gunModel[48].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[48].setRotationPoint(80.5F, -8.75F, -5.05F);

		gunModel[49].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[49].setRotationPoint(72.5F, -8.75F, -5.05F);

		gunModel[50].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[50].setRotationPoint(64.5F, -8.75F, -5.05F);

		gunModel[51].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[51].setRotationPoint(77.5F, -6.75F, -5.05F);

		gunModel[52].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[52].setRotationPoint(69.5F, -6.75F, -5.05F);

		gunModel[53].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		gunModel[53].setRotationPoint(61.5F, -6.75F, -5.05F);

		gunModel[54].addBox(0F, -17F, 0F, 49, 7, 1, 0F); // Import Box0
		gunModel[54].setRotationPoint(37.5F, -29F, 13.5F);
		gunModel[54].rotateAngleX = 1.57079633F;

		gunModel[55].addBox(0F, -17F, 0F, 49, 5, 2, 0F); // Import Box0
		gunModel[55].setRotationPoint(37.5F, -30F, 14.5F);
		gunModel[55].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(111.5F, -26.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(112.5F, -32.5F, 1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(112.5F, -32.5F, -2F);
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
		defaultScopeModel[8].setRotationPoint(112F, -30.5F, 1F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(112F, -30.5F, -2F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 16, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(22.5F, 0F, -2F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addBox(0F, -17F, 0F, 13, 4, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(28F, 14F, -1.5F);
		ammoModel[1].rotateAngleZ = 0.31415927F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 15, 3, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(20F, -9F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(21F, -8.5F, -6.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(147F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(16F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 19F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}