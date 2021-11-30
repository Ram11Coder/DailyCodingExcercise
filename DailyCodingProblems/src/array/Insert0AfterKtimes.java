package array;

import java.util.Arrays;

/*
 *  Insert 0 after consecutive (K times) of 1 is found.
Example:
Input:
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2
 
Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
*/
public class Insert0AfterKtimes {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(arr));
		int k = 2;
		System.out.print("[");
		checKConsectiveKtimes(arr, k);
		System.out.print("]");
	}

	private static void checKConsectiveKtimes(int[] arr, int k) {

		for (int i = 0; i < arr.length - 1;) {
			int c = 1;
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[j] + ", ");
				if (arr[j] == 1 && arr[j + 1] == 1) {
					c++;
				}
				if (k == c) {
					System.out.print(arr[j + 1] + ", ");
					System.out.print(0 + ", ");
					c = 0;
					i = j+2;
					break;
				}
			}

		}

	}
}
