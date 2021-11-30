package string;

/**
 * First Occurrences Given two strings, find the first occurrence of all
 * characters of second string in the first string and print the characters
 * between the least and the highest index I/P: ZOHOCORPORATION PORT O/P:
 * OHOCORPORAT Explanation: The index of P in first string is 7, O is 1, R is 6
 * and T is 11. The largest range is 1 – 11. So print the characters of the
 * first string in this index range i.e. OHOCORPORAT
 */
public class StringRange {

	public static void main(String[] args) {

		printRange("ZOHOCORPORATION", "PORT");
		printRange("ROCKY BHAI", "BAD");
		printRange("ZOHOCORPORATION", "");
		printRange("ZOHOCORPORATION", " ");

		printRange("ZOHOCORPORATION", null);
		printRange("HELLO WORLD", "OLD");
		printRange("I LOVE JAVA PROGRAMMING", "CODE");
		printRange("I LOVE JAVA PROGRAMMING", "code");

	}

	private static void printRange(String word, String key) {
		if (key == null || key.isBlank()) {
			System.out.println("No matching char in the string ");
			return;
		}
		word = word.toUpperCase();
		key = key.toUpperCase();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < key.length(); i++) {
			int index = word.indexOf(key.charAt(i));
			if (index != -1) {
				if (index > max)
					max = index;
				if (index < min)
					min = index;
			}
		}
		System.out.println(word.substring(min, max + 1));
	}

}
