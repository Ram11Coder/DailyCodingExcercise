package patterns;
/*
 
n= 10
 
*
1*
*2*
1*3*
*2*4*
1*3*5*
*2*4*6*
1*3*5*7*
*2*4*6*8*
1*3*5*7*9*


* 
 */

public class EvenOddNumberPyramid {
	public static void main(String[] args) {

		int n = 10;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				if (i % 2 == 0 && j % 2 == 1)
					System.out.print(j);
				else if (i % 2 == 1 && j % 2 == 0)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
