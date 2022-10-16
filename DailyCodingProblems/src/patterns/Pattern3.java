package patterns;

/*
 * 
 n=5

55555
54444
54333
54322
54321


*/
public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (i <= j)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
