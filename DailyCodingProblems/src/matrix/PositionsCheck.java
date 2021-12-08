package matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a matrix M of dimension A x B containing 0’s and 1’s, find out the
 * number of positions at which the value is 1 and other elements in its
 * corresponding rows and columns are all 0. Input 1: A = 3, B = 3 100 M = 001
 * 010 Output 1: 3 Input 2: A = 3, B = 3 100 M = 001 100 Output 2: 1
 *
 * 
 */
public class PositionsCheck {
	
	/**
Input 1:
3
3
1 0 0
0 0 1
0 1 0

output 1:
3


Input 2:
3
3
1 0 0
0 0 1
1 0 0

output 2:
1

input 3:
5
5
1 0 0 0 1
0 1 0 0 0
1 0 1 0 0
0 0 0 0 1
0 0 0 1 0

output: 3
2

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) 
			for (int j = 0; j < col; j++) 
				arr[i][j] = sc.nextInt();
	
		int rowCount[] = new int[row];
		int colCount[] = new int[col];

		for (int i = 0; i < row; i++) {
			int row_sum=0,col_sum=0;		
			for (int j = 0; j < col; j++) {
				row_sum+=arr[i][j];
				col_sum+=arr[j][i];
		}
			rowCount[i]=row_sum;
			colCount[i]=col_sum;
		}
		/*
		 * System.out.println(Arrays.toString(rowCount));
		 * System.out.println(Arrays.toString(colCount));
		 */
		int count = 0;
		for (int i = 0,j=0; i < rowCount.length; i++,j++) 		 
				if (rowCount[i] == 1 && colCount[j] == 1) 
					count++;		
		System.out.println("Result : "+count);
	}
}
