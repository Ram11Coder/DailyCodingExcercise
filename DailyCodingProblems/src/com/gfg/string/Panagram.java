package com.gfg.string;

/**
 * Check whether all english alphabets are present in the given sentence or not
 * I/P: abc defGhi JklmnOP QRStuv wxyz O/P: True I/P: abc defGhi JklmnOP QRStuv
 * O/P: False
 */
public class Panagram {

	public static void main(String[] args) {

		System.out.println(panagram("The quick brown fox jumps over the lazy dog"));
		System.out.println(panagram("Waltz, bad nymph, for quick jigs vex."));
		System.out.println(panagram("Glib jocks quiz nymph to vex dwarf."));
		System.out.println(panagram("Sphinx of black quartz, judge my vow."));
		System.out.println(panagram("How vexingly quick daft zebras jump!"));
		System.out.println(panagram("The five boxing wizards jump quickly."));
		System.out.println(panagram("Jackdaws love my big sphinx of quartz."));
		System.out.println(panagram("Pack my box with five dozen liquor jugs."));
		System.out.println(panagram(""));
		System.out.println(panagram(null));
		System.out.println(panagram("abc"));
		System.out.println(panagram("abcdefghijklmnopqrstuvwxy"));
		System.out.println(panagram("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(panagram("aabcdefghijklmnopqrstuvwxy"));
		System.out.println(panagram("aabcdefghijklmnopqrstuvwxyzz"));
		System.out.println(panagram("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"));
	}

	private static boolean panagram(String s) {
		// return s.matches("[A-Za-z]");
		if (s == null || s.isEmpty() || s.length() < 26) {
			return false;
		}
		s = s.toLowerCase();
		int hash[] = new int[128];
		for (int i = 0; i < s.length(); i++)
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
				hash[s.charAt(i)]++;

		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (hash[s.charAt(i)] >= 1) {
				count++;
				hash[s.charAt(i)] = 0;
			}

		// System.out.println(count);
		if (count >= 26)
			return true;

		return false;
	}
}
