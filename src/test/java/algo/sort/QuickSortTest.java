package algo.sort;

import org.junit.Test;

/**
 * Test for {@link QuickSort}
 *
 * Created by akhalikov on 06/02/16
 */
public class QuickSortTest {
  @Test
  public void testSort() throws Exception {
    int[] a = {3, 2, 5, 1, 8, 0};
    QuickSort.sort(a);
    for (int i : a)
      System.out.print(i + " ");
  }
}