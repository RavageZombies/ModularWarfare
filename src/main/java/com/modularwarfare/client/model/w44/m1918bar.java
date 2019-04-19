//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.05.2017 - 10:47:30
// Last changed on: 19.05.2017 - 10:47:30

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1918bar extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public m1918bar() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[112];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 55
		gunModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 56
		gunModel[51] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 57
		gunModel[52] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 58
		gunModel[53] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 59
		gunModel[54] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 60
		gunModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 61
		gunModel[56] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 62
		gunModel[57] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 63
		gunModel[58] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 64
		gunModel[59] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 65
		gunModel[60] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 66
		gunModel[61] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 67
		gunModel[62] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 68
		gunModel[63] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 69
		gunModel[64] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 70
		gunModel[65] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 71
		gunModel[66] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 72
		gunModel[67] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 73
		gunModel[68] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 74
		gunModel[69] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 75
		gunModel[70] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 76
		gunModel[71] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 77
		gunModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 84
		gunModel[73] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 85
		gunModel[74] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 86
		gunModel[75] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 87
		gunModel[76] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 88
		gunModel[77] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 87
		gunModel[78] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 88
		gunModel[79] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 89
		gunModel[80] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 90
		gunModel[81] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 91
		gunModel[82] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 99
		gunModel[83] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 100
		gunModel[84] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 103
		gunModel[85] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 104
		gunModel[86] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 105
		gunModel[87] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 106
		gunModel[88] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 107
		gunModel[89] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 108
		gunModel[90] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 109
		gunModel[91] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 110
		gunModel[92] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 111
		gunModel[93] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 112
		gunModel[94] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 113
		gunModel[95] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 114
		gunModel[96] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 115
		gunModel[97] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 116
		gunModel[98] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 117
		gunModel[99] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 118
		gunModel[100] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 119
		gunModel[101] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 120
		gunModel[102] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 121
		gunModel[103] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 122
		gunModel[104] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 123
		gunModel[105] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 124
		gunModel[106] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 127
		gunModel[107] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 128
		gunModel[108] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 129
		gunModel[109] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 130
		gunModel[110] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 131
		gunModel[111] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 132

		gunModel[0].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-2F, -13F, -1.5F);

		gunModel[1].addShapeBox(13F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, -0.21F, -1F, 0F, -0.21F, -1F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F); // Box 1
		gunModel[1].setRotationPoint(-1F, -14F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-4F, -13F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-7F, -11F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 4
		gunModel[4].setRotationPoint(21F, -13F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 5
		gunModel[5].setRotationPoint(41F, -10.5F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(21F, -11.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 7
		gunModel[7].setRotationPoint(21F, -6.5F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		gunModel[8].setRotationPoint(21F, -11.5F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		gunModel[9].setRotationPoint(21F, -7.5F, 1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 11
		gunModel[10].setRotationPoint(38F, -9.5F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[11].setRotationPoint(21F, -11.5F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(21F, -7.5F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 54, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 16
		gunModel[13].setRotationPoint(21F, -13F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[14].setRotationPoint(-30F, -9F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, -0.8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, -2F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2F, -0.5F, 0F); // Box 18
		gunModel[15].setRotationPoint(-30F, -3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.8F, -3F, 0F); // Box 19
		gunModel[16].setRotationPoint(-30F, -3F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[17].setRotationPoint(-14F, -9.5F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		gunModel[18].setRotationPoint(-11F, -10.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[19].setRotationPoint(-9F, -10.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[20].setRotationPoint(-7F, -6F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, -0.8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, -2F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2F, -1.5F, 0F); // Box 24
		gunModel[21].setRotationPoint(-30F, -3F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.8F, -3F, 0F); // Box 25
		gunModel[22].setRotationPoint(-30F, -3F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[23].setRotationPoint(-30F, -9F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[24].setRotationPoint(-14F, -9.5F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 28
		gunModel[25].setRotationPoint(-11F, -10.5F, 0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 29
		gunModel[26].setRotationPoint(-9F, -10.5F, 0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F); // Box 30
		gunModel[27].setRotationPoint(-7F, -6F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, -0.8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, -2F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2F, -0.5F, 0F); // Box 31
		gunModel[28].setRotationPoint(-30F, -3F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.8F, -3F, 0F); // Box 32
		gunModel[29].setRotationPoint(-30F, -3F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[30].setRotationPoint(-30F, -9F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[31].setRotationPoint(-14F, -9.5F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 35
		gunModel[32].setRotationPoint(-11F, -10.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[33].setRotationPoint(-9F, -10.5F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[34].setRotationPoint(-7F, -6F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F); // Box 38
		gunModel[35].setRotationPoint(-29.25F, -10F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 1F, -0.5F, -0.2F); // Box 39
		gunModel[36].setRotationPoint(8F, -14.5F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 40
		gunModel[37].setRotationPoint(62.5F, -11.5F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 41
		gunModel[38].setRotationPoint(64.5F, -10.5F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 42
		gunModel[39].setRotationPoint(65.5F, -10.5F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 43
		gunModel[40].setRotationPoint(66F, -10.5F, -1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 44
		gunModel[41].setRotationPoint(57.3F, -10.75F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[42].setRotationPoint(-1F, -10.5F, 0.75F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 46
		gunModel[43].setRotationPoint(-1F, -11.25F, 0.75F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 47
		gunModel[44].setRotationPoint(-1F, -9.75F, 0.75F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 48
		gunModel[45].setRotationPoint(-1.75F, -15F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		gunModel[46].setRotationPoint(-1.75F, -15F, 0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.8F, -0.5F, 0F); // Box 50
		gunModel[47].setRotationPoint(8F, -14.5F, -1.5F);

		gunModel[48].addShapeBox(13F, 0F, 0F, 9, 1, 3, 0F, 0F, -0.2F, -0.01F, -1F, -0.2F, -0.01F, -1F, -0.2F, -0.01F, 0F, -0.2F, -0.01F, 0F, 0F, -0.01F, -0.2F, 0F, -0.01F, -0.2F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 51
		gunModel[48].setRotationPoint(-1F, -14F, -1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[49].setRotationPoint(9.5F, -6F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56
		gunModel[50].setRotationPoint(6.5F, -7F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[51].setRotationPoint(1.5F, -4.5F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[52].setRotationPoint(-3.5F, -7.5F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F); // Box 59
		gunModel[53].setRotationPoint(5.5F, -6.38F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 60
		gunModel[54].setRotationPoint(5.5F, -5.35F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 61
		gunModel[55].setRotationPoint(11F, -5.5F, -1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 62
		gunModel[56].setRotationPoint(1.5F, -5.35F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 63
		gunModel[57].setRotationPoint(1.5F, -6.38F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 64
		gunModel[58].setRotationPoint(0.5F, -6.5F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F); // Box 65
		gunModel[59].setRotationPoint(33F, -13F, -1F);

		gunModel[60].addShapeBox(0.5F, -8F, -0.5F, 2, 5, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 66
		gunModel[60].setRotationPoint(33F, -12F, 0F);
		gunModel[60].rotateAngleX = 0.78539816F;

		gunModel[61].addShapeBox(0.5F, -2.75F, -0.5F, 3, 2, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 67
		gunModel[61].setRotationPoint(33F, -12F, 0F);
		gunModel[61].rotateAngleX = 0.78539816F;

		gunModel[62].addShapeBox(-8.5F, -8.5F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[62].setRotationPoint(33F, -12F, 0F);
		gunModel[62].rotateAngleX = 0.78539816F;

		gunModel[63].addShapeBox(-0.5F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 69
		gunModel[63].setRotationPoint(33F, -12F, 0F);
		gunModel[63].rotateAngleX = 0.78539816F;

		gunModel[64].addShapeBox(-1F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 70
		gunModel[64].setRotationPoint(33F, -12F, 0F);
		gunModel[64].rotateAngleX = 0.78539816F;

		gunModel[65].addShapeBox(0F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 71
		gunModel[65].setRotationPoint(33F, -12F, 0F);
		gunModel[65].rotateAngleX = 0.78539816F;

		gunModel[66].addShapeBox(-9F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 72
		gunModel[66].setRotationPoint(33F, -12F, 0F);
		gunModel[66].rotateAngleX = 0.78539816F;

		gunModel[67].addShapeBox(-9.5F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 73
		gunModel[67].setRotationPoint(33F, -12F, 0F);
		gunModel[67].rotateAngleX = 0.78539816F;

		gunModel[68].addShapeBox(-10F, -8.5F, -1F, 1, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 74
		gunModel[68].setRotationPoint(33F, -12F, 0F);
		gunModel[68].rotateAngleX = 0.78539816F;

		gunModel[69].addShapeBox(0.75F, -2.75F, -0.5F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 75
		gunModel[69].setRotationPoint(33F, -12F, 0F);
		gunModel[69].rotateAngleX = 0.78539816F;

		gunModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 76
		gunModel[70].setRotationPoint(75F, -13F, -1F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 1.4F, 0F, 0.4F, 1.4F, 0F, 0.4F, 1.4F, 0F, 0.4F, 1.4F); // Box 77
		gunModel[71].setRotationPoint(78F, -13F, -1F);

		gunModel[72].addShapeBox(0F, -0.25F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 84
		gunModel[72].setRotationPoint(3F, -6.5F, -0.5F);
		gunModel[72].rotateAngleZ = 0.19198622F;

		gunModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[73].setRotationPoint(78F, -9.65F, -2.4F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[74].setRotationPoint(78F, -9.65F, 0.4F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 87
		gunModel[75].setRotationPoint(79F, -10F, 0.4F);
		gunModel[75].rotateAngleX = 0.03490659F;
		gunModel[75].rotateAngleZ = -1.55334303F;

		gunModel[76].addShapeBox(-2.5F, 23F, 0F, 5, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 88
		gunModel[76].setRotationPoint(79F, -10F, 0F);
		gunModel[76].rotateAngleX = 0.03490659F;
		gunModel[76].rotateAngleZ = -1.55334303F;

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 87
		gunModel[77].setRotationPoint(79F, -10F, -2.4F);
		gunModel[77].rotateAngleX = -0.03490659F;
		gunModel[77].rotateAngleZ = -1.55334303F;

		gunModel[78].addShapeBox(-2.5F, 23F, 0F, 5, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 88
		gunModel[78].setRotationPoint(79F, -10F, -3F);
		gunModel[78].rotateAngleX = -0.03490659F;
		gunModel[78].rotateAngleZ = -1.55334303F;

		gunModel[79].addShapeBox(0F, -1F, 0F, 2, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		gunModel[79].setRotationPoint(79F, -10F, -2.4F);
		gunModel[79].rotateAngleX = -0.03490659F;
		gunModel[79].rotateAngleZ = -1.55334303F;

		gunModel[80].addShapeBox(0F, -1F, 0F, 2, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 90
		gunModel[80].setRotationPoint(79F, -10F, 0.4F);
		gunModel[80].rotateAngleX = 0.03490659F;
		gunModel[80].rotateAngleZ = -1.55334303F;

		gunModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 91
		gunModel[81].setRotationPoint(82F, -13F, -1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 99
		gunModel[82].setRotationPoint(45F, -10.5F, -1F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 100
		gunModel[83].setRotationPoint(45F, -8.35F, -1.9F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 103
		gunModel[84].setRotationPoint(45F, -7.55F, -1.9F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 104
		gunModel[85].setRotationPoint(45F, -8.35F, 0.9F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 105
		gunModel[86].setRotationPoint(45F, -7.55F, 0.9F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 106
		gunModel[87].setRotationPoint(45F, -6.9F, -1.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 107
		gunModel[88].setRotationPoint(45F, -9F, -1.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 108
		gunModel[89].setRotationPoint(-15F, -2.35F, 0.9F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 109
		gunModel[90].setRotationPoint(-15F, -1.55F, 0.9F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 110
		gunModel[91].setRotationPoint(-15F, -0.9F, -1.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 111
		gunModel[92].setRotationPoint(-15F, -1.55F, -1.9F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 112
		gunModel[93].setRotationPoint(-15F, -2.35F, -1.9F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 113
		gunModel[94].setRotationPoint(-15F, -3F, -1.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[95].setRotationPoint(-30.25F, -8F, -1F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
		gunModel[96].setRotationPoint(-30.25F, -3F, -1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116
		gunModel[97].setRotationPoint(38F, -8.5F, 1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		gunModel[98].setRotationPoint(21F, -8.5F, 1F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		gunModel[99].setRotationPoint(21F, -9.5F, 1F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 119
		gunModel[100].setRotationPoint(38F, -9.5F, -2F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[101].setRotationPoint(38F, -8.5F, -2F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[102].setRotationPoint(21F, -8.5F, -2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[103].setRotationPoint(21F, -9.5F, -2F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 123
		gunModel[104].setRotationPoint(39.5F, -9F, -2F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 124
		gunModel[105].setRotationPoint(23.5F, -9F, -2F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[106].setRotationPoint(-2F, -9F, -1.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[107].setRotationPoint(-2F, -11F, -1.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[108].setRotationPoint(18F, -11F, -1.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[109].setRotationPoint(11F, -11F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[110].setRotationPoint(11F, -11F, -1.35F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[111].setRotationPoint(13.5F, -10.5F, -1.6F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 78
		defaultScopeModel[1] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 83
		defaultScopeModel[2] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 92
		defaultScopeModel[3] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 93
		defaultScopeModel[4] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 94
		defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 95
		defaultScopeModel[6] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 96
		defaultScopeModel[7] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 97
		defaultScopeModel[8] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 98
		defaultScopeModel[9] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 133

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, 0.15F); // Box 78
		defaultScopeModel[0].setRotationPoint(75.75F, -14.75F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F); // Box 83
		defaultScopeModel[1].setRotationPoint(75.75F, -16F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		defaultScopeModel[2].setRotationPoint(-0.75F, -14F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 93
		defaultScopeModel[3].setRotationPoint(-0.75F, -17F, -0.1F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 94
		defaultScopeModel[4].setRotationPoint(-0.75F, -17F, -0.9F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		defaultScopeModel[5].setRotationPoint(-0.75F, -18F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 96
		defaultScopeModel[6].setRotationPoint(-0.75F, -16F, 0F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 97
		defaultScopeModel[7].setRotationPoint(-0.75F, -16F, -1F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 98
		defaultScopeModel[8].setRotationPoint(-0.75F, -16F, -0.5F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F, -0.1F, 0.15F, 0.5F); // Box 133
		defaultScopeModel[9].setRotationPoint(75.75F, -13.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 52

		ammoModel[0].addShapeBox(0F, 0F, 0F, 9, 10, 3, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 0F, -0.25F); // Box 52
		ammoModel[0].setRotationPoint(10.25F, -7.5F, -1.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 125
		slideModel[1] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 126

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 125
		slideModel[0].setRotationPoint(9F, -10.5F, 1.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F); // Box 126
		slideModel[1].setRotationPoint(9F, -10.5F, 1.75F);


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -9.5F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .5F;
	    reloadAnimation = WeaponAnimations.RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.280F, -0.65F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.050F, -0.72F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.58F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
	    rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
	    rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
	    leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

	    leftHandAmmo = true;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.35F;
		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);
		
	    chargeHandleDistance = 0.9F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}