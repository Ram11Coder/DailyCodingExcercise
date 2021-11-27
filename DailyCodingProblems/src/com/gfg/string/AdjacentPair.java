package com.gfg.string;

/**
 * Two strings of equal length will be given. Print all the adjacent pairs which
 * are not equal.
 * 
 * Input: asdfghij and adsfgijh
 * 
 * Output: sd-ds, hij-ijh
 * 
 *
 */
public class AdjacentPair {
	public static void main(String[] args) {

		findAdjacentPair("asdfghij", "adsfgijh");
		findAdjacentPair("asfgij", "adfijh");
		findAdjacentPair("aaaaaaa", "aaaaaaa");
		findAdjacentPair("asdfghij", "aa");
		findAdjacentPair("asdfghij", null);
		findAdjacentPair("abcdefg", "gfedcba");

	}

	private static void findAdjacentPair(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			System.out.println("either Both length not same nor contains null");
			return;
		}
		int count = 0, i = 0;
		for (i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				count++;
			else if (count > 0) {
				System.out.print(s1.substring(i - count, i) + "-" + s2.substring(i - count, i) + " ");
				count = 0;
			}
		}
		if (count > 0)
			System.out.print(s1.substring(i - count, i) + "-" + s2.substring(i - count, i) + " ");

		System.out.println();
	}
}
