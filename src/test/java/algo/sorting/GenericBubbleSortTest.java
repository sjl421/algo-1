package algo.sorting;

import org.junit.Test;
import util.ArrayUtils;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class GenericBubbleSortTest {

    @Test
    public void testSort() throws Exception {
        Integer[] actual = {2, 7, 4, 1, 5, 3};
        Integer[] expected = {1, 2, 3, 4, 5, 7};
        GenericBubbleSort.sort(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }
}