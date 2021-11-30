package string;

/*.Count the numbers of characters in the given string treating ‘$’ as escape sequence. 
 * If ‘$’ is preceeded by ”, consider it as normal ‘$’ and not the escape sequence. If ” occurs, treat it as single ”.
Example:
    Input: Hello$World$
    Output: 11
*/
public class CountChar {

	public static void main(String[] args) {
		String s = "Hello$World$";
		int n = s.length();
		if (s.charAt(n - 1) != '$') {
			System.out.println(s.length());
		} else
			System.out.println(s.length() - 1);
	}
}
