package algo.sort;

import algo.sort.Inversions;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author: Artur Khalikov
 */
public class InversionsTest {
    @Test
    public void testCount() throws Exception {
        int[] actual = {};
        int expected = 0;
        assertEquals(expected, Inversions.count(actual));

        actual = new int[]{1};
        expected = 0;
        assertEquals(expected, Inversions.count(actual));

        actual = new int[]{2, 1};
        expected = 1;
        assertEquals(expected, Inversions.count(actual));
    }
}
