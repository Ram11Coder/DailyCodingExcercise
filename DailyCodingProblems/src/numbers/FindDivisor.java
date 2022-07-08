package numbers;

public class FindDivisor {
	public static void main(String[] args) {

		int num = 1024;
		int sqrt = (int) Math.sqrt(num);
		System.out.println(num);
		while (sqrt > 0) {
			if (num % sqrt == 0) {
				System.out.println(sqrt);
				num /= sqrt;
			}
			sqrt--;
		}
		System.out.println(num);
	}
}
