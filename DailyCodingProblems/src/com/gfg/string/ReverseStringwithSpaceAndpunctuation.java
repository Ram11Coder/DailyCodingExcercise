package com.gfg.string;

/*You’re given a string as an input. You have to reverse the string by keeping the punctuation and spaces. You have to modify the source string itself with creating an another string.
Input :A man, in the boat says : I see 1-2-3 in the sky
Output :
y kse, ht ni3 21ee slsy : a sta o-b-e ht nin amA

reference: https://practice.geeksforgeeks.org/problems/reverse-a-string-with-spaces-intact5213/1
*/
public class ReverseStringwithSpaceAndpunctuation {
	public static void main(String[] args) {

		char str[] = "A man, in the boat says : I see 1-2-3 in the sky".toCharArray();
		reverseStr(str);
	}

	static void reverseStr(char[] str) {

		for (int i = 0, j = str.length - 1; i <= j; ) {
			if ((str[i] >= 32 && str[i] <= 47) ||(str[i] >= 58 && str[i] <= 64)) {
				i++;
			} else if ((str[j] >= 32 && str[j] <= 47)||(str[j] >= 58 && str[j] <= 64)) {
				j--;
			} else {
				char t = str[i];
				str[i] = str[j];
				str[j] = t;
				i++; j--;
			}
		}
		System.out.println(String.valueOf(str));
	}
}
