package algo.sort.comparison;

import static utils.Util.swap;

/**
 * Bubble sort review
 * https://en.wikipedia.org/wiki/Bubble_sort
 * https://www.youtube.com/watch?v=Jdtq5uKz-w4
 *
 * @author ahalikov
 */
public class BubbleSort<E> extends ComparisonSort<E> {
  @Override
  public void sort(E[] array) {
    validate(array);
    int n = array.length;
    do {
      int newN = 0;
      for (int i = 1; i < n; i++) {
        if (greater(array[i - 1], array[i])) {
          swap(array, i - 1, i);
          newN = i;
        }
        comparisons++;
      }
      n = newN;
    } while (n > 0);
  }
}
