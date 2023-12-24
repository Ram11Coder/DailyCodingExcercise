package sorting;

import java.util.Arrays;

import heap.Heap;

public class HeapSort {
	public static void main(String[] args) {

		int[] arr = { 10, 1, 4, 2, 3, 5 };

		Heap heap = new Heap();
		for (int i : arr)
			heap.insert(i);

		for (int i = arr.length - 1; i >= 0; i--)
			arr[i] = heap.remove();
		
		System.out.println(Arrays.toString(arr));
	}
}
