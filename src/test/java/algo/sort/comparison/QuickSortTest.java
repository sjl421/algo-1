package algo.sort.comparison;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akhalikov on 12/02/16
 */
public class QuickSortTest {
  static final QuickSort<Integer> QUICK = new QuickSort<>();

  @Test
  public void testSort() throws Exception {
    Integer[] numbers = {19, 11, 2, 7, 4, 1, 5, 3};
    Integer[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    QUICK.sort(numbers);
    assertArrayEquals(expected, numbers);
  }

  @Test
  public void testSorted() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 7, 11, 19};
    Integer[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    QUICK.sort(numbers);
    assertArrayEquals(expected, numbers);
    System.out.println("comparisons=" + QUICK.getComparisonsAndReset());
    System.out.println("n=" + numbers.length);
  }
}