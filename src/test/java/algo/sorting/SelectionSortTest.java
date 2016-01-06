package algo.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link SelectionSort}
 *
 * @author ahalikov
 */
public class SelectionSortTest {

  @Test
  public void testSort() throws Exception {
    int[] actual = {12, 11, 13, 5, 6};
    int[] expected = {5, 6, 11, 12, 13};
    SelectionSort.sort(actual);
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort1() throws Exception {
    int[] actual = {0, 0, 0};
    int[] expected = {0, 0, 0};
    SelectionSort.sort(actual);
    Assert.assertArrayEquals(expected, actual);
  }
}