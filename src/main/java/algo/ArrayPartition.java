package algo;

import utils.ArrayUtils;

/**
 * Partitioning of an array around some pivot element
 */
public class ArrayPartition {
  /**
   * Partitioning around selected element pivotIndex
   *
   * @return partition index
   */
  public static int partition(int[] a, int pivotIndex) {
    validateInput(a, pivotIndex);
    if (a.length < 2)
      return 0; // nothing to partition

    return partition(a, 0, a.length-1, pivotIndex);
  }

  /**
   * Partitioning around first element
   *
   * @return partition index
   */
  public static int partitionFirst(int[] a, int left, int right) {
    int pivot = a[left];
    int i = left + 1;
    for (int j = left + 1; j < right; j++) {
      if (a[j] < pivot) {
        ArrayUtils.swap(a, j, i);
        i++;
      }
    }
    ArrayUtils.swap(a, left, i-1);
    return i;
  }

  /**
   * Partitioning around last element
   *
   * @return partition index
   */
  public static int partitionLast(int[] a, int left, int right) {
    return partition(a, left, right, right);
  }

  /**
   * Partitioning around selected element pivotIndex
   *
   * @return partition index
   */
  public static int partition(int[] a, int left, int right, int pivotIndex) {
    validateInput(a, left, right, pivotIndex);
    int i = left;
    int pivot = a[pivotIndex];
    for (int j = left + 1; j <= right; j++) {
      if (a[j] < pivot)
        ArrayUtils.swap(a, j, i++);
    }
    ArrayUtils.swap(a, 0, i-1);
    return i;
  }

  private static void validateInput(int[] a, int pivotIndex) {
    if (a == null)
      throw new IllegalArgumentException("array is null");

    if (pivotIndex < 0 || (a.length > 0 && pivotIndex >= a.length))
      throw new IllegalArgumentException("pivotIndex is out of bounds");
  }

  private static void validateInput(int[] a, int left, int right, int pivotIndex) {
    if (left < 0 || left > a.length)
      throw new IllegalArgumentException("left index is out of bounds");

    if (right < 0 || right > a.length)
      throw new IllegalArgumentException("right index is out of bounds");

    if (pivotIndex < left && pivotIndex > right)
      throw new IllegalArgumentException("pivotIndex is out of bounds");
  }
}
