package algo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ArrayPartition}
 *
 * Created by ahalikov on 24/04/15.
 */
public class ArrayPartitionTest {
  @Test(expected = IllegalArgumentException.class)
  public void testPartitionNullArray() throws Exception {
    ArrayPartition.partitionFirst(null, 0, 0);
  }

  @Test
  public void testPartitionEmptyArray() throws Exception {
    int[] a = {};
    assertEquals(-1, ArrayPartition.partition(a, 0, 0, 0));
  }

  @Test
  public void testPartition1() throws Exception {
    int[] a = {10};
    int[] expected = {10};
    ArrayPartition.partition(a, 0, a.length, 0);
    assertArrayEquals(expected, a);
  }

  @Test
  public void testPartition2() throws Exception {
    int[] a = {3, 8, 2, 5, 1, 4, 7, 6};
    int[] expected = {1, 2, 3, 5, 8, 4, 7, 6};
    ArrayPartition.partition(a, 0, a.length, 0);
    Arrays.asList(a).forEach(x -> System.out.print(x + " "));
    assertArrayEquals(expected, a);
  }
}