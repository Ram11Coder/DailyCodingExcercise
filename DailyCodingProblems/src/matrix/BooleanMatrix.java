package matrix;

import java.util.Scanner;

/**
 * 
 * Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a
 * matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
 * 
 * input 
 * 
 4
4

1 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1

output 

1 1 1 1 
1 1 1 1 
1 1 0 1 
1 1 1 1 
 
 * 
 */
public class BooleanMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		for (int i = 0; i < row; i++) 
			for (int j = 0; j < col; j++) 
				mat[i][j] = sc.nextInt();


		int row1[] = new int[row];
		int col1[] = new int[col];

		for (int i = 0; i < row; i++) 
			for (int j = 0; j < col; j++) 
				if (mat[i][j] == 1) {
					row1[i] = 1;
					col1[j] = 1;
				}

		for (int i = 0; i < row; i++) 
			for (int j = 0; j < col; j++) 
				if (row1[i] == 1 || col1[j] == 1) 
					mat[i][j] = 1;
		

		for (int i = 0; i < row; i++) 
			for (int j = 0; j < col; j++) 
				System.out.print(mat[i][j] + " ");		
			System.out.println();
	}
}
