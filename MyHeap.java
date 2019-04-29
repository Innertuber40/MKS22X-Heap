public class MyHeap {
	private static void pushDown(int[] heap, int size, int index) {
		if (index * 2 + 2 <= size && (heap[index] < heap[index * 2 + 1] || heap[index] ) {
			int value = heap[index];
			int swapper;
			if (heap[index * 2 + 1] < heap[index * 2 + 2]) {
				swapper = index * 2
