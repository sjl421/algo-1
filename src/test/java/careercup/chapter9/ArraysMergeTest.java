package careercup.chapter9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link ArraysMerge}
 *
 * @author ahalikov
 */
public class ArraysMergeTest {

    @Test
    public void testMerge0() throws Exception {
        assertNull(ArraysMerge.merge(null, null, 5, 4));
    }

    @Test
    public void testMerge() throws Exception {
        int[] a = new int[] {1, 2, 5, 6, 7, 0, 0, 0, 0};
        int[] b = {-1, 4, 8, 11};
        assertArrayEquals(
                new int[] {-1, 1, 2, 4, 5, 6, 7, 8, 11},
                ArraysMerge.merge(a, b, 5, 4)
        );
    }
}