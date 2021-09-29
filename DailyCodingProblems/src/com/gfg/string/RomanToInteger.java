package com.gfg.string;

import java.util.HashMap;

/*Given a string in roman no format (s)  your task is to convert it to an integer .
 *  Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
Your Task:
Complete the function romanToDecimal() which takes a string as input parameter and returns the 
equivalent decimal number. 

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)

Constraints:
1<=roman no range<=3999

*/
public class RomanToInteger {

	public static void main(String[] args) {

		String s = "MCMIV";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		checkRoman(s, map);
	}

	private static void checkRoman(String s, HashMap<Character, Integer> map) {
		if (s.length() == 1)
			System.out.println("Integer form of Roman Numeral is : " + map.get(s.charAt(0)));
		else if (checkSameNumerals(s))
			System.out.println("Integer form of Roman Numeral is : " + map.get(s.charAt(0)) * s.length());
		else
			numeralSolver(s, map);

	}

	private static void numeralSolver(String s, HashMap<Character, Integer> map) {
		int sum = 0;
		for (int i = s.length() - 1; i >= 1;) {
			if (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1)))
				sum += map.get(s.charAt(i)) + map.get(s.charAt(i - 1));
			else
				sum += map.get(s.charAt(i)) - map.get(s.charAt(i - 1));

			i -= 2;
			// System.out.println("Sum : " + sum);
		}
		if (s.length() % 2 != 0) {
			if (map.get(s.charAt(0)) >= map.get(s.charAt(1)))
				sum += map.get(s.charAt(0));
			else
				sum -= map.get(s.charAt(0));
		}
		System.out.println("Integer form of Roman Numeral is : " + sum);
	}

	private static boolean checkSameNumerals(String s) {
		for (int i = 0; i < s.length() - 1; i++)
			if (s.charAt(i) != s.charAt(i + 1))
				return false;
		return true;
	}
}
