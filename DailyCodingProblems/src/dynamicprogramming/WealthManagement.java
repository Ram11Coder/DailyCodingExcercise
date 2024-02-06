package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WealthManagement {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 2 }, { 3, 3, 1 }, { 2, 1, 4 } };
		int n = a.length;
		int last = 3;
		List<Integer> ds = new ArrayList<Integer>();
		// int res = recursiveSol(a, n - 1, last, ds);

		int dp[][] = new int[n][4];
		for (int[] d : dp)
			Arrays.fill(d, -1);
		// int res = mem(a, n - 1, last, ds, dp);

		int res = tabulation(a, n, dp);
		System.out.println(res);
	}

	private static int tabulation(int[][] a, int n, int[][] dp) {

		// base case precomputation
		dp[0][0] = Math.min(a[0][1], a[0][2]);
		dp[0][1] = Math.min(a[0][0], a[0][2]);
		dp[0][2] = Math.min(a[0][0], a[0][1]);
		dp[0][3] = Math.min(a[0][0], Math.min(a[0][1], a[0][2]));

		for (int day = 1; day < n; day++) {

			for (int last = 0; last <4; last++) {
				dp[day][last] = Integer.MAX_VALUE;
				for (int task  = 0; task <= 2; task++) {

					if (task != last) {
						int activity = a[day][task] + dp[day - 1][task];
						dp[day][last] = Math.min(dp[day][last], activity);
					}
				}
			}
		}
		return dp[n-1][3];
	}

	private static int mem(int[][] a, int n, int last, List<Integer> ds, int[][] dp) {
		if (n == 0) {
			int min = Integer.MAX_VALUE;

			if (dp[n][last] != -1)
				return dp[n][last];
			for (int i = 0; i < 3; i++) {
				if (i != last) {
					ds.add(a[0][i]);
					min = Math.min(min, a[0][i]);
					System.out.println(ds);
					ds.remove(ds.size() - 1);
				}
			}

			return dp[n][last] = min;
		}

		int min = Integer.MAX_VALUE;
		for (int day = 0; day < a.length; day++) {

			if (day != last) {
				ds.add(a[n][day]);
				int points = mem(a, n - 1, day, ds, dp) + a[n][day];
				min = Math.min(min, points);
				ds.remove(ds.size() - 1);
			}
		}
		return dp[n][last] = min;
	}

	private static int recursiveSol(int[][] a, int n, int last, List<Integer> ds) {

		if (n == 0) {
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < 3; i++) {
				if (i != last) {
					ds.add(a[0][i]);
					min = Math.min(min, a[0][i]);
					System.out.println(ds);
					ds.remove(ds.size() - 1);
				}
			}

			return min;
		}

		int min = Integer.MAX_VALUE;
		for (int day = 0; day < a.length; day++) {

			if (day != last) {
				ds.add(a[n][day]);
				int points = recursiveSol(a, n - 1, day, ds) + a[n][day];
				min = Math.min(min, points);
				ds.remove(ds.size() - 1);
			}
		}
		return min;
	}
}
