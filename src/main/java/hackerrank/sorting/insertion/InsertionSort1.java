package hackerrank.sorting.insertion;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
class InsertionSort1 {
  static void insertIntoSorted(int[] a) {
    if (a == null) return;
    int n = a.length;
    if (n < 2) return;

    int v = a[n - 1], i = n - 2;
    while (i >= 0 && v < a[i]) {
      a[i + 1] = a[i];
      i--;
    }
    a[i + 1] = v;
  }
}
