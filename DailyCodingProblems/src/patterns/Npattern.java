package patterns;

/*
 * 
n=6
1    1
22   2
3 3  3
4  4 4
5   55
6    6


*/
public class Npattern {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}
