package com.gfg.charpattern;

public class AstarPattern {
	public static void main(String[] args) {

		int n = 5, k = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= k; j++) {

				if (j % 2 == 0)
					System.out.print("A");
				else
					System.out.print("*");
			}
			k += n - 1;
			System.out.println();
		}
	}
}
