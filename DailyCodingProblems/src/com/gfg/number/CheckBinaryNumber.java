package com.gfg.number;

public class CheckBinaryNumber {
	public static void main(String[] args) {

		isBinaryNumber(1011);
		isBinaryNumber(1211);
		isBinaryNumber(1);
		isBinaryNumber(01);
		isBinaryNumber(0);
		// isBinaryNumber(0010);
		/*
		 * The above binary number treated as Digit (8) so we will get the result as not
		 * binary number
		 */

		System.out.println("=================================");
		isBin(111001);
		isBin(1);
		isBin(01);
		isBin(0);
		isBin(12111);

		System.out.println("=================================");
		isBinNum(111001);
		isBinNum(1);
		isBinNum(01);
		isBinNum(0);
		isBinNum(12111);

	}

	private static void isBinNum(int num) {
		try {
			Integer.parseInt(String.valueOf(num), 2);
			System.out.println(num + " is a binary number");
		} catch (Exception e) {
			System.out.println(num + " is not a binary number");
		}

	}

	private static void isBin(int n) {
		if (String.valueOf(n).matches("[0-1]+"))
			System.out.println(n + " is a binary number");
		else
			System.out.println(n + " is not a binary number");

	}

	private static void isBinaryNumber(int num) {
		boolean flag = true;
		int n = num;
		while (num > 0) {
			int rem = num % 10;
			if (rem > 1) {
				flag = false;
				break;
			} else {
				num /= 10;
			}
		}
		if (flag == true)
			System.out.println(n + " is a binary number");
		else
			System.out.println(n + " is not a binary number");

	}
}
