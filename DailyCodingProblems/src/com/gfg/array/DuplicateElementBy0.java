package com.gfg.array;

public class DuplicateElementBy0 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 5, 6, 9, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					break;
				}
			}

		}

		for (int k : arr)
			System.out.print(k + " ");
	}
}
