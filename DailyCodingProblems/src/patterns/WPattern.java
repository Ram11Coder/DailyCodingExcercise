package patterns;
/**
 * 
n=5

*   *   *
 * * * * 
  *   *  
 
 *
 */
public class WPattern {
	public static void main(String[] args) {
		int n = 5;

		for (int j = 0; j < n / 2 + 1; j++) {
			
			for (int i = 0; i < 2 * n - 1; i++) {

				if(j==i || i==n-j-1 || i==n+j-1 || i== 2 * n -j-2 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
