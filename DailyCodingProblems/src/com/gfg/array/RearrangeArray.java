package com.gfg.array;

/**
 * Given an array of integers, write a program to re-arrange the array in the
 * given form. 1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest,
 * 3rd_largest……. Etc.
 *
 */
public class RearrangeArray {
	public static void main(String[] args) {

		int max = 0/** k = 0 */
				, min_index = 0, max_index = 0, min = Integer.MAX_VALUE;

		int arr[] = {6,5,4,3,2,1 };
		// commented the below codes in the program for
		// int new_arr[] = new int[arr.length];
		for (int i = 0; i < arr.length / 2; i++) {
			max = 0;
			min = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != -1) {
					if (arr[j] != -1) {
						if (max < arr[j]) {
							max = arr[j];
							max_index = j;
						}

						if (min > arr[j]) {
							min = arr[j];
							min_index = j;
						}
					}

				}

			}

//			new_arr[k++] = max;
//			new_arr[k++] = min;
			System.out.print(max + " " + min + " ");
			arr[min_index] = -1;
			arr[max_index] = -1;
		}

//		for (int j : new_arr) {
//			System.out.print(j + " ");
//		}
	}
}
