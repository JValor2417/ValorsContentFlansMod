//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SRM1216
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

public class ModelSRM1216 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSRM1216() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 11, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3.5F, 15F, -3F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 24, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(0F, 2F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 3, 12, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3.75F, 5F, -2F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, 16F, -2.5F);
		gunModel[3].rotateAngleZ = -0.08726646F;

		gunModel[4].addBox(0F, -17F, 0F, 14, 6, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(-2F, -1F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 51, 6, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(-51F, -10.5F, -3F);

		gunModel[6].addBox(0F, -17F, 0F, 90, 4, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(17F, -9.5F, -2F);

		gunModel[7].addBox(0F, -17F, 0F, 22, 15, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-47F, -4F, -2.5F);
		gunModel[7].rotateAngleZ = 0.31415927F;

		gunModel[8].addBox(0F, -17F, 0F, 7, 22, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-53F, -11F, -3.5F);

		gunModel[9].addBox(0F, -17F, 0F, 30, 9, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-30F, -4.5F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 3, 11, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(7.25F, 16F, -2F);
		gunModel[10].rotateAngleZ = 0.03490659F;

		gunModel[11].addBox(0F, -17F, 0F, 6, 16, 9, 0F); // Import Box0
		gunModel[11].setRotationPoint(25F, -7F, -4.5F);

		gunModel[12].addBox(0F, -17F, 0F, 6, 17, 9, 0F); // Import Box0
		gunModel[12].setRotationPoint(84F, -11F, -4.5F);

		gunModel[13].addBox(0F, -17F, 0F, 25, 6, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(0F, -1.5F, -3F);

		gunModel[14].addBox(0F, -17F, 0F, 25, 12, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(0F, -11.5F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 40, 7, 8, 0F); // Import Box0
		gunModel[15].setRotationPoint(25F, -11.5F, -4F);

		gunModel[16].addBox(0F, -17F, 0F, 2, 8, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(23.25F, 4F, -1.5F);

		gunModel[17].addBox(0F, -17F, 0F, 16, 2, 3, 0F); // Import Box0
		gunModel[17].setRotationPoint(9.25F, 12F, -1.5F);

		gunModel[18].addBox(0F, -17F, 0F, 2, 22, 7, 0F); // Import Box0
		gunModel[18].setRotationPoint(-55F, -11F, -3.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 15, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(105F, -12.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.80285146F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 13, 2, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(120F, -22.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 15, 2, 0, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(12F, -14.5F, 1.5F);
		defaultScopeModel[2].rotateAngleZ = 0.80285146F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 13, 2, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(27F, -24.5F, 1F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 15, 2, 0, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(12F, -14.5F, -1.5F);
		defaultScopeModel[4].rotateAngleZ = 0.80285146F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 13, 2, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(27F, -24.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(32.05F, 0.5F, -5.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(32F, -3F, -2F);

		ammoModel[2].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(32.05F, 0.5F, 1.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(32F, 4F, -2F);

		ammoModel[4].addBox(0F, -17F, 0F, 54, 4, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(30F, 1F, -2F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 10, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(14F, -5F, -4.05F);



		barrelAttachPoint = new Vector3f(107F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(46F /16F, 20F /16F, 2F /16F);

		scopeAttachPoint = new Vector3f(13F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(87 /16F, 11F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}