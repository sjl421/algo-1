package algo.sorting;

/**
 * Generic version of bubble sort
 *
 * @author ahalikov
 */
class GenericBubbleSort {

    static <T extends Comparable<? super T>> void sort(T[] a) {
        int n = a.length;
        do {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (a[i-1].compareTo(a[i]) > 0) {
                    swap(a, i-1, i);
                    newN = i;
                }
            }
            n = newN;
        } while (n > 0);
    }

    private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j) {
        T buffer = a[i];
        a[i] = a[j];
        a[j] = buffer;
    }
}
