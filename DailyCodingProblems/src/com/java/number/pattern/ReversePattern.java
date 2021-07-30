package com.java.number.pattern;

public class ReversePattern {
/**
 * 1  
  3 2
 6 5 4
10 9 8 7
10 9 8 7 
 6 5 4 
  3 2 
   1

 */
	
	public static void main(String[] args) {
		int n=4,c=0;
		
		for(int i=1;i<=n*2;i++) {
			if(i<=n) {
				for(int j=n;j>i;j--) 
					System.out.print(" ");
				
				c+=i;
				for(int j=1,t=c;j<=i;j++) 
					System.out.print(t--+" ");
				
				System.out.println();
			}
			else {
				
				for (int j = i; j >n+1 ; j--) 
					System.out.print(" ");
				
				for (int j = i; j <= 2*n; j++) 
					System.out.print(c--+" ");
				
				System.out.println();
			}
			
		}
	}
}
