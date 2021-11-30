package charpattern;

public class MiddlePattern {
	public static void main(String[] args) {
		String str = "PROGRAM";
		int l = str.length();
		int m = l / 2;

		for (int j = 0; j < l; j++) {
			for (int i = l; i > j+1 ; i--)
				System.out.print(" ");

			for (int i = 0, k = 0, c = m; i <=j; i++) {

	
					System.out.print(((i <= m)?str.charAt(c++):str.charAt(k++))+" ");

			}
			System.out.println();
		}

	}
}
