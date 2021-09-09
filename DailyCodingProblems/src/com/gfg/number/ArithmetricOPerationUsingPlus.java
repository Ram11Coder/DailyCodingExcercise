package com.gfg.number;

/*
 * Find the result subtraction, multiplication, division of two integers using + operator.
Input: 6 and 4
output:
addition 6+4 = 10,    subtraction  6+(-4) = 2,   multiplication = 24,   division = 1
Input : -8 and -4
Output:
addition -8+(-4) = -12,    subtraction  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2
*/
public class ArithmetricOPerationUsingPlus {
	/*
	 * case 1.
	 * I/p: a=6, b=4;
	 * O/p: 
	 * Add =12
	 * Sub =2
	 * Mul =24
	 * Div =1
	 * ------------------------------------
	 *  case 2.
	 * I/p: a=6, b=-4;
	 * O/p: 
	 * Add =2
	 * Sub =10
	 * Mul =-24
	 * Div =-1
	 * ------------------------------------
	 *  case 3.
	 * I/p: a=-6, b=-4;
	 * O/p: 
	 * Add =-12
	 * Sub =-2
	 * Mul =24
	 * Div =1
	 * ------------------------------------
	 *  case 4.
	 * I/p: a=-6, b=4;
	 * O/p: 
	 * Add =-2
	 * Sub =-10
	 * Mul =-24
	 * Div =-1
	 * ------------------------------------
	 * */
	public static void main(String[] args) {
		int a = 8, b = -4;
		System.out.print("Input :"+"\n"+a +" "+b+"\n");
		allOperations(a, b);
	}

	private static void allOperations(int a, int b) {
		System.out.println("Addition = "+calculateSum(a, b));
		System.out.println("Subtraction = "+calculateSub(a, b));
		System.out.println("Multiplication = "+calculateMul(a, b));
		System.out.println("Division = "+calculateDiv(a, b));
	}

	private static int calculateDiv(int a, int b) {
		int sum = 0, count = 0,t1=a,t2=b;
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		if (a < b)
			return 0;
		while (sum <= a) {
			sum += b;
			count++;
		}
		if(t1<0 && t2<0) 
			return count - 1;
		else if(t1<0 || t2<0) 
			return -(count-1);
		
		return count - 1;
	}

	private static int calculateMul(int a, int b) {
		int t1=a,t2=b, sum = 0;
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		int min = (a < b) ? a : b, max = (a > b) ? a : b;
		if (min < 0)
			min = -min;
		while (min-- > 0)
			sum += max;

		if(t1<0 && t2<0) 
			return sum;	
		else if(t1<0 || t2<0) 
			return -(sum);
		
		return sum;
	}

	private static int calculateSub(int a, int b) {

		return a + (-b);
	}

	private static int calculateSum(int a, int b) {
		return a + (b);

	}
}
