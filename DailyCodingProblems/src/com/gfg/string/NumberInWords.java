package com.gfg.string;

/*
 *  Print numbers in words.
For ex:
Input: 
1234
Output: 
One thousand two hundred and thirty-four. 
 */
public class NumberInWords {
	public static final String[] ONES = { "", "One ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ",
			"nine ", "ten " };
	public static final String[] TWO_DIGITS = { "Ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen", "twenty" };
	public static final String[] TENS = { "", "", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ",
			"eighty ", "ninety " };
	public static final String[] HUNDREDS = { "hundred " };
	public static final String[] THOUSAND = { "Thousand " };

	public static void main(String[] args) {
		System.out.println(numberToWordsConversion(1234));
		System.out.println(numberToWordsConversion(4321));
		System.out.println(numberToWordsConversion(5555));	
		System.out.println(numberToWordsConversion(9923));
		System.out.println(numberToWordsConversion(523));
		System.out.println(numberToWordsConversion(89));
		System.out.println(numberToWordsConversion(8989));
	}

	private static String numberToWordsConversion(int n) {
		int len = String.valueOf(n).length();
		if (n == 0)
			return "Zero";
		if (len == 1)
			return getOnes(n);
		else if (len == 2)
			return getTWO_DIGITS(n, len);
		else if (len == 3)
			return getHundreds(n, len);
		else if (len == 4)
			return getThousand(n, len);
		else
			return "Number not in the range[1 - 9999]";

	}

	public static String getThousand(int n, int len) {

		// int rem = n % (len-1);
		String s = "";
		int val = (int) (n % (Math.pow(10, len - 1)));
		int num = (int) (n / (Math.pow(10, len - 1)));
		s = getOnes(num) + THOUSAND[0]
				+ ((val < 10) ? getOnes(val) : (val < 100) ? getTWO_DIGITS(val, len - 1) : getHundreds(val, len - 1));
		return s;
	}

	private static String getHundreds(int num, int len) {
		int n = (int) (num % Math.pow(10, len - 1));
		num = (int) (num / Math.pow(10, len - 1));
		return (n == 0) ? getOnes(num) + HUNDREDS[0]
				: (n > 10) ? getOnes(num) + HUNDREDS[0] + getTWO_DIGITS(n, len - 1)
						: getOnes(num) + HUNDREDS[0] + getOnes(n);
	}

	private static String getTWO_DIGITS(int num, int len) {

		if (num >= 20)
			return (num % 10 == 0) ? getTens(num / 10) : getTens(num / 10) + getOnes(num % 10);

		return TWO_DIGITS[num % 10];
	}

	private static String getTens(int n) {

		return TENS[n];
	}

	private static String getOnes(int n) {

		return ONES[n];
	}

}
