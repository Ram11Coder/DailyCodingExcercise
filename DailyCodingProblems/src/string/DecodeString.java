package string;

public class DecodeString {
	public static void main(String[] args) {
		String str = "wwwwaaadexxxxxx";
		int count = 1, i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(str.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.print(str.charAt(i) + "" + count);
	}
}
