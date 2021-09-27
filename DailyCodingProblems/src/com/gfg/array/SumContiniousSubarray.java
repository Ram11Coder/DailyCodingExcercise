package com.gfg.array;
/*Find the largest sum contiguous subarraywhich should not have negative numbers. 
 * We have to print the sum and the corresponding array elements which brought up the
sum.
 
Sample: 
Array : {­2, 7, 5, ­1, 3, 2, 9, ­7} 
 
Output: 
     Sum : 14 
     Elements : 3, 2, 9 
*/

public class SumContiniousSubarray {
	public static void main(String[] args) {
		int arr[] = { -2, 7, 5, -1, 3, 2, 9, -7 };
		int n = arr.length;
		System.out.println("Largest continious subarray = " + solver(arr, n));
		/*
		 * Find the largest sum contiguous subarraywhich should not have negative
		 * numbers.
		 */
		subArrayWithoutNegative(arr, n);
	}

	private static void subArrayWithoutNegative(int[] arr, int n) {
		// Create the algorithm to check largest sub array without negative

	}

	private static int solver(int[] arr, int n) {

		int max_so_far = Integer.MIN_VALUE, max_end_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < arr.length; i++) {

			max_end_here = max_end_here + arr[i];

			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
				start = s;
				end = i;
			}

			if (max_end_here < 0) {
				max_end_here = 0;
				s += 1;
			}
		}
		System.out.println("Starting index from " + s + " to Ending index " + end);
		return max_so_far;
	}
}
