package com.gfg.array;
/**
 * 
 *  Find the extra element and its index
Input : [ 10, 20, 30, 12, 5 ]
    [ 10, 5, 30, 20 ]
Output : 12 is the extra element in array 1 at index 4
 
Input : [ -1, 0, 3, 2 ]
    [ 3, 4, 0, -1, 2 ]
Output : 4 is the extra element in array 3 at index 5

 *
 */
public class ExtraElement {
public static void main(String[] args) {
	int arr1[]= {10, 20, 30, 12, 5,7};
	int arr2[]= {10, 5, 30, 20,11};
	
	for (int i = 0; i < arr2.length; i++) {
		for (int j = 0; j < arr1.length; j++) {
			if(arr1[j]==arr2[i]) {
				arr1[j]=-1;
			}
		}
	}
	for(int k=0;k<arr1.length;k++) {
		if(arr1[k]!=-1)
	System.out.println(arr1[k]+" is the extra element in array1 at index "+k);
	}
}
}
