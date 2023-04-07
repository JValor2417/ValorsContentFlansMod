//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChinaLake
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

public class ModelChinaLake extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChinaLake() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[45];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 28, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-50F, -16F, -3F);
		gunModel[0].rotateAngleZ = -0.97738438F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 8, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(-64F, 5F, -3.5F);
		gunModel[1].rotateAngleZ = -0.10471976F;

		gunModel[2].addBox(0F, -17F, 0F, 1, 7, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-26.5F, 6.5F, -2F);

		gunModel[3].addBox(0F, -17F, 0F, 80, 10, 10, 0F); // Import Box0
		gunModel[3].setRotationPoint(9F, -11F, -5F);

		gunModel[4].addBox(0F, -17F, 0F, 10, 1, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(-35.5F, 13.5F, -2F);

		gunModel[5].addBox(0F, -17F, 0F, 1, 7, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(-35.5F, 6.5F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 17, 8, 0F); // Import Box0
		gunModel[6].setRotationPoint(-36F, -10F, -4F);

		gunModel[7].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		gunModel[7].setRotationPoint(81.5F, -56.5F, -4F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(81.5F, -22.5F, -4F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		gunModel[9].setRotationPoint(81.5F, -22.5F, 3F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 5, 5, 12, 0F); // Import Box0
		gunModel[10].setRotationPoint(79.5F, -24F, -6F);
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 1, 1, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(82.5F, -50.5F, -3.5F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 1, 1, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(82.5F, -44.5F, -3.5F);
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 1, 1, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(82.5F, -38.5F, -3.5F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 1, 1, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(82.5F, -32.5F, -3.5F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 2, 16, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-38F, -9.5F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 7, 32, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(-50F, -19F, -2.5F);
		gunModel[16].rotateAngleZ = -1.20427718F;

		gunModel[17].addBox(0F, -17F, 0F, 7, 39, 6, 0F); // Import Box0
		gunModel[17].setRotationPoint(-76F, -9F, -3F);
		gunModel[17].rotateAngleZ = -1.3962634F;

		gunModel[18].addBox(0F, -17F, 0F, 7, 43, 5, 0F); // Import Box0
		gunModel[18].setRotationPoint(-72F, -7F, -2.5F);
		gunModel[18].rotateAngleZ = -1.3962634F;

		gunModel[19].addBox(0F, -17F, 0F, 10, 40, 8, 0F); // Import Box0
		gunModel[19].setRotationPoint(-75F, -16F, -4F);
		gunModel[19].rotateAngleZ = -1.50098316F;

		gunModel[20].addBox(0F, -17F, 0F, 3, 34, 6, 0F); // Import Box0
		gunModel[20].setRotationPoint(-78F, -17F, -3F);
		gunModel[20].rotateAngleZ = -1.53588974F;

		gunModel[21].addBox(0F, -17F, 0F, 1, 32, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-79F, -17.5F, -2.5F);
		gunModel[21].rotateAngleZ = -1.53588974F;

		gunModel[22].addBox(0F, -17F, 0F, 9, 37, 9, 0F); // Import Box0
		gunModel[22].setRotationPoint(-76F, -15.5F, -4.5F);
		gunModel[22].rotateAngleZ = -1.50098316F;

		gunModel[23].addBox(0F, -17F, 0F, 19, 4, 9, 0F); // Import Box0
		gunModel[23].setRotationPoint(-113F, -14.5F, -4.5F);
		gunModel[23].rotateAngleZ = -1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 18, 1, 8, 0F); // Import Box0
		gunModel[24].setRotationPoint(-116.5F, -14F, -4F);
		gunModel[24].rotateAngleZ = -1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 1, 25, 10, 0F); // Import Box0
		gunModel[25].setRotationPoint(-26F, -11F, -5F);

		gunModel[26].addBox(0F, -17F, 0F, 34, 3, 10, 0F); // Import Box0
		gunModel[26].setRotationPoint(-25F, -11F, -5F);

		gunModel[27].addBox(0F, -17F, 0F, 4, 13, 10, 0F); // Import Box0
		gunModel[27].setRotationPoint(-25F, 1F, -5F);

		gunModel[28].addBox(0F, -17F, 0F, 34, 9, 11, 0F); // Import Box0
		gunModel[28].setRotationPoint(-25F, -8F, -5.5F);

		gunModel[29].addBox(0F, -17F, 0F, 11, 14, 10, 0F); // Import Box0
		gunModel[29].setRotationPoint(-10F, 1F, -5F);

		gunModel[30].addBox(0F, -17F, 0F, 8, 4, 10, 0F); // Import Box0
		gunModel[30].setRotationPoint(1F, 1F, -5F);

		gunModel[31].addBox(0F, -17F, 0F, 9, 9, 9, 0F); // Import Box0
		gunModel[31].setRotationPoint(0.5F, 5F, -4.5F);

		gunModel[32].addBox(0F, -17F, 0F, 13, 14, 9, 0F); // Import Box0
		gunModel[32].setRotationPoint(-22.75F, -0.75F, -4.5F);
		gunModel[32].rotateAngleZ = -0.10471976F;

		gunModel[33].addBox(0F, -17F, 0F, 6, 30, 5, 0F); // Import Box0
		gunModel[33].setRotationPoint(-42F, -17F, -2.5F);
		gunModel[33].rotateAngleZ = -1.22173048F;

		gunModel[34].addBox(0F, -17F, 0F, 80, 10, 10, 0F); // Import Box0
		gunModel[34].setRotationPoint(9F, 1F, -5F);

		gunModel[35].addBox(0F, -17F, 0F, 4, 11, 11, 0F); // Import Box0
		gunModel[35].setRotationPoint(78F, -11.5F, -5.5F);

		gunModel[36].addBox(0F, -17F, 0F, 4, 11, 11, 0F); // Import Box0
		gunModel[36].setRotationPoint(78F, 0.5F, -5.5F);

		gunModel[37].addBox(0F, -17F, 0F, 4, 1, 9, 0F); // Import Box0
		gunModel[37].setRotationPoint(78F, -0.5F, -4.5F);

		gunModel[38].addBox(0F, -17F, 0F, 1, 9, 9, 0F); // Import Box0
		gunModel[38].setRotationPoint(88.05F, -10.5F, -4.5F);

		gunModel[39].addBox(0F, -17F, 0F, 1, 9, 9, 0F); // Import Box0
		gunModel[39].setRotationPoint(88.05F, 1.5F, -4.5F);

		gunModel[40].addBox(0F, -17F, 0F, 4, 11, 11, 0F); // Import Box0
		gunModel[40].setRotationPoint(63F, -11.5F, -5.5F);

		gunModel[41].addBox(0F, -17F, 0F, 4, 4, 13, 0F); // Import Box0
		gunModel[41].setRotationPoint(80F, -24.5F, -6.5F);
		gunModel[41].rotateAngleZ = 1.57079633F;

		gunModel[42].addBox(0F, -17F, 0F, 22, 6, 2, 0F); // Import Box0
		gunModel[42].setRotationPoint(-14F, -11.05F, -5.05F);

		gunModel[43].addBox(0F, -17F, 0F, 22, 6, 2, 0F); // Import Box0
		gunModel[43].setRotationPoint(-14F, -8.05F, -5.55F);

		gunModel[44].addBox(0F, -17F, 0F, 33, 3, 8, 0F); // Import Box0
		gunModel[44].setRotationPoint(-24.5F, -13F, -4F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 6, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-12F, 7F, -3F);

		ammoModel[1].addBox(0F, -17F, 0F, 1, 7, 7, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-13F, 6.5F, -3.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 3, 5, 5, 0F); // Import Box0
		ammoModel[2].setRotationPoint(4F, 7.5F, -2.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(6.5F, 8F, -2F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import Box0
		pumpModel[2] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 27, 12, 11, 0F); // Import Box0
		pumpModel[0].setRotationPoint(49F, 0F, -5.5F);

		pumpModel[1].addBox(0F, -17F, 0F, 25, 12, 12, 0F); // Import Box0
		pumpModel[1].setRotationPoint(50F, 1F, -6F);

		pumpModel[2].addBox(0F, -17F, 0F, 23, 1, 11, 0F); // Import Box0
		pumpModel[2].setRotationPoint(51F, 13F, -5.5F);



		barrelAttachPoint = new Vector3f(89F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 13F /16F, 1F /16F);

		scopeAttachPoint = new Vector3f(-8F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(63 /16F, 3F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.SHOTGUN;


		tiltGunTime = 0.15F;


		unloadClipTime = 0F;


		loadClipTime = 0.75F;


		untiltGunTime = 0.1F;


		numBulletsInReloadAnimation = 3F;


		pumpDelayAfterReload = 130;


		pumpDelay = 15;


		pumpTime = 25;


		pumpHandleDistance = 2F;


		barrelBreakPoint = new Vector3f(24 /16F, 13F /16F, 1F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}