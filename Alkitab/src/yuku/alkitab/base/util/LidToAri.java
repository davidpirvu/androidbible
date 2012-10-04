package yuku.alkitab.base.util;

import java.util.Arrays;

public class LidToAri {
	public static final String TAG = LidToAri.class.getSimpleName();
	
	/**
	 * lid for the verse 1 of each book-chapter.
	 * 
	 * 1 -> 0:1:1
	 * 32 -> 0:2:1
	 * 57 -> 0:3:1
	 * 31082 -> 65:22:1
	 * 31102 -> 65:22:21
	 */
	static int[] lids = {1, 32, 57, 81, 107, 139, 161, 185, 207, 236, 268, 300, 320, 338, 362, 383, 399, 426, 459, 497, 515, 549, 573, 593, 660, 694, 729, 775, 797, 832, 875, 930, 962, 982, 1013, 1042, 1085, 1121, 1151, 1174, 1197, 1254, 1292, 1326, 1360, 1388, 1422, 1453, 1475, 1508, 1534, 1556, 1581, 1603, 1634, 1657, 1687, 1712, 1744, 1779, 1808, 1818, 1869, 1891, 1922, 1949, 1985, 2001, 2028, 2053, 2079, 2115, 2146, 2179, 2197, 2237, 2274, 2295, 2338, 2384, 2422, 2440, 2475, 2498, 2533, 2568, 2606, 2635, 2666, 2709, 2747, 2764, 2780, 2797, 2832, 2851, 2881, 2919, 2955, 2979, 2999, 3046, 3054, 3113, 3170, 3203, 3237, 3253, 3283, 3320, 3347, 3371, 3404, 3448, 3471, 3526, 3572, 3606, 3660, 3694, 3745, 3794, 3825, 3852, 3941, 3967, 3990, 4026, 4061, 4077, 4110, 4155, 4196, 4246, 4259, 4291, 4313, 4342, 4377, 4418, 4448, 4473, 4491, 4556, 4579, 4610, 4650, 4666, 4720, 4762, 4818, 4847, 4881, 4894, 4940, 4977, 5006, 5055, 5088, 5113, 5139, 5159, 5188, 5210, 5242, 5274, 5292, 5321, 5344, 5366, 5386, 5408, 5429, 5449, 5472, 5502, 5527, 5549, 5568, 5587, 5613, 5681, 5710, 5730, 5760, 5812, 5841, 5853, 5871, 5895, 5912, 5936, 5951, 5978, 6004, 6039, 6066, 6109, 6132, 6156, 6189, 6204, 6267, 6277, 6295, 6323, 6374, 6383, 6428, 6462, 6478, 6511, 6547, 6570, 6601, 6625, 6656, 6696, 6721, 6756, 6813, 6831, 6871, 6886, 6911, 6931, 6951, 6982, 6995, 7026, 7056, 7104, 7129, 7151, 7174, 7192, 7214, 7242, 7278, 7299, 7321, 7333, 7354, 7371, 7393, 7420, 7447, 7462, 7487, 7510, 7562, 7597, 7620, 7678, 7708, 7732, 7774, 7789, 7812, 7841, 7863, 7907, 7932, 7944, 7969, 7980, 8011, 8024, 8051, 8083, 8122, 8134, 8159, 8182, 8211, 8229, 8242, 8261, 8288, 8319, 8358, 8391, 8428, 8451, 8480, 8513, 8556, 8582, 8604, 8655, 8694, 8719, 8772, 8818, 8846, 8880, 8898, 8936, 8987, 9053, 9081, 9110, 9153, 9186, 9220, 9251, 9285, 9319, 9343, 9389, 9410, 9453, 9482, 9535, 9553, 9578, 9605, 9649, 9676, 9709, 9729, 9758, 9795, 9831, 9852, 9873, 9898, 9927, 9965, 9985, 10026, 10063, 10100, 10121, 10147, 10167, 10204, 10224, 10254, 10308, 10363, 10387, 10430, 10456, 10537, 10577, 10617, 10661, 10675, 10722, 10762, 10776, 10793, 10822, 10865, 10892, 10909, 10928, 10936, 10966, 10985, 11017, 11048, 11079, 11111, 11145, 11166, 11196, 11213, 11231, 11248, 11270, 11284, 11326, 11348, 11366, 11397, 11416, 11439, 11455, 11477, 11492, 11511, 11525, 11544, 11578, 11589, 11626, 11646, 11658, 11679, 11706, 11734, 11757, 11766, 11793, 11829, 11856, 11877, 11910, 11935, 11968, 11995, 12018, 12029, 12099, 12112, 12136, 12153, 12175, 12203, 12239, 12254, 12298, 12309, 12329, 12361, 12384, 12403, 12422, 12495, 12513, 12551, 12590, 12626, 12673, 12704, 12726, 12749, 12764, 12781, 12795, 12809, 12819, 12836, 12868, 12871, 12893, 12906, 12932, 12953, 12980, 13010, 13031, 13053, 13088, 13110, 13130, 13155, 13183, 13205, 13240, 13262, 13278, 13299, 13328, 13357, 13391, 13421, 13438, 13463, 13469, 13483, 13506, 13534, 13559, 13590, 13630, 13652, 13685, 13722, 13738, 13771, 13795, 13836, 13866, 13890, 13924, 13941, 13947, 13959, 13967, 13975, 13987, 13997, 14014, 14023, 14043, 14061, 14068, 14076, 14082, 14089, 14094, 14105, 14120, 14170, 14184, 14193, 14206, 14237, 14243, 14253, 14275, 14287, 14301, 14310, 14321, 14333, 14357, 14368, 14390, 14412, 14440, 14452, 14492, 14514, 14527, 14544, 14557, 14568, 14573, 14599, 14616, 14627, 14636, 14650, 14670, 14693, 14712, 14721, 14727, 14734, 14757, 14770, 14781, 14792, 14809, 14821, 14829, 14841, 14852, 14862, 14875, 14895, 14902, 14937, 14973, 14978, 15002, 15022, 15050, 15073, 15083, 15095, 15115, 15187, 15200, 15219, 15235, 15243, 15261, 15273, 15286, 15303, 15310, 15328, 15380, 15397, 15413, 15428, 15433, 15456, 15467, 15480, 15492, 15501, 15510, 15515, 15523, 15551, 15573, 15608, 15653, 15701, 15744, 15757, 15788, 15795, 15805, 15815, 15824, 15832, 15850, 15869, 15871, 15900, 16076, 16083, 16091, 16100, 16104, 16112, 16117, 16123, 16128, 16134, 16142, 16150, 16153, 16171, 16174, 16177, 16198, 16224, 16233, 16241, 16265, 16278, 16288, 16295, 16307, 16322, 16343, 16353, 16373, 16387, 16396, 16402, 16435, 16457, 16492, 16519, 16542, 16577, 16604, 16640, 16658, 16690, 16721, 16749, 16774, 16809, 16842, 16875, 16903, 16927, 16956, 16986, 17017, 17046, 17081, 17115, 17143, 17171, 17198, 17226, 17253, 17286, 17317, 17335, 17361, 17383, 17399, 17419, 17431, 17460, 17477, 17495, 17515, 17525, 17539, 17556, 17573, 17584, 17600, 17616, 17629, 17642, 17656, 17687, 17709, 17735, 17741, 17771, 17784, 17809, 17831, 17852, 17886, 17902, 17908, 17930, 17962, 17971, 17985, 17999, 18006, 18031, 18037, 18054, 18079, 18097, 18120, 18132, 18153, 18166, 18195, 18219, 18252, 18261, 18281, 18305, 18322, 18332, 18354, 18392, 18414, 18422, 18453, 18482, 18507, 18535, 18563, 18588, 18601, 18616, 18638, 18664, 18675, 18698, 18713, 18725, 18742, 18755, 18767, 18788, 18802, 18823, 18845, 18856, 18868, 18887, 18899, 18924, 18948, 18967, 19004, 19029, 19060, 19091, 19121, 19155, 19177, 19203, 19228, 19251, 19268, 19295, 19317, 19338, 19359, 19386, 19409, 19424, 19442, 19456, 19486, 19526, 19536, 19574, 19598, 19620, 19637, 19669, 19693, 19733, 19777, 19803, 19825, 19844, 19876, 19897, 19925, 19943, 19959, 19977, 19999, 20012, 20042, 20047, 20075, 20082, 20129, 20168, 20214, 20278, 20312, 20334, 20356, 20422, 20444, 20466, 20494, 20504, 20531, 20548, 20565, 20579, 20606, 20624, 20635, 20657, 20682, 20710, 20733, 20756, 20764, 20827, 20851, 20883, 20897, 20946, 20978, 21009, 21058, 21085, 21102, 21123, 21159, 21185, 21206, 21232, 21250, 21282, 21315, 21346, 21361, 21399, 21427, 21450, 21479, 21528, 21554, 21574, 21601, 21632, 21657, 21681, 21704, 21739, 21760, 21809, 21839, 21876, 21907, 21935, 21963, 21990, 22017, 22038, 22083, 22096, 22107, 22130, 22135, 22154, 22169, 22180, 22196, 22210, 22227, 22242, 22254, 22268, 22284, 22293, 22313, 22345, 22366, 22381, 22397, 22412, 22425, 22452, 22466, 22483, 22497, 22512, 22533, 22550, 22560, 22570, 22581, 22597, 22610, 22622, 22635, 22650, 22666, 22686, 22701, 22714, 22733, 22750, 22770, 22789, 22807, 22822, 22842, 22857, 22880, 22901, 22914, 22924, 22938, 22949, 22964, 22978, 23001, 23018, 23030, 23047, 23061, 23070, 23091, 23105, 23122, 23140, 23146, 23171, 23194, 23211, 23236, 23284, 23318, 23347, 23381, 23419, 23461, 23491, 23541, 23599, 23635, 23674, 23702, 23729, 23764, 23794, 23828, 23874, 23920, 23959, 24010, 24056, 24131, 24197, 24217, 24262, 24290, 24325, 24366, 24409, 24465, 24502, 24540, 24590, 24642, 24675, 24719, 24756, 24828, 24875, 24895, 24975, 25027, 25065, 25109, 25148, 25197, 25247, 25303, 25365, 25407, 25461, 25520, 25555, 25590, 25622, 25653, 25690, 25733, 25781, 25828, 25866, 25937, 25993, 26046, 26097, 26122, 26158, 26212, 26259, 26330, 26383, 26442, 26483, 26525, 26582, 26632, 26670, 26701, 26728, 26761, 26787, 26827, 26869, 26900, 26925, 26951, 26998, 27024, 27061, 27103, 27118, 27178, 27218, 27261, 27309, 27339, 27364, 27416, 27444, 27485, 27525, 27559, 27587, 27628, 27666, 27706, 27736, 27771, 27798, 27825, 27857, 27901, 27932, 27964, 27993, 28024, 28049, 28070, 28093, 28118, 28157, 28190, 28211, 28247, 28268, 28282, 28305, 28338, 28365, 28396, 28412, 28435, 28456, 28469, 28489, 28529, 28542, 28569, 28602, 28636, 28667, 28680, 28720, 28778, 28802, 28826, 28843, 28861, 28879, 28900, 28918, 28934, 28958, 28973, 28991, 29024, 29045, 29059, 29083, 29104, 29133, 29164, 29190, 29208, 29231, 29253, 29274, 29306, 29339, 29363, 29393, 29423, 29444, 29467, 29496, 29519, 29544, 29562, 29572, 29592, 29605, 29623, 29651, 29663, 29680, 29698, 29718, 29733, 29749, 29765, 29790, 29811, 29829, 29855, 29872, 29894, 29910, 29925, 29940, 29965, 29979, 29997, 30016, 30032, 30046, 30066, 30094, 30107, 30135, 30174, 30214, 30243, 30268, 30295, 30321, 30339, 30356, 30376, 30401, 30426, 30448, 30467, 30481, 30502, 30524, 30542, 30552, 30581, 30605, 30626, 30647, 30660, 30674, 30699, 30719, 30748, 30770, 30781, 30795, 30812, 30829, 30842, 30863, 30874, 30893, 30910, 30928, 30948, 30956, 30977, 30995, 31019, 31040, 31055, 31082};

	/**
	 * 0xbbcc
	 * bb is book_0
	 * cc is chapter_1
	 */
	static int[] bcs = {0x0001, 0x0002, 0x0003, 0x0004, 0x0005, 0x0006, 0x0007, 0x0008, 0x0009, 0x000a, 0x000b, 0x000c, 0x000d, 0x000e, 0x000f, 0x0010, 0x0011, 0x0012, 0x0013, 0x0014, 0x0015, 0x0016, 0x0017, 0x0018, 0x0019, 0x001a, 0x001b, 0x001c, 0x001d, 0x001e, 0x001f, 0x0020, 0x0021, 0x0022, 0x0023, 0x0024, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f, 0x0030, 0x0031, 0x0032, 0x0101, 0x0102, 0x0103, 0x0104, 0x0105, 0x0106, 0x0107, 0x0108, 0x0109, 0x010a, 0x010b, 0x010c, 0x010d, 0x010e, 0x010f, 0x0110, 0x0111, 0x0112, 0x0113, 0x0114, 0x0115, 0x0116, 0x0117, 0x0118, 0x0119, 0x011a, 0x011b, 0x011c, 0x011d, 0x011e, 0x011f, 0x0120, 0x0121, 0x0122, 0x0123, 0x0124, 0x0125, 0x0126, 0x0127, 0x0128, 0x0201, 0x0202, 0x0203, 0x0204, 0x0205, 0x0206, 0x0207, 0x0208, 0x0209, 0x020a, 0x020b, 0x020c, 0x020d, 0x020e, 0x020f, 0x0210, 0x0211, 0x0212, 0x0213, 0x0214, 0x0215, 0x0216, 0x0217, 0x0218, 0x0219, 0x021a, 0x021b, 0x0301, 0x0302, 0x0303, 0x0304, 0x0305, 0x0306, 0x0307, 0x0308, 0x0309, 0x030a, 0x030b, 0x030c, 0x030d, 0x030e, 0x030f, 0x0310, 0x0311, 0x0312, 0x0313, 0x0314, 0x0315, 0x0316, 0x0317, 0x0318, 0x0319, 0x031a, 0x031b, 0x031c, 0x031d, 0x031e, 0x031f, 0x0320, 0x0321, 0x0322, 0x0323, 0x0324, 0x0401, 0x0402, 0x0403, 0x0404, 0x0405, 0x0406, 0x0407, 0x0408, 0x0409, 0x040a, 0x040b, 0x040c, 0x040d, 0x040e, 0x040f, 0x0410, 0x0411, 0x0412, 0x0413, 0x0414, 0x0415, 0x0416, 0x0417, 0x0418, 0x0419, 0x041a, 0x041b, 0x041c, 0x041d, 0x041e, 0x041f, 0x0420, 0x0421, 0x0422, 0x0501, 0x0502, 0x0503, 0x0504, 0x0505, 0x0506, 0x0507, 0x0508, 0x0509, 0x050a, 0x050b, 0x050c, 0x050d, 0x050e, 0x050f, 0x0510, 0x0511, 0x0512, 0x0513, 0x0514, 0x0515, 0x0516, 0x0517, 0x0518, 0x0601, 0x0602, 0x0603, 0x0604, 0x0605, 0x0606, 0x0607, 0x0608, 0x0609, 0x060a, 0x060b, 0x060c, 0x060d, 0x060e, 0x060f, 0x0610, 0x0611, 0x0612, 0x0613, 0x0614, 0x0615, 0x0701, 0x0702, 0x0703, 0x0704, 0x0801, 0x0802, 0x0803, 0x0804, 0x0805, 0x0806, 0x0807, 0x0808, 0x0809, 0x080a, 0x080b, 0x080c, 0x080d, 0x080e, 0x080f, 0x0810, 0x0811, 0x0812, 0x0813, 0x0814, 0x0815, 0x0816, 0x0817, 0x0818, 0x0819, 0x081a, 0x081b, 0x081c, 0x081d, 0x081e, 0x081f, 0x0901, 0x0902, 0x0903, 0x0904, 0x0905, 0x0906, 0x0907, 0x0908, 0x0909, 0x090a, 0x090b, 0x090c, 0x090d, 0x090e, 0x090f, 0x0910, 0x0911, 0x0912, 0x0913, 0x0914, 0x0915, 0x0916, 0x0917, 0x0918, 0x0a01, 0x0a02, 0x0a03, 0x0a04, 0x0a05, 0x0a06, 0x0a07, 0x0a08, 0x0a09, 0x0a0a, 0x0a0b, 0x0a0c, 0x0a0d, 0x0a0e, 0x0a0f, 0x0a10, 0x0a11, 0x0a12, 0x0a13, 0x0a14, 0x0a15, 0x0a16, 0x0b01, 0x0b02, 0x0b03, 0x0b04, 0x0b05, 0x0b06, 0x0b07, 0x0b08, 0x0b09, 0x0b0a, 0x0b0b, 0x0b0c, 0x0b0d, 0x0b0e, 0x0b0f, 0x0b10, 0x0b11, 0x0b12, 0x0b13, 0x0b14, 0x0b15, 0x0b16, 0x0b17, 0x0b18, 0x0b19, 0x0c01, 0x0c02, 0x0c03, 0x0c04, 0x0c05, 0x0c06, 0x0c07, 0x0c08, 0x0c09, 0x0c0a, 0x0c0b, 0x0c0c, 0x0c0d, 0x0c0e, 0x0c0f, 0x0c10, 0x0c11, 0x0c12, 0x0c13, 0x0c14, 0x0c15, 0x0c16, 0x0c17, 0x0c18, 0x0c19, 0x0c1a, 0x0c1b, 0x0c1c, 0x0c1d, 0x0d01, 0x0d02, 0x0d03, 0x0d04, 0x0d05, 0x0d06, 0x0d07, 0x0d08, 0x0d09, 0x0d0a, 0x0d0b, 0x0d0c, 0x0d0d, 0x0d0e, 0x0d0f, 0x0d10, 0x0d11, 0x0d12, 0x0d13, 0x0d14, 0x0d15, 0x0d16, 0x0d17, 0x0d18, 0x0d19, 0x0d1a, 0x0d1b, 0x0d1c, 0x0d1d, 0x0d1e, 0x0d1f, 0x0d20, 0x0d21, 0x0d22, 0x0d23, 0x0d24, 0x0e01, 0x0e02, 0x0e03, 0x0e04, 0x0e05, 0x0e06, 0x0e07, 0x0e08, 0x0e09, 0x0e0a, 0x0f01, 0x0f02, 0x0f03, 0x0f04, 0x0f05, 0x0f06, 0x0f07, 0x0f08, 0x0f09, 0x0f0a, 0x0f0b, 0x0f0c, 0x0f0d, 0x1001, 0x1002, 0x1003, 0x1004, 0x1005, 0x1006, 0x1007, 0x1008, 0x1009, 0x100a, 0x1101, 0x1102, 0x1103, 0x1104, 0x1105, 0x1106, 0x1107, 0x1108, 0x1109, 0x110a, 0x110b, 0x110c, 0x110d, 0x110e, 0x110f, 0x1110, 0x1111, 0x1112, 0x1113, 0x1114, 0x1115, 0x1116, 0x1117, 0x1118, 0x1119, 0x111a, 0x111b, 0x111c, 0x111d, 0x111e, 0x111f, 0x1120, 0x1121, 0x1122, 0x1123, 0x1124, 0x1125, 0x1126, 0x1127, 0x1128, 0x1129, 0x112a, 0x1201, 0x1202, 0x1203, 0x1204, 0x1205, 0x1206, 0x1207, 0x1208, 0x1209, 0x120a, 0x120b, 0x120c, 0x120d, 0x120e, 0x120f, 0x1210, 0x1211, 0x1212, 0x1213, 0x1214, 0x1215, 0x1216, 0x1217, 0x1218, 0x1219, 0x121a, 0x121b, 0x121c, 0x121d, 0x121e, 0x121f, 0x1220, 0x1221, 0x1222, 0x1223, 0x1224, 0x1225, 0x1226, 0x1227, 0x1228, 0x1229, 0x122a, 0x122b, 0x122c, 0x122d, 0x122e, 0x122f, 0x1230, 0x1231, 0x1232, 0x1233, 0x1234, 0x1235, 0x1236, 0x1237, 0x1238, 0x1239, 0x123a, 0x123b, 0x123c, 0x123d, 0x123e, 0x123f, 0x1240, 0x1241, 0x1242, 0x1243, 0x1244, 0x1245, 0x1246, 0x1247, 0x1248, 0x1249, 0x124a, 0x124b, 0x124c, 0x124d, 0x124e, 0x124f, 0x1250, 0x1251, 0x1252, 0x1253, 0x1254, 0x1255, 0x1256, 0x1257, 0x1258, 0x1259, 0x125a, 0x125b, 0x125c, 0x125d, 0x125e, 0x125f, 0x1260, 0x1261, 0x1262, 0x1263, 0x1264, 0x1265, 0x1266, 0x1267, 0x1268, 0x1269, 0x126a, 0x126b, 0x126c, 0x126d, 0x126e, 0x126f, 0x1270, 0x1271, 0x1272, 0x1273, 0x1274, 0x1275, 0x1276, 0x1277, 0x1278, 0x1279, 0x127a, 0x127b, 0x127c, 0x127d, 0x127e, 0x127f, 0x1280, 0x1281, 0x1282, 0x1283, 0x1284, 0x1285, 0x1286, 0x1287, 0x1288, 0x1289, 0x128a, 0x128b, 0x128c, 0x128d, 0x128e, 0x128f, 0x1290, 0x1291, 0x1292, 0x1293, 0x1294, 0x1295, 0x1296, 0x1301, 0x1302, 0x1303, 0x1304, 0x1305, 0x1306, 0x1307, 0x1308, 0x1309, 0x130a, 0x130b, 0x130c, 0x130d, 0x130e, 0x130f, 0x1310, 0x1311, 0x1312, 0x1313, 0x1314, 0x1315, 0x1316, 0x1317, 0x1318, 0x1319, 0x131a, 0x131b, 0x131c, 0x131d, 0x131e, 0x131f, 0x1401, 0x1402, 0x1403, 0x1404, 0x1405, 0x1406, 0x1407, 0x1408, 0x1409, 0x140a, 0x140b, 0x140c, 0x1501, 0x1502, 0x1503, 0x1504, 0x1505, 0x1506, 0x1507, 0x1508, 0x1601, 0x1602, 0x1603, 0x1604, 0x1605, 0x1606, 0x1607, 0x1608, 0x1609, 0x160a, 0x160b, 0x160c, 0x160d, 0x160e, 0x160f, 0x1610, 0x1611, 0x1612, 0x1613, 0x1614, 0x1615, 0x1616, 0x1617, 0x1618, 0x1619, 0x161a, 0x161b, 0x161c, 0x161d, 0x161e, 0x161f, 0x1620, 0x1621, 0x1622, 0x1623, 0x1624, 0x1625, 0x1626, 0x1627, 0x1628, 0x1629, 0x162a, 0x162b, 0x162c, 0x162d, 0x162e, 0x162f, 0x1630, 0x1631, 0x1632, 0x1633, 0x1634, 0x1635, 0x1636, 0x1637, 0x1638, 0x1639, 0x163a, 0x163b, 0x163c, 0x163d, 0x163e, 0x163f, 0x1640, 0x1641, 0x1642, 0x1701, 0x1702, 0x1703, 0x1704, 0x1705, 0x1706, 0x1707, 0x1708, 0x1709, 0x170a, 0x170b, 0x170c, 0x170d, 0x170e, 0x170f, 0x1710, 0x1711, 0x1712, 0x1713, 0x1714, 0x1715, 0x1716, 0x1717, 0x1718, 0x1719, 0x171a, 0x171b, 0x171c, 0x171d, 0x171e, 0x171f, 0x1720, 0x1721, 0x1722, 0x1723, 0x1724, 0x1725, 0x1726, 0x1727, 0x1728, 0x1729, 0x172a, 0x172b, 0x172c, 0x172d, 0x172e, 0x172f, 0x1730, 0x1731, 0x1732, 0x1733, 0x1734, 0x1801, 0x1802, 0x1803, 0x1804, 0x1805, 0x1901, 0x1902, 0x1903, 0x1904, 0x1905, 0x1906, 0x1907, 0x1908, 0x1909, 0x190a, 0x190b, 0x190c, 0x190d, 0x190e, 0x190f, 0x1910, 0x1911, 0x1912, 0x1913, 0x1914, 0x1915, 0x1916, 0x1917, 0x1918, 0x1919, 0x191a, 0x191b, 0x191c, 0x191d, 0x191e, 0x191f, 0x1920, 0x1921, 0x1922, 0x1923, 0x1924, 0x1925, 0x1926, 0x1927, 0x1928, 0x1929, 0x192a, 0x192b, 0x192c, 0x192d, 0x192e, 0x192f, 0x1930, 0x1a01, 0x1a02, 0x1a03, 0x1a04, 0x1a05, 0x1a06, 0x1a07, 0x1a08, 0x1a09, 0x1a0a, 0x1a0b, 0x1a0c, 0x1b01, 0x1b02, 0x1b03, 0x1b04, 0x1b05, 0x1b06, 0x1b07, 0x1b08, 0x1b09, 0x1b0a, 0x1b0b, 0x1b0c, 0x1b0d, 0x1b0e, 0x1c01, 0x1c02, 0x1c03, 0x1d01, 0x1d02, 0x1d03, 0x1d04, 0x1d05, 0x1d06, 0x1d07, 0x1d08, 0x1d09, 0x1e01, 0x1f01, 0x1f02, 0x1f03, 0x1f04, 0x2001, 0x2002, 0x2003, 0x2004, 0x2005, 0x2006, 0x2007, 0x2101, 0x2102, 0x2103, 0x2201, 0x2202, 0x2203, 0x2301, 0x2302, 0x2303, 0x2401, 0x2402, 0x2501, 0x2502, 0x2503, 0x2504, 0x2505, 0x2506, 0x2507, 0x2508, 0x2509, 0x250a, 0x250b, 0x250c, 0x250d, 0x250e, 0x2601, 0x2602, 0x2603, 0x2604, 0x2701, 0x2702, 0x2703, 0x2704, 0x2705, 0x2706, 0x2707, 0x2708, 0x2709, 0x270a, 0x270b, 0x270c, 0x270d, 0x270e, 0x270f, 0x2710, 0x2711, 0x2712, 0x2713, 0x2714, 0x2715, 0x2716, 0x2717, 0x2718, 0x2719, 0x271a, 0x271b, 0x271c, 0x2801, 0x2802, 0x2803, 0x2804, 0x2805, 0x2806, 0x2807, 0x2808, 0x2809, 0x280a, 0x280b, 0x280c, 0x280d, 0x280e, 0x280f, 0x2810, 0x2901, 0x2902, 0x2903, 0x2904, 0x2905, 0x2906, 0x2907, 0x2908, 0x2909, 0x290a, 0x290b, 0x290c, 0x290d, 0x290e, 0x290f, 0x2910, 0x2911, 0x2912, 0x2913, 0x2914, 0x2915, 0x2916, 0x2917, 0x2918, 0x2a01, 0x2a02, 0x2a03, 0x2a04, 0x2a05, 0x2a06, 0x2a07, 0x2a08, 0x2a09, 0x2a0a, 0x2a0b, 0x2a0c, 0x2a0d, 0x2a0e, 0x2a0f, 0x2a10, 0x2a11, 0x2a12, 0x2a13, 0x2a14, 0x2a15, 0x2b01, 0x2b02, 0x2b03, 0x2b04, 0x2b05, 0x2b06, 0x2b07, 0x2b08, 0x2b09, 0x2b0a, 0x2b0b, 0x2b0c, 0x2b0d, 0x2b0e, 0x2b0f, 0x2b10, 0x2b11, 0x2b12, 0x2b13, 0x2b14, 0x2b15, 0x2b16, 0x2b17, 0x2b18, 0x2b19, 0x2b1a, 0x2b1b, 0x2b1c, 0x2c01, 0x2c02, 0x2c03, 0x2c04, 0x2c05, 0x2c06, 0x2c07, 0x2c08, 0x2c09, 0x2c0a, 0x2c0b, 0x2c0c, 0x2c0d, 0x2c0e, 0x2c0f, 0x2c10, 0x2d01, 0x2d02, 0x2d03, 0x2d04, 0x2d05, 0x2d06, 0x2d07, 0x2d08, 0x2d09, 0x2d0a, 0x2d0b, 0x2d0c, 0x2d0d, 0x2d0e, 0x2d0f, 0x2d10, 0x2e01, 0x2e02, 0x2e03, 0x2e04, 0x2e05, 0x2e06, 0x2e07, 0x2e08, 0x2e09, 0x2e0a, 0x2e0b, 0x2e0c, 0x2e0d, 0x2f01, 0x2f02, 0x2f03, 0x2f04, 0x2f05, 0x2f06, 0x3001, 0x3002, 0x3003, 0x3004, 0x3005, 0x3006, 0x3101, 0x3102, 0x3103, 0x3104, 0x3201, 0x3202, 0x3203, 0x3204, 0x3301, 0x3302, 0x3303, 0x3304, 0x3305, 0x3401, 0x3402, 0x3403, 0x3501, 0x3502, 0x3503, 0x3504, 0x3505, 0x3506, 0x3601, 0x3602, 0x3603, 0x3604, 0x3701, 0x3702, 0x3703, 0x3801, 0x3901, 0x3902, 0x3903, 0x3904, 0x3905, 0x3906, 0x3907, 0x3908, 0x3909, 0x390a, 0x390b, 0x390c, 0x390d, 0x3a01, 0x3a02, 0x3a03, 0x3a04, 0x3a05, 0x3b01, 0x3b02, 0x3b03, 0x3b04, 0x3b05, 0x3c01, 0x3c02, 0x3c03, 0x3d01, 0x3d02, 0x3d03, 0x3d04, 0x3d05, 0x3e01, 0x3f01, 0x4001, 0x4101, 0x4102, 0x4103, 0x4104, 0x4105, 0x4106, 0x4107, 0x4108, 0x4109, 0x410a, 0x410b, 0x410c, 0x410d, 0x410e, 0x410f, 0x4110, 0x4111, 0x4112, 0x4113, 0x4114, 0x4115, 0x4116}; 
	
	/**
	 * Converts lid to ari.
	 * @return 0 when lid is not valid
	 */
	public static int lidToAri(int lid) {
		if (lid <= 0 || lid > 31102) return 0;
		int pos = Arrays.binarySearch(lids, lid);
		if (pos >= 0) { // exactly at verse 1
			return (bcs[pos] << 8) + 1;
		} else {
			pos = -pos - 2;
			int base = lids[pos];
			return (bcs[pos] << 8) + 1 + (lid - base);
		}
	}
}
