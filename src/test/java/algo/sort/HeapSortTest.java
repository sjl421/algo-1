package algo.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for {@link HeapSort}
 *
 * Created by akhalikov on 21/01/16
 */
public class HeapSortTest {
  @Test
  public void testSort1() throws Exception {
    int[] arr = {1, 3, 3, 0, 12};
    HeapSort.sort(arr);
    for (int i : arr)
      System.out.print(i + " ");
  }

  @Test
  public void testSort2() throws Exception {
    int[] arr = {12, 11, 13, 5, 6, 15, 17};
    HeapSort.sort(arr);

    int[] expected = {12, 11, 13, 5, 6, 15, 17};
    Arrays.sort(expected);
    assertArrayEquals(expected, arr);
  }
}