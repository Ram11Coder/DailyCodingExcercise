package com.gfg.array;

/**
 * Given a list of non negative integers, arrange them in such a manner that
 * they form the largest number possible.The result is going to be very large,
 * hence return the result in the form of a string. Example 1: Input: N = 5
 * Arr[] = {3, 30, 34, 5, 9} Output: 9534330 Explanation: Given numbers are {3,
 * 30, 34, 5, 9}, the arrangement 9534330 gives the largest value. Example 2:
 * 
 * Input: N = 4 Arr[] = {54, 546, 548, 60} Output: 6054854654 Explanation: Given
 * numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest
 * value.
 * 
 * Your Task: You don't need to read input or print anything. Your task is to
 * complete the function printLargest() which takes the array of strings arr[]
 * as parameter and returns a string denoting the answer.
 * 
 * Expected Time Complexity: O(NlogN) Expected Auxiliary Space: O(1)
 * 
 * Constraints: 1 ≤ N ≤ 10^5 0 ≤ Arr[i] ≤ 10^18 Sum of all the elements of the
 * array is greater than 0.
 *
 */
public class LargestNumberFormedOfArray {
//Need to implement for bigintegers
	public static void main(String[] args) {
		int arr[] = { 54, 546, 548, 60 };
		System.out.println("***approach With String***");
		approachWithString(arr);
		System.out.println("\n***better Approach***");
		betterApproach(arr);
	}

	private static void betterApproach(int[] arr) {
		long start = arr[0];
		long s, e;
		for (int i = 1; i < arr.length; i++) {
			s = concatFirst(start, arr[i]);
			e = concatEnd(start, arr[i]);
			start = (s > e) ? s : e;
		}
		System.out.println(start);
	}

	private static void approachWithString(int[] arr) {
		String s = arr[0] + "";
		for (int i = 1; i < arr.length; i++) {
			long a = appendFirst(arr[i], s);
			long b = appendEnd(arr[i], s);
			s = "";
			s = "" + ((a < b) ? b : a);
		}
		System.out.println(s);

	}

	private static long concatFirst(long start, int num) {
		int len1 = (start + "").length();
		return (num * (long) (Math.pow(10, len1))) + start;
	}

	private static long concatEnd(long start, int num) {
		return Long.parseLong(start + "" + num);
	}

	private static long appendFirst(long num, String s) {
		return Long.parseLong(num + s);
	}

	private static long appendEnd(long num, String s) {
		return Long.parseLong(s + num);
	}

}
