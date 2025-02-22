//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RPD
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

public class ModelRPD extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRPD() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 12F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 0F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 5F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-7F, 16F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-4F, 4F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(19F, 3F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-11F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 14, 11, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-20F, -4F, -3F);
		gunModel[7].rotateAngleZ = 0.17453293F;

		gunModel[8].addBox(0F, -17F, 0F, 16, 14, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-18F, -5F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 76, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(50F, -7.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(33F, -10.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import Box0
		gunModel[11].setRotationPoint(-3F, -11F, -2.5F);

		gunModel[12].addBox(0F, -17F, 0F, 16, 1, 1, 0F); // Import Box0
		gunModel[12].setRotationPoint(7F, 8F, -0.5F);

		gunModel[13].addBox(0F, -17F, 0F, 3, 11, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(81F, -8.5F, -3F);

		gunModel[14].addBox(0F, -17F, 0F, 78, 3, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(9F, -1.5F, -1.5F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-24F, -3.5F, -3.5F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(33F, -20.5F, 12.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 24, 8, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(35F, -7F, -3.5F);


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 14, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(139F, -20.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(137F, -20.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(-1F, -13F, -1.5F);

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(-1F, -13F, 0.5F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 24, 24, 0F); // Import Box0
		ammoModel[0].setRotationPoint(20.5F, 8F, -12F);

		ammoModel[1].addBox(0F, -17F, 0F, 8, 16, 2, 0F); // Import Box0
		ammoModel[1].setRotationPoint(23.5F, -8F, 8F);
		ammoModel[1].rotateAngleX = 0.41887902F;

		ammoModel[2].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(22.5F, 10F, -15F);

		ammoModel[3].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(22.5F, 10F, 11F);

		ammoModel[4].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(22.5F, -8F, 7F);
		ammoModel[4].rotateAngleX = 1.57079633F;

		ammoModel[5].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[5].setRotationPoint(22.5F, 18F, 7F);
		ammoModel[5].rotateAngleX = 1.57079633F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(4F, -6F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 5, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(3F, -7F, -8.5F);



		barrelAttachPoint = new Vector3f(125F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(43F /16F, 23F /16F, 5F /16F);

		scopeAttachPoint = new Vector3f(5F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}