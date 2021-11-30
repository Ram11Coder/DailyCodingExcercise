package numbers;

public class MagicNumber {
	/**
	 * Magic number is the if the sum of its digits recursively are calculated till
	 * a single digit If the single digit is 1
	 * 
	 */
	public static void main(String[] args) {
		int n = 11, t = n;

		while (true) {
			if (n == 1) {
				System.out.println(t + " is a Magic number");
				break;
			} else if (n >= 10)
				n = magicChecker(n);
			else {
				System.out.println(t + " Not a magic number");
				break;
			}
		}
		System.out.println("Total sum is "+n);
		
	}

	public static int magicChecker(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;

			n /= 10;
		}
		return sum;
	}

}
