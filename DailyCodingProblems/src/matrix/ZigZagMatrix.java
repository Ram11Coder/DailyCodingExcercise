package matrix;

//	https://www.geeksforgeeks.org/print-matrix-in-zig-zag-fashion/

public class ZigZagMatrix {

	static void zigZagMatrix(int arr[][], int n, int m) {

		int row = 0, col = 0;
		int mn = Math.min(n, m);
		// Boolean variable that will true if we
		// need to increment 'row' value otherwise
		// false- if increment 'col' value
		boolean row_inc = false;

		for (int len = 1; len <= mn; len++) {

			for (int i = 0; i < len; i++) {
				System.out.print(arr[row][col] + " ");
				if (i + 1 == len)
					break;

				// If row_increment value is true
				// increment row and decrement col
				// else decrement row and increment
				// col
				if (row_inc) {
					row++;
					col--;
				} else {
					row--;
					col++;
				}
			}
			if (len == mn)
				break;

			// Update row or col value according
			// to the last increment
			if (row_inc) {
				row++;
				row_inc = false;
			} else {
				col++;
				row_inc = true;
			}
		}

		// Print the next half zig-zag pattern

		if (row == 0) {
			if (col == m - 1)
				row++;
			else
				col++;

			row_inc = true;

		} else {
			if (row == n - 1)
				col++;
			else
				row++;

			row_inc = false;
		}

		int MAX = Math.max(m, n) - 1;

		for (int len, diag = MAX; diag > 0; diag--) {

			len = (diag > mn) ? mn : diag;

			for (int i = 0; i < len; i++) {
				System.out.print(arr[row][col] + " ");
				if (i + 1 == len)
					break;
				// Update row or col value according
				// to the last increment
				if (row_inc) {
					row++;
					col--;
				} else {
					row--;
					col++;
				}

			}

			// Update the indexes of row and col variable
			if (row == 0 || col == m - 1) {
				if (col == m - 1)
					row++;
				else
					col++;

				row_inc = true;
			} else if (col == 0 || row == n - 1) {
				if (row == n - 1)
					col++;
				else
					row++;

				row_inc = false;
			}

		}

	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		zigZagMatrix(matrix, 3, 4);
	}
}