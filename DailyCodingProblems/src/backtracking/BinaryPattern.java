package backtracking;

import java.util.Arrays;
import java.util.Scanner;

/**
 * . Print pattern like this 
 * Example: 
 * 
 * Input: 1 
 * 
 * Output: 0
 * 
 * Input: 2 
 * [0, 0]
[0, 1]
[1, 0]
[1, 1]
 * Output: 
 * 
 * 
 * Input: 3 

 Output:

[0, 0, 0]
[0, 0, 1]
[0, 1, 0]
[0, 1, 1]
[1, 0, 0]
[1, 0, 1]
[1, 1, 0]
[1, 1, 1]

 * 
 */
public class BinaryPattern {

	public static void main(String[] args) {
		System.out.println("Enter the pattern size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		binaryPat(arr, 0);
		sc.close();
	}

	private static void binaryPat(int[] arr, int n) {
		if (n > arr.length - 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		arr[n] = 0;
		binaryPat(arr, n + 1);
		arr[n] = 1;
		binaryPat(arr, n + 1);
	}
}
