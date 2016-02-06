package algo;

import utils.ArrayUtils;

/**
 * Partitioning of an array around some pivot element
 */
public class ArrayPartition {
  /**
   * Partitioning around selected element
   */
  public static void partition(int[] a, int pivotIndex) {
    validateInput(a, pivotIndex);
    if (a.length < 2)
      return; // nothing to partition

    int i = 1;
    int pivot = a[pivotIndex];
    for (int j = 1; j < a.length; j++) {
      if (a[j] < pivot)
        ArrayUtils.swap(a, j, i++);
    }
    ArrayUtils.swap(a, 0, i - 1);
  }

  /**
   * Partitioning around first element
   */
  public static void partitionFirst(int[] a) {
    partition(a, 0);
  }

  /**
   * Partitioning around last element
   */
  public static void partitionLast(int[] a) {
    partition(a, a.length - 1);
  }

  private static void validateInput(int[] a, int pivotIndex) {
    if (a == null)
      throw new IllegalArgumentException("array is null");

    if (pivotIndex < 0 || (a.length > 0 && pivotIndex >= a.length))
      throw new IllegalArgumentException("pivotIndex is out of bounds");
  }
}
