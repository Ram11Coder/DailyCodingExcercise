package com.gfg.matrix;

import java.util.HashSet;

/*Given a binary matrix your task is to find all unique rows of the given matrix.

Example 1:

Input:
row = 3, col = 4 
M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
Output: 1 1 0 1 $1 0 0 1 $
Explanation: Above the matrix of size 3x4
looks like
1 1 0 1
1 0 0 1
1 1 0 1
The two unique rows are 1 1 0 1 and
1 0 0 1 .
Your Task:
You only need to implement the given function uniqueRow(). The function takes three arguments
the first argument is a matrix M and the next two arguments are row and col denoting the rows
and columns of the matrix. The function should return the list of the unique row of the martrix.
Do not read input, instead use the arguments given in the function.

Note: The drivers code print the rows "$" separated.

Expected Time Complexity: O(row * col)
Expected Auxiliary Space: O(row * col)

Constraints:
1<=row,col<=40
0<=M[][]<=1
*/
public class UniqueRow {
	public static void main(String[] args) {
		int row = 3, col = 4;
		int M[][] = { { 1, 1, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 } };

		// uniqueArray(M, row, col);
		betterApproach(M, row, col);
	}

	private static void betterApproach(int[][] m, int r, int c) {

		HashSet<String> s = new HashSet<String>();
		for (int i = 0; i < r; i++) {
			String str = "";
			for (int j = 0; j < c; j++) {

				str += m[i][j];
			}
			if (!s.contains(str)) {
				s.add(str);
				System.out.println(str);
			}

		}

	}

	private static void uniqueArray(int[][] m, int r, int c) {

		for (int i = 0; i < r; i++) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				flag = 1;
				for (int k = 0; k < c; k++)
					if (m[i][k] != m[j][k])
						flag = 0;

				if (flag == 1)
					break;
			}

			if (flag == 0) {
				for (int a = 0; a < c; a++)
					System.out.print(m[i][a] + " ");
				System.out.println();
			}
		}

	}

}
