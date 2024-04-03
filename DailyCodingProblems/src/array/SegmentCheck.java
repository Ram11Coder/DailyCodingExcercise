package array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array arr[] and size of array is n and one another key x, and give you a segment size k.
 * The task is to find that the key x present in every segment of size k in arr[]. Examples:
 * 
 * Input : arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} x = 3 k = 3 Output : Yes There are 4
 * non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}.
 * 3 is present all segments. Input : arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
 * x = 23 k = 5 Output :Yes There are three segments and last segment is not full {21, 23, 56, 65,
 * 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 23 is present all window. Input :arr[] = { 5, 8, 7,
 * 12, 14, 3, 9} x = 8 k = 2 Output : No
 */
// find the o(n) method
public class SegmentCheck {

	public static boolean optimalApproach(int a[], int key, int seg) {
		boolean isSegmentPresent = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				isSegmentPresent = true;

			if ((i + 1) % seg == 0 || i == a.length - 1) {
				if (!isSegmentPresent)
					return isSegmentPresent;
				isSegmentPresent = false;
			}
		}
		return true;
	}

	public static boolean segCheck(int a[], int key, int seg, int val) {
		int count = 0;
		int size = (seg + val < a.length) ? seg + val : a.length;
		for (int i = val; i < size; i++) 
			if (a[i] == key && seg > count++)
				return true;
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0, seg = 0;

		int a[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3 };

		System.out.println("Enter the key value to search :");
		key = sc.nextInt();
		System.out.println("Enter the segment range to search the key:");
		seg = sc.nextInt();
		System.out.println("Array is : " + Arrays.toString(a));
		//bruteforce(key, seg, a);
		isAllValidSegment(optimalApproach(a, key, seg));
		
		System.out.println("\nSegments: ");
		for (int pos = 0; pos < a.length; pos += seg)
			System.out.println(Arrays.toString(Arrays.copyOfRange(a, pos, pos + seg)));

		sc.close();
	}

	private static void bruteforce(int key, int seg, int[] a) {
		boolean check = true;
		for (int i = 0; i < a.length; i += seg) {
			if (check != segCheck(a, key, seg, i)) {
				check = false;
				break;
			}
		}
		isAllValidSegment(check);
	}

	private static void isAllValidSegment(boolean check) {
		System.out.println((check == false) ? "Some segments are not valid" : "All segments are valid");
	}
}
