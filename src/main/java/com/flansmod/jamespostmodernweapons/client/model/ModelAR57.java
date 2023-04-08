//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AR57
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

public class ModelAR57 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAR57() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7F, 18F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, 7F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 15F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-2F, 2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-8F, 23F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-5F, 0F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 13, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(15F, 8F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 34, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-6F, -8F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 30, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-41F, -7F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 50, 3, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(71F, -4.5F, -1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 63, 8, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(28F, -7.5F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(60F, -7.5F, 3F);

		gunModel[12].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(60F, -7.5F, -5F);

		gunModel[13].addBox(0F, -17F, 0F, 61, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(29F, -24.5F, 13F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(60F, -14.5F, 13F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 20, 3, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(0F, -11F, -2.5F);

		gunModel[16].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(6F, 11F, -1.5F);

		gunModel[17].addBox(0F, -17F, 0F, 18, 3, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(-5F, -24.5F, 15.5F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 7, 3, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(10F, -25F, 3.5F);
		gunModel[18].rotateAngleX = 1.57079633F;
		gunModel[18].rotateAngleY = -1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 23, 10, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(-37F, -1F, -2F);
		gunModel[19].rotateAngleZ = 0.10471976F;

		gunModel[20].addBox(0F, -17F, 0F, 6, 17, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(-42F, -6.25F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 10, 5, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-16F, -5.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 4, 12, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-18F, -4.25F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[23].setRotationPoint(29F, -7.5F, 3F);

		gunModel[24].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(29F, -7.5F, -5F);

		gunModel[25].addBox(0F, -17F, 0F, 30, 8, 2, 0F); // Import Box0
		gunModel[25].setRotationPoint(29F, -14.5F, 13F);
		gunModel[25].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(102F, -21.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 4, 14, 4, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(18F, -26.5F, -2F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(102.5F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(103F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(103F, -32.5F, -1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 2, 5, 4, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(19F, -30.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(19.5F, -28.5F, 1.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(19.5F, -28.5F, -2.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 61, 5, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(20F, -26.5F, 14.5F);
		ammoModel[0].rotateAngleX = 1.57079633F;

		ammoModel[1].addBox(0F, -17F, 0F, 8, 5, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(81F, -26F, 14.5F);
		ammoModel[1].rotateAngleX = 1.57079633F;

		ammoModel[2].addBox(0F, -17F, 0F, 6, 5, 3, 0F); // Import Box0
		ammoModel[2].setRotationPoint(20F, -23.5F, 14.5F);
		ammoModel[2].rotateAngleX = 1.57079633F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(13F, -7F, -4.5F);



		barrelAttachPoint = new Vector3f(121F /16F, 20F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(4F /16F, 27F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(42 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.P90;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}