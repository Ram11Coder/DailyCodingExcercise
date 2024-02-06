package heap;

import java.util.Arrays;

public class Heap {

	private int items[] = new int[10];
	private int size;

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(13);
		heap.insert(1);
		heap.insert(2);
		heap.insert(21);
		System.out.println(heap);
		System.out.println(heap.isMaxHeap(0));
		System.out.println(heap.isMinHeap(0));
		heap.remove();
	}

	public int remove() {
		if (size == 0) {
			throw new IllegalStateException();
		}
		int root = items[0];
		items[0] = items[--size];

		// bubble down
		int index = 0;
		while (index <= size && isValid(index)) {
			int largerIndex = largerIndex(index);
			swap(largerIndex, index);
			index = largerIndex;
		}
		return root;
	}

	private boolean isValid(int index) {
		if (!hasLeftChild(index))
			return false;

		if (!hasRightChild(index))
			return items[index] < items[leftIndex(index)];

		return items[index] < items[leftIndex(index)] && items[index] < items[rightIndex(index)];
	}

	private int largerIndex(int index) {

		if (!hasLeftChild(index))
			return index;

		if (!hasRightChild(index))
			return leftIndex(index);

		return (items[rightIndex(index)] < items[leftIndex(index)]) ? leftIndex(index) : rightIndex(index);
	}

	private int rightIndex(int index) {
		return index * 2 + 2;
	}

	private int leftIndex(int index) {
		return index * 2 + 1;
	}

	public boolean hasLeftChild(int index) {
		return leftIndex(index) < size;
	}

	public boolean hasRightChild(int index) {
		return rightIndex(index) < size;
	}

	public void insert(int data) {
		if (items.length == size)
			throw new IllegalStateException();

		items[size++] = data;
		int index = size - 1;
		int parentIndex = (index - 1) / 2;

		while (index > 0 && items[index] > items[parentIndex]) {
			swap(index, parentIndex);
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}

	}

	void swap(int index, int parentIndex) {
		int temp = items[index];
		items[index] = items[parentIndex];
		items[parentIndex] = temp;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

	public int size() {
		return size;
	}

	public static void heapify(int[] items) {
		// optimising heap
		/*
		 * 1. We do not need to perform heapify for leaf node
		 * 
		 * 2. if we do heapify in reverse order then reduce number of recursive calls
		 * 
		 * for (int i = 0; i < items.length; i++) { heapify(items, i); }
		 */
		for (int i = (items.length / 2) - 1; i >= 0; i--) {
			heapify(items, i);
		}
	}

	private static void heapify(int[] items, int index) {
		int largerIndex = index;
		int size = items.length;
		int leftIndex = index * 2 + 1;
		if (leftIndex < size && items[index] < items[leftIndex])
			largerIndex = leftIndex;

		int rightIndex = index * 2 + 2;
		if (rightIndex < size && items[index] < items[rightIndex])
			largerIndex = rightIndex;

		if (index == largerIndex)
			return;
		swap(items, index, largerIndex);
		heapify(items, largerIndex);
		if (items[largerIndex] > items[index])
			swap(items, index, largerIndex);

	}

	private static void swap(int[] items, int index, int largerIndex) {
		int temp = items[index];
		items[index] = items[largerIndex];
		items[largerIndex] = temp;
	}

	public int findKthLargestElement(int[] items, int k) {

		if (k < 1 || k > items.length) {
			throw new IllegalArgumentException();
		}
		for (int i : items)
			insert(i);

		for (int i = 0; i < k - 1; i++)
			remove();

		return maxRoot();
	}

	public int maxRoot() {
		if (size == 0)
			throw new IllegalArgumentException();
		return items[0];
	}

	public boolean isMaxHeap(int ind) {

		int lastParentIndex = (size - 2) / 2;

		if (ind > lastParentIndex)
			return true;

		int left = ind * 2 + 1;
		int right = ind * 2 + 2;
		boolean isvalid = false;
		if (left < size) 
			isvalid = items[ind] >= items[left];
		
		if (right < size)
			isvalid &= items[ind] >= items[right];

		return isvalid && isMaxHeap(left) && isMaxHeap(right);
	}
	
	public boolean isMinHeap(int ind) {

		int lastParentIndex = (size - 2) / 2;

		if (ind > lastParentIndex)
			return true;

		int left = ind * 2 + 1;
		int right = ind * 2 + 2;
		boolean isvalid = false;
		if (left < size) 
			isvalid = items[ind] <= items[left];
		
		if (right < size)
			isvalid &= items[ind] <= items[right];

		return isvalid && isMaxHeap(left) && isMaxHeap(right);
	}
}
