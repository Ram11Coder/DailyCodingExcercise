package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/

/**
 * Bruteforce Approach :
 * We can follow same approach in combination sum 
			sum(i+1, arr, res, target - arr.get(i), n);// instead of calling same value more than once 
 *
 * Use set data struture to store the unique values
 * 
 * Time Complexity : O(2^n *(k)*(logn) )
 *  k -> Putting datastruture into another DS
 *  logn -> putting it into set
 */
public class CombinationSum_2 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 1, 2 };
		int target = 4;
		System.out.println(combinationSum(arr, target));
	}

	private static List<List<Integer>> combinationSum(int[] arr, int target) {

		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		findCombinations(0, arr, target, ans, new ArrayList<Integer>());

		return ans;
	}

	private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans,
			ArrayList<Integer> ds) {
		if (target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = ind; i < arr.length; i++) {
			if (i > ind && arr[i] == arr[i - 1])
				continue;
			if (target < arr[i])
				break;

			ds.add(arr[i]);
			findCombinations(i + 1, arr, target - arr[i], ans, ds);
			ds.remove(ds.size() - 1);
		}
	}
}
