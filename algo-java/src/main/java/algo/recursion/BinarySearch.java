package algo.recursion;

/**
 * Recursive binary search
 *
 * Worst time complexity - O(log n)
 * Worst space complexity - O(log n)
 *
 * todo: compare execution time with iterative search
 */
class BinarySearch {

  /**
   * Search for key in array of objects
   *
   * @param a   array of objects
   * @param key searched object
   * @return > 0 - position of the key in array
   * < 0 - if key is not found in array
   */
  static int search(Object[] a, Object key) {
    return searchRec(a, 0, a.length - 1, key);
  }

  private static int searchRec(Object[] a, int first, int last, Object key) {
    if (first <= last) {
      int mid = (first + last) >> 1;
      Comparable midVal = (Comparable) a[mid];
      int comp = midVal.compareTo(key);
      if (comp < 0)
        return searchRec(a, mid + 1, last, key);
      else if (comp > 0)
        return searchRec(a, first, mid - 1, key);
      else
        return mid;
    }
    return -first - 1;
  }
}
