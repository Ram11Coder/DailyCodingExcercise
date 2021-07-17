package com.java.Pattern;

import java.util.Scanner;

public class LadderPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= (n * 3) + 2; i++) {
			if (i % 3 == 0)
				System.out.println("*****");
			else
				System.out.println("*   *");
		}
	}
}
