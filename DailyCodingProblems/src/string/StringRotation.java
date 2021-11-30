package string;

import java.util.Arrays;

/**
 Check if two strings are a rotation of each other
Ex: 
str1: helloworld 
str2: ldhellowor
Output: 
YES
str1: vicky 
str2: cvkyi
 
Output: 
NO 

 */
public class StringRotation {

	public static void main(String[] args) {
		/*
		 * System.out.println((brutefore("helloworld", "ldhellowor")) ? "YES" : "NO");
		 * System.out.println((brutefore("helloworld", "ldhellowro")) ? "YES" : "NO");
		 * System.out.println((brutefore("vicky", "cvkyi")) ? "YES" : "NO");
		 * 
		 * System.out.println((brutefore("helloworld", null)) ? "YES" : "NO");
		 */
		System.out.println((betterApproach("helloworld", "ldhellowor") ? "YES" : "NO"));
		System.out.println((betterApproach("helloworld", "elloworldh") ? "YES" : "NO"));
		System.out.println((betterApproach("vicky", "cvkyi")) ? "YES" : "NO");
	}

	private static boolean betterApproach(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		s1 = s1.trim();
		s2 = s2.trim();

		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 1; i < s2.length(); i++) {
			s2 = s2.substring(1) + s2.substring(0, 1);
			if (s1.equals(s2))
				return true;
		}
		return false;
	}

	private static boolean brutefore(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		s1 = s1.trim();
		s2 = s2.trim();

		if (s1.length() != s2.length()) {
			return false;
		}
		char carr[] = s2.toCharArray();

		for (int i = 0; i < carr.length; i++) {
			rotate(carr);
			if (Arrays.equals(s1.toCharArray(), carr))
				return true;
		}

		return false;
	}

	private static void rotate(char[] carr) {
		char temp = carr[0];
		int i = 0;
		for (i = 0; i < carr.length - 1; i++) {
			carr[i] = carr[i + 1];
		}
		carr[i] = temp;
	}

}
