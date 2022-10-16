package patterns;

/*
 * 
 
Input:
 n =4
 
 Output:
4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4 
4 3 2 2 2 2 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 1 0 1 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4 
4 4 4 4 4 4 4 4 4 





*/
public class Pattern6 {
	public static void main(String[] args) {

		int n = 4;
		solver(n);
	}

	private static void solver(int n) {
		int originalN = n;
		n = 2 * n;
		for (int row = 0; row <= n; row++) {
			// (r->6,c->4,t->night-col,bottom->n-row)
			for (int col = 0; col <= n; col++) {
				// Checking the current position of the pattern
				System.out.print(originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col)) + " ");
			}
			System.out.println();
		}

	}
}
