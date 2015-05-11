package algo.recursion;

/**
 * Recursive binary search
 * @author ahalikov
 */
public class BinarySearch {

    /**
     * Search for key in array of objects
     * @param a
     * @param key
     * @return
     */
    public static int search(Object[] a, Object key) {
        return searchRecursively(a, 0, a.length-1, key);
    }

    private static int searchRecursively(Object[] a, int first, int last, Object key) {
        if (first <= last) {
            int mid = (first + last) >> 1;
            Comparable midVal = (Comparable) a[mid];
            int comp = midVal.compareTo(key);
            if (comp < 0)
                return searchRecursively(a, mid + 1, last, key);
            else if (comp > 0)
                return searchRecursively(a, first, mid - 1, key);
            else
                return mid;
        }
        return -first - 1;
    }
}
