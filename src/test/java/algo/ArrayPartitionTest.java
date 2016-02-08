package algo;

import org.junit.Test;
import com.ahalikov.toolkit.utils.ArrayUtils;

import static org.junit.Assert.*;

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
    ArrayUtils.print(a);
    assertArrayEquals(expected, a);
  }
}