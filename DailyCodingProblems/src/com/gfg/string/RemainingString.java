package com.gfg.string;

/*Given a string S without spaces, a character ch, and an integer count, the task is to find the string after the specified character has occurred count number of times.

Example 1:

Input:  S = "Thisisdemostring", ch = 'i', 
count = 3
Output: ng
Explanation: Substring of S after the 3rd
occurrence of 'i' is "ng"
Example 2:

Input:  S = "Thisisdemostri", ch = 'i', 
count = 3
Output: Empty string
Explanation: 'i' occurce 3rd time at 
last index
Your Task:
Your task is to complete the function printString() which takes a single, a character, and a
 count as inputs and returns the string. You need not take any input or print anything.

Note:  “Empty string” should be returned incase of any unsatisfying conditions (Given character is not present, or present but less than given count, or given count completes on the last index). 


Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |S| <= 105
Assume upper case and lower case
alphabets as different*/
public class RemainingString {

	public static void main(String[] args) {
		String str = "Thisisdemostring";
		char ch = 'i';
		int count = 3;
		PrintString(str, ch, count);
	}

	private static void PrintString(String str, char ch, int c) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == ch)
				count++;

			if (count == c && j == str.length() - 1) {
				System.out.println("Empty string");
			} else if (count == c) {
				System.out.println(str.substring(j + 1, str.length()));
				break;
			}
		}
		if (count <= c - 1)
			System.out.println("Empty string");
	}

}
