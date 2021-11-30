package array;

import java.util.Arrays;

//https://www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/

/*
 * Given an array of integers, replace every element with the next greatest element
 *  (greatest element on the right side) in the array. Since there is no element
 *   next to the last element, replace it with -1.
 *    For example, if the array is {16, 17, 4, 3, 5, 2},
 *     then it should be modified to 
 *     {17, 5, 5, 5, 2, -1}. 
 * */
public class ReplaceNextGreaterElemetAtRight {

	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2 };
		nextGreater(arr);
	}

	private static void nextGreater(int[] arr) {
		int max;
		for (int i = 0; i < arr.length - 1; i++) {
			max = Integer.MIN_VALUE;
			for (int j = i + 1; j < arr.length; j++) 
				if (max < arr[j]) 
					max = arr[j];
			arr[i] = max;

		}
		arr[arr.length - 1] = -1;
		System.out.println(Arrays.toString(arr));
	}

}
