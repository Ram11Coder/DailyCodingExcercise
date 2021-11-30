package recursion;

/* Using Recursion reverse the string such as
Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I
*/
public class RecursionReverse {

	public static void main(String[] args) {
		String str = "I love india";
		reverse(str, str.length() - 1, str.length());
	}

	private static void reverse(String str, int n, int last) {

		if (n == 0) {
			System.out.print(str.substring(n, last));
			return;
		}
		if (str.charAt(n) == ' ') {
			System.out.print(str.substring(n+1, last)+" ");
			last = n;
		}
		reverse(str, n - 1, last);
	}

}
