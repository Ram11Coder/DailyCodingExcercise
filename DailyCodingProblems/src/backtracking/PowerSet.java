package backtracking;

// Print all subsequence using powerset
//Bit set formula : (n&(1<<i))!=0 then ith bit is set

//Time complexity O(2^n * n)
public class PowerSet {
	public static void main(String[] args) {
		String s = "abc";
		printSubset(s, s.length());
	}

	private static void printSubset(String s, int length) {

		for (int i = 0; i < Math.pow(2, length); i++) {
			String subStr = "";
			for (int j = 0; j < length; j++) {
				if ((i & (1 << j)) != 0)
					subStr += s.charAt(j);

			}
			System.out.println(subStr);
		}
	}

}
