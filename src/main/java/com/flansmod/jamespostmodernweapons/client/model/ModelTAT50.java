//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TAT50
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

public class ModelTAT50 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTAT50() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		gunModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 34
		gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 6, 9, 0F); // Import Box0
		gunModel[0].setRotationPoint(-17.5F, 22F, -4.5F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 30, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(-11F, -3F, -3.5F);
		gunModel[1].rotateAngleZ = -0.10471976F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 18, 5, 0F); // Import Box0
		gunModel[2].setRotationPoint(-14F, 5F, -2.5F);
		gunModel[2].rotateAngleZ = -0.2443461F;

		gunModel[3].addBox(0F, -17F, 0F, 14, 3, 10, 0F); // Import Box0
		gunModel[3].setRotationPoint(-17F, 25F, -5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 12, 2, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(1F, 12F, -2.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(-4F, -35F, 1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		gunModel[6].setRotationPoint(-4F, -35F, -2F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 34
		gunModel[7].setRotationPoint(52F, -35F, -0.5F);

		gunModel[8].addBox(0F, -17F, 0F, 10, 2, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(30F, -3F, -2.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 9, 18, 9, 0F); // Import Box0
		gunModel[9].setRotationPoint(16F, -29F, -4.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 8, 3, 8, 0F); // Import Box0
		gunModel[10].setRotationPoint(29F, -28.5F, -4F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 9, 10, 9, 0F); // Import Box0
		gunModel[11].setRotationPoint(26F, -29F, -4.5F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 7, 10, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(39F, -28F, -3.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 10, 19, 10, 0F); // Import Box0
		gunModel[13].setRotationPoint(53F, -29.5F, -5F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 11, 17, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(52F, -30F, -3.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 17, 11, 0F); // Import Box0
		gunModel[15].setRotationPoint(52F, -28.5F, -5.5F);
		gunModel[15].rotateAngleZ = -1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 6, 1, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(53.05F, -27.5F, -3F);
		gunModel[16].rotateAngleZ = -1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 11, 20, 11, 0F); // Import Box0
		gunModel[17].setRotationPoint(-2F, -30F, -5.5F);
		gunModel[17].rotateAngleZ = -1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 15, 6, 5, 0F); // Import Box0
		gunModel[18].setRotationPoint(0F, -2F, -2.5F);

		gunModel[19].addBox(0F, -17F, 0F, 1, 20, 10, 0F); // Import Box0
		gunModel[19].setRotationPoint(-2F, -31F, -5F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 20, 3, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(-28.5F, -3.5F, -2.5F);
		gunModel[20].rotateAngleZ = -0.06981317F;

		gunModel[21].addBox(0F, -17F, 0F, 24, 6, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(15F, -1F, -3F);

		gunModel[22].addBox(0F, -17F, 0F, 4, 5, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(39F, -0.5F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		gunModel[23].setRotationPoint(43F, 0.5F, -1.5F);

		gunModel[24].addBox(0F, -17F, 0F, 20, 2, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(44F, 1F, -1F);

		gunModel[25].addBox(0F, -17F, 0F, 14, 2, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(55F, -2.5F, -2.5F);

		gunModel[26].addBox(0F, -17F, 0F, 4, 4, 5, 0F); // Import Box0
		gunModel[26].setRotationPoint(63F, -0.5F, -2.5F);

		gunModel[27].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[27].setRotationPoint(60.5F, -2.5F, -2F);
		gunModel[27].rotateAngleZ = -0.2443461F;

		gunModel[28].addBox(0F, -17F, 0F, 4, 7, 7, 0F); // Import Box0
		gunModel[28].setRotationPoint(33F, -4F, -3.5F);

		gunModel[29].addBox(0F, -17F, 0F, 22, 2, 5, 0F); // Import Box0
		gunModel[29].setRotationPoint(34F, -16F, -2.5F);
		gunModel[29].rotateAngleZ = 0.03490659F;

		gunModel[30].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		gunModel[30].setRotationPoint(58.5F, -16.45F, -2F);
		gunModel[30].rotateAngleZ = 0.41887902F;

		gunModel[31].addBox(0F, -17F, 0F, 9, 3, 6, 0F); // Import Box0
		gunModel[31].setRotationPoint(33F, -15F, -3F);

		gunModel[32].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[32].setRotationPoint(50F, -28F, -5.55F);
		gunModel[32].rotateAngleZ = -1.57079633F;

		gunModel[33].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[33].setRotationPoint(48F, -28F, -5.55F);
		gunModel[33].rotateAngleZ = -1.57079633F;

		gunModel[34].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[34].setRotationPoint(46F, -28F, -5.55F);
		gunModel[34].rotateAngleZ = -1.57079633F;

		gunModel[35].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[35].setRotationPoint(44F, -28F, -5.55F);
		gunModel[35].rotateAngleZ = -1.57079633F;

		gunModel[36].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[36].setRotationPoint(42F, -28F, -5.55F);
		gunModel[36].rotateAngleZ = -1.57079633F;

		gunModel[37].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[37].setRotationPoint(50F, -28F, 4.55F);
		gunModel[37].rotateAngleZ = -1.57079633F;

		gunModel[38].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[38].setRotationPoint(48F, -28F, 4.55F);
		gunModel[38].rotateAngleZ = -1.57079633F;

		gunModel[39].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[39].setRotationPoint(46F, -28F, 4.55F);
		gunModel[39].rotateAngleZ = -1.57079633F;

		gunModel[40].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[40].setRotationPoint(44F, -28F, 4.55F);
		gunModel[40].rotateAngleZ = -1.57079633F;

		gunModel[41].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[41].setRotationPoint(42F, -28F, 4.55F);
		gunModel[41].rotateAngleZ = -1.57079633F;


		ammoModel = new ModelRendererTurbo[7];
		ammoModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 4, 3, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-26F, -9F, -2F);

		ammoModel[1].addBox(0F, -17F, 0F, 3, 2, 2, 0F); // Import Box0
		ammoModel[1].setRotationPoint(5.75F, -8.5F, -1.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(-26.25F, -9.5F, -2.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 20, 4, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(-24.75F, -9.5F, -2.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 5, 3, 3, 0F); // Import Box0
		ammoModel[4].setRotationPoint(1F, -9F, -2F);

		ammoModel[5].addBox(0F, -17F, 0F, 14, 5, 5, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-23.75F, -10F, -3F);

		ammoModel[6].addBox(0F, -17F, 0F, 6, 3, 3, 0F); // Import Box0
		ammoModel[6].setRotationPoint(-5F, -9F, -2F);


		slideModel = new ModelRendererTurbo[8];
		slideModel[0] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 11, 6, 11, 0F); // Import Box0
		slideModel[0].setRotationPoint(-22F, -30F, -5.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 12, 10, 12, 0F); // Import Box0
		slideModel[1].setRotationPoint(-28F, -30.5F, -6F);
		slideModel[1].rotateAngleZ = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 13, 8, 13, 0F); // Import Box0
		slideModel[2].setRotationPoint(-38F, -31F, -6.5F);
		slideModel[2].rotateAngleZ = -1.57079633F;

		slideModel[3].addBox(0F, -17F, 0F, 4, 6, 2, 0F); // Import Box0
		slideModel[3].setRotationPoint(-28F, -19F, -0.5F);
		slideModel[3].rotateAngleX = -0.48869219F;

		slideModel[4].addBox(0F, -17F, 0F, 1, 6, 10, 0F); // Import Box0
		slideModel[4].setRotationPoint(-22F, -31F, -5F);
		slideModel[4].rotateAngleZ = -1.57079633F;

		slideModel[5].addBox(0F, -17F, 0F, 1, 10, 11, 0F); // Import Box0
		slideModel[5].setRotationPoint(-28F, -31.5F, -5.5F);
		slideModel[5].rotateAngleZ = -1.57079633F;

		slideModel[6].addBox(0F, -17F, 0F, 1, 8, 12, 0F); // Import Box0
		slideModel[6].setRotationPoint(-38F, -32F, -6F);
		slideModel[6].rotateAngleZ = -1.57079633F;

		slideModel[7].addBox(0F, -17F, 0F, 12, 3, 12, 0F); // Import Box0
		slideModel[7].setRotationPoint(-43.5F, -30.5F, -6F);
		slideModel[7].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(70F /16F, 24F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(30 /16F, 12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE_TOP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}