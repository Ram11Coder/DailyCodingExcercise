package searching;

/**
 * TC - O(log i)
 */
		
public class ExponentialSearch {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int key = 4;
		int bound = expsearch(arr, key);
		int left = bound / 2;
		int right = Math.min(bound, arr.length - 1);
		int res = BinarySearch.iterativeBS(arr, key, left, right);
		System.out.println(res);
	}

	// Find the bound of the array where target is present, then do binarysearch
	private static int expsearch(int[] arr, int target) {
		int bound = 1;
		while (bound < arr.length && arr[bound] < target) {
			bound *= 2;
		}
		return bound;

	}
}
