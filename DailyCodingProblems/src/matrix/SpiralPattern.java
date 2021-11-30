package matrix;

public class SpiralPattern {
	static char x = 'X', z = '0', val = '0';

	public static void main(String[] args) {
//now developed for only equal row and colum ,yet to work on different row and column
		int r = 5, c = 5;

		char arr[][] = new char[r][c];

		int right = 0, left = r - 1, top = c - 1, down = 0;
		while (right <= top && left >= down) {
			// right
			for (int i = right; i <= left; i++) {
				arr[right][i] = checkCharPattern(val);
			}

			// down
			right++;
			for (int i = right; i <= top; i++) {

				arr[i][top] = checkCharPattern(val);

			}
			top--;
			// left

			for (int i = top; i >= down; i--) {

				arr[left][i] = checkCharPattern(val);

			}
			left--;

			// top
			for (int i = left; i >= right; i--) {
				arr[i][down] = checkCharPattern(val);
			}

			down++;
			val = checkCharPattern(val);
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	static char checkCharPattern(char val) {

		return (val == '0') ? x : z;
	}

}
