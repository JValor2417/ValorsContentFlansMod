//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AM180
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

public class ModelAM180 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAM180() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-1F, 13F, -2F);
		gunModel[0].rotateAngleZ = -0.15707963F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(4F, 1F, -1.5F);
		gunModel[1].rotateAngleZ = -0.27925268F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(1F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[3].setRotationPoint(-2F, 17F, -1F);
		gunModel[3].rotateAngleZ = -0.08726646F;

		gunModel[4].addBox(0F, -17F, 0F, 2, 8, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(24F, 1F, -1.5F);

		gunModel[5].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[5].setRotationPoint(-4F, -9F, -3.5F);

		gunModel[6].addBox(0F, -17F, 0F, 35, 8, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(-56F, 0F, -3F);
		gunModel[6].rotateAngleZ = 0.13962634F;

		gunModel[7].addBox(0F, -17F, 0F, 70, 2, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(64F, -4.5F, -1F);

		gunModel[8].addBox(0F, -17F, 0F, 34, 6, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(74F, -15F, 14F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 41, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-3F, -12F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(16F, 7F, -1.5F);

		gunModel[11].addBox(0F, -17F, 0F, 50, 12, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(-55F, 6F, -2F);
		gunModel[11].rotateAngleZ = 0.2443461F;

		gunModel[12].addBox(0F, -17F, 0F, 7, 19, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-61F, -1F, -3.5F);
		gunModel[12].rotateAngleZ = -0.06981317F;

		gunModel[13].addBox(0F, -17F, 0F, 10, 4, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(64F, -16F, 15F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 20, 12, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(-21F, -5F, -3F);
		gunModel[14].rotateAngleZ = 0.13962634F;

		gunModel[15].addBox(0F, -17F, 0F, 20, 4, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(-3F, 1F, -2.5F);

		gunModel[16].addBox(0F, -17F, 0F, 26, 6, 7, 0F); // Import Box0
		gunModel[16].setRotationPoint(38F, -5F, -3.5F);

		gunModel[17].addBox(0F, -17F, 0F, 34, 4, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(74F, -16F, 15F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 34, 6, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(74F, -18F, 14F);
		gunModel[18].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 8, 4, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(138F, -10.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.85521133F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 10, 4, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(147F, -21.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(148F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(148.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(148.5F, -32.5F, -1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;

		defaultScopeModel[8].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(142F, -18.5F, -2F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 30, 8, 30, 0F); // Import Box0
		ammoModel[0].setRotationPoint(43F, -13F, -14.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 4, 8, 26, 0F); // Import Box0
		ammoModel[1].setRotationPoint(39F, -13F, -12.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 4, 8, 26, 0F); // Import Box0
		ammoModel[2].setRotationPoint(73F, -13F, -12.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 26, 8, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(45F, -13F, -18.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 26, 8, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(45F, -13F, 15.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 3, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(34F, -3F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(35F, -2F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(128F /16F, 21F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(14F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(90 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}