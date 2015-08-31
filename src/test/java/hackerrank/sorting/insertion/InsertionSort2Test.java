package hackerrank.sorting.insertion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class InsertionSort2Test {

    @Test
    public void testSort1() throws Exception {
        int[] actual = {3, 0};
        int[] expected = {0, 3};
        InsertionSort2.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() throws Exception {
        int[] actual = {1, 4, 3, 5, 6, 2};
        int[] expected = {1, 2, 3, 4, 5, 6};
        InsertionSort2.sort(actual);
        assertArrayEquals(expected, actual);
    }
}