//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DevotionX55
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

public class ModelDevotionX55 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelDevotionX55() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 15F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 4F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 12F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 40, 8, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, -2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-5F, 20F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 10, 9, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-6F, -2F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[6].setRotationPoint(-1F, 4F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 60, 10, 9, 0F); // Import Box0
		gunModel[7].setRotationPoint(-10F, -12F, -4.5F);

		gunModel[8].addBox(0F, -17F, 0F, 61, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-56F, -11F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 80, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(45F, -9.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 14, 2, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(8F, 10F, -1.5F);

		gunModel[11].addBox(0F, -17F, 0F, 19, 4, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(-0.5F, 19F, -2F);
		gunModel[11].rotateAngleZ = -0.33161256F;

		gunModel[12].addBox(0F, -17F, 0F, 46, 12, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-41F, -5F, -2F);
		gunModel[12].rotateAngleZ = 0.10471976F;

		gunModel[13].addBox(0F, -17F, 0F, 20, 20, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(-57F, -12F, -3.5F);

		gunModel[14].addBox(0F, -17F, 0F, 80, 9, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(29F, -11.75F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 74, 10, 10, 0F); // Import Box0
		gunModel[15].setRotationPoint(33F, -5F, -5F);
		gunModel[15].rotateAngleZ = 0.03490659F;

		gunModel[16].addBox(0F, -17F, 0F, 23, 2, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(37.5F, 12F, -3F);
		gunModel[16].rotateAngleZ = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 18, 10, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(-56F, 1F, -2.5F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 24, 5, 5, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(116F, -10F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 8, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(110F, -13.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.80285146F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(120F, -20.5F, -2F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 40, 3, 5, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(-3F, -13F, -2.5F);

		defaultScopeModel[3].addBox(0F, -17F, 0F, 2, 7, 2, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(33F, -17F, -1F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 6, 10, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(24F, -29F, 3.5F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 10, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(24F, -29F, -4.5F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 10, 1, 8, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(114F, -29.5F, -4F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 10, 1, 8, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(36F, -29.5F, -4F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 24, 34, 20, 0F); // Import Box0
		ammoModel[0].setRotationPoint(22.5F, 2F, -10F);

		ammoModel[1].addBox(0F, -17F, 0F, 21, 10, 14, 0F); // Import Box0
		ammoModel[1].setRotationPoint(23.5F, -6F, -7F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 16, 5, 4, 0F); // Import Box0
		slideModel[0].setRotationPoint(2F, -10F, -6F);



		barrelAttachPoint = new Vector3f(117F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(46F /16F, 20F /16F, 2F /16F);

		scopeAttachPoint = new Vector3f(12F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(60 /16F, 13F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}