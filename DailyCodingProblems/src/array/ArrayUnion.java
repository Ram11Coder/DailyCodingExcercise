package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 * 
 * Given two arrays a[] and b[] of size n and m respectively. The task is to
 * find union between these two arrays.
 * 
 * Union of the two arrays can be defined as the set containing distinct
 * elements from both the arrays. If there are repetitions, then only one
 * occurrence of element be printed in the union.
 * 
 * Example 1:
 * 
 * Input: 5 3 1 2 3 4 5 1 2 3 Output: 5 Explanation: 1, 2, 3, 4 and 5 are the
 * elements which comes in the union set of both arrays. So count is 5. Example
 * 2:
 * 
 * Input: 6 2 85 25 1 32 54 6 85 2 Output: 7 Explanation: 85, 25, 1, 32, 54, 6,
 * and 2 are the elements which comes in the union set of both arrays. So count
 * is 7. Your Task: Complete doUnion funciton that takes a, n, b, m as
 * parameters and returns the count of union elements of the two arrays. The
 * printing is done by the driver code.
 * 
 * Constraints: 1 ≤ n, m ≤ 105 0 ≤ a[i], b[i] < 105
 * 
 * Expected Time Complexity : O((n+m)log(n+m)) Expected Auxilliary Space :
 * O(n+m)
 *
 * 
 */
public class ArrayUnion {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		int arr1[] = { 85, 25, 1, 32, 54, 6 };
		int arr2[] = { 85, 2 };

		int[] res = new int[arr1.length + arr2.length];
		if (arr1.length >= arr2.length) {
			List<Integer> list1 = new ArrayList<Integer>();
			for (Integer i : arr1) 
				list1.add(i);
			
			int i = 0;
			for (i = 0; i < arr1.length; i++)
				res[i] = arr1[i];

			for (int j = i, k = 0; j < res.length; j++, k++)
				if (list1.indexOf(arr2[k]) == -1)
					res[j] = arr2[k];

		} else {
			int i = 0;
			List<Integer> list2 = new ArrayList<Integer>();
			for (Integer e : arr2) 
				list2.add(e);			

			for (i = 0; i < arr2.length; i++)
				res[i] = arr2[i];

			for (int j = i, k = 0; j < res.length; j++)
				if (list2.indexOf(arr1[k]) == -1)
					res[j] = arr1[k++];
		}
		//System.out.println(Arrays.toString(res));
		int count = 0;
		for (int i : res) 
			if (i != 0)
				count++;
		
		System.out.println(count);
	}

	
	//Java8 Solution
	public void Java8Solution(int[] arr1,int arr2[]) {
	  
	}
}
