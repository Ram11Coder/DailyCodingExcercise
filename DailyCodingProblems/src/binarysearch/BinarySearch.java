package binarysearch;

public class BinarySearch {
//Elements should be sorted then only binary search will work
	// Need to check some edge test cases

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 4;
		System.out.println(bs(arr, key, 0, arr.length));
		System.out.println(iterativeApproach(arr, key));
	}

	public static int iterativeApproach(int[] arr, int key) {
		for (int i = 0, j = arr.length; i <= j;) {
			int mid = (i + j) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (key > arr[mid])
				i = mid + 1;
			if (key < arr[mid])
				j = mid - 1;

		}
		return -1;
	}

	private static int bs(int[] arr, int key, int l, int r) {
		int mid = (l + r) / 2;

		if (arr[mid] == key)
			return mid;
		if (key > arr[mid])
			return bs(arr, key, mid + 1, r);
		else if (key < arr[mid])
			return bs(arr, key, l, mid - 1);

		return -1;
	}
}
