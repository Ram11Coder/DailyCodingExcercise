package matrix;

public class ZigZag {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int r = 0, c = 0;
		int n = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (r == 0 && c == 0) {
					System.out.print(arr[r][c]);
					r--;

				} else if (c >= 0 || r < n) {
					System.out.println("r " + r + "c " + c);
					System.out.print(arr[r][c]);
					r++;
					c--;

				} else if (r >= 0) {
					System.out.print(arr[r--][c++]);
				}

				if (r < 0) {
					c++;
					r = 0;
				}

				if (c < 0) {
					r++;
					c = 0;
				}

			}
			System.out.println();

		}

	}
}
