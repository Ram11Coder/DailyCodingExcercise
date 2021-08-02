package com.gfg.array;

public class SecondMaximum {
public static void main(String[] args) {
	int N=5, arr[] = { 2, 4, 5, 6, 7 };
	int max=0,sec_max=0;
	for(int i:arr) 
		if(i>max) {
			sec_max=max;
			max=i;		
		}
	System.out.println("Max is - "+max+" "+" second max is - "+sec_max);
	
	
}
}
