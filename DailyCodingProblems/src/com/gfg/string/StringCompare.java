package com.gfg.string;

public class StringCompare {
	public static void main(String[] args) {

		/*
		 * Print the character which are mismatched from two array. Arr1 = {a b c d e f
		 * g h i} arr2 ={ a b d e e g g i i}, O/P- cd, de, f, g, h, i
		 */

		char charArr1[] = "abcdefghi".toCharArray();
		char charArr2[] = "abdeeggii".toCharArray();
	
		for(int i=0;i<charArr1.length;i++) {
			if(charArr1[i]!=charArr2[i]) {
				System.out.print(charArr1[i]+" "+charArr2[i]+" ");
			}
		}
	}
}
