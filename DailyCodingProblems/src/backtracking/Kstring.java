package backtracking;

import java.util.Arrays;
/**
 * This problem is similar to binary pattern
 * But binary pattern will execute 2^n time
 * Kstring will execute k^n time 
 */
public class Kstring {
	static int n = 2, k = 4;
	static int arr[] = new int[n];

	public static void main(String[] args) {
		kString(n);
	}

	private static void kString(int n) {
		if (n < 1) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int i = 0; i <k; i++) {
				arr[n - 1] = i;
				kString(n - 1);
			}
		}
	}
}
