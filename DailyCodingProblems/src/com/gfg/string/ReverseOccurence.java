package com.gfg.string;

import java.util.Arrays;

/**
 * 
 * Reverse the words in the given String1 from the first occurrence of String2
 * in String1 by maintaining white Spaces. example: String1 = Input: This is a
 * test String only String2 = st Output: This is a only String test
 *
 * 
 */
public class ReverseOccurence {

	public static void main(String[] args) {
		String s1 = "This is a test String only";
		String s2 = "st";
		char arr[] = s1.toCharArray();

		String s[] = s1.split(" ");
		int j = s.length - 1,c=0;
		for (int i = 0; i < s.length-c; i++) {
			if (s[i].contains(s2)) {
				String t = s[i];
				s[i] = s[j];
				s[j] = t;
				j--;
				c++;
			}
		}
		System.out.println(Arrays.toString(s));
	}

}
