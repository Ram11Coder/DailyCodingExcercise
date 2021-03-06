package patterns;

/**
 * Given N. print the following snake pattern (say N = 4). condition: must not
 * use arrays ( 1D array or 2D array like Matrix ). 1 2 3 4 8 7 6 5 9 10 11 12
 * 16 15 14 13
 * 
 * @author thulasi.janarthanan
 *
 */
public class SnakePattern {
	public static void main(String[] args) {
		int n = 4, val = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {

				for (int j = 1; j <= n; j++) {
					System.out.print(++val+" ");
				}
			} else {
				val += n;
				int t = val;
				for (int j = n; j >= 1; j--) {
					System.out.print(t-- +" ");
				}

			}
			System.out.println();
		}
	

	}
}
