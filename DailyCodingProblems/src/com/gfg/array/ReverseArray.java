package com.gfg.array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size-->");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		print(arr);
		//reverseArr(arr);
		reverseArrWithInplace(arr);
		print(arr);
	}

	private static void reverseArrWithInplace(int[] arr) {
		int i = 0, j = arr.length - 1, temp;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

	private static void reverseArr(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]->%d\n", i, arr[i]);
	}
}
