package com.gfg.string;

/**
 * Find if a String2 is substring of String1. If it is, return the index of the
 * first occurrence. else return -1. Eg 1:Input: String 1: test123string String
 * 2: 123 Output: 4 Eg 2: Input: String 1: testing12 String 2: 1234 Output: -1
 *
 */
public class StringSearch {
	public static void main(String[] args) {
		String s1 = "testqwe123string", s2 = "123";
		int count = 0, i;
		loop: for (i = 0; i < s1.length(); i++) {
			int t = i;
			for (int j = 0, k = i; j < s2.length(); j++) {

				if (s1.charAt(k) == s2.charAt(j)) {
					count++;
					k++;
				}

				if (count == s2.length()) {
					System.out.println(t);
					break loop;
				}
			}
		}

	}

}
