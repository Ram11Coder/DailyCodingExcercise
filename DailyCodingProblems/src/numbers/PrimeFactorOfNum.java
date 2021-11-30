package numbers;

public class PrimeFactorOfNum {
	public static void main(String[] args) {
		int n = 12;
		findPrime(n);
	}

	private static void findPrime(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n >>= 1;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2)
			System.out.print(n + " ");
	}
}
