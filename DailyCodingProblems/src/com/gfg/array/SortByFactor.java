package com.gfg.array;

/**
 * To find the factors of the numbers given in an array and to sort the numbers
 * in descending order according to the factors present in it. Input: Given
 * array : 8, 2, 3, 12, 16 Output: 12, 16, 8, 2, 3
 *
 */
public class SortByFactor {
	public static void main(String[] args) {

		int arr[] = { 8, 2, 3, 12, 16 }, factors[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			factors[i] = checkFactor(arr[i]);
		}
		sortArray(factors, arr);
	}

	static void sortArray(int[] factors, int[] arr) {
		int max = 0, i;
		for (i = 0; i < factors.length; i++) {
			max = i;
			for (int j = i + 1; j < factors.length; j++) {
				// 4,2,2,6,5
				// 6,2,2,4,5

				if (factors[max] <= factors[j])
					max = j;

			}
			swap(factors, max, i);
			swap(arr, max, i);
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

	static void swap(int[] factors, int max, int i) {

		int t = factors[i];
		factors[i] = factors[max];
		factors[max] = t;
	}

	static void arrswap(int[] arr, int max, int i) {

		int t = arr[i];
		arr[i] = arr[max];
		arr[max] = t;

	}

	static int checkFactor(int i) {
		int c = 0;
		if (i == 0 || i == 1) {
			return i;
		}

		for (int j = 1; j <= i; j++) {
			if (i % j == 0)
				c++;
		}

		return c;
	}
}
