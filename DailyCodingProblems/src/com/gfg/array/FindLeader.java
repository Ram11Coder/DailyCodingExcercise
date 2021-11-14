package com.gfg.array;

public class FindLeader {

	public static void main(String[] args) {
		int arr[] = { 92, 7, 12, 9, 8, 3 };

		/*
		 * for (int i = 0; i < arr.length; i++) { int temp = arr[i]; boolean flag =
		 * true; for (int j = i + 1; j < arr.length; j++) { if (temp < arr[j]) { flag =
		 * false; break; } } if(flag) System.out.print(temp+" "); }
		 */
		solver(arr);

	}

	private static void solver(int[] arr) {
		if (arr.length == 0)
			return;
		if (arr.length == 1) {
			System.out.println(arr[0]);
			return;
		}
		int max = arr[arr.length - 1];
		System.out.print(arr[arr.length - 1] + " ");
		for (int i = arr.length - 2; i >= 0; i--) {
			if (max < arr[i]) {
				System.out.print(arr[i] + " ");
				max = arr[i];
			}
		}
	}

}
