package array;

public class Top3MaxElements {
	public static void main(String[] args) {
		int arr[] = { 34, 45,21, 45, 21, 3, 78 };
		int max_first = Integer.MIN_VALUE, max_Second = Integer.MIN_VALUE, max_Third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max_first < arr[i]) {
				max_Third = max_Second;
				max_Second = max_first;
				max_first = arr[i];
			} else if (max_Second < arr[i]) {
				max_Third = max_Second;
				max_Second = arr[i];

			} else if (max_Third < arr[i]) {
				max_Third = arr[i];

			}
		}
		System.out.println(max_first + " " + max_Second + " " + max_Third);
	}
}
