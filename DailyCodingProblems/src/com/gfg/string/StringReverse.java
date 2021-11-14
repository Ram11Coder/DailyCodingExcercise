package com.gfg.string;

/**
 * 
 * Reverse words in a string ex: Dog barks output: god skrab
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		String s = "Dog Barks";
		Approach1(s);
		reverse(s);
	}

//swap the char
	private static void Approach1(String sentence) {
		String words[] = sentence.split(" ");
		for (String s : words) {
			char cArr[] = s.toCharArray();
			for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
				char ch = cArr[i];
				cArr[i] = cArr[j];
				cArr[j] = ch;
			}
			System.out.print(String.valueOf(cArr) + " ");

		}
		System.out.println();
	}

	private static void reverse(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (String word : str) {
			sb.append(word);
			sb.reverse();
			System.out.print(sb + " ");
			sb.delete(0, word.length());
		}
		System.out.println();
	}

}
