package numbers;

/**
 * 
 * You’re given a number n. If write all the numbers from 1 to n in a paper, we
 * have to find the number of characters written on the paper.For example if
 * n=13, the output should be 18 if n = 101, the output should be 195
 *
 */
public class NumberCount {
	public static void main(String[] args) {

		int n = 9990;

		System.out.println(numberCountChecker(n));
	}

	static int numberCountChecker(int n) {
		int sum = 9, count = 0, i = 1;
		int check = 9;
		if (n <= 9) {
			return n;
		}
		while (n > check) {
			count += (sum * i++);
			check = 9 + check * 10;

			sum *= 10;
		}

		count += (n - check / 10) * i;
		return count;
	}
}
