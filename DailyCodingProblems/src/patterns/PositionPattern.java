package patterns;

public class PositionPattern {
	/**
		 *  1
			2 4
			3 5 7
			6 8 10 12
	 */
	public static void main(String[] args) {

		int n = 4, oddval = 1, evenval = 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1) {
				
					System.out.print(oddval+" ");
					oddval += 2;
				} else {
				
					System.out.print(evenval+" ");
					evenval += 2;
				}
			}
			System.out.println();
		}
	}
}
