//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Glock
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

public class ModelGlock extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGlock() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 11, 22, 5, 0F); // Import Box0
		gunModel[0].setRotationPoint(-0.55F, -5.75F, -2F);
		gunModel[0].rotateAngleZ = -0.2443461F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(12.45F, 2.25F, -1F);

		gunModel[2].addBox(0F, -17F, 0F, 4, 30, 7, 0F); // Import Box0
		gunModel[2].setRotationPoint(15.45F, -24.75F, -3F);
		gunModel[2].rotateAngleZ = -1.57079633F;

		gunModel[3].addBox(0F, -17F, 0F, 8, 2, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-5.55F, -7.75F, -2F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(39.45F, -14.75F, -1F);
		gunModel[4].rotateAngleZ = 1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 1, 39, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(19.95F, -28F, -2F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 30, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(20.5F, -29.75F, -1.5F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 5, 1, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-18.6F, -29.75F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 4, 5, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(20.35F, -25F, -2.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 2, 5, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(-14.55F, -24.75F, -3F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 3, 1, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(20.55F, -29.25F, -1F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 5, 2, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(-11.55F, -12.75F, -1.5F);
		gunModel[11].rotateAngleZ = -0.87266463F;

		gunModel[12].addBox(0F, -17F, 0F, 1, 12, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-2.6F, -20.75F, -3F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(29.45F, -14.75F, -1F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 11, 21, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(-1.05F, -5.75F, -2.5F);
		gunModel[14].rotateAngleZ = -0.2443461F;

		gunModel[15].addBox(0F, -17F, 0F, 1, 21, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(-1.55F, -5.75F, -2F);
		gunModel[15].rotateAngleZ = -0.2443461F;

		gunModel[16].addBox(0F, -17F, 0F, 2, 14, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(-5.05F, 0.25F, -1.5F);
		gunModel[16].rotateAngleZ = -0.33161256F;

		gunModel[17].addBox(0F, -17F, 0F, 13, 2, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(-8.05F, 14F, -1.5F);
		gunModel[17].rotateAngleZ = -0.2443461F;

		gunModel[18].addBox(0F, -17F, 0F, 10, 2, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(39.95F, -13.25F, -0.5F);
		gunModel[18].rotateAngleZ = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 1, 13, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(28.95F, -12.25F, -0.5F);
		gunModel[19].rotateAngleZ = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		gunModel[20].setRotationPoint(20.3F, -24.25F, 2.55F);
		gunModel[20].rotateAngleZ = -1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		gunModel[21].setRotationPoint(20.3F, -24.25F, -2.55F);
		gunModel[21].rotateAngleZ = -1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 9, 15, 1, 0F); // Import Box0
		gunModel[22].setRotationPoint(-1.3F, -0.75F, 2.55F);
		gunModel[22].rotateAngleZ = -0.2443461F;

		gunModel[23].addBox(0F, -17F, 0F, 9, 15, 1, 0F); // Import Box0
		gunModel[23].setRotationPoint(-1.3F, -0.75F, -2.55F);
		gunModel[23].rotateAngleZ = -0.2443461F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 26, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(0.45F, -7.75F, -1F);
		ammoModel[0].rotateAngleZ = -0.2443461F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 2, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-7.05F, 16.5F, -1.5F);
		ammoModel[1].rotateAngleZ = -0.2443461F;


		slideModel = new ModelRendererTurbo[25];
		slideModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		slideModel[15] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		slideModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		slideModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		slideModel[18] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		slideModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		slideModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		slideModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		slideModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		slideModel[23] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		slideModel[24] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 6, 40, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(20.45F, -30.75F, -3F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[1].setRotationPoint(-16.55F, -29.75F, 3.05F);
		slideModel[1].rotateAngleZ = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[2].setRotationPoint(-14.8F, -29.75F, 3.05F);
		slideModel[2].rotateAngleZ = -1.57079633F;

		slideModel[3].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[3].setRotationPoint(-13.05F, -29.75F, 3.05F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[4].setRotationPoint(-11.3F, -29.75F, 3.05F);
		slideModel[4].rotateAngleZ = -1.57079633F;

		slideModel[5].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[5].setRotationPoint(-9.55F, -29.75F, 3.05F);
		slideModel[5].rotateAngleZ = -1.57079633F;

		slideModel[6].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[6].setRotationPoint(-7.8F, -29.75F, 3.05F);
		slideModel[6].rotateAngleZ = -1.57079633F;

		slideModel[7].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[7].setRotationPoint(-16.55F, -29.75F, -3.05F);
		slideModel[7].rotateAngleZ = -1.57079633F;

		slideModel[8].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[8].setRotationPoint(-14.8F, -29.75F, -3.05F);
		slideModel[8].rotateAngleZ = -1.57079633F;

		slideModel[9].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[9].setRotationPoint(-13.05F, -29.75F, -3.05F);
		slideModel[9].rotateAngleZ = -1.57079633F;

		slideModel[10].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[10].setRotationPoint(-11.3F, -29.75F, -3.05F);
		slideModel[10].rotateAngleZ = -1.57079633F;

		slideModel[11].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[11].setRotationPoint(-9.55F, -29.75F, -3.05F);
		slideModel[11].rotateAngleZ = -1.57079633F;

		slideModel[12].addBox(0F, -17F, 0F, 5, 1, 1, 0F); // Import Box0
		slideModel[12].setRotationPoint(-7.8F, -29.75F, -3.05F);
		slideModel[12].rotateAngleZ = -1.57079633F;

		slideModel[13].addBox(0F, -17F, 0F, 6, 39, 6, 0F); // Import Box0
		slideModel[13].setRotationPoint(19.95F, -30.95F, -2.5F);
		slideModel[13].rotateAngleZ = -1.57079633F;

		slideModel[14].addBox(0F, -17F, 0F, 4, 10, 3, 0F); // Import Box0
		slideModel[14].setRotationPoint(5.45F, -31F, -3.05F);
		slideModel[14].rotateAngleZ = -1.57079633F;

		slideModel[15].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		slideModel[15].setRotationPoint(51F, -28.5F, -0.5F);
		slideModel[15].rotateAngleZ = 1.57079633F;

		slideModel[16].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		slideModel[16].setRotationPoint(52F, -32.5F, 1.5F);
		slideModel[16].rotateAngleZ = 1.57079633F;

		slideModel[17].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		slideModel[17].setRotationPoint(52F, -32.5F, -1.5F);
		slideModel[17].rotateAngleZ = 1.57079633F;

		slideModel[18].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		slideModel[18].setRotationPoint(15F, -30.5F, -1F);
		slideModel[18].rotateAngleZ = 1.57079633F;

		slideModel[19].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		slideModel[19].setRotationPoint(16F, -32F, 2F);
		slideModel[19].rotateAngleZ = 1.57079633F;

		slideModel[20].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		slideModel[20].setRotationPoint(16F, -32F, -2F);
		slideModel[20].rotateAngleZ = 1.57079633F;

		slideModel[21].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		slideModel[21].setRotationPoint(15.5F, -31F, 2F);
		slideModel[21].rotateAngleZ = 1.57079633F;

		slideModel[22].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		slideModel[22].setRotationPoint(15.5F, -31F, -2F);
		slideModel[22].rotateAngleZ = 1.57079633F;

		slideModel[23].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		slideModel[23].setRotationPoint(51.5F, -30.5F, 1.5F);
		slideModel[23].rotateAngleZ = 1.57079633F;

		slideModel[24].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		slideModel[24].setRotationPoint(51.5F, -30.5F, -1.5F);
		slideModel[24].rotateAngleZ = 1.57079633F;



		barrelAttachPoint = new Vector3f(37.5F /16F, 27.75F /16F, 0.5F /16F);

		scopeAttachPoint = new Vector3f(2F /16F, 31F /16F, 0.5F /16F);

		gripAttachPoint = new Vector3f(32 /16F, 20.75F /16F, 0.5F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		scopeIsOnSlide = true;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}