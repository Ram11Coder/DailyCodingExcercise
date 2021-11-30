package array;

/**
 * Print all possible subsets of the given array whose sum equal to given N.
 * example: Input: {1, 2, 3, 4, 5}
 * 
 * N=6
 * 
 * Output: {1, 2, 3}, {1, 5}, {2, 4}
 *
 * Note: Need to optimise the code further
 */
public class PrintSubset {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = 6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

}
