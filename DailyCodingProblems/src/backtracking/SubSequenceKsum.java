package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceKsum {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 1);
		int n = arr.size();
		int k = 2;
		List<Integer> res = new ArrayList<>();
		System.out.println("Print subsequences:");
		printSequenceKsum(0, arr, res, n, k, 0);
		System.out.println("Print any k subsequence once : ");
		printSequenceKsumOnce(0, arr, res, n, k, 0);
		System.out.println("Subsequence count :" + subSequenceCount(0, arr, res, n, k, 0));

	}

	private static void printSequenceKsum(int i, List<Integer> arr, List<Integer> res, int n, int k, int sum) {

		if (i == n) {
			if (k == sum)
				System.out.println(res);

			return;
		} else {
			// Take
			res.add(arr.get(i));
			sum += arr.get(i);
			printSequenceKsum(i + 1, arr, res, n, k, sum);
			res.remove(res.size() - 1);
			sum -= arr.get(i);

			// Not take
			printSequenceKsum(i + 1, arr, res, n, k, sum);

		}

	}

	private static boolean printSequenceKsumOnce(int i, List<Integer> arr, List<Integer> res, int n, int k, int sum) {

		if (i == n) {
			if (k == sum) {
				System.out.println(res);
				return true;
			}
			return false;
		} else {
			// Take
			res.add(arr.get(i));
			sum += arr.get(i);
			if (printSequenceKsumOnce(i + 1, arr, res, n, k, sum))
				return true;
			res.remove(res.size() - 1);
			sum -= arr.get(i);

			// Not take
			if (printSequenceKsumOnce(i + 1, arr, res, n, k, sum))
				return true;

			return false;
		}
	}

	private static int subSequenceCount(int i, List<Integer> arr, List<Integer> res, int n, int k, int sum) {

		if (i == n) {
			if (k == sum) {
				return 1;
			}
			return 0;
		} else {
			// Take
			res.add(arr.get(i));
			sum += arr.get(i);
			int left = subSequenceCount(i + 1, arr, res, n, k, sum);
			res.remove(res.size() - 1);
			sum -= arr.get(i);

			// Not take
			int right = subSequenceCount(i + 1, arr, res, n, k, sum);
			return left + right;
		}

	}
}
