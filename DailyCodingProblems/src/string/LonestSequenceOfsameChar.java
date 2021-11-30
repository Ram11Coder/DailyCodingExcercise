package string;

/**
 * Given a string containing lower and uppercase alphabets, the task is to find
 * the maximum number of characters between any two same character in the
 * string.
 * 
 * Example 1:
 * 
 * Input: S = "socks" Output: 3 Explanation: There are 3 characters between the
 * two occurrences of 's'. ​Example 2:
 * 
 * Input: S = "FoR" Output: -1 Explanation: No repeating character present.
 * 
 * Your Task: You don't need to read input or print anything. Your task is to
 * complete the function maxChars() which takes the string S as input and
 * returns the maximum number of characters between any two same characters in
 * the string.
 * 
 * 
 * Expected Time Complexity: O(|S|). Expected Auxiliary Space: O(1).
 * 
 * 
 * Constraints: 1<=|S|<=10^5
 *
 * 
 */
public class LonestSequenceOfsameChar {
//Exploring on optimising the code
	public static void main(String[] args) {

		System.out.println(solver("abcccccbba"));
		System.out.println(solver("For"));
		System.out.println(solver("abccccclbk"));
		System.out.println(solver("abcccccbbaccc"));
		System.out.println(solver("SockS"));
		System.out.println(solver("Socks"));
		System.out.println(solver("happpyday"));
		System.out.println(solver("lifeisbeautiful"));

	}

	public static int solver(String s) {
		int hash[] = new int[128];
		for (int i = 0; i < s.length(); i++)
			hash[s.charAt(i)]++;

		boolean flag = false;
		for (int i = 0, j = s.length() - 1; i < j;) {
			if (hash[s.charAt(i)] == 2 && s.charAt(i) == s.charAt(j)) {
				flag = true;
				return j - i - 1;
			}
			if (hash[s.charAt(i)] == 2 && s.charAt(i) != s.charAt(j)) {
				j--;
			} else if (hash[s.charAt(j)] == 2 && s.charAt(i) != s.charAt(j)) {
				i++;
			} else {
				j--;
				i++;
			}
		}
		return (flag == false) ? -1 : 0;
	}
}
