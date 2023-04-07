//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LARGrizzly
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

public class ModelLARGrizzly extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLARGrizzly() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(-10.5F, 4F, -0.5F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-8F, -6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-9.5F, 0F, 0F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[3].setRotationPoint(-12.25F, 8F, -1F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 13, 2, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(4F, 3F, -0.5F);

		gunModel[5].addBox(0F, -17F, 0F, 4, 40, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(17F, -24F, -3F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(-11F, -4F, -1F);
		gunModel[6].rotateAngleZ = -0.17453293F;

		gunModel[7].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(32F, -14F, -0.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 3, 6, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(22F, -24F, -1F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-22F, -22F, -1.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(8F, -36F, -0.5F);
		gunModel[10].rotateAngleZ = 2.26892803F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 40, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(31F, -29F, -1F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 9, 20, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(-6.5F, -6F, -2F);
		gunModel[12].rotateAngleZ = -0.17453293F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 19, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-6F, -3F, -0.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 1, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-11F, 15F, -1.5F);
		ammoModel[1].rotateAngleZ = -0.17453293F;


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		slideModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		slideModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(-4F, -32F, 2F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[1].setRotationPoint(-4F, -32F, -1F);

		slideModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		slideModel[2].setRotationPoint(35F, -33F, 0.5F);

		slideModel[3].addBox(0F, -17F, 0F, 3, 41, 6, 0F); // Import Box0
		slideModel[3].setRotationPoint(21F, -31F, -2F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 6, 44, 7, 0F); // Import Box0
		slideModel[4].setRotationPoint(22F, -30F, -2.5F);
		slideModel[4].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(48F /16F, 27F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(12F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 20F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}