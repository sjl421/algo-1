package algo.sort.comparison;

import org.junit.Test;
import utils.Util;

import static org.junit.Assert.*;

public class BubbleSortTest {
  @Test
  public void testSort() throws Exception {
    final BubbleSort<Integer> bubble = new BubbleSort<>();
    Integer[] numbers = {19, 11, 2, 7, 4, 1, 5, 3};
    Integer[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    bubble.sort(numbers);
    assertArrayEquals(expected, numbers);
    System.out.println("comparisons=" + bubble.getComparisonsAndReset());
    System.out.println("n=" + numbers.length);
  }
}