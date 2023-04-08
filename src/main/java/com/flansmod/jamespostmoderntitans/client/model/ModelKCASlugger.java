//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KCASlugger
// Model Creator: 
// Created on: 14.01.2021 - 01:55:13
// Last changed on: 14.01.2021 - 01:55:13

package com.flansmod.jamespostmoderntitans.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKCASlugger extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKCASlugger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[119];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import ImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportBox0
		gunModel[67] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import ImportBox0
		gunModel[68] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Import ImportBox0
		gunModel[69] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Import ImportBox0
		gunModel[70] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import ImportBox0
		gunModel[71] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import ImportBox0
		gunModel[72] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import ImportBox0
		gunModel[73] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import ImportBox0
		gunModel[74] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Import ImportBox0
		gunModel[75] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Import ImportBox0
		gunModel[76] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Import ImportBox0
		gunModel[77] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Import ImportBox0
		gunModel[78] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Import ImportBox0
		gunModel[79] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Import ImportBox0
		gunModel[80] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Import ImportBox0
		gunModel[81] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Import ImportBox0
		gunModel[82] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Import ImportBox0
		gunModel[83] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import ImportBox0
		gunModel[84] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Import ImportBox0
		gunModel[85] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Import ImportBox0
		gunModel[86] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import ImportBox0
		gunModel[87] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import ImportBox0
		gunModel[88] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import ImportBox0
		gunModel[89] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[90] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import ImportBox0
		gunModel[91] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import ImportBox0
		gunModel[92] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import ImportBox0
		gunModel[93] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import ImportBox0
		gunModel[94] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import ImportBox0
		gunModel[95] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import ImportBox0
		gunModel[96] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import ImportBox0
		gunModel[97] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Import ImportBox0
		gunModel[98] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Import ImportBox0
		gunModel[99] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Import ImportBox0
		gunModel[100] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Import ImportBox0
		gunModel[101] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Import ImportBox0
		gunModel[102] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Import ImportBox0
		gunModel[103] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Import ImportBox0
		gunModel[104] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox0
		gunModel[105] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import ImportBox0
		gunModel[106] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportBox0
		gunModel[107] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import ImportBox0
		gunModel[108] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Import ImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Import ImportBox0
		gunModel[110] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import ImportBox0
		gunModel[111] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Import ImportBox0
		gunModel[112] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Import ImportBox0
		gunModel[113] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Import ImportBox0
		gunModel[114] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import ImportBox0
		gunModel[115] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Import ImportBox0
		gunModel[116] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox0
		gunModel[117] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportBox0
		gunModel[118] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 6, 4, 5, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-30.5F, 24F, -2.5F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 18, 4, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-26F, 10F, -2F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 14, 3, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-30F, 12F, -1.5F);
		gunModel[2].rotateAngleZ = -0.27925268F;

		gunModel[3].addBox(0F, -17F, 0F, 50, 8, 7, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(-26F, 6F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 57, 11, 8, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-27F, -10F, 11.5F);
		gunModel[4].rotateAngleX = 1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 55, 4, 8, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-26F, -2F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 53, 3, 6, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-25F, -3F, -3F);

		gunModel[7].addBox(0F, -17F, 0F, 130, 8, 15, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(86F, 26F, -7.5F);

		gunModel[8].addBox(0F, -17F, 0F, 40, 7, 6, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-30F, 28F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 40, 8, 11, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(30F, -8F, -5.5F);

		gunModel[10].addBox(0F, -17F, 0F, 127, 4, 9, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(86F, 22F, -4.5F);

		gunModel[11].addBox(0F, -17F, 0F, 129, 2, 13, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(86F, 33F, -6.5F);

		gunModel[12].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(87F, 23F, -5.5F);

		gunModel[13].addBox(0F, -17F, 0F, 6, 22, 5, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(3F, 11F, -2.5F);

		gunModel[14].addBox(0F, -17F, 0F, 55, 7, 7, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(-31F, 31F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(90F, 23F, -5.5F);

		gunModel[16].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(93F, 23F, -5.5F);

		gunModel[17].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(96F, 23F, -5.5F);

		gunModel[18].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(99F, 23F, -5.5F);

		gunModel[19].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(102F, 23F, -5.5F);

		gunModel[20].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(105F, 23F, -5.5F);

		gunModel[21].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(108F, 23F, -5.5F);

		gunModel[22].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(111F, 23F, -5.5F);

		gunModel[23].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(114F, 23F, -5.5F);

		gunModel[24].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(117F, 23F, -5.5F);

		gunModel[25].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(120F, 23F, -5.5F);

		gunModel[26].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(123F, 23F, -5.5F);

		gunModel[27].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(126F, 23F, -5.5F);

		gunModel[28].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(129F, 23F, -5.5F);

		gunModel[29].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(132F, 23F, -5.5F);

		gunModel[30].addBox(0F, -17F, 0F, 6, 32, 9, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(24F, 6F, -4.5F);

		gunModel[31].addBox(0F, -17F, 0F, 10, 40, 17, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(76F, 4F, -8.5F);

		gunModel[32].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(135F, 23F, -5.5F);

		gunModel[33].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(138F, 23F, -5.5F);

		gunModel[34].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(141F, 23F, -5.5F);

		gunModel[35].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(144F, 23F, -5.5F);

		gunModel[36].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(147F, 23F, -5.5F);

		gunModel[37].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(150F, 23F, -5.5F);

		gunModel[38].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(153F, 23F, -5.5F);

		gunModel[39].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(156F, 23F, -5.5F);

		gunModel[40].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(159F, 23F, -5.5F);

		gunModel[41].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(162F, 23F, -5.5F);

		gunModel[42].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(165F, 23F, -5.5F);

		gunModel[43].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(168F, 23F, -5.5F);

		gunModel[44].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(171F, 23F, -5.5F);

		gunModel[45].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(174F, 23F, -5.5F);

		gunModel[46].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(177F, 23F, -5.5F);

		gunModel[47].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(180F, 23F, -5.5F);

		gunModel[48].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(183F, 23F, -5.5F);

		gunModel[49].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(186F, 23F, -5.5F);

		gunModel[50].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(189F, 23F, -5.5F);

		gunModel[51].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(192F, 23F, -5.5F);

		gunModel[52].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(195F, 23F, -5.5F);

		gunModel[53].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(198F, 23F, -5.5F);

		gunModel[54].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(201F, 23F, -5.5F);

		gunModel[55].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(204F, 23F, -5.5F);

		gunModel[56].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(207F, 23F, -5.5F);

		gunModel[57].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(210F, 23F, -5.5F);

		gunModel[58].addBox(0F, -17F, 0F, 130, 8, 15, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(86F, 6F, -7.5F);

		gunModel[59].addBox(0F, -17F, 0F, 127, 4, 9, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(86F, 14F, -4.5F);

		gunModel[60].addBox(0F, -17F, 0F, 185, 6, 13, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(30F, 0F, -6.5F);

		gunModel[61].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[61].setRotationPoint(87F, 15F, -5.5F);

		gunModel[62].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[62].setRotationPoint(90F, 15F, -5.5F);

		gunModel[63].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(93F, 15F, -5.5F);

		gunModel[64].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(96F, 15F, -5.5F);

		gunModel[65].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(99F, 15F, -5.5F);

		gunModel[66].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[66].setRotationPoint(102F, 15F, -5.5F);

		gunModel[67].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[67].setRotationPoint(105F, 15F, -5.5F);

		gunModel[68].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[68].setRotationPoint(108F, 15F, -5.5F);

		gunModel[69].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[69].setRotationPoint(111F, 15F, -5.5F);

		gunModel[70].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[70].setRotationPoint(114F, 15F, -5.5F);

		gunModel[71].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[71].setRotationPoint(117F, 15F, -5.5F);

		gunModel[72].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[72].setRotationPoint(120F, 15F, -5.5F);

		gunModel[73].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[73].setRotationPoint(123F, 15F, -5.5F);

		gunModel[74].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[74].setRotationPoint(126F, 15F, -5.5F);

		gunModel[75].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[75].setRotationPoint(129F, 15F, -5.5F);

		gunModel[76].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[76].setRotationPoint(132F, 15F, -5.5F);

		gunModel[77].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[77].setRotationPoint(135F, 15F, -5.5F);

		gunModel[78].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[78].setRotationPoint(138F, 15F, -5.5F);

		gunModel[79].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[79].setRotationPoint(141F, 15F, -5.5F);

		gunModel[80].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[80].setRotationPoint(144F, 15F, -5.5F);

		gunModel[81].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[81].setRotationPoint(147F, 15F, -5.5F);

		gunModel[82].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[82].setRotationPoint(150F, 15F, -5.5F);

		gunModel[83].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[83].setRotationPoint(153F, 15F, -5.5F);

		gunModel[84].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[84].setRotationPoint(156F, 15F, -5.5F);

		gunModel[85].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[85].setRotationPoint(159F, 15F, -5.5F);

		gunModel[86].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[86].setRotationPoint(162F, 15F, -5.5F);

		gunModel[87].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[87].setRotationPoint(165F, 15F, -5.5F);

		gunModel[88].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[88].setRotationPoint(168F, 15F, -5.5F);

		gunModel[89].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[89].setRotationPoint(171F, 15F, -5.5F);

		gunModel[90].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[90].setRotationPoint(174F, 15F, -5.5F);

		gunModel[91].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[91].setRotationPoint(177F, 15F, -5.5F);

		gunModel[92].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[92].setRotationPoint(180F, 15F, -5.5F);

		gunModel[93].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[93].setRotationPoint(183F, 15F, -5.5F);

		gunModel[94].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[94].setRotationPoint(186F, 15F, -5.5F);

		gunModel[95].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[95].setRotationPoint(189F, 15F, -5.5F);

		gunModel[96].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[96].setRotationPoint(192F, 15F, -5.5F);

		gunModel[97].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[97].setRotationPoint(195F, 15F, -5.5F);

		gunModel[98].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[98].setRotationPoint(198F, 15F, -5.5F);

		gunModel[99].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[99].setRotationPoint(201F, 15F, -5.5F);

		gunModel[100].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[100].setRotationPoint(204F, 15F, -5.5F);

		gunModel[101].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[101].setRotationPoint(207F, 15F, -5.5F);

		gunModel[102].addBox(0F, -17F, 0F, 2, 2, 11, 0F); // Import ImportBox0
		gunModel[102].setRotationPoint(210F, 15F, -5.5F);

		gunModel[103].addBox(0F, -17F, 0F, 20, 8, 11, 0F); // Import ImportBox0
		gunModel[103].setRotationPoint(118F, -8F, -5.5F);

		gunModel[104].addBox(0F, -17F, 0F, 60, 4, 3, 0F); // Import ImportBox0
		gunModel[104].setRotationPoint(68F, -7F, -1.5F);

		gunModel[105].addBox(0F, -17F, 0F, 38, 8, 10, 0F); // Import ImportBox0
		gunModel[105].setRotationPoint(31F, -9F, -5F);

		gunModel[106].addBox(0F, -17F, 0F, 18, 8, 10, 0F); // Import ImportBox0
		gunModel[106].setRotationPoint(119F, -9F, -5F);

		gunModel[107].addBox(0F, -17F, 0F, 60, 4, 1, 0F); // Import ImportBox0
		gunModel[107].setRotationPoint(68F, -7.5F, -0.5F);

		gunModel[108].addBox(0F, -17F, 0F, 36, 6, 17, 0F); // Import ImportBox0
		gunModel[108].setRotationPoint(40F, 4F, -8.5F);

		gunModel[109].addBox(0F, -17F, 0F, 10, 40, 17, 0F); // Import ImportBox0
		gunModel[109].setRotationPoint(30F, 4F, -8.5F);

		gunModel[110].addBox(0F, -17F, 0F, 35, 5, 18, 0F); // Import ImportBox0
		gunModel[110].setRotationPoint(40.5F, 4.5F, -9F);

		gunModel[111].addBox(0F, -17F, 0F, 53, 2, 6, 0F); // Import ImportBox0
		gunModel[111].setRotationPoint(-30F, 37F, -3F);

		gunModel[112].addBox(0F, -17F, 0F, 6, 22, 4, 0F); // Import ImportBox0
		gunModel[112].setRotationPoint(-2F, 11F, -2F);
		gunModel[112].rotateAngleZ = -0.2443461F;

		gunModel[113].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import ImportBox0
		gunModel[113].setRotationPoint(139F, -6F, -3.5F);

		gunModel[114].addBox(0F, -17F, 0F, 29, 1, 6, 0F); // Import ImportBox0
		gunModel[114].setRotationPoint(139.5F, -7F, -3F);

		gunModel[115].addBox(0F, -17F, 0F, 29, 4, 1, 0F); // Import ImportBox0
		gunModel[115].setRotationPoint(139.5F, -5F, -4F);

		gunModel[116].addBox(0F, -17F, 0F, 29, 4, 1, 0F); // Import ImportBox0
		gunModel[116].setRotationPoint(139.5F, -5F, 3F);

		gunModel[117].addBox(0F, -17F, 0F, 2, 4, 4, 0F); // Import ImportBox0
		gunModel[117].setRotationPoint(168.5F, -5F, -2F);

		gunModel[118].addBox(0F, -17F, 0F, 1, 2, 2, 0F); // Import ImportBox0
		gunModel[118].setRotationPoint(169.75F, -4F, -1F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 29, 26, 26, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(43.5F, 13F, -12.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 2, 24, 24, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(41.5F, 14F, -11.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 2, 24, 24, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(72.5F, 14F, -11.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 27, 2, 22, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(44.5F, 11F, -10.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 27, 2, 22, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(44.5F, 39F, -10.5F);



		barrelAttachPoint = new Vector3f(216F /16F, 7F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(128 /16F, -18F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}