package string;

import java.util.Arrays;

/**
Remove the duplicates in the String. 
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is capital Z. The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
 *
 * 
 */
public class RemoveDuplicates {
	public static void main(String[] args) {

		removeDup("Java1234");
		removeDup("Python1223");
		removeDup("aBuZz9900");//Working on 3rd test case
	}

	private static void removeDup(String str) {
		int hash[] = new int[128];
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (hash[(int) arr[i]] >= 1) {
				if (arr[i] == '9') {
					arr[i] = '0';
				} else
					arr[i]++;
				hash[arr[i]]++;
			} else {
				hash[arr[i]]++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
