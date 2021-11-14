package com.gfg.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the 1st row");
		int row1 = sc.nextInt();
		System.out.println("Enter the 1st col");
		int col1 = sc.nextInt();
		System.out.println("Enter the 2nd row");
		int row2 = sc.nextInt();
		System.out.println("Enter the 2nd col");
		int col2 = sc.nextInt();

		matrixMultiplication(row1, col1, row2, col2);
	}

	private static void matrixMultiplication(int row1, int col1, int row2, int col2) {

		if (col1 != row2) {
			System.out.println("undefined");
			return;
		}
		int mat1[][] = new int[row1][col1];
		int mat2[][] = new int[row2][col2];
		int product[][] = new int[row1][col2];
		System.out.println("Enter the first matrix");
		for (int i = 0; i < row1; i++)
			for (int j = 0; j < col1; j++)
				mat1[i][j] = sc.nextInt();
		System.out.println("Enter the second matrix");
		for (int i = 0; i < row2; i++)
			for (int j = 0; j < col2; j++)
				mat2[i][j] = sc.nextInt();

		for (int i = 0; i < row1; i++)
			for (int j = 0; j < col2; j++)
				for (int k = 0; k < col1; k++)
					product[i][j] += mat1[i][k] * mat2[k][j];

		System.out.println("Matrix 1");
		for (int m[] : mat1) {
			System.out.println(Arrays.toString(m));
		}
		System.out.println("Matrix 2");
		for (int m[] : mat2) {
			System.out.println(Arrays.toString(m));
		}
		System.out.println("Matric multiplication");

		for (int m[] : product) {
			System.out.println(Arrays.toString(m));
		}

	}
}
