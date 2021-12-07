package string;

/**
 * You have to classify a string as “GOOD”, “BAD” or “MIXED”. A string is
 * composed of lowercase alphabets and ‘?’. A ‘?’ is to be replaced by any of
 * the lowercase alphabets. Now you have to classify the string on the basis of
 * some rules. If there are more than 3 consonants together, the string is
 * considered to be “BAD”. If there are more than 5 vowels together, the also
 * string is considered to be “BAD”. A string is “GOOD” if its not “BAD”. Now
 * when question marks are involved, they can be replaced with consonants or
 * vowels to make new strings. If all the choices lead to “GOOD” strings then
 * the input is considered as “GOOD”, and if all the choices lead to “BAD”
 * strings then the input is “BAD”, else the string is “MIXED? – Example:
 * 1)a?fafff – BAD; 2)??aa?? – MIXED; 3) abc – GOOD 4)abcde - MIXED
 * 
 */
public class StringCheck {
	public static void main(String[] args) {

		solver("a?fafff");
		solver("??aa??");
		solver("abc");
		solver("aeiou");
		solver("aeioua");
		solver("alefigohuiaj");
	}

	private static void solver(String s) {
		int hash[] = new int[128];
		for (char c : s.toCharArray()) 
			hash[c]++;	

		int vowelCount = hash['a'] + hash['e'] + hash['i'] + hash['o'] + hash['u'];
		int consonantsCount = s.length() - vowelCount;
		//System.out.println("consonantsCount " + consonantsCount + " vowelCount " + vowelCount);
		if ((vowelCount + hash['?']) > 5 || consonantsCount > 3) {
			System.out.println("BAD");
		} else if ((vowelCount + hash['?']) < 5 && (vowelCount + hash['?']) > 0
				|| consonantsCount < 3 && consonantsCount > 0) {
			System.out.println("GOOD");
		} else {
			System.out.println("MIXED");
		}

	}
}
