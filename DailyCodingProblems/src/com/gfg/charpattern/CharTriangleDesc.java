package com.gfg.charpattern;

public class CharTriangleDesc {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j < i) {
					System.out.print(c++);
				} else {

					System.out.print(c--);
				}
			}
			System.out.println();
		}
	}
}
