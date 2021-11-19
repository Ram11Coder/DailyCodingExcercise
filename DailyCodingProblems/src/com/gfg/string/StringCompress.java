package com.gfg.string;

/**
 * Compression of a given string. example: aaaabbcccc —> a4bbc4 abbccc —> a1 bbc3
 * bb —> bb (not b2, no need to compress)
 *
 */
public class StringCompress {

	public static void main(String[] args) {
		String str = "abbccc";
		compress(str);
	}

	private static void compress(String str) {
		int hash[] = new int[128];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != 'b') {
				hash[c]++;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hash[c] >= 1 && c != 'b') {
				System.out.print(c + "" + hash[c]);
				hash[c] = 0;
			} else if (c == 'b') {
				System.out.print(c);
			}
		}
	}

}
