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
  public static int partition(int[] a, int left, int right, int pivotIndex) {
    validateInput(a, left, right, pivotIndex);
    ArrayUtils.swap(a, left, pivotIndex);
    return partitionFirst(a, left, right);
  }

  /**
   * Partitioning around first element
   *
   * @return partition index
   */
  public static int partitionFirst(int[] a, int left, int right) {
    int pivot = a[left];
    int swapIndex = left + 1;
    for (int j = left + 1; j < right; j++) {
      if (a[j] < pivot)
        ArrayUtils.swap(a, j, swapIndex++);
    }
    ArrayUtils.swap(a, left, swapIndex-1);
    return swapIndex;
  }

  /**
   * Partitioning around last element
   *
   * @return partition index
   */
  public static int partitionLast(int[] a, int left, int right) {
    int pivot = a[right-1];
    int swapIndex = left;
    for (int i = left; i < right; i++) {
      if (a[i] < pivot) {
        ArrayUtils.swap(a, i, swapIndex);
        swapIndex++;
      }
    }
    ArrayUtils.swap(a, right, swapIndex-1);
    return swapIndex;
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
