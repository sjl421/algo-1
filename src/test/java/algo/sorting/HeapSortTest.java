package algo.sorting;

import com.ahalikov.toolkit.utils.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for {@link HeapSort}
 *
 * Created by akhalikov on 21/01/16
 */
public class HeapSortTest {
  @Test
  public void testSort() throws Exception {
    int[] arr = {12, 11, 13, 5, 6, 15, 17};
    HeapSort.sort(arr);
    int[] expected = {5, 6, 11, 12, 13, 15, 17};
    ArrayUtils.print(arr);
    assertArrayEquals(expected, arr);
  }
}