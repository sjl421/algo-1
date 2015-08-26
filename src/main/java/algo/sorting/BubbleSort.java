package algo.sorting;

/**
 * Bubble sort review
 *
 * https://en.wikipedia.org/wiki/Bubble_sort
 * https://www.youtube.com/watch?v=Jdtq5uKz-w4
 *
 * @author ahalikov
 */
public class BubbleSort {

    /**
     * Basic O(n^2) implementation
     *
     * @param a
     */
    public static void sort1(int[] a) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    swap(a, i-1, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     * Swaps a[from] with a[to]
     * @param a array
     * @param from
     * @param to
     */
    private static void swap(int[] a, int from, int to) {
        int buffer = a[from];
        a[from] = a[to];
        a[to] = buffer;
    }
}
