package array;

import java.util.Arrays;
/**
 * 
 * Shift all zeros in to right side
 *
 */
public class ShiftZeros {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 3, 0, 0, 0, 0 };


		System.out.println(Arrays.toString(shiftAllZeros(arr)));
	}

	private static int[] shiftAllZeros(int[] arr) {

		int newArr[] = new int[arr.length];
		int count = 0;
		for (int n : arr) {
			if (n != 0)
				newArr[count++] = n;
		}

		return newArr;
	}

}
