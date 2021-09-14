package com.gfg.number;

/**
 * Solve the equation (XpowerY/Z!) + (Z/(X!+Z)) with given values of X, Y, Z. X
 * and Z cannot be negative. Example: Input: X=2, Y=3, Z=4 Output: 1
 * 
 */
public class EqautionQsn {
	//Need to check with few test cases
	public static void main(String[] args) {

		int x = 5, y = 2, z = 3;
		System.out.println("Equation = (x^y/z!)+(z/(x!+z))");
		solveEquation(x, y, z);
	}

	private static void solveEquation(int x, int y, int z) {
		int denom1, denom2, lcm;
		denom1 = fact(z);
		denom2 = fact(x) + z;

		lcm = calculateLcm(denom1, denom2);
		System.out.println("Numerator = "
				+ ((int) Math.pow(x, y) * checkNumerator1(denom1, lcm) + z * checkNumerator2(denom2, lcm)));
		System.out.println("Denominator = " + lcm);
		int res = ((int) Math.pow(x, y) * checkNumerator1(denom1, lcm) + z * checkNumerator2(denom2, lcm)) / lcm;
		System.out.println("Result = " + res);
	}

	private static int checkNumerator2(int denom2, int lcm) {
		if (lcm == denom2)
			return 1;
		return lcm / denom2;
	}

	private static int checkNumerator1(int denom1, int lcm) {
		if (lcm == denom1)
			return 1;
		return lcm / denom1;
	}

	private static int calculateLcm(int a, int b) {

		return (a / gcd(a, b)) * b;
	}

	private static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	private static int fact(int z) {
		if (z == 0 || z == 1)
			return 1;
		return z * fact(z - 1);
	}
}
