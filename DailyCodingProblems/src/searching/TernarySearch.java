package searching;

/**
 * TC - O(log3N) 
 * 
 * Divide the array into 3 partition and do the search
 * It is not faster than binary search
 */
public class TernarySearch {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int left = 0, right = arr.length;

		int key = 14;
		int res = ternarySearch(arr, key, left, right);
		System.out.println(res);
	}

	private static int ternarySearch(int[] arr, int key, int left, int right) {
		if (left > right)
			return -1;

		int parition = (right - left) / 3;
		int mid1 = left + parition;
		int mid2 = right - parition;
		if (arr[mid1] == key) {
			return mid1;
		}
		if (arr[mid2] == key) {
			return mid2;
		}
		if (arr[mid1] > key) {
			return ternarySearch(arr, key, left, mid1 - 1);
		}

		if (arr[mid2] < key) {
			return ternarySearch(arr, key, mid2 + 1, right);
		}
		return ternarySearch(arr, key, mid1 + 1, mid2 - 1);
	}
}
