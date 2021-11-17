package com.gfg.string;

/**
 * https://practice.geeksforgeeks.org/problems/check-for-subsequence4930/1
 * 
 * Print true if second string is a substring of first string, else print false.
 * Note : * symbol can replace n number of characters Input : Spoon Sp*n Output
 * : TRUE Zoho *o*o Output : TRUE Man n* Output : FALSE Subline line Output :
 * TRUE
 *
 * Note: Still need add some extra test cases and finding in progress of optimal
 * solution
 * 
 */
public class Subsequence {

	public static void main(String[] args) {

		System.out.println(solver("Spoon", "Sp*n"));
		System.out.println(solver("Spoon", "Spoon"));
		System.out.println(solver("Zoho", "*o*o"));
		System.out.println(solver("Zoho", "*"));
		System.out.println(solver("Man", "n*"));
		System.out.println(solver("Mango", "M*n*"));
		System.out.println(solver("Mango", "M*n*k"));
		System.out.println(solver("Mango", "M*"));
		System.out.println(solver("Mango", "*n*"));
		System.out.println(solver("Mango", "*n*o"));

	}

	private static boolean solver(String s1, String s2) {
		if (s1.length() > 1 && s2.length() == 1 && s2.charAt(0) == '*')
			return true;

		for (int i = 0, j = 0; i < s1.length(); i++) {
			if (s2.charAt(j) != '*' && s1.charAt(i) != s2.charAt(j))
				return false;
			else if (s2.charAt(j) != '*' && s1.charAt(i) == s2.charAt(j))
				j++;
			else {
				if (s2.charAt(s2.length() - 1) == '*' && j >= s2.length() - 1)
					return true;
				j++;
				i = checkPattern(i, j, s1, s2);
				if (s1.charAt(i) == s2.charAt(j))
					j++;
				else
					return false;
			}
		}
		return true;
	}

	private static int checkPattern(int i, int j, String s1, String s2) {
		int k = i;
		for (; k < s1.length(); k++)
			if (s1.charAt(k) == s2.charAt(j))
				return k;

		return k - 1;
	}

}
