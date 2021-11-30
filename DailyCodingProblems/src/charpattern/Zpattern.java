package charpattern;

public class Zpattern {
	public static void main(String[] args) {
		char c = 'Z';
		int n =  c-'A';
		n+=1;
		System.out.println(n);
	
		for (int i = 0; i < n; i++) {
			char val = 'A';
			for (int j = 0; j <= 2 * n - 1; j++) {
				if (j <= i) {
					System.out.print(val++);
				} else if (j >= 2 * n - i - 1) {
					System.out.print(--val);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
