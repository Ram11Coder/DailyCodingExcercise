package array;

/*
 *  Print second frequently occurring number in given series
Example :
Input: 1 1 2 3 1 2 4
Output: 2
*/
public class SecondFrequency {
	/*
	 * Only solved if the given array contains values in the range (0 - 9)
	 * 
	 * need to implement other cases also
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 1, 2, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0 };
		int n = arr.length;
		FrequencyCheck(arr, n);

	}

	private static void FrequencyCheck(int[] arr, int n) {
		int hash[] = new int[10];
		int max = Integer.MIN_VALUE, second_max = 0, Sec_max_index = 0;
		for (int i = 0; i < n; i++)
			hash[arr[i]]++;

		for (int i = 0; hash[i] != 0 && i < hash.length; i++) {
//			System.out.println(hash[i]);
			if (hash[i] > max) {
				max = hash[i];
				// } else if (hash[i] <= max && second_max < hash[i]) {
			} else if (second_max < hash[i]) {
				second_max = hash[i];
				Sec_max_index = i;
			}
		}
		System.out.println("second Maximum frequence element is -> " + Sec_max_index);

	}

}
