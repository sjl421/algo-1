package algo.sorting;

import org.junit.Test;
import toolkit.utils.ArrayUtils;

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
    ArrayUtils.print(a);
  }
}