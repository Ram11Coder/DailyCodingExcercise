package com.java.pattern.set1;

import java.util.Scanner;

public class PramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		first_method(n);
		second_method(n);

	}

	private static void second_method(int n) {
		System.out.println("Second method :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i - 1)
					System.out.print(" ");
				else
					System.out.print("* ");

			}
			System.out.println();
		}

	}

	private static void first_method(int n) {
		System.out.println("Second method :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
