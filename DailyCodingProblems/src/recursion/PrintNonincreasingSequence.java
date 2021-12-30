package recursion;

public class PrintNonincreasingSequence {

	public static void main(String[] args) {
		int n = 6, sum = 0;
		// nonIncreasingSequence(n, sum);
		int[] arr = new int[n];
		solver(n, arr, 0, 0);
	}

	private static void solver(int n, int[] arr, int curr_sum, int curr_index) {
		if (n == curr_sum) {
			print(arr, curr_index);
			System.out.println();
		}else {
		int num = 1;
		while (num <= n - curr_sum && (curr_index == 0 || num <= arr[curr_index - 1])) {
			arr[curr_index] = num;
			solver(n, arr, curr_sum + num, curr_index + 1);
			num++;
		}
	}
	}

	private static void print(int[] arr, int curr_index) {
		for (int i = 0; i < curr_index; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// yet to implement further
	private static void nonIncreasingSequence(int n, int sum) {
		if (sum == n) {
			System.out.println();
			return;
		} else {
			for (int i = 1; i <= n - sum; i++) {
				System.out.print(i + " ");
				int val = sum + i;
				nonIncreasingSequence(n, val);

			}
		}
	}

}
