package numbers;

/**
 * Find the occurrence of a number and display the values in ascending order of
 * the given input Ex input 3 4 3 4 1 2 3 1 2 
 * Output 2 2 3 2
 *
 */
public class OccurenceOrder {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 3, 4, 1, 2, 3, 1, 2 };
		int hash[] = new int[128];
		for (int i = 0; i < arr.length; i++) 
			hash[arr[i] + '0']++;//ex:(3+48)-> 51 (Ascii value of number)
		//If it is specific number then we can iterate only ('0'-'9' )-> Ascii(48 to 57))
		
		//Generic approach
		for (int i : hash) 
			if (i != 0)
				System.out.println(i);
	}
}
