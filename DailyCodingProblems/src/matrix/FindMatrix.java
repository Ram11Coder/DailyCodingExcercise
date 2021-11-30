package matrix;

public class FindMatrix {
	public static void main(String[] args) {
		int mat[][] = new int[][] { { 4, 5, 9 }, { 1, 3, 5 }, { 8, 2, 4 } };

		int found[][] = new int[][] { { 3, 5 }, { 2, 4 } };
		int m = mat.length, n = found.length, count = 0;
		boolean flag = false;

		int r = 0, c;
		all: for (int i = 0; i < mat.length; i++) {
			c = 0;
			for (int j = 0; j < mat.length; j++) {

				if (c <= n - 1 && mat[i][j] == found[r][c]) {
					if (count == (n * n) - 1) {
						flag = true;
						break all;
					}
					c++;
					count++;
				}
			}
			if (c != 0)
				r++;
		}

		if (flag) {
			System.out.println("YES");
		} else
			System.out.println("FALSE");
	}
}
