package algo.sort;

/**
 * Insertion sort review
 *
 * 1. Sedgewick R., Wayne K. Algorithms, page 250
 * 2. {@see http://geeksquiz.com/insertion-sort/}
 */
class InsertionSort {

  static void sort(int[] a) {
    if (a == null)
      throw new NullPointerException("array is null");
    if (a.length < 2)
      return;
    int n = a.length, j, key;
    for (int i = 1; i < n; i++) {
      key = a[i];
      j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
  }

  static <T extends Comparable<? super T>> void sort(T[] a) {
    if (a == null)
      throw new NullPointerException("array is null");
    if (a.length < 2)
      return;
    int n = a.length, j;
    T key;
    for (int i = 1; i < n; i++) {
      key = a[i];
      j = i - 1;
      while (j >= 0 && a[j].compareTo(key) > 0) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
  }
}
