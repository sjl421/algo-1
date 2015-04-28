package algo;

import org.junit.Test;
import util.ArrayUtils;

import static org.junit.Assert.*;

/**
 * Test for {@link ArrayPartitioner}
 * Created by ahalikov on 24/04/15.
 */
public class ArrayPartitionerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPartitionNullArray() throws Exception {
        ArrayPartitioner.partition(null);
    }

    @Test
    public void testPartition1() throws Exception {
        assertArrayEquals(new int[]{}, ArrayPartitioner.partition(new int[]{}));
        assertArrayEquals(new int[]{10}, ArrayPartitioner.partition(new int[]{10}));
        int[] actual = ArrayPartitioner.partition(new int[]{3, 8, 2, 5, 1, 4, 7, 6});
        ArrayUtils.print(actual);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8, 4, 7, 6}, actual);
    }
}