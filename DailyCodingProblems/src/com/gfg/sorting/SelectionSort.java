package com.gfg.sorting;

import java.util.Arrays;

/**
 * Selection sort Logic : Find the smallest element in the array and swap it to
 * first position ,next small element swap it to 2nd position and so on
 * 
 * You will get the sorted array (Ascending order)
 *
 * Time Complexity: O(n2) as there are two nested loops. Auxiliary Space: O(1)
 */
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };

		solver(arr);
	}

	static void solver(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			boolean flag = false;
			for (int j = i; j < arr.length - 1; j++) {

				if (arr[minIndex] > arr[j + 1]) {
					minIndex = j + 1;
					flag = true;
				}

			}
			if (flag == false)
				break;

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

			// System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
