package com.gfg.string;

/**
 * .Alphabets are inside () and the number -9<=0>=9 which is under{} solve the
 * string according to the sample input output Input (z){-2}oho Output ZZoho
 * Input ((X){2}(y){3}(z)){2} Output xxyyyzxxyyyz
 *
 */
public class AlphabetSOlver {

	public static void main(String[] args) {

		String str = "((X){2}(y){3}(z)){2}";
		char charArr[] = str.toCharArray();
		char c = '0';
		int count = 0;
		String val = "";
		int n = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '(') {
				count++;
			} else if (charArr[i] >= 'a' && charArr[i] <= 'z' || charArr[i] >= 'A' && charArr[i] <= 'Z') {
				c = charArr[i];
			} else if (charArr[i] >= '0' && charArr[i] <= '9') {

				n = n * 10 + Integer.parseInt(String.valueOf(charArr[i]));
			} else if (charArr[i] == '}') {
				// num += String.valueOf(charArr[i - 1]);

				val += generateSequence(c, n);
				System.out.println(val);
				n = 0;
				c = '0';
			} else if (charArr[i] == ')') {
				count--;
			}

			// System.out.println("c -> "+c+" n ->"+n );

			if (count == 0) {
				val += generateSequence(c, 1);
				System.out.println(val);
			}
		}
	}

	private static String generateSequence(String val, int n) {
		n = (n == 0) ? 1 : n;
		System.out.println(n);
		String sum = "";
		// int t = n;
		while (n-- > 0) {
			// System.out.print(val);
			sum += val;
		}

		return sum;
	}

	private static String generateSequence(char c, int n) {
		String val = "";
		n = (n == 0) ? 1 : n;
		System.out.println(n);
		int t = n;
		while (n-- > 0) {
			// System.out.print(c);
			val += String.valueOf(c);
		}

		return (t < 0) ? val.toUpperCase() : val.toLowerCase();
	}

}
