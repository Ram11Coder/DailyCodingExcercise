package com.gfg.array;

import java.util.Scanner;

/*Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].
Examples: 

Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
Input : 
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
x = 23 
k = 5 
Output :Yes 
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
x = 8 
k = 2 
Output : No*/
//find the o(n) method
public class Array1 {
	public static boolean segCheck(int a[], int key, int seg, int val) {
		int count = 0;
		for (int i = val; i < (seg + val); i++) {
			if (a[i] == key && seg > count++)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0, seg = 0;
		boolean check = true;
		int a[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3 };
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.println("Enter the key:");
		key = sc.nextInt();
		System.out.println("Enter the segment:");
		seg = sc.nextInt();
		for (int i = 0; i < a.length; i += seg) {
			if (check != segCheck(a, key, seg, i)) {
				check = false;
				break;
			}
		}
		// (check==false)?System.out.println("No"):System.out.println("No");
		if (check == false)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
