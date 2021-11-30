package array;

/**
 * Given an array of integers of size, N. Assume ‘0’ as the invalid number and
 * all others as a valid number. Write a program that modifies the array in such
 * a way that if the next number is a valid number and is the same as the
 * current number, double the current number value and replace the next number
 * with 0. After the modification, rearrange the array such that all 0’s are
 * shifted to the end and the sequence of the valid number or new doubled number
 * is maintained as in the original array.
 * 
 * Example 1:
 * 
 * Input : arr[ ] = {2, 2, 0, 4, 0, 8} 
 * Output : 4 4 8 0 0 0 
 * Explanation: At index 0 and 1 both the elements are same. So, we can change the element at
 * index 0 to 4 and element at index 1 is 0 then we shift all the values to the
 * end of the array. So, array will become [4, 4, 8, 0, 0, 0].
 */
public class EaseTheArray {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] += arr[i + 1];
				arr[i + 1] = 0;
			}

		}
		int c = 0;
		for (int j : arr) {
			if (j != 0) {
				c++;
				System.out.print(j + " ");
			}

		}
		int count = (arr.length - c);
		while (count-- > 0) {
			System.out.print(0 + " ");

		}

	}
}
