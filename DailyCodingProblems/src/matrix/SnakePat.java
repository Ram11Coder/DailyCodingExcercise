package matrix;

public class SnakePat {
	public static void main(String[] args) {
		int k = 10, row = 3;

		int ind = checkIndex(k);
		int arr[][] = new int[row][ind];

		int num = 1, count = 0;
		for (int m = 0; m < ind; m++) {
			if (count % 2 == 0) {
				for (int j = 0; j < row && num <= k; j++)
					arr[j][m] = num++;

			} else {
				for (int j = row - 1; j >= 0 && num <= k; j--)
					arr[j][m] = num++;
			}
			count++;
		}

		for (int m = 0; m < arr.length; m++) {
			for (int j = 0; j < arr[m].length; j++) {
				System.out.print(arr[m][j] + " ");
			}
			System.out.println();
		}

	}

	static int checkIndex(int k) {
		int i = 1;
		while (i * i <= k) {
			i++;
		}
		return i;
	}

}
