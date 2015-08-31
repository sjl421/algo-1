package hackerrank.sorting.insertion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class InsertionSort1Test {

    @Test
    public void testInsertIntoSorted1() throws Exception {
        int[] actual = {2, 4, 6, 8, 3};
        int[] expected = {2, 3, 4, 6, 8};
        InsertionSort1.insertIntoSorted(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertIntoSorted2() throws Exception {
        int[] actual = {};
        int[] expected = {};
        InsertionSort1.insertIntoSorted(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertIntoSorted3() throws Exception {
        int[] actual = {3, 0};
        int[] expected = {0, 3};
        InsertionSort1.insertIntoSorted(actual);
        assertArrayEquals(expected, actual);
    }
}