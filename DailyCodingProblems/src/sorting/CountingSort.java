package sorting;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 4, 1, 2, 4, 3 };
		int max = Arrays.stream(arr).max().getAsInt();

		int freq[] = new int[max + 1];

		for (int i : arr)
			freq[i]++;

		int k = 0;
		for (int i = 0; i < freq.length; i++)
			for (int j = 0; j < freq[i]; j++)
				arr[k++] = i;

		System.out.println(Arrays.toString(arr));
	}
}