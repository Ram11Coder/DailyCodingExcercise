package string;

public class CheckSubstring {

	public static void main(String[] args) {
		System.out.println(isSubstring("Hello world !!", "world"));
		System.out.println(isSubstring("Hello world !!", "world "));
		System.out.println(isSubstring("Hello world !!", " "));
		System.out.println(isSubstring("Hello world !!", null));
		System.out.println(isSubstring("Hello world !!", "!! "));
		System.out.println(isSubstring("Hello world $$", "$$ "));
		System.out.println(isSubstring("Hello world !!", " Hello "));
		System.out.println(isSubstring("Hello world !!", "World"));
		System.out.println(isSubstring("Hello world !!", "worlds"));
		System.out.println(isSubstring("Hello world !!", "! "));

		System.out.println(isSubstring1("Hello world {} !!", "{}"));
		System.out.println(isSubstring1("Hello world $$ !!", " $"));
		System.out.println(isSubstring2("Hello world !! %%", "%"));
		System.out.println(isSubstring2("Hello world !! ,,", ",,"));
		System.out.println(isSubstring2("Hello world !! ..", " ."));

	}

	private static boolean isSubstring(String main, String sub) {

		return main.matches("(.*)" + sub + "(.*)");
	}

	private static boolean isSubstring1(String main, String sub) {

		return main.contains(sub);
	}

	private static boolean isSubstring2(String main, String sub) {

		return main.indexOf(sub) != -1;
	}

}
