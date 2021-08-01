package com.gfg.array;

public class RotateArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		int last=arr[arr.length-1],i;
		for( i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=last;
		
		for(int j : arr)
			System.out.print(j+" ");
	}
}
