//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PGMHecate
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

public class ModelPGMHecate extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPGMHecate() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-13F, 22F, -3F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 20, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-10F, 11F, -2.5F);
		gunModel[1].rotateAngleZ = -0.20943951F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-12F, 19F, -2F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 30, 4, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-16F, 10F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-14F, 25F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 7, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(7F, 14F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 40, 7, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-1F, -10F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(-1F, 19F, -1.5F);

		gunModel[8].addBox(0F, -17F, 0F, 6, 29, 8, 0F); // Import Box0
		gunModel[8].setRotationPoint(-69F, -2F, -4F);

		gunModel[9].addBox(0F, -17F, 0F, 60, 5, 10, 0F); // Import Box0
		gunModel[9].setRotationPoint(-2F, 5F, -5F);

		gunModel[10].addBox(0F, -17F, 0F, 46, 8, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-68F, 7F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(58.05F, -1.5F, 3F);

		gunModel[12].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(58.05F, -1.5F, -5F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(58F, -17.5F, 13F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(58F, -9.5F, 13F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 58, 5, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(0F, 3F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 14, 7, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(58F, -7.5F, 13.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 60, 5, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(-1F, -1F, -2.5F);

		gunModel[18].addBox(0F, -17F, 0F, 14, 2, 8, 0F); // Import Box0
		gunModel[18].setRotationPoint(-2F, -3F, -4F);

		gunModel[19].addBox(0F, -17F, 0F, 14, 8, 1, 0F); // Import Box0
		gunModel[19].setRotationPoint(-2F, -3F, 4F);

		gunModel[20].addBox(0F, -17F, 0F, 6, 11, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(9F, 11F, -2F);

		gunModel[21].addBox(0F, -17F, 0F, 6, 12, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(38F, 10F, -2F);

		gunModel[22].addBox(0F, -17F, 0F, 26, 6, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(44F, 8F, -1.5F);

		gunModel[23].addBox(0F, -17F, 0F, 76, 4, 4, 0F); // Import Box0
		gunModel[23].setRotationPoint(-63F, 8F, -2F);

		gunModel[24].addBox(0F, -17F, 0F, 40, 10, 6, 0F); // Import Box0
		gunModel[24].setRotationPoint(-66F, 14F, -3F);
		gunModel[24].rotateAngleZ = 0.10471976F;

		gunModel[25].addBox(0F, -17F, 0F, 18, 10, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(-66F, 16F, -2.5F);
		gunModel[25].rotateAngleZ = 0.03490659F;

		gunModel[26].addBox(0F, -17F, 0F, 10, 11, 9, 0F); // Import Box0
		gunModel[26].setRotationPoint(-63F, -3F, -4.5F);

		gunModel[27].addBox(0F, -17F, 0F, 30, 10, 8, 0F); // Import Box0
		gunModel[27].setRotationPoint(-53F, -2F, -4F);

		gunModel[28].addBox(0F, -17F, 0F, 14, 14, 12, 0F); // Import Box0
		gunModel[28].setRotationPoint(75F, -5F, -6F);

		gunModel[29].addBox(0F, -17F, 0F, 13, 14, 8, 0F); // Import Box0
		gunModel[29].setRotationPoint(75.5F, -11F, -4F);

		gunModel[30].addBox(0F, -17F, 0F, 2, 20, 2, 0F); // Import Box0
		gunModel[30].setRotationPoint(73.5F, -23F, -2F);
		gunModel[30].rotateAngleX = 2.44346095F;

		gunModel[31].addBox(0F, -17F, 0F, 21, 3, 3, 0F); // Import Box0
		gunModel[31].setRotationPoint(55.5F, -22F, -2F);
		gunModel[31].rotateAngleX = 2.44346095F;

		gunModel[32].addBox(0F, -17F, 0F, 22, 1, 1, 0F); // Import Box0
		gunModel[32].setRotationPoint(55F, -23.5F, -2F);
		gunModel[32].rotateAngleX = 2.44346095F;

		gunModel[33].addBox(0F, -17F, 0F, 13, 4, 4, 0F); // Import Box0
		gunModel[33].setRotationPoint(71.5F, -10F, -2F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 24, 18, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(14.5F, 10F, -3.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(15.5F, 24F, -2.5F);


		slideModel = new ModelRendererTurbo[6];
		slideModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 120, 6, 6, 0F); // Import Box0
		slideModel[0].setRotationPoint(58F, -0.5F, -3F);

		slideModel[1].addBox(0F, -17F, 0F, 8, 12, 14, 0F); // Import Box0
		slideModel[1].setRotationPoint(180F, -3.5F, -7F);

		slideModel[2].addBox(0F, -17F, 0F, 3, 17, 3, 0F); // Import Box0
		slideModel[2].setRotationPoint(-6F, -12F, -12.5F);
		slideModel[2].rotateAngleY = 0.6981317F;
		slideModel[2].rotateAngleZ = -1.22173048F;

		slideModel[3].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		slideModel[3].setRotationPoint(-14F, -8.5F, -18F);
		slideModel[3].rotateAngleY = 0.59341195F;
		slideModel[3].rotateAngleZ = -1.18682389F;

		slideModel[4].addBox(0F, -17F, 0F, 18, 14, 16, 0F); // Import Box0
		slideModel[4].setRotationPoint(188F, -4.5F, -8F);

		slideModel[5].addBox(0F, -17F, 0F, 8, 8, 8, 0F); // Import Box0
		slideModel[5].setRotationPoint(178F, -1.5F, -4F);



		barrelAttachPoint = new Vector3f(178F /16F, 15F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(18F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(56 /16F, 3F /16F, 0F /16F);


		gunSlideDistance = 2F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}