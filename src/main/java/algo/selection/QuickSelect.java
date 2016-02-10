package algo.selection;

import utils.Util;

/**
 * A QuickSelect algorithm implementation
 * Function select returns k-th smallest element from array.
 *
 * Average time complexity: O(n) depending on the pivot choice
 * Worst-case performance: O(n^2)
 *
 * @link https://en.wikipedia.org/wiki/Quickselect
 *
 * Created by akhalikov on 10/02/16
 */
public class QuickSelect {

  public static int select(int[] arr, int k) {
    return select(arr, 0, arr.length-1, k);
  }

  public static int select(int[] arr, int left, int right, int k) {
    if (left == right)
      return arr[left];
    int pivotIndex = randomPivot(left, right);
    pivotIndex = partition(arr, left, right, pivotIndex);
    if (k == pivotIndex)
      return arr[k];
    else if (k < pivotIndex)
      return select(arr, left, pivotIndex-1, k);
    else
      return select(arr, pivotIndex+1, right, k);
  }

  static int randomPivot(int left, int right) {
    return left + (int) Math.floor(Math.random() * (right - left + 1));
  }

  static int partition(int[] arr, int left, int right, int pivotIndex) {
    int pivotValue = arr[pivotIndex];
    Util.swap(arr, right, pivotIndex); // move pivot to the end
    int swapIndex = left;
    for (int i = left; i < right; i++) {
      if (arr[i] < pivotValue)
        Util.swap(arr, i, swapIndex++);
    }
    Util.swap(arr, right, swapIndex);
    return swapIndex;
  }
}
