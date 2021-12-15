package stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Remove unbalanced parentheses in a given expression. Eg.) Input :
 * ((abc)((de)) Output : ((abc)(de))
 * 
 * Input : (((ab) Output : (ab)
 *
 */

public class BalanceParenthesis {
	private static Map<Character, Character> paren = new HashMap<Character, Character>();
	private static Set<Character> containsParen = new HashSet<Character>();

	static {
		paren.put('}', '{');
		paren.put(')', '(');
		paren.put(']', '[');
		containsParen.addAll(paren.values());
	}

	public static void main(String[] args) {

		System.out.println(balanceSolver("((abc)((de)))"));
		System.out.println(balanceSolver("(((ab)"));
		System.out.println(balanceSolver("([a+b])(b(d*e)))"));
		System.out.println(balanceSolver("(({}{}{})"));
		
	}

	public static boolean balanceSolver(String input) {

		try {
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (containsParen.contains(ch)) {
					stack.push(ch);
				}
				if (paren.containsKey(ch)) {
					char lastValue = stack.pop();
					if (lastValue != paren.get(ch)) {
						return false;
					}
				}
			}

			return stack.isEmpty();
		} catch (Stack.StackOverflowException soe) {
			System.err.println("Stack Overflow");
		} catch (Stack.StackUnderflowException sue) {
			System.err.println("Stack Underflow");
		}
		return false;

	}

}
