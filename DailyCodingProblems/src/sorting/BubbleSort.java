package sorting;

import java.util.Arrays;

/**
 * 
 * Bubble sort will swaps the elements will not in correct order
 * ex:(5,3)
 * 5 is greater than 3 so it is not in correct position
 * so it will swap both 5 and 3 
 * 
 *
 */

/**
 * Worst and Average Case Time Complexity: O(n*n). 
 * Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1)
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
Sorting In Place: Yes
Stable: Yes
 *
 *
 *use case:
 * it is used in a polygon filling algorithm, where bounding lines are sorted by their x 
 * coordinate at a specific scan line (a line parallel to x axis) and with incrementing y
 *  their order changes (two elements are swapped) only at intersections of two lines
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 1, 9, 8, 2, 4, 7 };
		System.out.print("Before sorting : \n" + Arrays.toString(arr));
		solver(arr);

	}

	private static void solver(int[] arr) {
		int n = arr.length, temp;
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false)// if there is no swap then array is already sorted
				break;
		}
		System.out.print("\nAfter sorting : \n" + Arrays.toString(arr));
	}

}
