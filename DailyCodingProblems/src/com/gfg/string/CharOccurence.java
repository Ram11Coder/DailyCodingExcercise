package com.gfg.string;

import java.util.HashMap;

/**
 * Count the occurence of the given string
 *
 */
public class CharOccurence {
	public static void main(String[] args) {
		charCount("test");
		charCount(" test ");
		charCount("This is a test");
		charCount("t");
		charCount("tt");
		charCount("");
		charCount(" ");
		charCount("    ");

	}

	private static void charCount(String word) {
		char carr[] = word.toCharArray();

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : carr)
			// if (!String.valueOf(c).isBlank()) // if loop for avoiding space character
			if (charMap.containsKey(c))
				charMap.put(c, charMap.get(c) + 1);
			else
				charMap.put(c, 1);

		System.out.println(word + " -> " + charMap);

	}
}
