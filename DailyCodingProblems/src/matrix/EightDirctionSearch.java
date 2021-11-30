package matrix;

public class EightDirctionSearch {
	/**
	 * Given a 2D grid of n*m of characters and a word, find all occurrences of
	 * given word in grid. A word can be matched in all 8 directions at any point.
	 * Word is said be found in a direction if all characters match in this
	 * direction (not in zig-zag form). The 8 directions are, horizontally left,
	 * horizontally right, vertically up, vertically down and 4 diagonal directions.
	 */

	/**
	 * right to left left to right top to bottom bottom to up left diagonal down
	 * left diagonal up right diagonal down right diagonal up
	 */
	public static void main(String[] args) {

		char mat[][] = new char[][] { { 'P', 'W', 'K', 'C', 'T' }, { 'B', 'O', 'F', 'A', 'L' },
				{ 'O', 'O', 'E', 'R', 'M' }, { 'X', 'L', 'A', 'T', 'E' }, { 'A', 'C', 'O', 'T', 'N' }

		};

		String searchWord[] = { "POET", "MOUSE", "CAMP", "ROAM", "BOFA", "CART", "EAT", "MEN", "ALEX", "COT" };

		for (int i = 0; i < searchWord.length; i++) {
			char[] word = searchWord[i].toCharArray();

			System.out
					.println(searchAllDirction(word, mat) ? searchWord[i] + " found " : searchWord[i] + " not found ");
		}

	}

	static boolean searchAllDirction(char[] word, char[][] mat) {

		if (rightToLeft(word, mat))
			return true;
		else if (leftToRight(word, mat))
			return true;
		else if (topToBottom(word, mat))
			return true;
		else if (bottomToUp(word, mat))
			return true;
		else if (leftDiagonalDown(word, mat))
			return true;
		else if (leftDiagonalUp(word, mat))
			return true;
		else if (rightDiagonalDown(word, mat))
			return true;
		else if (rightDiagonalUp(word, mat))
			return true;

		return false;
	}

	private static boolean rightDiagonalUp(char[] word, char[][] mat) {
		int count = 0, l = 0;

		for (int i = 0, j = mat.length - 1; j >= 0; i++, j--) {

			if (word[l] == mat[j][i]) {
				count++;
				l++;
			}
			if (word.length == count)
				return true;

		}
		return false;
	}

	private static boolean rightDiagonalDown(char[] word, char[][] mat) {

		int count = 0, l = 0;

		for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {

			if (word[l] == mat[i][j]) {
				count++;
				l++;
			}
			if (word.length == count)
				return true;

		}
		return false;

	}

	private static boolean leftDiagonalUp(char[] word, char[][] mat) {
		int count = 0, l = 0;
		
		for (int i = mat.length - 1; i >= 0; i--) {

			if (word[l] == mat[i][i]) {
				count++;
				l++;
			}
			if (word.length == count)
				return true;

		}

		return false;
	}

	private static boolean leftDiagonalDown(char[] word, char[][] mat) {
		int count = 0, l = 0;

		for (int i = 0; i < mat.length; i++) {

			if (word[l] == mat[i][i]) {
				count++;
				l++;
			}
			if (word.length == count)
				return true;

		}
		return false;
	}

	private static boolean bottomToUp(char[] word, char[][] mat) {
		int count;
		for (int i = 0; i < mat.length; i++) {
			int l = 0;
			count = 0;
			for (int j = mat[i].length - 1; j >= 0; j--) {
				if (word[l] == mat[j][i]) {
					count++;
					l++;
				}
				if (word.length == count)
					return true;

			}
		}
		return false;
	}

	private static boolean topToBottom(char[] word, char[][] mat) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			int l = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (word[l] == mat[j][i]) {
					count++;
					l++;
				}
				if (word.length == count)
					return true;

			}
		}
		return false;
	}

	private static boolean leftToRight(char[] word, char[][] mat) {
		int count;
		for (int i = 0; i < mat.length; i++) {
			int l = 0;
			count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (word[l] == mat[i][j]) {
					count++;
					l++;
				}
				if (word.length == count)
					return true;

			}
		}

		return false;
	}

	private static boolean rightToLeft(char[] word, char[][] mat) {
		int count;
		for (int i = 0; i < mat.length; i++) {
			int l = 0;
			count = 0;
			for (int j = mat[i].length - 1; j >= 0; j--) {
				if (word[l] == mat[i][j]) {
					count++;
					l++;
				}
				if (word.length == count)
					return true;

			}
		}
		return false;
	}
}
