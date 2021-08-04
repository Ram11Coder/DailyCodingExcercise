package com.gfg.number;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to implement Zeckendorf’s theorem. Definition: Zeckendorf’s
 * theorem states that every positive integer can be represented uniquely as the
 * sum of one or more distinct Fibonacci numbers in such a way that the sum does
 * not include any two consecutive Fibonacci numbers. Example: Input: 64 Output:
 * 55+8+1 Input: 50 Output: 34+13+3
 */
public class Zeckendoff {
	public static void main(String[] args) {

		int n = 50;
		List<Integer> arr = fibonacciCreation(n);
		int l = arr.size() - 1;

		for (int i = l; i >= 0; i--) {

			if (arr.get(i) <= n) {
				n = n - arr.get(i);
				System.out.print(arr.get(i)+" ");
			}
			if (n == 0) {
				break;
			}

		}
	}

	static List<Integer> fibonacciCreation(int n) {
		int a = 0, b = 1, c;
		List<Integer> arr = new ArrayList<Integer>();
		while (b < n) {

			c = a + b;
			if (c <= n)
				arr.add(c);
			a = b;
			b = c;
			// System.out.print(c + " ");

		}
		return arr;
	}
}
