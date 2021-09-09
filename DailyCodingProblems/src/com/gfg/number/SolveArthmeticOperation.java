package com.gfg.number;

/* Given a String with numbers and operators. Perform the operation on the numbers in their respective order. Operator precedence need not be considered. The input string will have the numbers followed by the operators.
 
Input: "12345 * + - + "
Result: 6 [Explanation: 1 * 2 + 3 - 4 + 5 = 6]
Input: "374291 - - * + -"
Result: -4 [Explanation: 3 - 7 - 4 * 2 + 9 - 1 = -4]

 * */
public class SolveArthmeticOperation {

	public static void main(String[] args) {
		/*
		 * The code will not give correct output for the below input
		 * Input: "374291 - - * + -"
		 * reason is casting negative integer into char not possible in java
		 * java char primitive type is unsigned so negative integer parsing not able to do
		 * Yet looking for correct way to complete the program
		 * 
		*/
		String exp = "12345 * + - + ".replaceAll("\\s", "");// Replacing extra spaces
		evaluateExpression(exp);
	}

	private static void evaluateExpression(String exp) {
		char[] charArr = exp.toCharArray();
		int index = 0;
		for (int i = charArr.length - 1; i > 0; i--) {
			if (charArr[i] >= '0' && charArr[i] <= '9') {
				index = i + 1;
				break;
			}
		}

		formulateExpression(charArr, index);
	}

	static void formulateExpression(char[] charArr, int index) {
		char newArray[] = new char[charArr.length];
		int startIndex = 0;
		int i = 0;
		while (i < charArr.length - 1) {

			newArray[i++] = charArr[startIndex];
			newArray[i++] = charArr[index];
			startIndex++;
			index++;

		}
		newArray[i] = charArr[startIndex];
		System.out.println("Expression : " + String.valueOf(newArray));
		calcuateTheExpression(newArray);
	}

	private static void calcuateTheExpression(char[] newArray) {

		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] == '+') {
				newArray[i + 1] = sum(newArray[i - 1], newArray[i + 1]);
				//System.out.println(newArray[i - 1]);
			} else if (newArray[i] == '-') {
				newArray[i + 1] = subtract(newArray[i - 1], newArray[i + 1]);
				//System.out.println(newArray[i - 1]);
			} else if (newArray[i] == '*') {
				newArray[i + 1] = (char) multiply(newArray[i - 1], newArray[i + 1]);
				//System.out.println(newArray[i - 1]);
			} else if (newArray[i] == '/') {
				newArray[i + 1] = divide(newArray[i - 1], newArray[i + 1]);
				//System.out.println(newArray[i - 1]);
			}
			// System.out.println(newArray[i - 1]);
		}
//		System.out.println("Expression : " + String.valueOf(newArray));
		System.out.println("Output : " + newArray[newArray.length - 1]);

	}

	private static char divide(char c, char d) {
		return (char) ((getNumericValue(c) / getNumericValue(d)) + '0');
	}

	private static int multiply(char c, char d) {
		return (char) ((getNumericValue(c) * getNumericValue(d)) + '0');
	}

	private static char subtract(char c, char d) {
//
//		if(getNumericValue(c) - getNumericValue(d)<0) {
//			return (char) (-(-(getNumericValue(c) - getNumericValue(d))) + '0');
//		}
		return (char) ((getNumericValue(c) - getNumericValue(d)) + '0');
	}



	private static char sum(char c, char d) {
		return (char) ((getNumericValue(c) + getNumericValue(d)) + '0');
	}

	static int getNumericValue(char c) {
		return Character.getNumericValue(c);
	}
}