package string;

/**
 * input : aaabbcc output : abc
 */
public class Compress {

	public static void main(String[] args) {

		System.out.println(solver("aaabbcc"));
		System.out.println(solver("aaaaaaaaaaaaabccc"));
		System.out.println(solver("abc"));
		System.out.println(solver("aabbcc"));
		System.out.println(solver("aaabbcc"));
		System.out.println(solver(" aaabbcc "));
		System.out.println(solver(null));

	}

	private static String solver(String s) {
		if (s == null) {
			return "String is not null";
		}
		int hash[] = new int[128];
		s = s.trim();
		String res = "";
		for (char i : s.toCharArray())
			hash[i]++;

		for (char i : s.toCharArray())
			if (hash[i] >= 1) {
				res += i;
				hash[i] = 0;
			}

		return res;

	}

}
