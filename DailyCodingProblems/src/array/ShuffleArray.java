package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Shuffle an Array
Given a range of numbers print the numbers such that they are shuffled
First line contains no. of test cases.
I/P:
3
1 10
5 12
1 10
O/P: (The order of numbers may vary)
2 3 9 5 1 10 6 7 8 4
5 6 9 12 10 11 7 8
9 5 1 2 3 4 8 7 6 10
If any of the given ranges are same, The orders of the numbers must vary.
I/P: 4
1 7
1 7
1 7
1 7

O/P:
6 7 1 5 2 3 4
1 7 2 6 3 5 4
6 3 5 1 4 2 7
1 2 3 6 5 7 4

 *
 */
public class ShuffleArray {

	public static void main(String[] args) {

		// Using inbuilt method
		List<Integer> list = new ArrayList<Integer>();
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.shuffle(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);
//Create a shuffle algorithm based on constraints
//Resources
	}

}
