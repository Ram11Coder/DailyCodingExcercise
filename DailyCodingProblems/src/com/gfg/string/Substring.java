package com.gfg.string;

/*Print all the substring of the given string.
 * 
 * Reference: https://simplifie.medium.com/different-ways-to-get-all-substring-of-a-string-c1003cb52700
 * 
 * */
public class Substring {

	public static void main(String[] args) {
		String s = "abc";
		char carr[] = s.toCharArray();
		 NormalForLoopMethod(carr, s.length());
		//substringMethod(s);
	}

	private static void substringMethod(String str) {

		for (int i = 0; i < str.length(); i++)
			for (int j = i; j <= str.length(); j++)
				System.out.println(str.substring(i, j));

	}

	static void NormalForLoopMethod(char[] carr, int length) {

		for (int i = 1; i <= length; i++) {
			for (int j = 0; j <= length - i; j++) {
				int len = j + i - 1;
				for (int k = j; k <= len; k++) {
					System.out.print(carr[k]);
				}
				System.out.println();
			}

		}

	}

}
