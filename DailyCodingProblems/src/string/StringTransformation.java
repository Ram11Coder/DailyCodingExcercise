package string;

import java.util.Arrays;

/**
 * Replace the characters in a string based on the transformation:
 *  A -> Z, B->Y,C->X and so on
 *  Input: FADE
 *  Output: UZWV
 *
 */
public class StringTransformation {

	public static void main(String[] args) {
		transform("FADE");
		transform("ABCD");
		transform("ZXYZ");
		transform("HAPPY");
		transform("CODING");
	}

	private static void transform(String word) {

		approach1(word);
		/*
		 * approach2(word); 
		 * approach3(word);
		 */

	}

	private static void approach3(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = (char) (65 + (90 - word.charAt(i)));
			System.out.print(c);
		}
		System.out.println();
	}

	private static void approach2(String word) {
		char c[] = word.toCharArray();
		for (int i = 0; i < word.length(); i++)
			c[i] = (char) ('A' + ('Z' - word.charAt(i)));

		System.out.print(Arrays.toString(c));
		System.out.println();
	}

	private static void approach1(String word) {

		for (int i = 0; i < word.length(); i++) {
			char c = (char) ('A' + ('Z' - word.charAt(i)));
			System.out.print(c);
		}
		System.out.println();

	}

}
