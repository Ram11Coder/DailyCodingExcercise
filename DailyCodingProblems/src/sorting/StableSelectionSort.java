package sorting;

import java.util.Arrays;

/**
 * 
 * Selection sort is not stable so Order of elements not maintained
 * 
 * Example:(Here A and B are the orders) 
 * Input : 4A 5 3 2 4B 1 
 * Output : 1 2 3 4B 4A 5
 * 
 * Stable Selection Sort would have produced 
 * Output : 1 2 3 4A 4B 5
 *
 */
public class StableSelectionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 3, 2, 4, 1 };
		solver(arr);

	}

	private static void solver(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (arr[min] > arr[j])
					min = j;

			int val = arr[min];

			while (i < min) {
				arr[min] = arr[min - 1];
				min--;
			}
			arr[i] = val;

		}
		System.out.println(Arrays.toString(arr));
	}

}
