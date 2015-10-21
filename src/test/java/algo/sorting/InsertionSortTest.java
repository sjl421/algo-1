package algo.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@code InsertionSort}
 *
 * @author ahalikov
 */
public class InsertionSortTest {

    @Test
    public void testSort1() throws Exception {
        int[] actual = {12, 11, 13, 5, 6};
        int[] expected = {5, 6, 11, 12, 13};

        InsertionSort.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() throws Exception {
        int[] actual = {};
        int[] expected = {};

        InsertionSort.sort(actual);
        Assert.assertArrayEquals("Test of empty array", expected, actual);

        actual = null;
        expected = null;

        Assert.assertArrayEquals("Test of null array", expected, actual);
    }
}