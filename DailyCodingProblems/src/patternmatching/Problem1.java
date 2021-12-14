package patternmatching;
/**
 * Given the Text and we have to find the Pattern
? ->means one characters are missing
* -> means multiple characters are missing
Example:
Text Pattern Output
baaabab baaa?ab TRUE
baaabab  b*ab TRUE
baaabab *ab TRUE
baaabab ba?ab FALSE
*Note: Try to avoid built in function, try to use best approach .
 *
 */
public class Problem1 {
	public static void main(String[] args) {
		System.out.println(patternCheck("baaabab", "baaa?ab"));
		System.out.println(patternCheck("baaabab", "b*ab"));
		System.out.println(patternCheck("baaabab", "*ab"));
		System.out.println(patternCheck("baaabab", "???????"));
		System.out.println(patternCheck("baaabab", "?a?a?a?"));
		System.out.println(patternCheck("baaabab", "ba?ab*"));
		System.out.println(patternCheck("baaabab", "ba*?*ab"));
		System.out.println(patternCheck("baaabab", "*"));
		System.out.println(patternCheck("baaabab", "**"));
		System.out.println(patternCheck("baaabab", "*******"));
		System.out.println(patternCheck("baaabab", "?"));
		System.out.println(patternCheck("baaabab", "???abab"));
	}

	private static boolean patternCheck(String str, String pat) {

		if (!pat.contains("*") && str.length() != pat.length())
			return false;

		for (int i = str.length()-1, j = pat.length()-1; j >= 0;) {
			if (str.charAt(i) == pat.charAt(j) || pat.charAt(j) == '?') {
				i--;
				j--;
			} else if (pat.charAt(j) == '*') {
				i = j - 1;
				j--;
			} else {
				return false;
			}
		}

		return true;
	}
}
