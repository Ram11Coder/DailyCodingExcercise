package recursion;

/**
 * Convert integer to binary (using recursive)
 * 
 * Ex: 8
 * 
 * 1 0 0 0
 * 
 */
public class NumberToBinary {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		recursiverNumToBin(0, sb);
		recursiverNumToBin(8, sb);
		recursiverNumToBin(11, sb);
		recursiverNumToBin(128, sb);
		recursiverNumToBin(17, sb);
		recursiverNumToBin(1, sb);
		recursiverNumToBin(63, sb);
		recursiverNumToBin(91, sb);
	}

	private static void recursiverNumToBin(int num, StringBuilder sb) {
		if (num == 0)
			return;
		if (num == 1) {
			sb.append(1);
			System.out.println(sb.reverse());
			clear();
			return;
		}
		sb.append(num % 2);
		recursiverNumToBin(num / 2, sb);
	}

	private static void clear() {
		sb.setLength(0);
	}
}
