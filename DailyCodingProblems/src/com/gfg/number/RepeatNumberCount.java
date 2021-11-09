package com.gfg.number;

import java.util.HashMap;
import java.util.Set;

/*Count the number of frequency for given number
Need to implement frequency count without hashmap
*/
public class RepeatNumberCount {
	public static void main(String[] args) {
		long n = 1001;
		numberFrequency(n);
		//numberFrequencyWithoutHasMap(n);
	}

	public static boolean singleDigitCheck(long n) {
		if (String.valueOf(n).length() == 1)
			return true;

		return false;
	}

	private static void numberFrequencyWithoutHasMap(long n) {

		if (singleDigitCheck(n)) {
			System.out.println(n + " : " + 1);
			return;
		}
		boolean flag = false;
		if (n < 0) {
			n = -n;
			flag = true;
		}
		int hash[] = new int[10];

		while (n != 0) {
			int r = (int) (n % 10);
			hash[r]++;
			n /= 10;
		}

		for (int i = 0; i < hash.length; i++) {
			if (hash[i] != 0) {
				System.out.println(((flag == true) ? -i : i) + " : " + hash[i]);
			}
		}
	}

	private static void numberFrequency(long n) {

		if (singleDigitCheck(n)) {
			System.out.println(n + " : " + 1);
			return;
		}
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();

		while (n != 0) {
			long r = n % 10;
			/*
			 * if (map.containsKey(r)) map.put(r, map.get(r) + 1); else map.put(r, 1);
			 */
			map.put(r, map.getOrDefault(r, 0)+1);//Either we can use this one line or above commented code also
			n /= 10;
		}
		Set<Long> freq = map.keySet();

		for (long key : freq)
			System.out.println(key + " : " + map.get(key));
	}
}
