package com.gfg.number;;

public class PrintOddEven {
	public static void main(String[] args) {
		int n = 12346511;
		int odd = 0, even = 0, temp;

		while (n > 0) {
			temp = ((n % 10) % 2 == 1) ? odd++ : even++;
			n /= 10;
		}
		System.out.println("odd - " + odd + "  even - " + even);
	}
}
