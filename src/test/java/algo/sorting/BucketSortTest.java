package algo.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for {@link BucketSort}
 *
 * Created by akhalikov on 22/01/16
 */
public class BucketSortTest {
  @Test
  public void testSort() throws Exception {
    float arr[] = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
    BucketSort.sort(arr);

    float expected[] = {0.1234f, 0.3434f, 0.565f, 0.656f, 0.665f, 0.897f};
    assertArrayEquals(expected, arr, 0.0001f);
  }
}