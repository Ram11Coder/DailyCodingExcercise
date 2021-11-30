package matrix;

/*Smaller Matrix Search [ZOHO]
A bigger NxN matrix is passed as the input. Also a smaller MxM matrix is passed as input.
 The program must print TRUE if the smaller matrix can be found in the bigger matrix.
 Else the program must print FALSE.
Input Format:
First line will contain the value of N.
Second line will contain the value of M.
Next N lines will contain the values in the N*N matrix with each value separated by one or more space.
Next M lines will contain the values in the M*M matrix with each value separated by one or more space.
Output Format:
First line will contain the string value TRUE or FALSE
Boundary Conditions:
3 <= N <= 202 <= M <= N
Example Input/Output 1:
Input:
3
2
4 5 9
1 3 5
8 2 4
3 5
2 4
Output:
TRUE
Example Input/Output 2:
Input:
3
2
4 5 9
1 3 5
8 2 4
4 5
1 4
Output:
FALSE
*/
public class FindSmallerMatrix {

	public static void main(String[] args) {
		int M[][] = { { 4, 5, 9 }, { 1, 3, 5 }, { 8, 2, 4 } };
		int N[][] = { { 3, 5 }, { 2, 4 } };

		if (isSmallerMatrixPresent(M, N))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean isSmallerMatrixPresent(int[][] m, int[][] n) {
		int a = 0, b, count, j1 = 0;
		for (int i = 0; i < m.length; i++) {
			b = 0;
			count = 0;
			for (int j = j1; j < m.length; j++) {

				if (m[i][j] == n[a][b]) {
					count++;
					b++;
				} else {
					count = 0;
					a = 0;
					b = 0;
				}
				// System.out.println("a ->" + a + " b-> " + b + " count-> " + count);
				if (count == n.length) {
					a++;
					j1 = (j + 1) - count;
					break;
				}

			}
			if (a == n.length)
				return true;

		}
		return false;
	}
}