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
     * Basic O(n^2) implementation of bubble sort
     *
     * @param a Input array
     */
    static void sort1(int[] a) {
        int passes = 0;
        int comparisons = 0;

        boolean swapped;
        do {
            swapped = false;
            int i;
            for (i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    swap(a, i-1, i);
                    swapped = true;
                }
            }
            passes++;
            comparisons += i;
        } while (swapped);

        System.out.println("Bubble sort1");
        System.out.println("input N=" + a.length);
        System.out.println("passes=" + passes);
        System.out.println("comparisons=" + comparisons);
    }

    /**
     * Optimized inner loop to avoid looking at last n-1 items
     * 
     * @param a
     */
    static void sort2(int[] a) {
        int passes = 0;
        int comparisons = 0;

        boolean swapped;
        int n = a.length;
        do {
            int i;
            swapped = false;
            for (i = 1; i < n; i++) {
                if (a[i-1] > a[i]) {
                    swap(a, i-1, i);
                    swapped = true;
                }
            }
            n -= 1;
            passes++;
            comparisons += i;
        } while (swapped);

        System.out.println("Bubble sort2");
        System.out.println("input N=" + a.length);
        System.out.println("passes=" + passes);
        System.out.println("comparisons=" + comparisons);
    }

    /**
     * Further optimization of inner loop
     *
     * @param a
     */
    static void sort3(int[] a) {
        int n = a.length;
        do {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (a[i-1] > a[i]) {
                    swap(a, i-1, i);
                    newN = i;
                }
            }
            n = newN;
        } while (n > 0);
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
