package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Priority Queues using heaps
 * 
 * TC - O(logn)
 * 
 * SC - O(logn)
 */
public class PriorityQueueUsingHeaps {
	private Heap heap = new Heap();

	public void enqueue(int data) {
		heap.insert(data);
	}

	public int dequeue() {
		return heap.remove();
	}

	public static void main(String[] args) {

		PriorityQueueUsingHeaps pq = new PriorityQueueUsingHeaps();
		pq.enqueue(1);
		pq.enqueue(12);
		pq.enqueue(13);
		pq.enqueue(10);
		System.out.println(pq.heap.size());
		System.out.println(pq.heap);
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());
		System.out.println(pq.dequeue());

		/*
		 * PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); pq.offer(1);
		 * pq.offer(12); pq.offer(13); pq.offer(10); System.out.println(pq.toString());
		 * System.out.println(pq.poll()); System.out.println(pq.poll());
		 * System.out.println(pq.poll()); System.out.println(pq.poll());
		 */

		int[] items = { 5, 6, 1, 7, 4 };
		pq.heap.heapify(items);
		System.out.println(Arrays.toString(items));
		// Kth largest elementy
		int k = 5;
		Heap h = new Heap();
		System.out.println(h.findKthLargestElement(items, k));
	}
}
