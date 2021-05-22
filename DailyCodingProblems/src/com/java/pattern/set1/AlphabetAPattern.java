package com.java.pattern.set1;

public class AlphabetAPattern {
	public static void main(String[] args) {
		int n = 100;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= (n / 2); j++) {
				if ((i == 0 && j != n / 2) || i == n / 2 || j == 0 || (j == n / 2 && i != 0)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
