package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * Time complexity -> 2^n +2^n *(log2^n)
 * 
 * Recursive call -> 2^n
 * 
 * sorting -> 2^n *(log2^n)
 * 
 */
public class SubsetSum1 {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 2 };
		List<Integer> list = new ArrayList<>();
		subsetSum(0, arr, list, 0);
		Collections.sort(list);
		System.out.println(list);
	}

	private static void subsetSum(int i, int[] arr, List<Integer> list, int sum) {
		if (i == arr.length) {
			list.add(sum);
			return;
		}
		// Pick the element
		subsetSum(i + 1, arr, list, sum + arr[i]);

		// Not Pick the element
		subsetSum(i + 1, arr, list, sum);
		
		
	}
}
