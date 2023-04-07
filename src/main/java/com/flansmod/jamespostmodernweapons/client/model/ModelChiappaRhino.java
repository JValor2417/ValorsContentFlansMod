//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChiappaRhino
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

public class ModelChiappaRhino extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChiappaRhino() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 6, 10, 10, 0F); // Import Box0
		gunModel[0].setRotationPoint(-19.75F, 18F, -4.5F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 11, 24, 9, 0F); // Import Box0
		gunModel[1].setRotationPoint(-14F, 5F, -4F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 18, 8, 0F); // Import Box0
		gunModel[2].setRotationPoint(-17F, 4F, -3.5F);
		gunModel[2].rotateAngleZ = -0.27925268F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 2, 0F); // Import Box0
		gunModel[3].setRotationPoint(6F, 14F, -0.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 32, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(5F, -15F, -2.5F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 16, 5, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(-21F, -2F, -3.5F);
		gunModel[5].rotateAngleZ = -0.40142573F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 2, 0F); // Import Box0
		gunModel[6].setRotationPoint(36F, -3F, -0.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 12, 6, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-15F, -26F, -3F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 10, 5, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-11F, -35F, -1.5F);
		gunModel[8].rotateAngleZ = -2.44346095F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 10, 8, 0F); // Import Box0
		gunModel[9].setRotationPoint(-7.5F, 20F, -3.5F);
		gunModel[9].rotateAngleZ = -0.06981317F;

		gunModel[10].addBox(0F, -17F, 0F, 12, 4, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(5F, -26F, -3F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 2, 6, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(-2F, -11F, -1F);
		gunModel[11].rotateAngleZ = 0.36651914F;

		gunModel[12].addBox(0F, -17F, 0F, 6, 7, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-21F, -20F, -3F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 3, 26, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(5F, -29F, -2.5F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 10, 16, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(-11F, -11F, -2.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 54, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(59F, -21F, -2.5F);
		gunModel[15].rotateAngleZ = -1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 1, 53, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(58F, -22F, -2F);
		gunModel[16].rotateAngleZ = -1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(57.5F, -26F, -1.5F);
		gunModel[17].rotateAngleZ = -1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(44.5F, -26F, -1.5F);
		gunModel[18].rotateAngleZ = -1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(31.5F, -26F, -1.5F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 4, 2, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(17.5F, -26F, -1.5F);
		gunModel[20].rotateAngleZ = -1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 2, 53, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(58F, -27F, -2F);
		gunModel[21].rotateAngleZ = -1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 4, 30, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(58F, -13F, -2F);
		gunModel[22].rotateAngleZ = -1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 1, 52, 4, 0F); // Import Box0
		gunModel[23].setRotationPoint(57F, -13F, -1.5F);
		gunModel[23].rotateAngleZ = -1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 2, 20, 5, 0F); // Import Box0
		gunModel[24].setRotationPoint(58F, -29F, -2F);
		gunModel[24].rotateAngleZ = -1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 3, 8, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(58F, -32F, -2F);
		gunModel[25].rotateAngleZ = -1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		gunModel[26].setRotationPoint(51F, -27.25F, -1.5F);
		gunModel[26].rotateAngleZ = -1.30899694F;

		gunModel[27].addBox(0F, -17F, 0F, 2, 22, 5, 0F); // Import Box0
		gunModel[27].setRotationPoint(2F, -31F, -2F);
		gunModel[27].rotateAngleZ = -1.57079633F;

		gunModel[28].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		gunModel[28].setRotationPoint(60F, -19F, -1.5F);
		gunModel[28].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(88.5F, -28.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(89.5F, -32.5F, 1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(89.5F, -32.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -30.5F, -1F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(16F, -32F, 2F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 2, 1, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(16F, -32F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -31F, 2F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 1, 2, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -31F, -2F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;

		defaultScopeModel[8].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(89F, -30.5F, 1.5F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(89F, -30.5F, -1.5F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 10, 16, 9, 0F); // Import Box0
		ammoModel[0].setRotationPoint(1F, -25.5F, -4F);
		ammoModel[0].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(77F /16F, 17F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(8F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(60 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.REVOLVER;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}