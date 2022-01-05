package sorting;

import java.util.Arrays;

/**
 * Time complexity O(n^(3/2))
 * 
 * For increments 2^k-1 for k=1,2,3...
 * 
 * Space complexity - O(1)
 *
 */
public class ShellSort {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 5, 4, 9, 7, 8, 10 };
		int increment = arr.length / 2;
		while (increment >= 1) {
			for (int start = 0; start < increment; start++) {
				insertionSort(arr, start, increment);
			}
			increment /= 2;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr, int start, int increment) {
		for (int i = start; i < arr.length; i += increment) {
			for (int j = Math.min(i + increment, arr.length - 1); j > 0; j -= increment) {
				if (arr[j] < arr[j - increment]) {
					int t = arr[j];
					arr[j] = arr[j - increment];
					arr[j - increment] = t;
				} else {
					break;
				}
			}
		}
	}
}
