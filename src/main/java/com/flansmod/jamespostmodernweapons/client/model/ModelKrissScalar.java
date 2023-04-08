//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KrissScalar
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

public class ModelKrissScalar extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKrissScalar() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, 19F, -3F);
		gunModel[0].rotateAngleZ = -0.13962634F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, 3F, -2.5F);
		gunModel[1].rotateAngleZ = -0.13962634F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 13, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4.75F, 7F, -2F);
		gunModel[2].rotateAngleZ = -0.13962634F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(6.5F, 14F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 8, 30, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(-24F, -19F, -3.5F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(33.5F, -3F, -1.5F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 2, 56, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(35F, -25F, -2F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 12, 22, 12, 0F); // Import Box0
		gunModel[7].setRotationPoint(38F, -21F, -6F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 6, 50, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(84F, -16F, -3F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 10, 50, 11, 0F); // Import Box0
		gunModel[9].setRotationPoint(26F, -19F, -5.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 58, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(36F, -23F, -3F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 20, 6, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-47F, -20.25F, -4F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 22, 4, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-56F, -20.25F, -4F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 20, 28, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(16.75F, 3F, -3F);
		gunModel[13].rotateAngleZ = -0.13962634F;

		gunModel[14].addBox(0F, -17F, 0F, 38, 2, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-9F, 27F, -3.5F);
		gunModel[14].rotateAngleZ = -0.13962634F;

		gunModel[15].addBox(0F, -17F, 0F, 24, 10, 9, 0F); // Import Box0
		gunModel[15].setRotationPoint(-49F, -21.25F, -4.5F);
		gunModel[15].rotateAngleZ = -1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 20, 31, 8, 0F); // Import Box0
		gunModel[16].setRotationPoint(30.75F, 4F, -4F);
		gunModel[16].rotateAngleZ = -0.13962634F;

		gunModel[17].addBox(0F, -17F, 0F, 4, 33, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(70F, -20F, -2.5F);
		gunModel[17].rotateAngleZ = -1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 3, 7, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(77F, -19F, -1.5F);
		gunModel[18].rotateAngleZ = -1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 2, 28, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(-22F, -20F, -2F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 14, 24, 9, 0F); // Import Box0
		gunModel[20].setRotationPoint(33.75F, 5F, -4.5F);
		gunModel[20].rotateAngleZ = -0.13962634F;

		gunModel[21].addBox(0F, -17F, 0F, 2, 28, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(-22F, -12F, -2F);
		gunModel[21].rotateAngleZ = -1.57079633F;


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(103F, -16.5F, -3.5F);
		defaultBarrelModel[0].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(2F, -27.25F, 0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(2F, -27.25F, -1.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(50F, -28.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 3, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(25F, 46F, -3.5F);
		ammoModel[0].rotateAngleZ = -0.13962634F;

		ammoModel[1].addBox(0F, -17F, 0F, 16, 32, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(30F, 16F, -3F);
		ammoModel[1].rotateAngleZ = -0.13962634F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 5, 14, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(14F, -14.5F, -6.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(100F /16F, 13F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(25F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(62 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}