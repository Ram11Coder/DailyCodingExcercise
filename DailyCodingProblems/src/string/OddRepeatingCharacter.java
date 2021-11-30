package string;

/**
 * 
 * Print odd repeating characters in a string. For Example: Input:
 * datastructure; Output: dtsce
 *
 */
public class OddRepeatingCharacter {

	public static void main(String[] args) {
		int hash[] = new int[128];
		String s = "datastructure";

		for (char i : s.toCharArray())
			hash[i]++;

		for (char c : s.toCharArray())
			if (hash[c] % 2 != 0) {
				System.out.print(c);
				hash[c] = 0;
			}
	}

}
