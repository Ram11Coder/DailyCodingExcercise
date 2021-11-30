package string;

import java.util.Arrays;

/**
 * Given 2 strings A and B, check if swapping 2 characters only once in string A
 * makes the string equal to B. Input: A = flrweo B = flower Output: True
 */
public class StringSwap {

	public static void main(String[] args) {
		System.out.println(swap("flrweo", "flower"));
		System.out.println(swap("flrweoo", "floweor"));
		System.out.println(swap("flrweror", "flowerrr"));
		System.out.println(swap("monga", "mango"));
		System.out.println(swap("paece", "peace"));
		System.out.println(swap("aabccc", "aacccb"));
		System.out.println(swap("  ", " "));
		System.out.println(swap("", ""));
	}

	private static boolean swap(String A, String B) {
		if (A.length() != B.length() || A.isBlank() || B.isBlank())
			return false;

		char[] arr1 = A.toCharArray();
		char[] arr2 = B.toCharArray();
		int startIndex = 0;

		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i]) {
				startIndex = i;
				return checkEnd(startIndex, arr1, arr2, arr1[i]);
			}
		return false;
	}

	private static boolean checkEnd(int startIndex, char[] arr1, char[] arr2, char c) {
		for (int i = startIndex + 1; i < arr2.length; i++)
			if (arr2[i] == c) {
				char t = arr1[startIndex];
				arr1[startIndex] = arr1[i];
				arr1[i] = t;
				if (Arrays.equals(arr1, arr2))
					return true;
			}
		return false;
	}
}
