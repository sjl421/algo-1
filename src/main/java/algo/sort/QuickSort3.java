package algo.sort;

import util.FileUtils;

import java.io.File;

/**
 * Quick sort algorithm implementation
 * Pivot - median of first, middle and last elements of the input array
 * @author: Artur Khalikov
 */
public class QuickSort3 {

    public static int comparisons = 0;

    public static void sort(int[] a) {
        if (a == null)
            throw new IllegalArgumentException("Input array is null");
        if (a.length > 1) {
            comparisons = 0;
            sort(a, 0, a.length);
        }
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi - lo > 1) {
            comparisons += hi - lo - 1;
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
        }
    }

    private static int partition(int[]a, int lo, int hi) {
        int p = findPivot(a, lo, hi);
        int pivot = a[p];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (i != j && a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, p, i);
        return i;
    }

    /**
     * Returns pivot element
     * @param a input array
     * @return
     */
    public static int findPivot(int[] a, int lo, int hi) {
        int middle = (lo + hi)/2 - 1;
        if (a[lo] > a[middle])
            swap(a, lo, middle);
        if (a[lo] > a[hi-1])
            swap(a, lo, hi-1);
        if (a[middle] > a[hi-1])
            swap(a, middle, hi-1);
        return middle;
    }

    private static void swap(int[] a, int i, int j) {
        int save = a[i];
        a[i] = a[j];
        a[j] = save;
    }

    public static void main(String[] args) {
        File f = new File("/home/artur/work/study/algo/data/QuickSort.txt");
        int[] a = FileUtils.getIntArrayFromFile(f);
        assert a.length != 0: "array is empty";
        sort(a);
        System.out.println("Input array length=" + a.length);
        System.out.println("Comparisons: " + comparisons);
    }
}
