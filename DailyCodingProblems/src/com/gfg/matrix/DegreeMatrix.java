package com.gfg.matrix;

import java.util.Scanner;

/**
 * Given two matrices a and b both of size NxN find if matrix a can be
 * transformed to matrix b by rotating it 90deg , 180deg , 270deg if so print
 * TRUE else print FALSE
 *
 */
public class DegreeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		while (true) {
			System.out.println(
					"0.rotate Clockwise with Extra Space 90*\n1.Rotate Print Clock 90* \n2.Rotate Print Clock 180*\n3.Rotate Print Clock 270*\n4.Rotate Print AntiClock 90*\n5.Rotate Print AntiClock 180*\n6.Rotate Print AntiClock 270* own implementation\n7.Rotate Inplace Clock 90*\n8.Rotate Inplace Clock 180*\n9.Rotate Inplace Clock 270\n10.Rotate Inplace AntiClock90\n11.Rotate Inplace AntiClock 180\n12.Rotate Inplace AntiClock270\n13.Exit\n");
			System.out.println("Enter the key ");
			int key = sc.nextInt();
//			System.out.println("Before Rotation");
//			printMatrix(arr);
//			System.out.println("After Rotation");
			switch (key) {
			case 0:
				rotateClockwisewithExtraSpace90(arr);
				break;
			case 1:
				rotatePrintClockwise90(arr);
				break;
			case 2:
				rotatePrintClockwise180(arr);
				break;
			case 3:
				rotatePrintClockwise270(arr);
				break;
			case 4:
				rotatePrintAntiClockwise90(arr);
				break;
			case 5:
				rotatePrintAntiClockwise180(arr);
				break;
			case 6:
				rotatePrintAntiClockwise270(arr);
				break;
			case 7:
				inplaceRotate90(arr);
				break;
			case 8:
				rotateownInplaceClockwise180(arr);
				break;
			case 9:
				rotateInplaceClockwise270(arr);
				break;
			case 10:
				rotateAntiClockwise90(arr);
				break;
			case 11:
				rotateInplaceAntiClockwise180(arr);
				break;
			case 12:
				rotateInplaceAntiClockwise270(arr);
				break;
			case 13:
				System.exit(0);
				break;
			}

		}

	}

	private static void rotateInplaceAntiClockwise270(int[][] arr) {
		System.out.println("Anti clock wise 270* is same as clockwise 90* rotation");

	}

	private static void rotateInplaceAntiClockwise180(int[][] arr) {
		int m = arr.length - 1, i;
		for (i = 0; i < (arr.length) / 2; i++) {
			for (int j = 0, n = arr.length - 1; j < arr.length; j++, n--) {
				int t = arr[i][j];
				arr[i][j] = arr[m][n];
				arr[m][n] = t;
			}
			m--;
		}
		if ((arr.length % 2 == 0) ? false : true) {
			int n = arr.length - 1, j = 0;
			while (j < n) {
				int t = arr[i][j];
				arr[i][j] = arr[m][n];
				arr[m][n] = t;
				j++;
				n--;
			}

		}
		printMatrix(arr);

	}

	private static void rotatePrintAntiClockwise270(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

	private static void rotatePrintAntiClockwise180(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotatePrintAntiClockwise90(int[][] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotatePrintClockwise90(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--)
				System.out.print(arr[j][i] + " ");
			System.out.println();
		}
	}

	private static void rotateownInplaceClockwise180(int[][] arr) {
		int m = arr.length - 1, i;
		for (i = 0; i < (arr.length) / 2; i++) {
			for (int j = 0, n = arr.length - 1; j < arr.length; j++, n--) {
				int t = arr[i][j];
				arr[i][j] = arr[m][n];
				arr[m][n] = t;
			}
			m--;
		}

		if ((arr.length % 2 == 0) ? false : true) {
			int n = arr.length - 1, j = 0;
			while (j < n) {
				int t = arr[i][j];
				arr[i][j] = arr[m][n];
				arr[m][n] = t;
				j++;
				n--;
			}

		}
		printMatrix(arr);

	}

	private static void rotateInplaceClockwise270(int[][] arr) {
		System.out.println("270 clock wise direction is same as 90* anticlockwise direction");
		rotateAntiClockwise90(arr);
	}

	private static void rotatePrintClockwise270(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

	private static void rotatePrintClockwise180(int[][] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotateAntiClockwise90(int[][] arr) {

		int N = arr.length;
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - 1 - i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][N - 1 - i];
				arr[j][N - 1 - i] = arr[N - 1 - i][N - j - 1];
				arr[N - 1 - i][N - j - 1] = arr[N - 1 - j][i];
				arr[N - 1 - j][i] = temp;
			}

		}
		printMatrix(arr);

	}

	private static void inplaceRotate90(int[][] arr) {
		int N = arr.length;
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - 1 - i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[N - 1 - j][i];
				arr[N - 1 - j][i] = arr[N - 1 - i][N - 1 - j];
				arr[N - 1 - i][N - 1 - j] = arr[j][N - 1 - i];
				arr[j][N - 1 - i] = temp;
			}
		}
		printMatrix(arr);

	}

	static void rotateClockwisewithExtraSpace90(int[][] arr) {
		int result[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr[i].length - 1; j < arr[i].length; j++, k--) {
				result[i][j] = arr[k][i];
			}
		}
		printMatrix(result);
	}

	static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}