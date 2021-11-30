package array;

import java.util.Arrays;

/**
 * Given an array of integers, compute the maximum value for each integer in the
 * index, by either summing all the digits or multiplying all the digits.
 * (Choose which operation gives the maximum value)
 * 
 * Input: 5 120 24 71 10 59
 * 
 * Output: 3 8 8 1 45
 * 
 * Explanation: For index 0, the integer is 120. Summing the digits will give 3,
 * and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.
 *
 *
 */
public class MaximumValueAtIndex {
	public static void main(String[] args) {

		int[] arr = { 5, 120, 24, 71, 10, 59 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Math.max(addValue(arr[i]), mulValue(arr[i])) + " ");
		}
	}

	private static int mulValue(int num) {
		int rem = 1;
		while (num > 0) {
			rem *= num % 10;
			num /= 10;
		}
		return rem;
	}

	private static int addValue(int num) {
		int rem = 0;
		while (num > 0) {
			rem += num % 10;
			num /= 10;
		}
		return rem;
	}
}
