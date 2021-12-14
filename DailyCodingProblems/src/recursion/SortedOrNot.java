package recursion;

public class SortedOrNot {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,62,4};
		System.out.println((sortedOrNot(0,arr)==0)?"Not sorted":"Sorted");

	}

	private static int sortedOrNot(int i, int[] arr) {
		if (i == arr.length-1) 
			return 1;
		
		return (arr[i] > arr[i+1]) ? 0 : sortedOrNot(i + 1, arr);
	}

}
