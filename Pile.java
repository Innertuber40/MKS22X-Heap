public class Pile {
    public static void main(String[] args) {
        int[] test1 = new int[] {-6, 5, 4, 0, 0, 3, 2, 1, -87, 32499};
        MyHeap.heapify(test1);
        for (int i : test1) {
            System.out.print (i + " ");
        }
        System.out.println();
        MyHeap.heapSort(test1);
        for (int i : test1) {
            System.out.print (i + " ");
        }
    }
}