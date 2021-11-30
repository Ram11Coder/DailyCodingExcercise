package numbers;

public class NthPrime {

	public static void main(String[] args) {
		int n = 10;
int c=0;
		for (int i = 2;; i++) {

			if(primeCheck(i)) {
			c++;	
			}
			
			if(c==n) {
				System.out.println(n + "th prime number is  "+i);
				break;
			}
			
		}

	}

	static boolean primeCheck(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}