package stack;

import java.util.Stack;

//Ref :- https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

/**
 * Given an expression string x. Examine whether the pairs and the orders of
 * “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the function should
 * return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.
 * 
 * Example 1:
 * 
 * Input: {([])} Output: true Explanation: { ( [ ] ) }. Same colored brackets
 * can form balaced pairs, with 0 number of unbalanced bracket. Example 2:
 * 
 * Input: () Output: true Explanation: (). Same bracket can form balanced pairs,
 * and here only 1 type of bracket is present and in balanced way. Example 3:
 * 
 * Input: ([] Output: false Explanation: ([]. Here square bracket is balanced
 * but the small bracket is not balanced and Hence , the output will be
 * unbalanced. Your Task: This is a function problem. You only need to complete
 * the function ispar() that takes a string as a parameter and returns a boolean
 * value true if brackets are balanced else returns false. The printing is done
 * automatically by the driver code.
 * 
 * Expected Time Complexity: O(|x|) Expected Auixilliary Space: O(|x|)
 * 
 * Constraints: 1 ≤ |x| ≤ 32000
 * 
 * Note: The drive code prints "balanced" if function return true, otherwise it
 * prints "not balanced".
 *
 */
public class ParenthesisChecker {
	public static void main(String[] args) {
		System.out.println(ispar("[()]{}{[()()]()}"));
		System.out.println(ispar("([]"));
		System.out.println(ispar("{([])}"));
		System.out.println(ispar("[(]"));
		System.out.println(ispar("{}[()]"));
		System.out.println(ispar("(()()()())()"));

		System.out.println("--------------------------");

		System.out.println(String.format("Has matching parens %s? : %s", "(abcd)", ispar("(abcd)")));
		System.out.println(String.format("Has matching parens %s? : %s", "{{{{}}", ispar("{{{{}}")));
		System.out.println(String.format("Has matching parens %s? : %s", "{{{{}}})", ispar("{{{{}}})")));
		System.out.println(String.format("Has matching parens %s? : %s", "{{{}}}()", ispar("{{{}}}()")));
		System.out.println(String.format("Has matching parens %s? : %s", "{{{}}]()", ispar("{{{}}]()")));
		System.out.println(String.format("Has matching parens %s? : %s", "{{}}([]){}{}{}{}{[[[[]]]]}",
				ispar("{{}}([]){}{}{}{}{[[[[]]]]}")));
	}

	private static boolean ispar(String str) {

		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				s.push(c);
			else if (c == ')' || c == '}' || c == ']') {
				if (s.isEmpty() || s.peek() != getParen(c))
					return false;
				s.pop();
			}
		}
		if (s.isEmpty())
			return true;

		return false;
	}

	public static char getParen(char c) {
		switch (c) {
		case '}':
			return '{';
		case ')':
			return '(';
		case ']':
			return '[';

		}
		return ' ';
	}
}
