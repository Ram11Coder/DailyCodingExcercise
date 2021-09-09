package com.gfg.number;

/*Print only numbers which is present in Fibonacci series (0 1 1 2 3 5 8 ……..)
Example:
 
 
Input: 2 10 4 8
Output: 2 8 
Input: 1 10 6 8 13 21
Output: 1 8 13 21
*/
public class FindFibonacciPresent {
	public static void main(String[] args) {

		int arr[] = { 1, 10, 6, 8, 13, 21 };
		for (int i : arr) {
			if (fibCheck(i)) {
				System.out.print(i + " ");
			}
		}

	}

	private static boolean fibCheck(int i) {
		int a = 0, b = 1, c = a + b;
		while (a <= i) {
			if (c == i) {
				return true;
			}
			a = b;
			b = c;
			c = a + b;
		}

		return false;
	};
}
