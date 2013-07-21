package algo.sort;

/**
 * Quick sort algorithm implementation
 * @author: Artur Khalikov
 */
public class Quick {

    public static void sort(int[] a) {
        if (a.length == 1)
            return;

    }

    private static void partition(int[]a, int lo, int hi) {
        int pivot = a[findPivot(a, lo)];
        int i = lo + 1;
        for (int j = lo + 1; j < hi; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, lo, i);
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
