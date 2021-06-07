package com.java.number.pattern;

import java.util.Arrays;

//Use stringBuilder instead of string
public class LookAndSayPattern {
	public static void main(String[] args) {
		int N = 6, count = 0, ind = 0;
		char charArr[] = new char[N];
		Arrays.fill(charArr, '1');

		System.out.println(String.valueOf(charArr[0]));
		for (int i = 1; i < N; i++) {
			// for (int j = 0; charArr[j] != '\0'; j++) {
			for (int j = 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count++;

				} else {
					charArr[ind++] = (char) count;
					charArr[ind++] = charArr[i];
					i = j;
					count = 1;
				}
			}
			System.out.println(String.valueOf(charArr));
		}

	}
}
