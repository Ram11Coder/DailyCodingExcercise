package sorting;

import java.util.Arrays;

/**
 * 
 * Sort elements on the basis of number of factors
 * 
 * Given an array of positive integers. Sort the given array in decreasing order
 * of number of factors of each element, i.e., element having the highest number
 * of factors should be the first to be displayed and the number having least
 * number of factors should be the last one. Two elements with equal number of
 * factors should be in the same order as in the original array. Examples:
 * 
 * 
 * Input : {5, 11, 10, 20, 9, 16, 23} Output : 20 16 10 9 5 11 23 Number of
 * distinct factors: For 20 = 6, 16 = 5, 10 = 4, 9 = 3 and for 5, 11, 23 = 2
 * (same number of factors therefore sorted in increasing order of index)
 * 
 * Input : {104, 210, 315, 166, 441, 180} Output : 180 210 315 441 104 166
 *
 */
public class SortByFactor {

	public static void main(String[] args) {
		int arr[] = { 5, 11, 10, 20, 9, 16, 23 };
		sort(arr);
	}

	private static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && factorSize(key) > factorSize(arr[j])) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int factorSize(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count + 2;
	}

}
