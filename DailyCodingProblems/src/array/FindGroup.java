package array;

/**
 * To find the number of groups and output the groups: Explanation: To find the
 * sum of the elements in the groups and that sum should be divisible by input X
 * and the groups should be limited to range with X numbers. If X is 3, then the
 * group should have only 2 elements and 3 elements from the array whose sum is
 * divisible by 3. Input: Array: 3, 9, 7, 4, 6, 8 X: 3 Output: 3, 9 3, 6 9, 6 3,
 * 9, 6 No of groups: 4
 * 
 */
public class FindGroup {
	public static void main(String[] args) {

		int arr[] = { 3, 9, 7, 4, 6, 8 };
		int x = 3;
		System.out.println("Possible groups :" + findGroup(arr, x));
	}

	private static int findGroup(int[] arr, int x) {

		int res = 0;
		int c[] = new int[x];
		for (int i : arr)
			c[i % x]++;

		/*
		 * 2 groups scenerios case 1: remainder 0 is group of 2 (if num %3 ==0 then that
		 * eligible) so 2 zero remainder number possible case 2: remainder 1 and
		 * remainder 2 (sum of remainder 1 + remainder 2 which is 3 so %3 ==0) so that
		 * only possible
		 * 
		 */
		
		res += (c[0] * (c[0] - 1)) >> 1;
		res += c[1] * c[2];
		
		/*
		 * 3 groups possibilities
		 * 
		 * case 1 - remainder of(0+0+0)%3==0 case 2 - remainder of(1+1+1)%3==0 case 3 -
		 * remainder of(2+2+2)%3==0 case 4 - remainder of(1+2+3)%3==0 possiblity of 3
		 * n*(n-1)*(n-2)/6
		 * 
		 */

		res += (c[0] * (c[0] - 1) * (c[0] - 2)) / 6;
		res += (c[1] * (c[1] - 1) * (c[1] - 2)) / 6;
		res += (c[2] * (c[2] - 1) * (c[2] - 2)) / 6;
		res += c[0] * c[1] * c[2];

		return res;

	}
}
