package backtracking;
//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1

public class PermutateString {
	public static void main(String[] args) {
		String str = "ABSG";
		permutate(str, 0, str.length());
	}

	private static void permutate(String str, int l, int len) {
		if (l == len) {
			System.out.println(str);
		} else {
			for (int i = l; i < len; i++) {
				str = swap(str, l, i);
				permutate(str, l + 1, len);
				str = swap(str, l, i);
			}
		}

	}

	private static String swap(String str, int l, int i) {
		char c[] = str.toCharArray();
		char t = c[l];
		c[l] = c[i];
		c[i] = t;
		return String.valueOf(c);
	}
}
