package algo.sort.comparison;

import algo.ArrayPartition;

/**
 * Created by akhalikov on 12/02/16
 */
public class QuickSort<E> extends ComparisonSort<E> {
  @Override
  public void sort(E[] array) {
    validate(array);
    if (array.length == 0)
      return;
    sort(array, 0, array.length);
  }

  private static void sort(E[] array, int left, int right) {
    if (right - left <= 1)
      return;
    int i = ArrayPartition.partitionFirst(array, left, right);
    sort(array, left, i - 1);
    sort(array, i, right);
  }
}
