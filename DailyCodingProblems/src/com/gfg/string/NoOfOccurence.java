package com.gfg.string;

public class NoOfOccurence {
	public static void main(String[] args) {
		String str = "Hello this is a sample program";

		for (char c : str.toCharArray()) {
			System.out.println(c + " : " + getNumOccurence(str, c));
		}

	}

	private static long getNumOccurence(String str, char c) {

		return str.chars().filter(e -> e == c).count();
	}
}
