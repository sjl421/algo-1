package algo.sort;

import algo.ArrayPartition;

/**
 * Quick sort implementation
 * @author ahalikov
 */
public class QuickSort {

  public static void sort(int[] a) {
    validateInput(a);
    if (a.length == 0)
      return;

    sort(a, 0, a.length);
  }

  /**
   * Recursive sort
   * @param right Right index is not included
   */
  private static void sort(int[] a, int left, int right) {
    if (right - left <= 1)
      return;
    int i = ArrayPartition.partitionFirst(a, left, right);
    sort(a, left, i - 1);
    sort(a, i, right);
  }

  private static void validateInput(int[] a) {
    if (a == null)
      throw new NullPointerException("Array is null");
  }
}
