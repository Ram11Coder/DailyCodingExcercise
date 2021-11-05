package com.gfg.array;

import java.util.Arrays;
/**
 * 
 * Shift all zeros in to left
 *
 */
public class ShiftZerosLeft {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 3, 0, 0, 0, 0 };

		System.out.println(Arrays.toString(shiftAllZerosLeft(arr)));// O(n)
		Arrays.sort(arr);// O(n log(n))
		// System.out.print(Arrays.toString(arr));
	}

	private static int[] shiftAllZerosLeft(int[] arr) {

		int newArr[] = new int[arr.length];
		int count = 0;

		for (int m : arr)
			if (m == 0)
				count++;
		for (int n : arr) {
			if (n != 0)
				newArr[count++] = n;
		}

		return newArr;
	}
}
