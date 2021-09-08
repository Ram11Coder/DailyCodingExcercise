package com.gfg.number;

/**
 * A number is called as binary-decimal if all the digits in the number should
 * be either ‘1’ or ‘0’. Any number can be written as a sum of binary-decimals.
 * Our task is to find the minimum number of binary-decimals to represent a
 * number.
 *  Input : 32 
 *  Output : 10 11 11
 *  Input : 120 
 *  Output : 10 110
 */
public class MinimumNoOfBinaryDecimals {
	/*
	 * This code only works when input limit upto 10000
	 * Will update optimized code
	 * */
	public static void main(String[] args) {

		int n = 1234;
		int[] arr = {};
		
		if (n <= 9) {
			arr = new int[] { 1 };
		} else if (n > 9 && n < 100) {
			arr = new int[] { 1, 10, 11 };
		} else if (n >= 100 && n < 1000) {
			arr = new int[] { 1, 10, 11, 100, 101, 110, 111 };
		}else if (n >= 1000 && n <= 10000) {
			arr = new int[] { 1, 10, 11, 100, 101, 110, 111,1000,1001,1010,1011,1100,1101,1110,1111,10000 };
		}
		solver(n, arr);
	}

	 static void solver(int n, int[] arr) {
		int i = 1;
		while (n > 0) {
			int l = arr.length - i;
			n = possibleBinaries(n, arr[l]);

			if (n == 0) 
				break;
		
			i++;
		}
	}

	 static int possibleBinaries(int n, int val) {

		while (n > 0) {
			if (n < val)
				return n;

			n = n - val;
			System.out.print(val + " ");
		}
		return n;
	}
}
