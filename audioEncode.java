// This file is automatically generated. Do not edit.
class audioEncode {
	static public double u2d(byte u) {
		return (mulaw2linear[0xff & (int)u]);
	}
static final double[] mulaw2linear = {
	-32124.0, -31100.0, -30076.0, -29052.0, -28028.0, -27004.0,	// 0 - 5
	-25980.0, -24956.0, -23932.0, -22908.0, -21884.0, -20860.0,	// 6 - 11
	-19836.0, -18812.0, -17788.0, -16764.0, -15996.0, -15484.0,	// 12 - 17
	-14972.0, -14460.0, -13948.0, -13436.0, -12924.0, -12412.0,	// 18 - 23
	-11900.0, -11388.0, -10876.0, -10364.0, -9852.0, -9340.0,	// 24 - 29
	-8828.0, -8316.0, -7932.0, -7676.0, -7420.0, -7164.0,	// 30 - 35
	-6908.0, -6652.0, -6396.0, -6140.0, -5884.0, -5628.0,	// 36 - 41
	-5372.0, -5116.0, -4860.0, -4604.0, -4348.0, -4092.0,	// 42 - 47
	-3900.0, -3772.0, -3644.0, -3516.0, -3388.0, -3260.0,	// 48 - 53
	-3132.0, -3004.0, -2876.0, -2748.0, -2620.0, -2492.0,	// 54 - 59
	-2364.0, -2236.0, -2108.0, -1980.0, -1884.0, -1820.0,	// 60 - 65
	-1756.0, -1692.0, -1628.0, -1564.0, -1500.0, -1436.0,	// 66 - 71
	-1372.0, -1308.0, -1244.0, -1180.0, -1116.0, -1052.0,	// 72 - 77
	-988.0, -924.0, -876.0, -844.0, -812.0, -780.0,	// 78 - 83
	-748.0, -716.0, -684.0, -652.0, -620.0, -588.0,	// 84 - 89
	-556.0, -524.0, -492.0, -460.0, -428.0, -396.0,	// 90 - 95
	-372.0, -356.0, -340.0, -324.0, -308.0, -292.0,	// 96 - 101
	-276.0, -260.0, -244.0, -228.0, -212.0, -196.0,	// 102 - 107
	-180.0, -164.0, -148.0, -132.0, -120.0, -112.0,	// 108 - 113
	-104.0, -96.0, -88.0, -80.0, -72.0, -64.0,	// 114 - 119
	-56.0, -48.0, -40.0, -32.0, -24.0, -16.0,	// 120 - 125
	-8.0, 0.0, 32124.0, 31100.0, 30076.0, 29052.0,	// 126 - 131
	28028.0, 27004.0, 25980.0, 24956.0, 23932.0, 22908.0,	// 132 - 137
	21884.0, 20860.0, 19836.0, 18812.0, 17788.0, 16764.0,	// 138 - 143
	15996.0, 15484.0, 14972.0, 14460.0, 13948.0, 13436.0,	// 144 - 149
	12924.0, 12412.0, 11900.0, 11388.0, 10876.0, 10364.0,	// 150 - 155
	9852.0, 9340.0, 8828.0, 8316.0, 7932.0, 7676.0,	// 156 - 161
	7420.0, 7164.0, 6908.0, 6652.0, 6396.0, 6140.0,	// 162 - 167
	5884.0, 5628.0, 5372.0, 5116.0, 4860.0, 4604.0,	// 168 - 173
	4348.0, 4092.0, 3900.0, 3772.0, 3644.0, 3516.0,	// 174 - 179
	3388.0, 3260.0, 3132.0, 3004.0, 2876.0, 2748.0,	// 180 - 185
	2620.0, 2492.0, 2364.0, 2236.0, 2108.0, 1980.0,	// 186 - 191
	1884.0, 1820.0, 1756.0, 1692.0, 1628.0, 1564.0,	// 192 - 197
	1500.0, 1436.0, 1372.0, 1308.0, 1244.0, 1180.0,	// 198 - 203
	1116.0, 1052.0, 988.0, 924.0, 876.0, 844.0,	// 204 - 209
	812.0, 780.0, 748.0, 716.0, 684.0, 652.0,	// 210 - 215
	620.0, 588.0, 556.0, 524.0, 492.0, 460.0,	// 216 - 221
	428.0, 396.0, 372.0, 356.0, 340.0, 324.0,	// 222 - 227
	308.0, 292.0, 276.0, 260.0, 244.0, 228.0,	// 228 - 233
	212.0, 196.0, 180.0, 164.0, 148.0, 132.0,	// 234 - 239
	120.0, 112.0, 104.0, 96.0, 88.0, 80.0,	// 240 - 245
	72.0, 64.0, 56.0, 48.0, 40.0, 32.0,	// 246 - 251
	24.0, 16.0, 8.0, 0.0 
};
}