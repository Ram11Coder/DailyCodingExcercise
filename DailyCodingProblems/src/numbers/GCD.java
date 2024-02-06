package numbers;


class Parent{}
class Child extends Parent{}
public class GCD {
	
	public Parent test() {
		return new Parent();
	}
	public Child test(int i) {
		return new Child();
	}
	public static int gcd(int a, int b) {
		if (a == 1 || b == 1)
			return a;
		if (a % b == 0)
			return b;
		return gcd(b, a% b);
	}

	public static void main(String[] args) {
		System.out.println(gcd(5, 2));
	}
}
