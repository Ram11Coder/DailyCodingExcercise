package array;

/**
 * 
 * Given an array A of n positive numbers. The task is to find the first
 * Equilibium Point in the array. Equilibrium Point in an array is a position
 * such that the sum of elements before it is equal to the sum of elements after
 * it.
 *
 *Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2).
 */
public class EquilibriumPoint {
	public static void main(String[] args) {
		int n = 7;
		int arr[] = {-7, 1, 5, 2, -4, 3, 0 };

		for (int i = 1; i < arr.length; i++) {
			if(checkLeft(arr, i-1)==checkRight(arr, i + 1)) {
				System.out.println("Equilibrium point at "+(i+1));
			break;
			}		
		}
	}

	public static int checkLeft(int[] arr, int i) {
		int sum = 0;
		while (i >= 0) 
			sum += arr[i--];	
		
		return sum;
	}

	public static int checkRight(int[] arr, int i) {
		int sum = 0;
		while (i < arr.length) 
			sum += arr[i++];
	
		return sum;
	}
}
