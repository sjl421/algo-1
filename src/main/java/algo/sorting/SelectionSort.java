package algo.sorting;

import com.ahalikov.toolkit.utils.ArrayUtils;

/**
 * Selection sort
 *
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from unsorted part and putting it at the beginning.
 *
 * The algorithm maintains two subarrays in a given array.
 *      1) The sub array which is already sorted.
 *      2) Remaining sub array which is unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order)
 * from the unsorted sub array is picked and moved to the sorted sub array.
 *
 * {@see http://geeksquiz.com/selection-sort/}
 */
public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(T[] a) {
        if (a == null || a.length < 2) return;
        int n = a.length, minIndex;
        for (int i = 0; i < n; i++) {
            minIndex = ArrayUtils.min(a, i);
            ArrayUtils.swap(a, minIndex, i);
        }
    }

    public static void sort(int[] a) {
        if (a == null || a.length < 2) return;
        int n = a.length, minIndex;
        for (int i = 0; i < n; i++) {
            minIndex = ArrayUtils.min(a, i);
            ArrayUtils.swap(a, minIndex, i);
        }
    }
}