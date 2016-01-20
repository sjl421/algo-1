package careercup.chapter10;

/**
 * You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 *
 * @author ahalikov
 */
class SortedMerge {
  static int[] merge(int[] a, int[] b, int n, int m) {
    if (a == null && b == null)
      return null;
    int i = n - 1, // index of the last item in a
      j = m - 1; // index of the last item in b

    for (int k = m + n - 1; k >= 0; k--)
      if (i < 0)
        a[k] = b[j--];
      else
        a[k] = (a[i] > b[j]) ? a[i--] : b[j--];
    return a;
  }
}
