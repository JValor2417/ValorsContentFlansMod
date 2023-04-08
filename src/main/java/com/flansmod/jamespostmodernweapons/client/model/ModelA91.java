//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: A91
// Model Creator: 
// Created on: 20.02.2021 - 15:37:17
// Last changed on: 20.02.2021 - 15:37:17

package com.flansmod.jamespostmodernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelA91 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelA91() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(5F, 17F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(8F, 5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(5F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(2F, 21F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(5F, 9F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 5, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(23F, 10F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 42, 13, 7, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-7F, -3F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 26, 14, 6, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-33F, -4F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 16, 6, 7, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-22F, -4F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 30, 6, 6, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(50F, -2F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(33F, -5.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(16F, 15F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 3, 6, 6, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(58F, 4.5F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 20, 6, 7, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(-28F, -0.5F, -3.5F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 25, 8, 5, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(34F, -11.5F, 13F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 24, 8, 9, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(34F, -2.5F, -4.5F);

		gunModel[16].addBox(0F, -17F, 0F, 24, 8, 5, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(-29F, -5.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 32, 2, 6, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(0F, -11F, -3F);

		gunModel[18].addBox(0F, -17F, 0F, 10, 2, 5, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(48F, -17F, -2.5F);
		gunModel[18].rotateAngleZ = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 10, 2, 5, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(16F, -17F, -2.5F);
		gunModel[19].rotateAngleZ = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import ImportBox0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 13, 4, 1, 0F); // Import ImportBox0
		defaultScopeModel[0].setRotationPoint(75F, -15.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 8, 6, 3, 0F); // Import ImportBox0
		defaultScopeModel[1].setRotationPoint(74F, -15.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 2, 0F); // Import ImportBox0
		defaultScopeModel[2].setRotationPoint(76F, -24.5F, -1F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import ImportBox0
		defaultScopeModel[3].setRotationPoint(76.5F, -28.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import ImportBox0
		defaultScopeModel[4].setRotationPoint(76.5F, -28.5F, -1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 2, 5, 4, 0F); // Import ImportBox0
		defaultScopeModel[5].setRotationPoint(18F, -26.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 4, 3, 1, 0F); // Import ImportBox0
		defaultScopeModel[6].setRotationPoint(18.5F, -26.5F, 1.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 4, 3, 1, 0F); // Import ImportBox0
		defaultScopeModel[7].setRotationPoint(18.5F, -26.5F, -2.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 20, 5, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(-23.5F, 5F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.10471976F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 18, 4, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(-20F, 21F, -2F);
		ammoModel[1].rotateAngleZ = 0.20943951F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import ImportBox0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(-22F, -1F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(-23F, 0F, -8.5F);



		barrelAttachPoint = new Vector3f(78F /16F, 16F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(10F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 6F /16F, 0F /16F);


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}