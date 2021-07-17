package com.java.Pattern;

import java.util.Scanner;

public class BinaryTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					System.out.print(1);
				else
					System.out.print(0);

			}
			System.out.println();
		}
	}
}
