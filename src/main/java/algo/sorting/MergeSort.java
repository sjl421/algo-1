package algo.sorting;

/**
 * In-place merge sort
 *
 * Sedgewick R., Wayne K. Algorithms, page 270
 * {@see http://geeksquiz.com/merge-sort}
 *
 * Auxiliary Space: O(n)
 * Features: Divide and Conquer paradigm, in-place sorting, stable
 *
 * Applications of Merge Sort
 *   - Merge Sort is useful for sorting linked lists in O(nLogn) time.
 *     Other n logn algorithms like Heap Sort, Quick Sort (average case nLogn)
 *     cannot be applied to linked lists.
 *  - Inversion Count Problem
 *  - External Sorting
 */
public class MergeSort {

    private static int[] aux;

    public static void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi - lo <= 1)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid;
        save(a, lo, hi);
        for (int k = lo; k < hi; k++) {
            if (i >= mid)
                a[k] = aux[j++];
            else if (j >= hi)
                a[k] = aux[i++];
            else if (aux[j] < aux[i])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    private static void save(int[] a, int lo, int hi) {
        for (int i = lo; i < hi; i++)
            aux[i] = a[i];
    }
}
