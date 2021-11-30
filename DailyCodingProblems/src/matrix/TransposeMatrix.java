package matrix;

import java.util.Arrays;

/**
 * 
 * Transpose matrix contains first matrix row as column and col as row
 *
 */
public class TransposeMatrix {

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for (int[] m : arr) {
			System.out.println(Arrays.toString(m));
		}

		int transopose[][] = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transopose[j][i] = arr[i][j];
			}
		}
		System.out.println();
		for (int[] m : transopose) {
			System.out.println(Arrays.toString(m));
		}
	}

}
