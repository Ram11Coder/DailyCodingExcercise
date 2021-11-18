package com.gfg.recursion;

/**
 * Given a string of integers find out all the possible words that can made out
 * of it in continuous order. Eg: 11112 ans: AAAAB AKAB AAKB AAAL etc.
 *
 */
public class NumberCorrespondingChar {

	public static void main(String[] args) {

		int n = 11112;
		solver(n + "", "");
	}

	private static void solver(String digits, String word) {

		if (digits.isEmpty()) {
			System.out.println(word);
		} else {
			int num = Integer.parseInt(digits.substring(0, 1));
			solver(digits.substring(1), word + (char) ('A' + num - 1));
			if (digits.length() >= 2 && (num = Integer.parseInt(digits.substring(0, 2))) <= 26) {
				solver(digits.substring(2), word + (char) ('A' + num - 1));
			}
		}
	}
}
