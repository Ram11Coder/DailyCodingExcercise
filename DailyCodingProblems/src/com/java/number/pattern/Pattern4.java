package com.java.number.pattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			int num = 2 * i + 1;
			for (int k = 0; k < num; k++) {
				if (k == (num / 2))
					System.out.print(c);
				else if (k < (num / 2))
					System.out.print(c--);
				else if (k > (num / 2))
					System.out.print(++c);

			}
			c++;
			System.out.println();
		}
	}
}
