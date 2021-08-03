package com.gfg.array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * Given a number N. find the minimum count of numbers in which N can be
 * represented as a sum of numbers x1, x2, … xn. where xi is number whose digits
 * are 0s and 1s. example 1) i/p : N = 33 o/p : count = 3. 33( 11 + 11 + 11 )
 * some other possibilities of 33 is (11 + 11 + 10 + 1), (11 + 10 + 10 + 1 + 1
 * ), (10 + 10 + 10 + 1 + 1 + 1)
 *
 * 
 */
public class SumofNumberN {
	public static void main(String[] args) {
		int n = 33;
		int count = String.valueOf(n).length();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = form0or1(count);

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			checkSameNumber(val, n);
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				list.add(arr[j]);
				if (sum == n) {
					System.out.println(list);
					break; 
				}
			}

			

		}

	}

	private static void checkSameNumber(int val, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while (sum <= n) {
			list.add(val);
			sum += val;
			if (sum == n) {
				System.out.println(list);
				break;
			}
		}

	}

	private static int[] form0or1(int c) {

		if (c == 1) {

			return new int[] { 1 };
		} else if (c == 2) {
			return new int[] { 1, 10, 11 };
		} else if (c == 3) {
			return new int[] { 1, 10, 11, 100, 101, 110, 111 };
		}
		return null;

	}
}
