package com.gfg.string;

/**
 * Password Strength Find the strength of the given password string based on the
 * conditions Four rules were given based on the type and no. of characters in
 * the string. Weak – only Rule 1 is satisfied or Rule 1 is not satisfied Medium
 * – Two rules are satisfied Good – Three rules satisfied Strong – All Four
 * rules satisfied
 * 
 * 
 * I/P: Qw!1 O/P: Weak I/P: Qwertyuiop O/P: Medium I/P: QwertY123 O/P: Good I/P:
 * Qwerty@123 O/P: Strong
 *
 * 
 */
public class PasswordValidation {
	public static void main(String[] args) {

		char arr[] = "Qwert12@3yuiop".toCharArray();
		passwordValidate(arr);

	}

	private static void passwordValidate(char[] arr) {

		if (weak(arr))
			return;
		else if (medium(arr))
			return;
		else if (good(arr))
			return;
		else
			System.out.println("Strong");

	}

	private static boolean good(char[] arr) {
		for (char c : arr) {
			if (c >= 58 && c <= 64)
				return false;
		}
		System.out.println("good");
		return true;
	}

	private static boolean medium(char[] arr) {
		for (char c : arr) {
			if (c >= '0' && c <= '9')
				return false;
		}
		System.out.println("medium");
		return true;

	}

	private static boolean weak(char[] arr) {
		if (arr.length <= 4) {
			System.out.println("Weak");
			return true;
		}

		return false;
	}
}
