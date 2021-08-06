package com.java.number.pattern;

public class SpiralPattern {
	public static void main(String[] args) {

		int r = 6, c = 6;

		int arr[][] = new int[r][c];
		int right = 0, left = r - 1, top = c - 1, down = 0;
		while (right < top && left > down) {
			// right
			for (int i = right; i < left; i++) {
				if (right % 2 == 0)
					arr[right][i] = 88;
				else
					arr[right][i] = 48;

			}

			// down
			for (int i = 0; i < top; i++) {
				if (top % 2 == 0)
					arr[i][top] = 88;
				else
					arr[i][top] = 48;

			}

			// left

			for (int i = left; i > down; i--) {
				if (left % 2 == 0)
					arr[i][left] = 88;
				else
					arr[i][left] = 48;

			}

			// top
			for (int i = left; i > down; i--) {
				if (left % 2 == 0)
					arr[down][i] = 88;
				else
					arr[down][i] = 48;

			}
			right++;
			top--;
			left--;
			down++;
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
