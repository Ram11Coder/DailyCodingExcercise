package patterns;

import java.util.Iterator;

/**
 * 
 * 	0 0 0 0 0 0 0 0 0 
	0 1 1 1 1 1 1 1 0 
	0 1 2 2 2 2 2 1 0 
	0 1 2 3 3 3 2 1 0 
	0 1 2 3 4 3 2 1 0 
	0 1 2 3 3 3 2 1 0 
	0 1 2 2 2 2 2 1 0 
	0 1 1 1 1 1 1 1 0 
	0 0 0 0 0 0 0 0 0 
 *
 */

public class Pattern7 {

	public static void main(String[] args) {
		int n = 4;
		n = 2 * n;
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				int top = i;
				int bottom = j;
				int left = n - i;
				int right = n - j;
				System.out.print(Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");

			}
			System.out.println();
		}
	}

}
