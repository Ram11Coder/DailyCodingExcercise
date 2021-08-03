package com.gfg.number;

/**
 * Given two integers a and b, the task is to add them to get c. After that
 * remove zeroes from a, b and c and check for modified values if a + b = c then
 * return “YES” else return “NO”. Examples:
 * 
 * 
 * Input: a = 101, b = 102 Output: YES 101 + 102 = 203. After removing all
 * zeroes from a, b and c, a = 11, b = 12 and c = 23 Now check if a + b = c i.e.
 * 11 + 12 = 23 . So print Yes. Input: a = 105, b = 108 Output: NO After
 * removing all zeroes a + b!= c, therefore the output is NO.
 *
 */
public class RemoveAllZeros {
	public static void main(String[] args) {

		int a = 1010, b = 1020, c;

		c = a + b;
		if (removeZeros(a) + removeZeros(b) == removeZeros(c))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	static int removeZeros(int n) {

		int i = 1, sum = 0;
		while (n > 0) {

			int r = n % 10;
			if (r != 0) {
				sum += r * i;
				i *= 10;

			}
			n /= 10;
		}
		// System.out.println(sum);
		return 0;
	}
}
