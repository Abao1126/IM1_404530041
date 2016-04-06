/*
 * [A]90
 * [TA's Advise]
 * 1.老弟, 你的folder名稱要寫好寫滿阿!
 * 2.演算法條件實作要確實.
 * 3.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.並未產生javadoc, 此部分扣5分.
 * */
public class eastertester {
	public static void main(String[] args) {
		String easter2001 = easter.calculateEaster(2001);
		String easter2012 = easter.calculateEaster(2012);

		// 串接字串的工作可以留給子程式去做, 主程式只需要印出就好了, 這樣會不會比較好呢?

		System.out.println("In 2001, Easter Sunday is:" + easter2001);
		System.out.println("In 2012, Easter Sunday is:" + easter2012);

	}
}
