package array;

/*
 *  reference :https://practice.geeksforgeeks.org/problems/special-array-reversal/0 
Given a string S, containing special characters and all the alphabets, reverse the string without
affecting the positions of the special characters.

Example 1:

Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
â€‹Example 2:

Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string as inputs and returns required reverse string.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 105*/
public class SpecialArrayReversal {

	public static void main(String[] args) {
		String S = "A&x#";
		reverseStr(S);
	}

	private static void reverseStr(String s) {
		int i = 0, j = s.length() - 1;
		char arr[] = s.toCharArray();
		while (i <= j) {

			if (arr[i] >= 32 && arr[i] <= 47 || arr[i] >= 58 && arr[i] <= 64)
				i++;
			else if (arr[j] >= 32 && arr[j] <= 47 || arr[j] >= 58 && arr[j] <= 64)
				j--;
			else {

				char t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;

			}

		}
		System.out.println(String.valueOf(arr));
	}

}
