package searching;

public class JumpSearch {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		int seg = (int) Math.sqrt(arr.length);
		int start = 0, next = seg;
		int key = 18;
		int res = jumpsort(arr, start, next, seg, key);
		System.out.println(res);
	}

	private static int jumpsort(int[] arr, int start, int next, int seg, int key) {
		// Find the segment
		while (start < arr.length && arr[next - 1] < key) {
			start = next;
			next += key;
			if (next > arr.length)
				next = arr.length;
		}

		// check the key in the segment
		for (int i = start; i < next; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	//Not refractored
	private static int js(int[] arr, int start, int next, int seg) {
		int key = 7;

		// Find the correct segment
		while (start <= arr.length - 1 && next <= arr.length - 1) {
			if (arr[start] <= key && arr[next] >= key) {
				for (int i = start; i <= next; i++) {
					if (arr[i] == key)
						return i;
				}
			}
			start = next + 1;
			if (next + seg > arr.length - 1)
				next = arr.length - 1;
			else
				next += seg;
		}
		return -1;
	}
}
