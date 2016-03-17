/*
 * [A]98
 * [TA's advise]
 * 1.有問候, 讚!
 * 2.沒有串接Getwidth(),GetHeight(), 這部分扣2分.
 * */
package rectangle;

import java.util.Scanner;

class rec1 {
	//有沒有可能會是浮點數呢?
	int height, width, X, Y;

	rec1() {
		//this(-1,-1,-1,-1);//加入這行可以讓你的程式更好(物件初始化)
	}

	rec1(int height, int width, int X, int Y) {
		this.height = height;
		this.width = width;
		this.X = X;
		this.Y = Y;
	}

	int GetHeight() {
		return this.height;
	}

	int Getwidth() {
		return this.width;
	}

	int GetX() {
		return this.X;
	}

	int GetY() {
		return this.Y;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.X + ",y=" + this.Y + ",width=" + this.width + ",height=" + this.height + "]"
				+ "\nArea =" + (double) this.height * (double) this.width + "\nPerimeter ="
				+ 2 * ((double) this.height + (double) this.width);
	}
}

public class rec {
	public static void main(String[] args) {
		int height1, height2, width1, width2, X1, X2, Y1, Y2;

		Scanner cin = new Scanner(System.in);

		System.out.println("Please enter the parameter for the first rectangle in the order of X Y height width ");
		X1 = cin.nextInt();
		Y1 = cin.nextInt();
		height1 = cin.nextInt();
		width1 = cin.nextInt();
		System.out.println("Please enter the parameter for the second rectangle in the order of X Y height width ");
		X2 = cin.nextInt();
		Y2 = cin.nextInt();
		height2 = cin.nextInt();
		width2 = cin.nextInt();
		rec1 a = new rec1(height1, width1, X1, Y1);
		System.out.println(a);
		rec1 b = new rec1(height2, width2, X2, Y2);
		System.out.println(b);
		System.out.println("\n\n\nHAVE A NICE DAY!!!");

	}

}
