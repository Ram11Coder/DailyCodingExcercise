package com.gfg.number;

public class ConvertBase7 {
	public static void main(String[] args) {

		int n = 1032;
		int i = 1, r = 0;
		while (n > 0) {
			r = r + (n % 7) * i;
			i *= 10;
			n = n / 7;
		}
		System.out.println(r);
	}
}
