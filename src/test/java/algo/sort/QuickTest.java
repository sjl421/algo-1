package algo.sort;

import org.junit.Test;
import util.ArrayUtils;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for {@link QuickSort}
 * @author: Artur Khalikov
 */
public class QuickTest {

    @Test
    public void testSortOneElement() throws Exception {
        int[] actual = {1};
        int[] expected = {1};
        QuickSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort() throws Exception {
        int[] actual = {5, 4, 1, 8, 7, 2, 6, 3};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        QuickSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort3() throws Exception {
        int n = 10000 + 1;
        int[] expected = new int[n];
        ArrayUtils.fillFrom(expected, 0);

        int[] actual = Arrays.copyOf(expected, expected.length);
        ArrayUtils.shuffle(actual);
        QuickSort.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
