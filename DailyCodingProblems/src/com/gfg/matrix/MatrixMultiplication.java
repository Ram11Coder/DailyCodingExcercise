package com.gfg.matrix;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st row");
		int row1 = sc.nextInt();
		System.out.println("Enter the 1st col");
		int col1 = sc.nextInt();
		System.out.println("Enter the 2nd row");
		int row2 = sc.nextInt();
		System.out.println("Enter the 2nd col");
		int col2 = sc.nextInt();
	
		int mat1[][] = new int[row1][col1];
		int mat2[][] = new int[row2][col2];

		if (col1 != row2) {
			System.out.println("Indefine");
		}

		int matOperation[][] = new int[row1][col2];
		System.out.println("Enter the first matrix");
		for (int i = 0; i < row1; i++)
			for (int j = 0; j < col1; j++)
				mat1[i][j] = sc.nextInt();
		System.out.println("Enter the second matrix");
		for (int i = 0; i < row2; i++)
			for (int j = 0; j < col2; j++)
				mat2[i][j] = sc.nextInt();

		System.out.println("*******Matric multiplication*********");
		
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j <col2; j++) {
				matOperation[i][j]=(mat1[][]*mat2[][])+(mat1[][]*mat2[][]);
			}
		}
	}
}
