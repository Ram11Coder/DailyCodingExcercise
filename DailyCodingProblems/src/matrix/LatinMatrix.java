package matrix;

import java.util.Scanner;

/**
 *  Given N. print the Latin Matrix (say N = 3). condition: 
 *  must not use strings(aka character literals), arrays (both 1D and 2D),
    inbuilt functions(like rotate).
 
 
 A   B   C
 B   C   A
 C   A   B
 */
public class LatinMatrix {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	char c='A',temp=c;
for(int i=0;i<n;i++) {
	char t=c++;
	for (int j = 0; j < n; j++) {
		System.out.print(t +" ");
		if(t==temp+n-1) 
			t='A';
		else 
			t++;
		

	}
	System.out.println();
}
}
}
