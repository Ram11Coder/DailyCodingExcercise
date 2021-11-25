package com.gfg.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of numbers and a number k. Print the maximum possible k digit
 * number which can be formed using given numbers. INPUT:
 * 
 * Enter the array size : 4
 * 
 * Enter the elements : 1 4 973 97
 * 
 * Enter number of digits : 3
 * 
 * OUTPUT : 974
 * 
 * INPUT : Enter the array size : 6
 * 
 * Enter the elements : 1 4 89 73 9 7
 * 
 * Enter number of digits : 5
 * 
 * OUTPUT : 98973
 *
 */
public class LargestNumberFormedOfArrayKsize {
	// Use sringBuilder to optimise the code

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values to array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter the size");
		int k = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		findKsizeLargestElement(arr, k);
		sc.close();
	}

	private static void findKsizeLargestElement(int[] arr, int k) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i] + "";
			for (int j = i + 1; j < arr.length; j++) {
				if ((s + arr[j]).length() <= k) {
					s = checkPossibleLargeNumber(Integer.parseInt(s), arr[j]) + "";
				} else if (s.length() > k) {
					s = "";
					s = arr[i] + "";
				}
				if (s.length() == k)
					max = Math.max(max, Integer.parseInt(s));
			}
			s = "";
			// System.out.println(max);
		}
		max = Math.max(max, arr[arr.length - 1]);
		System.out.println(max);
	}

	private static int checkPossibleLargeNumber(int startNum, int endNum) {
		int a = startNum * (int) Math.pow(10, (endNum + "").length()) + endNum;
		int b = endNum * (int) Math.pow(10, (startNum + "").length()) + startNum;
		return Math.max(a, b);
	}
}
