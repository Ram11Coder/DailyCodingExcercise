package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println("Before sorting :\n" + Arrays.toString(arr));
		// solver(arr);
		solver2ndApproach(arr);
	}

	private static void solver2ndApproach(int[] arr) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("After sorting :\n" +Arrays.toString(arr));
	}

	public static void solver(int[] arr) {
		int n = arr.length, k = 0, j;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			boolean flag = false;
			for (j = i - 1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j + 1] = arr[j];
					k = j;
					flag = true;
				}
			}

			if (flag)
				arr[k] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
