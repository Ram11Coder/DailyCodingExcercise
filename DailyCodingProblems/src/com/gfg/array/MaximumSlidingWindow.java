package com.gfg.array;

/**
 * Given a sliding window of size k print the maximum of the numbers under the
 * sliding window. Example: Consider a sliding window of size k equals 3. Let
 * the array be [3,2,7,6,5,1,2,3,4] the output should print 7 as the first
 * output as first window contains {3,2,7} and second window contains {2,7,6}
 * and so on and the final output is {7,7,7,6,5,3,4}
 *
 */
public class MaximumSlidingWindow {

	/**
	 * Given an array arr[] of size N and an integer K. Find the maximum for each
	 * and every contiguous subarray of size K.
	 * 
	 * Example 1:
	 * 
	 * Input: N = 9, K = 3 arr[] = 1 2 3 1 4 5 2 3 6 Output: 3 3 4 5 5 5 6
	 * Explanation: 1st contiguous subarray = {1 2 3} Max = 3 2nd contiguous
	 * subarray = {2 3 1} Max = 3 3rd contiguous subarray = {3 1 4} Max = 4 4th
	 * contiguous subarray = {1 4 5} Max = 5 5th contiguous subarray = {4 5 2} Max =
	 * 5 6th contiguous subarray = {5 2 3} Max = 5 7th contiguous subarray = {2 3 6}
	 * Max = 6
	 */
	public static void main(String[] args) {
		int N = 9, K = 3;
		int arr[] = { 3, 2, 7, 6, 5, 1, 2, 3, 4 };

		for (int i = 0; i <= N - K; i++) {
			int max = 0;
			for (int j = i; j < K + i; j++) {
				if (max <= arr[j])
					max = arr[j];

			}
			System.out.print(max + ",");
		}

	}
}
