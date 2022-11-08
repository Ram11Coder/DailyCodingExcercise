package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Subset Sum 2
 * 
 * Bruteforce approach :
 * 
 * Generate the all the 2^n subset using pick and not pick approach and put it
 * into the set, so there is no duplicate
 * 
 * then convert the set into arraylist
 * 
 * Optimised solution:
 * 
 * optimise the recursive call
 * 
 * 
 */
public class SubsetSum2 {
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 3, 2, 2, 2, 3);
		List<List<Integer>> res = new ArrayList<>();
		Collections.sort(arr);
		sumFunc(0, arr, res, new ArrayList<Integer>());
		System.out.println(res);
	}

	private static void sumFunc(int ind, List<Integer> arr, List<List<Integer>> res, List<Integer> ds) {

		res.add(new ArrayList<>(ds));

		for (int i = ind; i < arr.size(); i++) {
			if (i != ind && arr.get(i) == arr.get(i - 1))
				continue;
//pick
			ds.add(arr.get(i));
			sumFunc(i + 1, arr, res, ds);
//not pick
			ds.remove(ds.size() - 1);
		}

	}
}
