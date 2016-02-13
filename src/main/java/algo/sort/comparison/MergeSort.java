package algo.sort.comparison;

/**
 * Created by akhalikov on 13/02/16
 */
public class MergeSort extends ComparisonSort<Integer> {

  private Integer[] helper;

  @Override
  public void sort(Integer[] array) {
    validate(array);
    if (array.length == 0)
      return;

    helper = new Integer[array.length];
    sort(array, 0, array.length-1);
  }

  private void sort(Integer[] array, int lo, int hi) {
    if (hi <= lo)
      return;

    int mid = (lo + hi) / 2;
    sort(array, lo, mid);
    sort(array, mid+1, hi);
    merge(array, lo, mid, hi);
  }

  private void merge(Integer[] array, int lo, int mid, int hi) {
    System.arraycopy(array, lo, helper, lo, hi - lo + 1);
    int leftIndex = lo, rightIndex = mid + 1, k = lo;

    while (leftIndex <= mid && rightIndex <= hi) {
      if (lessOrEqual(helper[leftIndex], helper[rightIndex]))
        array[k] = helper[leftIndex++];
      else
        array[k] = helper[rightIndex++];

      k++;
    }

    int remaining = mid - leftIndex;
    for (int i = 0; i <= remaining; i++)
      array[k + i] = helper[leftIndex + i];
  }
}
