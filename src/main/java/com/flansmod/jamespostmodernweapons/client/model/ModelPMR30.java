//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PMR30
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

public class ModelPMR30 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPMR30() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 12, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-2.5F, 1F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(0F, -7F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-1F, -7F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 5, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, 6F, -2.5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 10, 1, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(11F, 1F, -1.5F);

		gunModel[5].addBox(0F, -17F, 0F, 5, 28, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(8F, -26F, -3F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(37F, -16F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 2, 2, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-20F, -23F, -2.5F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 3, 20, 3, 0F); // Import Box0
		gunModel[8].setRotationPoint(23F, -28.5F, -1.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 7, 19, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(1F, -6F, -3.5F);
		gunModel[9].rotateAngleZ = -0.17453293F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 14, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(21F, -26F, -2.5F);
		gunModel[10].rotateAngleZ = -1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(1F, -9F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 1, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-4F, 13.5F, -3F);
		ammoModel[1].rotateAngleZ = -0.17453293F;


		slideModel = new ModelRendererTurbo[7];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
		slideModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 34
		slideModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 34

		slideModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(-1F, -32F, 1F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[1].setRotationPoint(-1F, -32F, -2F);

		slideModel[2].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 34
		slideModel[2].setRotationPoint(32.5F, -32F, -0.5F);

		slideModel[3].addBox(0F, -17F, 0F, 1, 18, 5, 0F); // Import Box0
		slideModel[3].setRotationPoint(-1F, -30.5F, -2.5F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 3, 22, 5, 0F); // Import Box0
		slideModel[4].setRotationPoint(21F, -29F, -2.5F);
		slideModel[4].rotateAngleZ = -1.57079633F;

		slideModel[5].addBox(0F, -17F, 0F, 4, 20, 6, 0F); // Import Box0
		slideModel[5].setRotationPoint(0F, -30F, -3F);
		slideModel[5].rotateAngleZ = -1.57079633F;

		slideModel[6].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 34
		slideModel[6].setRotationPoint(32F, -31F, -1F);



		barrelAttachPoint = new Vector3f(40F /16F, 27F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(31 /16F, 21F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		endLoadedAmmoDistance = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}