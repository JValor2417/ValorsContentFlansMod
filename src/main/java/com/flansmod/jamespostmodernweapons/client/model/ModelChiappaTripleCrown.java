//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChiappaTripleCrown
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

public class ModelChiappaTripleCrown extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChiappaTripleCrown() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 2, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(-21F, 7.45F, -1.5F);

		gunModel[1].addBox(0F, -17F, 0F, 6, 2, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(8F, -9.55F, -1.5F);
		gunModel[1].rotateAngleZ = 1.57079633F;

		gunModel[2].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import Box0
		gunModel[2].setRotationPoint(-7.5F, -18.05F, -5.5F);
		gunModel[2].rotateAngleZ = -1.57079633F;

		gunModel[3].addBox(0F, -17F, 0F, 3, 15, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(-22.75F, -28.05F, -1.5F);
		gunModel[3].rotateAngleZ = -1.3962634F;

		gunModel[4].addBox(0F, -17F, 0F, 9, 15, 10, 0F); // Import Box0
		gunModel[4].setRotationPoint(-23F, -28.05F, -5F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 31, 10, 0F); // Import Box0
		gunModel[5].setRotationPoint(-7F, -19.55F, -5F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 3, 15, 2, 0F); // Import Box0
		gunModel[6].setRotationPoint(-22.75F, -27.55F, -3F);
		gunModel[6].rotateAngleZ = -1.3962634F;

		gunModel[7].addBox(0F, -17F, 0F, 3, 15, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(-22.75F, -27.55F, 1F);
		gunModel[7].rotateAngleZ = -1.3962634F;

		gunModel[8].addBox(0F, -17F, 0F, 7, 24, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-40F, -15.55F, -2.5F);
		gunModel[8].rotateAngleZ = -0.87266463F;

		gunModel[9].addBox(0F, -17F, 0F, 10, 9, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-49F, 5.45F, -3F);
		gunModel[9].rotateAngleZ = -0.10471976F;

		gunModel[10].addBox(0F, -17F, 0F, 6, 12, 8, 0F); // Import Box0
		gunModel[10].setRotationPoint(-27F, -10.55F, -4F);

		gunModel[11].addBox(0F, -17F, 0F, 2, 11, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-29F, -10.05F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 7, 22, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-42F, -15.55F, -2F);
		gunModel[12].rotateAngleZ = -0.89011792F;

		gunModel[13].addBox(0F, -17F, 0F, 7, 39, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(-61F, -8.55F, -2.5F);
		gunModel[13].rotateAngleZ = -1.3962634F;

		gunModel[14].addBox(0F, -17F, 0F, 7, 43, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-57F, -6.55F, -2F);
		gunModel[14].rotateAngleZ = -1.3962634F;

		gunModel[15].addBox(0F, -17F, 0F, 10, 36, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-62F, -16.55F, -3.5F);
		gunModel[15].rotateAngleZ = -1.50098316F;

		gunModel[16].addBox(0F, -17F, 0F, 3, 32, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(-65F, -17.55F, -2.5F);
		gunModel[16].rotateAngleZ = -1.53588974F;

		gunModel[17].addBox(0F, -17F, 0F, 1, 30, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(-66F, -18.05F, -2F);
		gunModel[17].rotateAngleZ = -1.53588974F;

		gunModel[18].addBox(0F, -17F, 0F, 9, 35, 8, 0F); // Import Box0
		gunModel[18].setRotationPoint(-63F, -16.05F, -4F);
		gunModel[18].rotateAngleZ = -1.50098316F;

		gunModel[19].addBox(0F, -17F, 0F, 19, 2, 7, 0F); // Import Box0
		gunModel[19].setRotationPoint(-97.5F, -14.5F, -3.5F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 18, 1, 6, 0F); // Import Box0
		gunModel[20].setRotationPoint(-99F, -14F, -3F);
		gunModel[20].rotateAngleZ = -1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 6, 23, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(-39F, -13.55F, -2F);
		gunModel[21].rotateAngleZ = -0.90757121F;

		gunModel[22].addBox(0F, -17F, 0F, 6, 2, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(-4F, -9.55F, -1.5F);
		gunModel[22].rotateAngleZ = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 5, 1, 7, 0F); // Import Box0
		gunModel[23].setRotationPoint(-26F, -11.05F, -3.5F);

		gunModel[24].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[24].setRotationPoint(-48F, -0.549999999999996F, -1.5F);
		gunModel[24].rotateAngleZ = -0.13962634F;


		ammoModel = new ModelRendererTurbo[12];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 1, 5, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-3.25F, -12.55F, -2.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 3, 4, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-2.75F, -12.05F, -2F);

		ammoModel[2].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[2].setRotationPoint(8.55F, -11.55F, -1.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 9, 4, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(0.25F, -12.05F, -2F);

		ammoModel[4].addBox(0F, -17F, 0F, 1, 5, 5, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-3.25F, -7.55F, 0.5F);

		ammoModel[5].addBox(0F, -17F, 0F, 3, 4, 4, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-2.75F, -7.05F, 1F);

		ammoModel[6].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[6].setRotationPoint(8.55F, -6.55F, 1.5F);

		ammoModel[7].addBox(0F, -17F, 0F, 9, 4, 4, 0F); // Import Box0
		ammoModel[7].setRotationPoint(0.25F, -7.05F, 1F);

		ammoModel[8].addBox(0F, -17F, 0F, 1, 5, 5, 0F); // Import Box0
		ammoModel[8].setRotationPoint(-3.25F, -7.55F, -5.5F);

		ammoModel[9].addBox(0F, -17F, 0F, 3, 4, 4, 0F); // Import Box0
		ammoModel[9].setRotationPoint(-2.75F, -7.05F, -5F);

		ammoModel[10].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[10].setRotationPoint(8.55F, -6.55F, -4.5F);

		ammoModel[11].addBox(0F, -17F, 0F, 9, 4, 4, 0F); // Import Box0
		ammoModel[11].setRotationPoint(0.25F, -7.05F, -5F);


		breakActionModel = new ModelRendererTurbo[29];
		breakActionModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		breakActionModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		breakActionModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		breakActionModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		breakActionModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		breakActionModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		breakActionModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		breakActionModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		breakActionModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		breakActionModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		breakActionModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		breakActionModel[13] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		breakActionModel[14] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		breakActionModel[15] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		breakActionModel[16] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		breakActionModel[17] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import Box0
		breakActionModel[18] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box0
		breakActionModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		breakActionModel[20] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		breakActionModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		breakActionModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		breakActionModel[23] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		breakActionModel[24] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		breakActionModel[25] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		breakActionModel[26] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		breakActionModel[27] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		breakActionModel[28] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0

		breakActionModel[0].addBox(0F, -17F, 0F, 4, 26, 11, 0F); // Import Box0
		breakActionModel[0].setRotationPoint(19F, -19.55F, -5.5F);
		breakActionModel[0].rotateAngleZ = -1.57079633F;

		breakActionModel[1].addBox(0F, -17F, 0F, 5, 110, 5, 0F); // Import Box0
		breakActionModel[1].setRotationPoint(103F, -24.55F, -5.25F);
		breakActionModel[1].rotateAngleZ = -1.57079633F;

		breakActionModel[2].addBox(0F, -17F, 0F, 5, 110, 5, 0F); // Import Box0
		breakActionModel[2].setRotationPoint(103F, -24.55F, 0.25F);
		breakActionModel[2].rotateAngleZ = -1.57079633F;

		breakActionModel[3].addBox(0F, -17F, 0F, 4, 14, 10, 0F); // Import Box0
		breakActionModel[3].setRotationPoint(33F, -20.05F, -5F);
		breakActionModel[3].rotateAngleZ = -1.57079633F;

		breakActionModel[4].addBox(0F, -17F, 0F, 5, 110, 5, 0F); // Import Box0
		breakActionModel[4].setRotationPoint(103F, -30.05F, -2.5F);
		breakActionModel[4].rotateAngleZ = -1.57079633F;

		breakActionModel[5].addBox(0F, -17F, 0F, 5, 109, 4, 0F); // Import Box0
		breakActionModel[5].setRotationPoint(102F, -25.05F, -2F);
		breakActionModel[5].rotateAngleZ = -1.57079633F;

		breakActionModel[6].addBox(0F, -17F, 0F, 6, 14, 6, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(-7F, -25.05F, -5.75F);
		breakActionModel[6].rotateAngleZ = -1.57079633F;

		breakActionModel[7].addBox(0F, -17F, 0F, 6, 14, 6, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(-7F, -25.05F, -0.25F);
		breakActionModel[7].rotateAngleZ = -1.57079633F;

		breakActionModel[8].addBox(0F, -17F, 0F, 6, 14, 6, 0F); // Import Box0
		breakActionModel[8].setRotationPoint(-7F, -30.55F, -3F);
		breakActionModel[8].rotateAngleZ = -1.57079633F;

		breakActionModel[9].addBox(0F, -17F, 0F, 7, 2, 8, 0F); // Import Box0
		breakActionModel[9].setRotationPoint(-21F, -25.55F, -6.25F);
		breakActionModel[9].rotateAngleZ = -1.57079633F;

		breakActionModel[10].addBox(0F, -17F, 0F, 7, 2, 8, 0F); // Import Box0
		breakActionModel[10].setRotationPoint(-21F, -25.55F, -1.75F);
		breakActionModel[10].rotateAngleZ = -1.57079633F;

		breakActionModel[11].addBox(0F, -17F, 0F, 7, 2, 7, 0F); // Import Box0
		breakActionModel[11].setRotationPoint(-21F, -31.05F, -3.5F);
		breakActionModel[11].rotateAngleZ = -1.57079633F;

		breakActionModel[12].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		breakActionModel[12].setRotationPoint(103.05F, -24.05F, -4.75F);
		breakActionModel[12].rotateAngleZ = -1.57079633F;

		breakActionModel[13].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		breakActionModel[13].setRotationPoint(103.05F, -24.05F, 0.75F);
		breakActionModel[13].rotateAngleZ = -1.57079633F;

		breakActionModel[14].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		breakActionModel[14].setRotationPoint(103.05F, -29.55F, -2F);
		breakActionModel[14].rotateAngleZ = -1.57079633F;

		breakActionModel[15].addBox(0F, -17F, 0F, 2, 13, 4, 0F); // Import Box0
		breakActionModel[15].setRotationPoint(-7F, -31.05F, -2F);
		breakActionModel[15].rotateAngleZ = -1.57079633F;

		breakActionModel[16].addBox(0F, -17F, 0F, 2, 110, 3, 0F); // Import Box0
		breakActionModel[16].setRotationPoint(102.5F, -31F, -1.5F);
		breakActionModel[16].rotateAngleZ = -1.57079633F;

		breakActionModel[17].addBox(0F, -17F, 0F, 4, 24, 10, 0F); // Import Box0
		breakActionModel[17].setRotationPoint(18F, -19F, -5F);
		breakActionModel[17].rotateAngleZ = -1.57079633F;

		breakActionModel[18].addBox(0F, -17F, 0F, 4, 13, 9, 0F); // Import Box0
		breakActionModel[18].setRotationPoint(31F, -19.5F, -4.5F);
		breakActionModel[18].rotateAngleZ = -1.57079633F;

		breakActionModel[19].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		breakActionModel[19].setRotationPoint(132.5F, -28.5F, -1F);
		breakActionModel[19].rotateAngleZ = 1.57079633F;

		breakActionModel[20].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		breakActionModel[20].setRotationPoint(133.5F, -32.5F, 1F);
		breakActionModel[20].rotateAngleZ = 1.57079633F;

		breakActionModel[21].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		breakActionModel[21].setRotationPoint(133.5F, -32.5F, -2F);
		breakActionModel[21].rotateAngleZ = 1.57079633F;

		breakActionModel[22].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		breakActionModel[22].setRotationPoint(15F, -30.5F, -1.5F);
		breakActionModel[22].rotateAngleZ = 1.57079633F;

		breakActionModel[23].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		breakActionModel[23].setRotationPoint(16F, -32F, 1.5F);
		breakActionModel[23].rotateAngleZ = 1.57079633F;

		breakActionModel[24].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		breakActionModel[24].setRotationPoint(16F, -32F, -2.5F);
		breakActionModel[24].rotateAngleZ = 1.57079633F;

		breakActionModel[25].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		breakActionModel[25].setRotationPoint(15.5F, -31F, 1.5F);
		breakActionModel[25].rotateAngleZ = 1.57079633F;

		breakActionModel[26].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		breakActionModel[26].setRotationPoint(15.5F, -31F, -2.5F);
		breakActionModel[26].rotateAngleZ = 1.57079633F;

		breakActionModel[27].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		breakActionModel[27].setRotationPoint(133F, -30.5F, 1F);
		breakActionModel[27].rotateAngleZ = 1.57079633F;

		breakActionModel[28].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		breakActionModel[28].setRotationPoint(133F, -30.5F, -2F);
		breakActionModel[28].rotateAngleZ = 1.57079633F;



		barrelAttachPoint = new Vector3f(121F /16F, 25F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(22F /16F, 18F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(28F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(24 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		barrelBreakPoint = new Vector3f(22 /16F, 20F /16F, 0F /16F);


		breakAngle = 60F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}