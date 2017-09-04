package algo.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

  @Test
  public void testSort() throws Exception {
    Integer[] numbers = {19, 11, 2, 7, 4, 1, 5, 3};
    Integer[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    BubbleSort.sort(numbers);
    assertArrayEquals(expected, numbers);
  }

  @Test
  public void testSort1() throws Exception {
    int[] actual = {19, 11, 2, 7, 4, 1, 5, 3};
    int[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    BubbleSort.sort1(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort1a() throws Exception {
    int[] actual = {1, 1, 0, 1, 0, -1};
    int[] expected = {-1, 0, 0, 1, 1, 1};
    BubbleSort.sort1(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort1CornerCases() throws Exception {
    // empty array
    int[] actual = {};
    int[] expected = {};
    BubbleSort.sort1(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort2() throws Exception {
    int[] actual = {19, 11, 2, 7, 4, 1, 5, 3};
    int[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
    BubbleSort.sort2(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort2a() throws Exception {
    int[] actual = {1, 1, 0, 1, 0, -1};
    int[] expected = {-1, 0, 0, 1, 1, 1};
    BubbleSort.sort2(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort2CornerCases() throws Exception {
    // empty array
    int[] actual = {};
    int[] expected = {};
    BubbleSort.sort1(actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testSort3() throws Exception {
    int[] actual = {2, 7, 4, 1, 5, 3};
    int[] expected = {1, 2, 3, 4, 5, 7};
    BubbleSort.sort(actual);
    assertArrayEquals(expected, actual);
  }
}