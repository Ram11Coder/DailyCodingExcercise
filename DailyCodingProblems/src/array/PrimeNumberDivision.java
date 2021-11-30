package array;

/**
 * Find the least prime number that can be added with first array element that
 * makes them divisible by second array elements at respective index (check for
 * prime numbers under 1000, if exist return -1 as answer) & (Consider 1 as
 * prime number) Input : [ 20, 7 ] [ 11, 5 ] Output : [ 2, 3 ]
 * 
 * Explanation : (20 + ?) % 11 ( 7 + ?) % 5
 *
 */
public class PrimeNumberDivision {
	public static void main(String[] args) {

		int arr1[] = new int[] { 20, 7 };
		int arr2[] = new int[] { 11, 5 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 1; j < 1000; j++) {
				if (primeVal(j) && (arr1[i] + j) % arr2[i] == 0) {
					System.out.println(j);
					break;
				}
			}

		}

	}

	private static boolean primeVal(int n) {
		if (n < 1)
			return false;
		if (n <= 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i < n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
