package com.gfg.matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * matrix addition Matrix subtraction Matrix multiplication
 *
 */
public class MatrixBasics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = sc.nextInt();
		System.out.println("Enter the col");
		int col = sc.nextInt();

		System.out.println("*******Matric addition*********");
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int matOperation[][] = new int[row][col];
		System.out.println("Enter the first matrix");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < row; j++)
				mat1[i][j] = sc.nextInt();
		System.out.println("Enter the second matrix");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < row; j++)
				mat2[i][j] = sc.nextInt();

		for (int i = 0; i < row; i++)
			for (int j = 0; j < row; j++)
				matOperation[i][j] = mat1[i][j] + mat2[i][j];
		System.out.println("*******Matric Addition*********");
		System.out.println(Arrays.deepToString(matOperation));

		System.out.println("*******Matric subtraction*********");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < row; j++)
				matOperation[i][j] = mat1[i][j] - mat2[i][j];
		System.out.println(Arrays.deepToString(matOperation));

	}

}
