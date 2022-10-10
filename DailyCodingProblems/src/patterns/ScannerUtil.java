package patterns;

import java.util.Scanner;

public class ScannerUtil {
	private static Scanner sc = new Scanner(System.in);

	private ScannerUtil() {
	}

	public static Scanner getScanner() {
		return sc;
	}

	public static void close() {
		sc.close();
	}
}
