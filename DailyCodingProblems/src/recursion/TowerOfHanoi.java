package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {

		TOH(4, 'A', 'C', 'B');
	}

	private static void TOH(int n, char source, char dest, char aux) {
		if (n == 1) {
			System.out.println(source + " -> " + dest);
			return;
		}
		TOH(n - 1, source, aux, dest);
		System.out.println(source + " -> " + dest);
		TOH(n - 1, aux, dest, source);
	}

}
