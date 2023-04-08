//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QLZ87B
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

public class ModelQLZ87B extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelQLZ87B() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 11, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4.5F, 31F, -3F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 24, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 18F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 3, 12, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4.75F, 21F, -2F);
		gunModel[2].rotateAngleZ = -0.34906585F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-5F, 30F, -2.5F);
		gunModel[3].rotateAngleZ = -0.08726646F;

		gunModel[4].addBox(0F, -17F, 0F, 14, 8, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(-2F, 12F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 51, 6, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(-55F, 1.5F, -3F);

		gunModel[6].addBox(0F, -17F, 0F, 50, 6, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(66F, 2.5F, -3F);

		gunModel[7].addBox(0F, -17F, 0F, 22, 15, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-51F, 8F, -2.5F);
		gunModel[7].rotateAngleZ = 0.31415927F;

		gunModel[8].addBox(0F, -17F, 0F, 7, 22, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-57F, 1F, -3.5F);

		gunModel[9].addBox(0F, -17F, 0F, 30, 9, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-34F, 7.5F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 3, 11, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(7.25F, 32F, -2F);
		gunModel[10].rotateAngleZ = 0.03490659F;

		gunModel[11].addBox(0F, -17F, 0F, 27, 7, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(0F, 12.5F, -3F);

		gunModel[12].addBox(0F, -17F, 0F, 33, 12, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-2F, 0.5F, -4F);

		gunModel[13].addBox(0F, -17F, 0F, 2, 9, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(25.25F, 18F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 2, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(9.25F, 27F, -1.5F);

		gunModel[15].addBox(0F, -17F, 0F, 2, 22, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-59F, 1F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 26, 10, 7, 0F); // Import Box0
		gunModel[16].setRotationPoint(-42F, 0.5F, -3.5F);

		gunModel[17].addBox(0F, -17F, 0F, 2, 16, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(-4F, 1F, -3.5F);

		gunModel[18].addBox(0F, -17F, 0F, 4, 8, 7, 0F); // Import Box0
		gunModel[18].setRotationPoint(27F, 12.5F, -3.5F);

		gunModel[19].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		gunModel[19].setRotationPoint(-2F, -0.5F, -4.5F);

		gunModel[20].addBox(0F, -17F, 0F, 48, 15, 9, 0F); // Import Box0
		gunModel[20].setRotationPoint(28F, -0.5F, -4.5F);

		gunModel[21].addBox(0F, -17F, 0F, 30, 7, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(31F, 12.5F, -3F);

		gunModel[22].addBox(0F, -17F, 0F, 20, 8, 8, 0F); // Import Box0
		gunModel[22].setRotationPoint(116F, 1.5F, -4F);

		gunModel[23].addBox(0F, -17F, 0F, 20, 10, 7, 0F); // Import Box0
		gunModel[23].setRotationPoint(116.95F, 0.5F, -3.5F);

		gunModel[24].addBox(0F, -17F, 0F, 20, 7, 9, 0F); // Import Box0
		gunModel[24].setRotationPoint(116.05F, 2F, -4.5F);

		gunModel[25].addBox(0F, -17F, 0F, 14, 8, 8, 0F); // Import Box0
		gunModel[25].setRotationPoint(77F, 1.5F, -4F);

		gunModel[26].addBox(0F, -17F, 0F, 17, 4, 4, 0F); // Import Box0
		gunModel[26].setRotationPoint(67F, -4.5F, -2F);

		gunModel[27].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import Box0
		gunModel[27].setRotationPoint(73F, -7.5F, -1.5F);
		gunModel[27].rotateAngleZ = -0.68067841F;

		gunModel[28].addBox(0F, -17F, 0F, 66, 3, 7, 0F); // Import Box0
		gunModel[28].setRotationPoint(7F, -10.5F, -3.5F);

		gunModel[29].addBox(0F, -17F, 0F, 3, 7, 7, 0F); // Import Box0
		gunModel[29].setRotationPoint(71F, -7.5F, -3.5F);

		gunModel[30].addBox(0F, -17F, 0F, 14, 7, 7, 0F); // Import Box0
		gunModel[30].setRotationPoint(6F, -7.5F, -3.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 8, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(75F, -14.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.80285146F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(85F, -26.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 7, 2, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(27F, -14.5F, 2.05F);
		defaultScopeModel[2].rotateAngleZ = 0.80285146F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(36F, -24.5F, 1.55F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 7, 2, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(27F, -14.5F, -3.05F);
		defaultScopeModel[4].rotateAngleZ = 0.80285146F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(36F, -24.5F, -3.55F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 28, 7, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(32F, 17.5F, -2.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 30, 4, 9, 0F); // Import Box0
		ammoModel[1].setRotationPoint(31F, 24.5F, -4.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 32, 15, 15, 0F); // Import Box0
		ammoModel[2].setRotationPoint(30F, 28.5F, -7.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 2, 13, 13, 0F); // Import Box0
		ammoModel[3].setRotationPoint(61F, 29.5F, -6.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 2, 13, 13, 0F); // Import Box0
		ammoModel[4].setRotationPoint(29F, 29.5F, -6.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 28, 4, 2, 0F); // Import Box0
		slideModel[0].setRotationPoint(44F, 1.5F, -4.95F);



		barrelAttachPoint = new Vector3f(136F /16F, 11F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(46F /16F, 20F /16F, 2F /16F);

		scopeAttachPoint = new Vector3f(13F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(76 /16F, 7F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}