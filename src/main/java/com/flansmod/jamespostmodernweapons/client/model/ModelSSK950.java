//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SSK950
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

public class ModelSSK950 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSSK950() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 12, 6, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-34F, 19.25F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-27F, -8F, -2.5F);
		gunModel[1].rotateAngleZ = -1.04719755F;

		gunModel[2].addBox(0F, -17F, 0F, 10, 12, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-30F, 11F, -2F);

		gunModel[3].addBox(0F, -17F, 0F, 60, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-88F, 5F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 3, 10, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(14F, 6F, -2F);

		gunModel[5].addBox(0F, -17F, 0F, 44, 11, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(-5F, -4F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 16, 60, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(-71F, 10F, -4.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 120, 7, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(26F, -10.5F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 62, 8, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(40F, -10.5F, 12.5F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 17, 1, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(0F, 16F, -1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 26, 6, 10, 0F); // Import Box0
		gunModel[10].setRotationPoint(-77F, 11.5F, -5F);
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 60, 10, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(39F, -4F, -4F);

		gunModel[12].addBox(0F, -17F, 0F, 41, 10, 10, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3F, -11F, 12F);
		gunModel[12].rotateAngleX = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 34, 8, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(-5F, -12F, -4F);

		gunModel[14].addBox(0F, -17F, 0F, 1, 26, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(69F, -28F, -4F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 84, 2, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(17F, 6F, -3F);

		gunModel[16].addBox(0F, -17F, 0F, 3, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(0F, 6F, -2F);

		gunModel[17].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(21F, -5.5F, -2F);

		gunModel[18].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(12F, -6F, -2.5F);

		gunModel[19].addBox(0F, -17F, 0F, 20, 5, 3, 0F); // Import Box0
		gunModel[19].setRotationPoint(-4F, -10F, -4.75F);

		gunModel[20].addBox(0F, -17F, 0F, 2, 20, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(-29F, -11F, -2F);
		gunModel[20].rotateAngleZ = -1.04719755F;

		gunModel[21].addBox(0F, -17F, 0F, 5, 20, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(-28F, -10F, -3F);
		gunModel[21].rotateAngleZ = -1.04719755F;

		gunModel[22].addBox(0F, -17F, 0F, 16, 52, 11, 0F); // Import Box0
		gunModel[22].setRotationPoint(-71F, 6F, -5.5F);
		gunModel[22].rotateAngleZ = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 28, 6, 6, 0F); // Import Box0
		gunModel[23].setRotationPoint(-88F, 3F, -3F);

		gunModel[24].addBox(0F, -17F, 0F, 7, 4, 8, 0F); // Import Box0
		gunModel[24].setRotationPoint(71F, -21F, -4F);
		gunModel[24].rotateAngleZ = 1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 7, 4, 8, 0F); // Import Box0
		gunModel[25].setRotationPoint(89F, -21F, -4F);
		gunModel[25].rotateAngleZ = 1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 10, 11, 8, 0F); // Import Box0
		gunModel[26].setRotationPoint(-15F, -4F, -4F);


		defaultBarrelModel = new ModelRendererTurbo[3];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 2, 10, 10, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(146F, -12F, -5F);

		defaultBarrelModel[1].addBox(0F, -17F, 0F, 2, 11, 11, 0F); // Import Box0
		defaultBarrelModel[1].setRotationPoint(148F, -12.5F, -5.5F);

		defaultBarrelModel[2].addBox(0F, -17F, 0F, 30, 13, 13, 0F); // Import Box0
		defaultBarrelModel[2].setRotationPoint(150F, -13.5F, -6.5F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 4, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-8F, -10F, -2F);

		ammoModel[1].addBox(0F, -17F, 0F, 3, 3, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(8F, -9.5F, -1.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import Box0
		ammoModel[2].setRotationPoint(10.75F, -9F, -1F);

		ammoModel[3].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[3].setRotationPoint(-9F, -9.5F, -1.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-10F, -10F, -2F);

		ammoModel[5].addBox(0F, -17F, 0F, 10, 5, 5, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-7.25F, -10.5F, -2.5F);


		pumpModel = new ModelRendererTurbo[4];
		pumpModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		pumpModel[2] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		pumpModel[3] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 40, 6, 6, 0F); // Import Box0
		pumpModel[0].setRotationPoint(-12F, -11F, -3F);

		pumpModel[1].addBox(0F, -17F, 0F, 2, 3, 14, 0F); // Import Box0
		pumpModel[1].setRotationPoint(-11F, -5F, -2.5F);
		pumpModel[1].rotateAngleX = 0.6981317F;

		pumpModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		pumpModel[2].setRotationPoint(-12F, -1.5F, -15.5F);

		pumpModel[3].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		pumpModel[3].setRotationPoint(-14F, -10.5F, -2.5F);



		barrelAttachPoint = new Vector3f(146F /16F, 26F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(64F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(60 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		unloadClipTime = 0F;


		loadClipTime = 0.5F;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}