package com.gfg.string;

/*
 * https://practice.geeksforgeeks.org/problems/remove-character3815/1
 * 
 *  Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece” 
 */
public class CharacterOccurence {

	public static void main(String[] args) {

		solver("expErIence", "En");
		solver("expErIence", "n");
		solver("expErIence", "End");
		solver("expErIence", "ErIen");
		solver("expErIence", "e");
		
	}

	private static void solver(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		for (char c : s2.toCharArray()) {
			
			if(sb.toString().contains(c+""))
			sb = sb.deleteCharAt(sb.indexOf(c+""));
		}
		System.out.println(sb.toString());
	}

}
