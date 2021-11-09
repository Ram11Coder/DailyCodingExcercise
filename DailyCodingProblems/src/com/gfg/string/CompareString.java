package com.gfg.string;

/**
 * Three strings will be given as 
 * Input string 1: I walk everyday in the morning. 
 * 2: I run everyday in the evening. 
 * 3: I swim everyday in the night.
 * 
 * Output: I everyday in the 
 * i.e The common words in three strings must be
 * printed
 *
 */
public class CompareString {

	public static void main(String[] args) {
		String s1 = "I walk everyday in the morning";
		String s2 = "I run everyday in the evening";
		String s3 = "I swim everyday in the night";
		compare(s1, s2, s3);

	}

	private static void compare(String s1, String s2, String s3) {

		String s[] = s1.split(" ");
		for (String word : s)
			if (s2.contains(word) && s3.contains(word))
				System.out.print(word+" ");
	}

}
