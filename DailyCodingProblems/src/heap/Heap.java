package heap;

public class Heap {

	private int items[] = new int[10];
	private int size;

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(13);
		heap.insert(1);
		heap.insert(2);
		heap.insert(21);

		heap.remove();
	}

	private void remove() {
		if (size == 0) {
			throw new IllegalStateException();
		}
		items[0] = items[--size];

		// bubble down
		int index = 0;
		while (index <= size && items[index] < items[leftIndex(index)] && items[index] < items[rightIndex(index)]) {
			int largerIndex = largerIndex(index);
			swap(largerIndex, index);
			index = largerIndex;
		}
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
		return leftIndex(index) <= size;
	}

	public boolean hasRightChild(int index) {
		return rightIndex(index) <= size;
	}

	private void insert(int data) {
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

	private void swap(int index, int parentIndex) {
		int temp = items[index];
		items[index] = items[parentIndex];
		items[parentIndex] = temp;
	}
}
