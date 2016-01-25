package hackerrank.sorting.insertion;

import toolkit.utils.ArrayUtils;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 */
public class InsertionSort2 {

  static void sort(int[] a) {
    if (a == null || a.length < 2) return;
    for (int i = 2; i <= a.length; i++) {
      insertIntoSorted(a, i);
      ArrayUtils.print(a);
    }
  }

  private static void insertIntoSorted(int[] a, int l) {
    if (l < 2) return;
    int v = a[l - 1], i = l - 2;
    while (i >= 0 && v < a[i]) {
      a[i + 1] = a[i];
      i--;
    }
    a[i + 1] = v;
  }
}
