package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*An array is given of n length, and we need to calculate the next greater element for each element in the given array. If the next greater element is not available in the given array then we need to fill ‘_’ at that index place.

Examples : 

Input :  6 3 9 8 10 2 1 15 7 
Output : 7 6 10 9 15 3 2 _ 8
Here every element of array has next greater 
element but at index 7,
15 is the greatest element of given array
and no other element is greater from 15 
so at the index of 15 we fill with '_' .

Input  : 13 6 7 12
Output : _ 7 12 13
Here, at index 0, 13 is the greatest 
value in given array and no other 
array element is greater from 13 so
at index 0 we fill '_'.

reference : https://practice.geeksforgeeks.org/problems/smallest-greater-elements-in-whole-array/0/
*/
public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };
		nextGreater(arr);
		nextGreaterWithSorting(arr);

	}

//Time complexity O(n*logn)
	private static void nextGreaterWithSorting(int[] arr) {
		List<Integer> list = new ArrayList<>();

		for (int i : arr)
			list.add(i);

		Collections.sort(list);

		for (int i = 0; i < arr.length; i++)
			if (list.indexOf(arr[i]) != list.size() - 1)
				System.out.print(list.get(list.indexOf(arr[i]) + 1) + ", ");
			else
				System.out.print("_ , ");
	}

	private static void nextGreater(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i], max = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[j] > val && arr[j] < max)
					max = arr[j];
			}
			if (max == Integer.MAX_VALUE)
				System.out.print("_ ");
			else
				System.out.print(max + " ");

		}

	}

}
