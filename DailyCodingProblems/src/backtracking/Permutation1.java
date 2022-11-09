package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time complexity : O(n! *n)
 * 
 * Space complexity : O(n)+O(n)[map]
 */

public class Permutation1 {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3 };
		boolean[] freq = new boolean[nums.length];
		List<List<Integer>> res = new ArrayList<>();
		findPermutation(nums, freq, res, new ArrayList<Integer>());
		System.out.println(res);
	}

	private static void findPermutation(int[] nums, boolean[] freq, List<List<Integer>> res, ArrayList<Integer> ds) {
		if (ds.size() == nums.length) {
			res.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				findPermutation(nums, freq, res, ds);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}

	}

}
