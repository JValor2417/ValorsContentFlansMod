//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CMR30
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

public class ModelCMR30 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelCMR30() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 12, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-2.5F, 4F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(0F, -4F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-1F, -4F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 5, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, 9F, -2.5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 10, 1, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(11F, 4F, -1.5F);

		gunModel[5].addBox(0F, -17F, 0F, 5, 40, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(8F, -23F, -4F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(37F, -13F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 1, 18, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-1F, -27.5F, -2.5F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 2, 2, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-15F, -19F, -2.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 3, 40, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(70F, -24.5F, -1.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 7, 19, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(1F, -3F, -3.5F);
		gunModel[10].rotateAngleZ = -0.17453293F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 40, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(44F, -23F, -3.5F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 5, 76, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(43F, -28F, -3.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 2, 76, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(44F, -30F, -4F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 2, 74, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(43F, -31F, -3.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 10, 4, 8, 0F); // Import Box0
		gunModel[15].setRotationPoint(-32F, -29F, -4F);
		gunModel[15].rotateAngleZ = -1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 10, 4, 8, 0F); // Import Box0
		gunModel[16].setRotationPoint(-82F, -29F, -4F);
		gunModel[16].rotateAngleZ = -1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(-86F, -29F, -3.5F);
		gunModel[17].rotateAngleZ = -1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 16, 4, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(-82F, -26F, -3F);
		gunModel[18].rotateAngleZ = -1.74532925F;

		gunModel[19].addBox(0F, -17F, 0F, 2, 10, 1, 0F); // Import Box0
		gunModel[19].setRotationPoint(6F, -26F, -3.95F);
		gunModel[19].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 34
		defaultScopeModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 34
		defaultScopeModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 34
		defaultScopeModel[5] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(-10F, -34F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(-10F, -34F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(50.5F, -34F, -0.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 34
		defaultScopeModel[3].setRotationPoint(50F, -33F, -1F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 50, 2, 2, 0F); // Box 34
		defaultScopeModel[4].setRotationPoint(-66F, -26F, 1.5F);

		defaultScopeModel[5].addBox(0F, 0F, 0F, 50, 2, 2, 0F); // Box 34
		defaultScopeModel[5].setRotationPoint(-66F, -26F, -3.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(1F, -5F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 1, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-4F, 16.5F, -3F);
		ammoModel[1].rotateAngleZ = -0.17453293F;



		barrelAttachPoint = new Vector3f(87F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(38 /16F, 19F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		endLoadedAmmoDistance = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}