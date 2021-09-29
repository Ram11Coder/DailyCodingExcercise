package com.gfg.string;

/* Given a number, convert it into corresponding alphabet.
Input Output
       1     A
      26     Z
      27     AA
      676     ZZZ
*/
public class NumberToAlphabet {

	public static void main(String[] args) {
		alphabetSolver(26);
		alphabetSolver(51);
		alphabetSolver(52);
		alphabetSolver(80);
		alphabetSolver(676);
		alphabetSolver(702);
		alphabetSolver(705);

	}

	private static void alphabetSolver(int n) {
		StringBuilder sb = new StringBuilder();

		while (n > 0) {
			int rem = n % 26;
			if (rem == 0) {
				sb.append('Z');
				n = (n / 26) - 1;
			} else {
				sb.append((char) (rem - 1 + 'A'));
				n = n / 26;
			}

		}
		System.out.println(sb.reverse());
	}

}
