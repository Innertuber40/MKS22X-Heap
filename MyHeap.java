public class MyHeap {
	private static void pushDown(int[] heap, int size, int index) {
		if (index * 2 + 2 < size && (heap[index] < heap[index * 2 + 1] || heap[index] < heap[index * 2 + 2]) || index * 2 + 1 < size && heap[index] < heap[index * 2 + 1]) {
			int swapper = index * 2;
			if (index * 2 + 2 == size || heap[index * 2 + 1] > heap[index * 2 + 2]) {
				swapper += 1;
			} else {
				swapper += 2;
			}
			swap(heap, index, swapper);
			pushDown(heap, size, swapper);
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

	private static void heapifyhelp(int[] heap, int max) {
		int levels;
		int exp = 0;
		while (Math.pow(2, exp + 1) < max) {
			exp++;
		}
		levels = (int)Math.pow(2, exp) - 2;
		for (int index = levels; index >= 0; index--) {
			pushDown(heap, max, index);
			/*for (int i : heap) {
				System.out.print(i + " ");
			}
			System.out.println();*/
		}
	}

	public static void heapify(int[] heap) {
		heapifyhelp(heap, heap.length);
	}
	public static void heapSort(int[] heap) {
		for (int index = heap.length; index > 0; index--) {
			heapifyhelp(heap, index);
			swap(heap, 0, index - 1);
		}
	}
}
