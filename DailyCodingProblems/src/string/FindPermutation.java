package string;

/* Write a program to print all permutations of a given string.
 *  Note here you need to take all combinations as well, say for the input ABC the output should be as follows:
Input: ABC
Output:
A B C
AB AC BA BC CA CB
ABC ACB BCA BAC CBA CAB
*/		

public class FindPermutation {
	/*Yet to implement all combination for the input*/
	public static void main(String[] args) {

		String str = "ABC";
		//permutate(str.toCharArray(), 0,str.length());
		permutate(str, 0, str.length() - 1);
	}

	private static void permutate(char[] charArray, int l,int r) {
		if(l==r) {
			return;
		}
		System.out.println();
		permutate(charArray, l+1, r);
		
	}

	static void permutate(String str, int l, int r) {
		if (l == r) {
			
		System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutate(str, l + 1, r);
				str = swap(str, l, i);

			}
		}
	}

	private static String swap(String str, int l, int r) {

		char[] arr = str.toCharArray();
		char t = arr[l];
		arr[l] = arr[r];
		arr[r] = t;
		return String.valueOf(arr);
	}
}
