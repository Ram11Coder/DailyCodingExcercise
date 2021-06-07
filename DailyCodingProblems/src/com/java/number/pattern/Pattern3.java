package com.java.number.pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 15;
		for (int i = n; i >= 1; i--) {

			for (int j = n; j >= 1; j--) {

				if (i <= j) {
					System.out.print(j);
				} else {
					System.out.print(i);
				}

			}
			System.out.println();
		}

	}
}
