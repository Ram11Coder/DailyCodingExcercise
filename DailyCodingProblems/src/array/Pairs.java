package array;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Pairs {
	long first, second;

	public Pairs(long first, long second) {
		this.first = first;
		this.second = second;
	}
}

class GFG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			long n = Long.parseLong(br.readLine().trim());
			long a[] = new long[(int) (n)];
			// long getAnswer[] = new long[(int)(n)];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(inputLine[i]);
			}

			Compute obj = new Compute();
			Pairs product = obj.getMinMax(a, n);
			System.out.println(product.first + " " + product.second);

		}
	}
}

//} Driver Code Ends

//User function Template for Java

/*
 * class pair { long first, second; public pair(long first, long second) {
 * this.first = first; this.second = second; } }
 */

class Compute {
	static Pairs getMinMax(long a[], long n) {
		long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		Pairs p = new Pairs(min, max);
	String	str="";
		  
		return p;

	}
}
