package com.java.pattern.set1;

public class DoublesideStaircase {

	public static void main(String[] args) {
		int n = 10, c = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n / 2 - c; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * c; j++) {
				System.out.print("*");
			}
			if (i % 2 == 0)
				c++;
			System.out.println();
		}
	}

}
