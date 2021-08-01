package com.gfg.array;

import java.util.Scanner;

public class NumberSys {
	public static void main(String[] args) {
		/*
		 * Form a number system with only 3 and 4. Find the nth number of the number
		 * system. Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433,
		 * 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sequenceChecker(n);
	}

	private static void sequenceChecker(int n) {
		int c = 0, i;

		for (i = 3; i < 10000; i++) {

			if (numberChecker(i)) {
				c++;
			}
			if (c == n) {
				System.out.println(i);
				break;
			}

		}
	}

	static boolean numberChecker(int i) {
		boolean flag = false;
		int r;
		while (i > 0) {
			r = i % 10;
			if (r == 3 || r == 4) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			i /= 10;
		}
		return flag;
	}
}
