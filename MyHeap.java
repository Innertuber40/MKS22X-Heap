public class MyHeap {
	private static void pushDown(int[] heap, int index) {
		if (index * 2 + 2 < heap.length && (heap[index] < heap[index * 2 + 1] || heap[index] < heap[index * 2 + 2])) {
			int value = heap[index];
			int swapper = index * 2;
			if (heap[index * 2 + 1] < heap[index * 2 + 2]) {
				swapper += 1;
			} else {
				swapper += 2;
			}
			heap[index] = heap[swapper];
			heap[swapper] = value;
			pushDown(heap, swapper);
		}
	}

	private static void pushUp(int[] heap, int index) {
		if (index > 0 && (heap[index] > heap[index / 2]) {
			int value = heap[index];
			heap[index] = heap[index / 2];
			heap[index / 2] = value;
			pushUp(heap, index / 2);
		}
	}
}
