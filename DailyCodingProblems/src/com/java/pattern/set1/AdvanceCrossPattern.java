package com.java.pattern.set1;

import java.util.Scanner; 

public class AdvanceCrossPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//input should greater than 2, get the correct pattern
		int n = sc.nextInt();
		if (n <= 2) { 
			System.out.println("Please enter the value greater than 2");
			return;
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {
				if (j == i || j == n - i - 1 || (j == n + i - 1 && i != 0) || (j == 2 * n - i - 2 && i != n - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
