package com.java.number.pattern;

import java.util.Scanner;

public class Pattern5 {
/*
 * pascal pattern
 * 
 * Input: N = 5
Output:
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
  
  
  
  Using nCr formula i.e. n!/(n-r)!r!
 * */
	
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print(NCRFormula(i,k)+" ");
			}
			System.out.println();
		}
	}
 static int NCRFormula(int n, int r) {
	
return (fact(n)/(fact(n-r)*fact(r)));	
}
 static int fact(int n) {
	if(n==0 || n== 1) {
		return 1;
	}
	
	return n*fact(n-1);
}
}
