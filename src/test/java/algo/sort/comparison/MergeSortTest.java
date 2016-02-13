package algo.sort.comparison;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akhalikov on 13/02/16
 */
public class MergeSortTest {

  private static final MergeSort MERGE = new MergeSort();

  @Test
  public void testSort() throws Exception {
    Integer[] numbers = {19, 11, 2, 7, 4, 1, 5, 3};
    Integer[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    MERGE.sort(numbers);
    assertArrayEquals(expected, numbers);
  }
}