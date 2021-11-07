package com.gfg.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(bruteForceApproach("silent", "Listen"));
		System.out.println(bruteForceApproach("silentt", "Listen"));
		System.out.println(bruteForceApproach("s", "S"));
		System.out.println(bruteForceApproach("cat", "ACT"));
		System.out.println(bruteForceApproach("si	le	nt", "L i s t e n"));
		System.out.println(bruteForceApproach("silent", "LISTEN"));
		System.out.println(bruteForceApproach("ROBOT", "oRbOt"));

		System.out.println("-----------------");
		System.out.println(isAnagram("silent", "Listen"));
		System.out.println(isAnagram("Silent", "Listen"));
		System.out.println(isAnagram("s 		 i 	lent", "L i s t e n"));
		System.out.println(isAnagram("silent", "LISTEN"));
		System.out.println(isAnagram("CAT", "act"));
		System.out.println(isAnagram("joy", "enjoy"));
		System.out.println(isAnagram("silent", "Listenn"));
		System.out.println(isAnagram("T", "t"));
		System.out.println(isAnagram("Robot", "orbot"));

	}

	private static boolean bruteForceApproach(String s1, String s2) {
		int hash[] = new int[26];
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		if (s1.length() != s2.length()) {
			return false;
		} else if (s1.length() == 1 && s2.length() == 1) {

			return s1.charAt(0) == s2.charAt(0);
		} else {
			for (int i = 0; i < s1.length(); i++) {
				hash[s1.charAt(i) - 'a']++;
			}
			for (int i = 0; i < s2.length(); i++) {
				if (hash[s2.charAt(i) - 'a'] > 0)
					hash[s2.charAt(i) - 'a']--;
				else
					return false;
			}
			/*
			 * for (int i = 0; i < hash.length; i++) { if (hash[i] != 0) return false;
			 */
			// }
			return true;
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		if (s1.length() != s2.length())
			return false;
		else {
			char carr1[] = s1.toLowerCase().toCharArray();
			char carr2[] = s2.toLowerCase().toCharArray();

			Arrays.sort(carr1);
			Arrays.sort(carr2);
			return Arrays.equals(carr1, carr2);
		}
	}
}
