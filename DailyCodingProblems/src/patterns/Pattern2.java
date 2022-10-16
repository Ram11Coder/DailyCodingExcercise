package patterns;

public class Pattern2 {
/*
 * 
n = 7


1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 

 *
 *
 */
	public static void main(String[] args) {
		int n = 7, c = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}
