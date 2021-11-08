package com.gfg.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicate {

	public static void main(String[] args) {

		solver("java");
		solver("");
		solver("R");
		solver(null);
		solver("tesla");
		solver("aaabbc");
		solver("this is a test");
		solver("Banana");
		solver("001001");

	}

	private static void solver(String str) {
		if (str == null) {
			System.out.println("NULL string");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single char string");
			return;
		}

		char word[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : word)
			if (charMap.containsKey(c))
				charMap.put(c, charMap.get(c) + 1);
			else
				charMap.put(c, 1);

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("------------------");
	}

}
