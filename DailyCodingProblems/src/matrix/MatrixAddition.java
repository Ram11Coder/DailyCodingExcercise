package matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Matrix Addition Given n integer arrays of different size, find the addititon
 * of numbers represented by the arrays
 * 
 * I/P: 4
 * 
 * 3 5 4 2
 * 
 * 2 4 5
 * 
 * 4 5 6 7 8
 * 
 * 4 9 2 1
 * 
 * 
 * O/P: 54386
 *
 * 
 */

public class MatrixAddition {

	public static void main(String[] args) {

		// Scanner sc=new Scanner(System.in);
		int finalSum = 0;
		int arr[][] = { { 3, 5, 4, 2 }, { 2, 4, 5 }, { 4, 5, 6, 7, 8 }, { 4, 9, 2, 1 } };
		// System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++)
				sum = sum * 10 + arr[i][j];
			finalSum += sum;
		}
		System.out.println(finalSum);
	}

}
