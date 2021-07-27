package com.gfg.matrix;

public class ReverseWave {
	public static void main(String[] args) {

		int arr[][] = new int[][] { { 1, 2, 3, 4 }, 
									{ 5, 6, 7, 8 },
									{ 9, 10, 11, 12 },
									{ 13, 14, 15, 16 } };
		int k=0;
		for (int i = 0, n = arr.length; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 1)
					System.out.print(arr[--k][n - i - 1] + " ");
				else
					System.out.print(arr[k++][n - i - 1] + " ");
			}

		}

	}
}
