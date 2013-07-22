package algo.sort;

import org.junit.Test;
import util.ArrayUtils;
import util.FileUtils;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static algo.sort.QuickSort3.findPivot;

/**
 * Test for {@link QuickSort3}
 * @author: Artur Khalikov
 */
public class QuickSort3Test {

    @Test
    public void testSortOneElement() throws Exception {
        int[] actual = {1};
        int[] expected = {1};
        QuickSort3.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort() throws Exception {
        int[] actual = {5, 4, 1, 8, 7, 2, 6, 3};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        QuickSort3.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() throws Exception {
        int n = 10000 + 1;
        int[] expected = new int[n];
        ArrayUtils.fillFrom(expected, 0);

        int[] actual = Arrays.copyOf(expected, expected.length);
        ArrayUtils.shuffle(actual);
        QuickSort3.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPivot() throws Exception {
        int[] a = {4, 5, 6, 7};
        int expected = 1;
        int actual = findPivot(a, 0, a.length-1);
        assertEquals(expected, actual);
        assertEquals(5, a[actual]);

        a = new int[] {5, 7, 10, 2, 3};
        expected = 0;
        actual = findPivot(a, 0, a.length-1);
        assertEquals(expected, actual);
        assertEquals(5, a[actual]);
    }

    @Test
    public void testComparisons1() throws Exception {
        int[] a = {3, 9, 8, 4, 6, 10, 2, 5, 7, 1};
        int expected = 21;
        QuickSort3.sort(a);
        assertEquals(expected, QuickSort3.comparisons);
    }

    @Test
    public void testComparisons2() throws Exception {
        int[] a = FileUtils.getIntArrayFromFile(new File("/home/artur/work/study/algo/data/100.txt"));
        int expected = 518;
        QuickSort3.sort(a);
        assertEquals(expected, QuickSort3.comparisons);
    }

    @Test
    public void testComparisons3() throws Exception {
        int[] a = FileUtils.getIntArrayFromFile(new File("/home/artur/work/study/algo/data/1000.txt"));
        int expected = 8921;
        QuickSort3.sort(a);
        assertEquals(expected, QuickSort3.comparisons);
    }
}
