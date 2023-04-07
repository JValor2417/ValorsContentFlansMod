//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SSR20
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

public class ModelSSR20 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSSR20() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3F, 13F, -2F);
		gunModel[0].rotateAngleZ = -0.15707963F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(1F, 0F, -1.5F);
		gunModel[1].rotateAngleZ = -0.15707963F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 11, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-1.75F, 3F, -1F);
		gunModel[2].rotateAngleZ = -0.2443461F;

		gunModel[3].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, -2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 10, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-3F, 15.95F, -1F);
		gunModel[4].rotateAngleZ = -0.15707963F;

		gunModel[5].addBox(0F, -17F, 0F, 46, 11, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(-4F, -13F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 40, 4, 8, 0F); // Import Box0
		gunModel[6].setRotationPoint(-41F, -9.5F, -4F);
		gunModel[6].rotateAngleZ = 0.06981317F;

		gunModel[7].addBox(0F, -17F, 0F, 42, 3, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(92.5F, -7.5F, -1.5F);

		gunModel[8].addBox(0F, -17F, 0F, 50, 8, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(42F, -9.5F, 3F);

		gunModel[9].addBox(0F, -17F, 0F, 49, 8, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(42F, -9.5F, -5F);

		gunModel[10].addBox(0F, -17F, 0F, 53, 8, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(38F, -17.5F, 13F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 38, 9, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-42F, -9.25F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[12].setRotationPoint(11F, 8F, -1.5F);

		gunModel[13].addBox(0F, -17F, 0F, 40, 4, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-38F, -0.25F, -3F);

		gunModel[14].addBox(0F, -17F, 0F, 6, 18, 9, 0F); // Import Box0
		gunModel[14].setRotationPoint(-42.5F, -9F, -4.5F);

		gunModel[15].addBox(0F, -17F, 0F, 9, 2, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(92F, -10.5F, -1F);

		gunModel[16].addBox(0F, -17F, 0F, 45, 3, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(42F, -12.5F, 3F);

		gunModel[17].addBox(0F, -17F, 0F, 45, 3, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(42F, -12.5F, -5F);

		gunModel[18].addBox(0F, -17F, 0F, 49, 8, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(42F, -26F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(91.5F, -11.5F, -2.5F);

		gunModel[20].addBox(0F, -17F, 0F, 2, 11, 7, 0F); // Import Box0
		gunModel[20].setRotationPoint(90.5F, -12.5F, -3.5F);

		gunModel[21].addBox(0F, -17F, 0F, 17, 12, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(21F, -2F, -3F);

		gunModel[22].addBox(0F, -17F, 0F, 1, 17, 9, 0F); // Import Box0
		gunModel[22].setRotationPoint(-36.5F, -9F, -4.5F);

		gunModel[23].addBox(0F, -17F, 0F, 44, 9, 10, 0F); // Import Box0
		gunModel[23].setRotationPoint(-3F, -12F, -5F);

		gunModel[24].addBox(0F, -17F, 0F, 5, 7, 4, 0F); // Import Box0
		gunModel[24].setRotationPoint(95F, -11F, -2F);

		gunModel[25].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import Box0
		gunModel[25].setRotationPoint(133.55F, -7F, -1F);

		gunModel[26].addBox(0F, -17F, 0F, 49, 7, 2, 0F); // Import Box0
		gunModel[26].setRotationPoint(42.5F, -9F, 3.5F);

		gunModel[27].addBox(0F, -17F, 0F, 48, 7, 2, 0F); // Import Box0
		gunModel[27].setRotationPoint(42.5F, -9F, -5.5F);

		gunModel[28].addBox(0F, -17F, 0F, 93, 6, 1, 0F); // Import Box0
		gunModel[28].setRotationPoint(-2.5F, -30F, 14F);
		gunModel[28].rotateAngleX = 1.57079633F;

		gunModel[29].addBox(0F, -17F, 0F, 38, 4, 7, 0F); // Import Box0
		gunModel[29].setRotationPoint(-40.25F, -10F, -3.5F);
		gunModel[29].rotateAngleZ = 0.06981317F;

		gunModel[30].addBox(0F, -17F, 0F, 2, 17, 8, 0F); // Import Box0
		gunModel[30].setRotationPoint(-43F, -8.5F, -4F);

		gunModel[31].addBox(0F, -17F, 0F, 2, 6, 3, 0F); // Import Box0
		gunModel[31].setRotationPoint(19F, 4F, -1.5F);

		gunModel[32].addBox(0F, -17F, 0F, 7, 21, 5, 0F); // Import Box0
		gunModel[32].setRotationPoint(1.5F, 0F, -2.5F);
		gunModel[32].rotateAngleZ = -0.15707963F;

		gunModel[33].addBox(0F, -17F, 0F, 10, 4, 5, 0F); // Import Box0
		gunModel[33].setRotationPoint(-29F, 1.4F, -2.5F);
		gunModel[33].rotateAngleZ = 0.61086524F;


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(103.5F, -28.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(104.5F, -32.5F, 1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(104.5F, -32.5F, -2F);
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
		defaultScopeModel[8].setRotationPoint(104F, -30.5F, 1F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(104F, -30.5F, -2F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 15, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(22.5F, 7F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 15, 4, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(23.35F, 20.85F, -2F);
		ammoModel[1].rotateAngleZ = 0.06981317F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 16, 4, 1, 0F); // Import Box0
		slideModel[0].setRotationPoint(24.5F, -7.5F, -5.05F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(24.5F, -7F, -7.55F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(132F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(10F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(64 /16F, 17F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}