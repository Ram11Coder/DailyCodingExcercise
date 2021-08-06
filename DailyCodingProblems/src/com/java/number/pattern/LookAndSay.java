package com.java.number.pattern;

public class LookAndSay {
	public static void main(String[] args) {

		String s1 = "1";
		String s2 = "";
		int count, i, j, n = 5;
		System.out.println(s1);

		for (int itr = 1; itr < n; itr++) {
			count = 0;
			s2 = "";

			for (i = 0, j = 0; j < s1.length(); j++) {

				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
				} else {

					s2 += count;
					s2 += s1.charAt(i);
					i = j;
					count = 1;
				}
			}
			s2 += count;
			s2 += s1.charAt(i);
			System.out.println(s2);
			s1 = s2;
		}
	}
}