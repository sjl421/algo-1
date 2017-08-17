package algo.sort.comparison;

import utils.Util;

public class QuickSort<E> extends ComparisonSort<E> {
  @Override
  public void sort(E[] array) {
    validate(array);
    if (array.length == 0)
      return;
    sort(array, 0, array.length);
  }

  private void sort(E[] array, int left, int right) {
    if (right - left <= 1)
      return;
    int i = partitionFirst(array, left, right);
    sort(array, left, i - 1);
    sort(array, i, right);
  }

  /**
   * Partitioning around first element
   * @return partition index
   */
  private int partitionFirst(E[] array, int left, int right) {
    if (array.length == 0)
      return -1;
    E pivot = array[left];
    int swapIndex = left + 1;
    for (int j = left + 1; j < right; j++) {
      if (less(array[j], pivot))
        Util.swap(array, j, swapIndex++);

      // counting comparisons
      comparisons++;
    }
    Util.swap(array, left, swapIndex - 1);
    return swapIndex;
  }
}
