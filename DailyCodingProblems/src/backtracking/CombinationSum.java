package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/combination-sum/

// same element repeat more than once 
// Pattern : pick and Not pick
public class CombinationSum {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(2, 3, 6, 7);
		int target = 7;
		List<Integer> res = new ArrayList<>();
		sum(0, arr, res, target, arr.size());

	}

	private static void sum(int i, List<Integer> arr, List<Integer> res, int target, int n) {
		// base case

		if (i == n) {
			if (target == 0)
				System.out.println(res);
			return;
		}
		if (arr.get(i) <= target) {
			res.add(arr.get(i));
			sum(i, arr, res, target - arr.get(i), n);
			res.remove(res.size() - 1);
		}
		sum(i + 1, arr, res, target, n);
	}
}
