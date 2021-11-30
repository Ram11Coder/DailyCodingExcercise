package matrix;

public class SpiralNumber {
	static int n=4;

	public static void main(String[] args) {
//now developed for only equal row and colum ,yet to work on different row and column
		int r = 7, c = 7;

		int arr[][] = new int[r][c];

		int right = 0, left = r - 1, top = c - 1, down = 0;
		while (right <= top && left >= down) {
			// right
			for (int i = right; i <= left; i++) {
				arr[right][i] = n;
			}

			// down
			right++;
			for (int i = right; i <= top; i++) {

				arr[i][top] =n;

			}
			top--;
			// left

			for (int i = top; i >= down; i--) {

				arr[left][i] = n;

			}
			left--;

			// top
			for (int i = left; i >= right; i--) {
				arr[i][down] = n;
			}

			down++;
			n = --n;
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	
}
