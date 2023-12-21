package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 2, 1, 3, 4, 3 };
		// Number of bucket increase then time reduce
		int numberOfBuckets = 3;

		List<List<Integer>> buckets = getBuckets(arr, numberOfBuckets);
		int i = 0;
		for (List<Integer> list : buckets) {
			Collections.sort(list); // sort the each bucket
			for (int li : list) {
				arr[i++] = li;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static List<List<Integer>> getBuckets(int[] arr, int numberOfBuckets) {

		List<List<Integer>> buckets = new ArrayList<List<Integer>>();

		for (int i = 0; i < numberOfBuckets; i++)
			buckets.add(new ArrayList<Integer>());

		for (int i = 0; i < arr.length; i++) {
			buckets.get(arr[i] / numberOfBuckets).add(arr[i]);
		}
		return buckets;
	}
}
