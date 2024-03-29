package patterns;

/*
n = 6


123456
234561
345612
456123
561234
612345


*/

public class RotatePattern {

	public static void main(String[] args) {

		int n = 6;
		for (int i = 0; i < n; i++) {
			int c = i + 1, val = 1;
			for (int j = 1; j <= n; j++)
				if (j <= n - i)
					System.out.print(c++);
				else
					System.out.print(val++);

			System.out.println();
		}
	}
}
