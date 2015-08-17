package stanford.part1.sort;

import org.junit.Test;
import util.ArrayUtils;
import util.InputFile;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test for {@link stanford.part1.sort.QuickSort}
 * @author: Artur Khalikov
 */
public class QuickSortTest {

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
    public void testSort2() throws Exception {
        int n = 10000 + 1;
        int[] expected = new int[n];
        ArrayUtils.fillFrom(expected, 0);

        int[] actual = Arrays.copyOf(expected, expected.length);
        ArrayUtils.shuffle(actual);
        QuickSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparisons1() throws Exception {
        int[] a = {3, 9, 8, 4, 6, 10, 2, 5, 7, 1};
        int expected = 25;
        QuickSort.sort(a);
        assertEquals(expected, QuickSort.comparisons);
    }

    //@Test
    public void testComparisons2() throws Exception {
        int[] a = new InputFile("/home/artur/work/study/algo/data/100.txt").getIntegerArray();
        int expected = 615;
        QuickSort.sort(a);
        assertEquals(expected, QuickSort.comparisons);
    }

    //@Test
    public void testComparisons3() throws Exception {
        int[] a = new InputFile("/home/artur/work/study/algo/data/1000.txt").getIntegerArray();
        int expected = 10297;
        QuickSort.sort(a);
        assertEquals(expected, QuickSort.comparisons);
    }
}
