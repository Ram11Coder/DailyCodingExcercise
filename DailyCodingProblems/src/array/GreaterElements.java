package array;

public class GreaterElements {
	public static void main(String[] args) {
		int arr[] = { 2, -3, -4, 5, 9, 7, 8 };
		System.out.println(arr[0]);
		for (int i = 1; i < arr.length - 1; i++)
			if (arr[i] < arr[i + 1])
				System.out.println(arr[i + 1]);

	}
}
