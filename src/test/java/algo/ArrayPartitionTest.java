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
    ArrayPartition.partitionFirst(null);
  }

  @Test
  public void testPartitionEmptyArray() throws Exception {
    int[] a = {};
    int[] expected = {};
    ArrayPartition.partitionFirst(a);
    assertArrayEquals(expected, a);
  }

  @Test
  public void testPartition1() throws Exception {
    int[] a = {10};
    int[] expected = {10};
    ArrayPartition.partitionFirst(a);
    assertArrayEquals(expected, a);
  }

  @Test
  public void testPartition2() throws Exception {
    int[] a = {3, 8, 2, 5, 1, 4, 7, 6};
    int[] expected = {1, 2, 3, 5, 8, 4, 7, 6};
    ArrayPartition.partitionFirst(a);
    ArrayUtils.print(a);
    assertArrayEquals(expected, a);
  }
}