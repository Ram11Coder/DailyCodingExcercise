package com.gfg.number;

import java.util.Scanner;

/**
 * 3n+1 sequence
 * 
 * if n is even then divide the number by 2 if n is odd then divide the number
 * by 3 and add 1
 *
 * if n becomes then return
 *
 */
public class NumberSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		sequence(n);
	}

	private static void sequence(int n) {
		while (n > 1) {
			if (n % 2 == 0)
				n /= 2;
			else if (n % 2 == 1)
				n = (n * 3) + 1;
			System.out.print(n + " ");
		}
	}
}
