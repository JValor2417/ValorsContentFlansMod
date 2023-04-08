//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: VSS
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

public class ModelVSS extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelVSS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 37, 4, 8, 0F); // Import Box0
		gunModel[0].setRotationPoint(-13F, -7F, -4F);

		gunModel[1].addBox(0F, -17F, 0F, 37, 2, 6, 0F); // Import Box0
		gunModel[1].setRotationPoint(-13F, -11F, -3F);

		gunModel[2].addBox(0F, -17F, 0F, 32, 3, 5, 0F); // Import Box0
		gunModel[2].setRotationPoint(-8F, -14F, -2.5F);

		gunModel[3].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(-1F, 2F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 37, 2, 8, 0F); // Import Box0
		gunModel[4].setRotationPoint(-13F, -9F, -4F);

		gunModel[5].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(-1.75F, -14.2F, -2F);
		gunModel[5].rotateAngleZ = 0.6981317F;

		gunModel[6].addBox(0F, -17F, 0F, 5, 11, 8, 0F); // Import Box0
		gunModel[6].setRotationPoint(-15.5F, 8F, -4F);
		gunModel[6].rotateAngleZ = -0.08726646F;

		gunModel[7].addBox(0F, -17F, 0F, 8, 20, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-14F, -1F, -3.5F);
		gunModel[7].rotateAngleZ = -0.17453293F;

		gunModel[8].addBox(0F, -17F, 0F, 3, 12, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-15.75F, -2F, -3F);
		gunModel[8].rotateAngleZ = -0.34906585F;

		gunModel[9].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-16F, 9F, -2.5F);
		gunModel[9].rotateAngleZ = -0.08726646F;

		gunModel[10].addBox(0F, -17F, 0F, 3, 11, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(-7.75F, 9F, -3F);
		gunModel[10].rotateAngleZ = 0.03490659F;

		gunModel[11].addBox(0F, -17F, 0F, 11, 4, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-14.5F, -2F, -4F);
		gunModel[11].rotateAngleZ = -0.08726646F;

		gunModel[12].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3F, -3F, -1.5F);

		gunModel[13].addBox(0F, -17F, 0F, 1, 3, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(8F, 3F, -2F);
		gunModel[13].rotateAngleZ = -0.06981317F;

		gunModel[14].addBox(0F, -17F, 0F, 1, 6, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(104.05F, -11F, -3F);

		gunModel[15].addBox(0F, -17F, 0F, 2, 26, 8, 0F); // Import Box0
		gunModel[15].setRotationPoint(-63F, -5F, -4F);

		gunModel[16].addBox(0F, -17F, 0F, 2, 25, 7, 0F); // Import Box0
		gunModel[16].setRotationPoint(-63.5F, -4.5F, -3.5F);

		gunModel[17].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		gunModel[17].setRotationPoint(8F, -3F, -1.5F);

		gunModel[18].addBox(0F, -17F, 0F, 13, 7, 9, 0F); // Import Box0
		gunModel[18].setRotationPoint(-16F, -7F, -4.5F);
		gunModel[18].rotateAngleZ = -0.08726646F;

		gunModel[19].addBox(0F, -17F, 0F, 42, 4, 7, 0F); // Import Box0
		gunModel[19].setRotationPoint(-56F, -5F, -3.5F);

		gunModel[20].addBox(0F, -17F, 0F, 42, 3, 7, 0F); // Import Box0
		gunModel[20].setRotationPoint(-55.5F, 17F, -3.5F);
		gunModel[20].rotateAngleZ = 0.03490659F;

		gunModel[21].addBox(0F, -17F, 0F, 42, 5, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-56F, -5.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 42, 4, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-55.5F, 16.5F, -2.5F);
		gunModel[22].rotateAngleZ = 0.03490659F;

		gunModel[23].addBox(0F, -17F, 0F, 7, 18, 6, 0F); // Import Box0
		gunModel[23].setRotationPoint(-38F, -0.5F, -3F);

		gunModel[24].addBox(0F, -17F, 0F, 5, 26, 8, 0F); // Import Box0
		gunModel[24].setRotationPoint(-61F, -5F, -4F);

		gunModel[25].addBox(0F, -17F, 0F, 14, 7, 8, 0F); // Import Box0
		gunModel[25].setRotationPoint(10F, -3F, -4F);

		gunModel[26].addBox(0F, -17F, 0F, 6, 10, 6, 0F); // Import Box0
		gunModel[26].setRotationPoint(-52.5F, 9F, -3F);
		gunModel[26].rotateAngleZ = 0.52359878F;

		gunModel[27].addBox(0F, -17F, 0F, 20, 7, 7, 0F); // Import Box0
		gunModel[27].setRotationPoint(27F, -4F, -3.5F);
		gunModel[27].rotateAngleZ = 0.31415927F;

		gunModel[28].addBox(0F, -17F, 0F, 19, 4, 8, 0F); // Import Box0
		gunModel[28].setRotationPoint(24F, -7F, -4F);

		gunModel[29].addBox(0F, -17F, 0F, 19, 2, 6, 0F); // Import Box0
		gunModel[29].setRotationPoint(24F, -11F, -3F);

		gunModel[30].addBox(0F, -17F, 0F, 19, 3, 5, 0F); // Import Box0
		gunModel[30].setRotationPoint(24F, -14F, -2.5F);

		gunModel[31].addBox(0F, -17F, 0F, 19, 2, 8, 0F); // Import Box0
		gunModel[31].setRotationPoint(24F, -9F, -4F);

		gunModel[32].addBox(0F, -17F, 0F, 60, 7, 7, 0F); // Import Box0
		gunModel[32].setRotationPoint(45F, -11.5F, -3.5F);

		gunModel[33].addBox(0F, -17F, 0F, 2, 8, 8, 0F); // Import Box0
		gunModel[33].setRotationPoint(43F, -12F, -4F);

		gunModel[34].addBox(0F, -17F, 0F, 58, 6, 8, 0F); // Import Box0
		gunModel[34].setRotationPoint(46F, -11F, -4F);

		gunModel[35].addBox(0F, -17F, 0F, 58, 8, 6, 0F); // Import Box0
		gunModel[35].setRotationPoint(46F, -12F, -3F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(116.5F, -28.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(117.5F, -32.5F, 1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(117.5F, -32.5F, -2F);
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
		defaultScopeModel[8].setRotationPoint(117F, -30.5F, 1F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(117F, -30.5F, -2F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 16, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(12.5F, -2F, -2F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 4, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(18F, 12F, -1.5F);
		ammoModel[1].rotateAngleZ = 0.31415927F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 13, 3, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(10F, -9F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(10F, -8.5F, -6.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(105F /16F, 25F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(8F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(33 /16F, 17F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}