package algo.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@code InsertionSort}
 *
 * @author ahalikov
 */
public class InsertionSortTest {
  @Test
  public void testSort1() throws Exception {
    int[] actual = {12, 11, 13, 5, 6};
    int[] expected = {5, 6, 11, 12, 13};
    InsertionSort.sort(actual);
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort2() throws Exception {
    int[] actual = {};
    int[] expected = {};
    InsertionSort.sort(actual);
    Assert.assertArrayEquals("empty array", expected, actual);
  }

  @Test(expected = NullPointerException.class)
  public void testSort3() throws Exception {
    int[] arr = null;
    InsertionSort.sort(arr);
  }
}