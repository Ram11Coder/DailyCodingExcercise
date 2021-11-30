package string;

/**
 * https://practice.geeksforgeeks.org/problems/excel-sheet5448/1
 * 
 * Given a positive integer N, return its corresponding column title as it would
 * appear in an Excel sheet. For N =1 we have column A, for 27 we have AA and so
 * on.
 * 
 * Note: The alphabets are all in uppercase.
 * 
 * Example 1:
 * 
 * Input: N = 51 Output: AY "Your Task: Complete the function ExcelColumn()
 * which takes N as input and returns output string. Expected Time Complexity:
 * O(Log(N)) Expected Auxiliary Space: O(Log(N)) Constraints: 1 ≤ N ≤ 107"
 *
 * Input: 1 Output: A Input: 26 Output: Z Input : 27 Output: AA Input: 28:
 * Output: AB Input: 1000 Output: ALL
 * 
 */
public class ExcelSheet {

	public static void main(String[] args) {
		System.out.println(solver(1));

		System.out.println(solver(26));
		System.out.println(solver(27));
		System.out.println(solver(28));
		System.out.println(solver(1000));
		System.out.println(solver(346));
		System.out.println(solver(45));
		System.out.println(solver(676));
		System.out.println(solver(702));
		System.out.println(solver(705));
	}

	private static String solver(int n) {
		int rem;
		String s = "";
		if (n <= 26) {
			return s + (char) ('A' + n - 1);
		}
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			rem = n % 26;
			if (rem == 0) {
				sb.append('Z');
				n = (n / 26) - 1;
			} else {
				sb.append((char) ('A' + rem - 1));
				n /= 26;
			}
		}

		return sb.reverse().toString();
	}

}
