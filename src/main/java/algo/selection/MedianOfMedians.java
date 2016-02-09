package algo.selection;

/**
 * Median of Medians algorithm implementation
 *
 * @link https://en.wikipedia.org/wiki/Median_of_medians
 *
 * Created by akhalikov on 10/02/16
 */
public class MedianOfMedians {

  public static int select(int[] arr) {
    if (arr == null || arr.length == 0)
      throw new NullPointerException("arr is null or empty");

    return select(arr, 0, arr.length);
  }

  private static int select(int[] arr, int left, int right) {
    if (left == right)
      return left;

    int pivotIndex;
    while (true) {
      //pivotIndex = getPivot(arr, left, right);
      //pivotIndex = partition(arr, left, right, pivotIndex);
    }
  }
}
