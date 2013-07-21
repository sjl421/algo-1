package algo.sort;

import util.FileUtils;

import java.io.File;

/**
 * Algorithms: Design and Analysis, Part I
 * Programming Question-2
 *
 * @author: Artur Khalikov
 */
public class QuickSortComparisons {

    private static int comparisons;

    public static void sort(int[] a) {
        if (a == null)
            throw new IllegalArgumentException("Input array is null");
        if (a.length <= 1)
            return;
        sort(a, 0, a.length);
    }

    public static void main(String[] args) {
        comparisons = 0;
        File f = new File("/home/artur/work/study/algo/data/QuickSort.txt");
        int[] a = FileUtils.getIntArrayFromFile(f);
        assert a.length != 0: "array is empty";
        System.out.println("Input array length=" + a.length);
        System.out.println("Comparisons: " + comparisons);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi - lo <= 1)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j);
        sort(a, j, hi);
    }

    private static int partition(int[]a, int lo, int hi) {
        int p = findPivot(a, lo);
        int pivot = a[p];
        int i = lo + 1, j;
        for (j = lo + 1; j < hi; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
            comparisons++;
        }
        swap(a, lo, i - 1);
        return i;
    }

    /**
     * Returns pivot element
     * @param a input array
     * @return
     */
    private static int findPivot(int[] a, int lo) {
        return lo;
    }

    private static void swap(int[] a, int i, int j) {
        int save = a[i];
        a[i] = a[j];
        a[j] = save;
    }
}
