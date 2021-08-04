package com.gfg.number;

/*For a given number N, find the next immediate palindrome number.
Input: 808
Output: 818
Input: 2133
Output: 2222*/

public class PalindromeNext {
	public static void main(String[] args) {

		int n = 2133, l = String.valueOf(n).length(), len = (int) Math.pow(10, l);

		while (n < len) {

			if (isPalindrome(n)) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}

	static boolean isPalindrome(int n) {

		char arr[] = String.valueOf(n).toCharArray();
		int i = 0, j = arr.length - 1;
		while (i <= j) {
			if (arr[i] != arr[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}
