package backtracking;

import java.util.ArrayList;
import java.util.List;

//find permutation using swap approach

/**
 * Time complexity : O(n! *n)
 * 
 * Space complexity : O(n)
 *
 */
public class Permutation2 {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> res = new ArrayList<>();
		findPermutation(0, nums, res);
		System.out.println(res);
	}

	private static void findPermutation(int ind, int[] nums, List<List<Integer>> res) {

		if (ind == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}
			res.add(new ArrayList<>(ds));
			return;
		}
		for (int i = ind; i < nums.length; i++) {
			swap(ind, i, nums);
			findPermutation(ind + 1, nums, res);
			swap(ind, i, nums);// backtracking
		}
	}

	private static void swap(int ind, int i, int[] nums) {
		int t = nums[ind];
		nums[ind] = nums[i];
		nums[i] = t;
	}
}
