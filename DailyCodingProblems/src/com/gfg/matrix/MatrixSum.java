package com.gfg.matrix;

import java.util.Arrays;

public class MatrixSum {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		// Printing 2D arrays
		System.out.println(Arrays.deepToString(arr));
			
			Arrays.stream(arr).forEach((e)-> {
				Arrays.stream(e).forEach((j)->System.out.print(j+" ")
						);
				System.out.println();
			});
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum += arr[i][j];
			}

		}
		System.out.println(sum);
	}
}
