package matrix;

import java.util.Scanner;
/**
 * 
 *  Matrix Diagonal sum
Given a matrix print the largest of the sums of the two triangles split by diagonal 
from top right to bottom left

 *
 */
public class MaximumTriangleSum {
	/**
	 * 	3 3
	 * input:-
		1 2 3
		4 5 6
		7 8 9
      output:-34
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();

		findMaxTriangle(arr, r, c);
	//	printArr(arr, r, c);

	}

	static void findMaxTriangle(int[][] arr, int r, int c) {
		int maxsum = 0;

		maxsum = (firstTriangle(arr, r, c) > maxsum) ? firstTriangle(arr, r, c) : maxsum;
		maxsum = (secondTriangle(arr, r, c) > maxsum) ? secondTriangle(arr, r, c) : maxsum;
		maxsum = (thirdTriangle(arr, r, c) > maxsum) ? thirdTriangle(arr, r, c) : maxsum;
		maxsum = (fouthTriangle(arr, r, c) > maxsum) ? fouthTriangle(arr, r, c) : maxsum;
		System.out.println(maxsum);
	}

	static int fouthTriangle(int[][] arr, int r, int c) {

		int sum = 0;
		for (int i = 0; i < r; i++) 
			for (int j = i; j < c; j++) 
				sum += arr[i][j];
		
		return sum;
	}

	static int thirdTriangle(int[][] arr, int r, int c) {
		int sum = 0;
		for (int i = 0; i < r; i++) 
			for (int j = 0; j < c - i; j++) 
				sum += arr[i][j];
		
		return sum;

	}

	static int secondTriangle(int[][] arr, int r, int c) {

		int sum = 0;
		for (int i = 0; i < r; i++) 
			for (int j = r - i - 1; j < c; j++) 
				sum += arr[i][j];

		return sum;
	}

	static int firstTriangle(int[][] arr, int r, int c) {
		int sum = 0;
		for (int i = 0; i < r; i++) 
			for (int j = 0; j <= i; j++) 
				sum += arr[i][j];
		return sum;

	}

	static void printArr(int[][] arr, int r, int c) {

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
