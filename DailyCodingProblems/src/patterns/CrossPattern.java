package patterns;

import java.util.stream.IntStream;

/*

5

*   *
 * * 
  *  
 * * 
*   *


*/
public class CrossPattern {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pattern : ");
		int n = ScannerUtil.getScanner().nextInt();
		// printPattern(n);
		printPatternUpdate(n);
		usingJava8(n);
		ScannerUtil.close();
	}

	private static void usingJava8(int n) {

		/*
		 * IntStream.range(1, n+1).forEach(e1 -> { IntStream.range(1, n+1).mapToObj(e2
		 * -> ( e2== e1 || e2 == n - e1 - 1) ? "*" : " ").forEach(System.out::print);
		 * System.out.println(); });
		 */
		IntStream.rangeClosed(1, n)
        .mapToObj(row ->
                IntStream.rangeClosed(1, n)
                        .mapToObj(col ->
                                col == row || col == n - row + 1 ? "*" : " "
                        )
                        .reduce((s1, s2) -> s1 + s2)
                        .orElse("")
        )
        .forEach(System.out::println);
	}

	private static void printPatternUpdate(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((j == i || j == n - i - 1) ? "*" : " ");
			System.out.println();
		}
	}

	private static void printPattern(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
