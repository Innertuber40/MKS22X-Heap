public class MyHeap {
	private static void pushDown(int[] heap, int index) {
		if (index * 2 + 2 < heap.length && (heap[index] < heap[index * 2 + 1] || heap[index] < heap[index * 2 + 2]) || index * 2 + 1 < heap.length && heap[index] < heap[index * 2 + 1]) {
			int swapper = index * 2;
			if (index * 2 + 2 == heap.length || heap[index * 2 + 1] > heap[index * 2 + 2]) {
				swapper += 1;
			} else {
				swapper += 2;
			}
			swap(heap, index, swapper);
			pushDown(heap, swapper);
		}
	}

	private static void pushUp(int[] heap, int index) {
		if (index > 0 && (heap[index] > heap[index / 2])) {
			swap(heap, index, index / 2);
			pushUp(heap, index / 2);
		}
	}

	private static void swap(int[] heap, int ind1, int ind2) {
		int value = heap[ind1];
		heap[ind1] = heap[ind2];
		heap[ind2] = value;
	}

	public static void heapify(int[] heap) {
		int levels;
		int exp = 0;
		while (Math.pow(2, exp + 1) < heap.length) {
			exp++;
		}
		levels = (int)Math.pow(2, exp) - 2;
		for (int index = levels; index >= 0; index--) {
			pushDown(heap, index);
			for (int i : heap) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
