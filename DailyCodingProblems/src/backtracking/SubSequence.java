package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {

	public static void printSequence(int i, List<Integer> arr, int n, List<Integer> res) {

		if (i >= n) {
			System.out.println(res);
		} else {
			res.add(arr.get(i));
			printSequence(i + 1, arr, n, res);
			res.remove(res.size() - 1);
			printSequence(i + 1, arr, n, res);

		}
	}

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(3, 1, 2);
		int n = arr.size();
		List<Integer> res = new ArrayList<Integer>();
		printSequence(0, arr, n, res);

	}
}
