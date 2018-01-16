package algo;

/**
 * Given two sorted arrays of numbers.
 * Merge them into one sorted array.
 */
class SortedArrayMerge {

  static int[] merge(int[] a, int[] b) {
    int i = 0, j = 0, n = a.length + b.length;
    int c[] = new int[n];

    for (int k = 0; k < n; k++) {
      if (i >= a.length)
        c[k] = b[j++];
      else if (j >= b.length)
        c[k] = a[i++];
      else if (a[i] < b[j])
        c[k] = a[i++];
      else
        c[k] = b[j++];
    }
    return c;
  }
}
