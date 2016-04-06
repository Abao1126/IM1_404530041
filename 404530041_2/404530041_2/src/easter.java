
public class easter {
	public static String calculateEaster(int aYear) {
		String easterday;
		int year, a, b, c, k, p, q, M, N, d, e, easterdateM, easterdateA;
		year = aYear;

		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = year / 100;// Math.floor(), -2
		p = ((13 + 8 * k) / 25);
		q = k / 4;
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;
		easterdateM = 22 + d + e;
		easterdateA = d + e - 9;

		// 或許easterday寫在最後就好了, 會更精簡!
		if (d == 29 && e == 6) {
			easterday = "April\t 19";
			return easterday;
		} else if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
			easterday = "April\t 18";
			return easterday;
			// d + e < 9 , 我想應該是 d + e <=9 喔 3/31 是存在的, 條件設定不完全 -3
		} else if (d + e < 9) {
			easterday = "March\t" + easterdateM;
			return easterday;
		} else {
			easterday = "April\t" + easterdateA;
			return easterday;
		}
	}
}
