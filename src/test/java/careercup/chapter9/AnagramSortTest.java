package careercup.chapter9;

import org.junit.Test;
import util.ArrayUtils;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class AnagramSortTest {

    @Test
    public void testSort() throws Exception {
        String[] a = new String[] {"abab", "Google", "Amazon", "Microsoft", "abba", "baba"};
        String[] actual = AnagramSort.sort(a);
        ArrayUtils.print(actual);
        assertArrayEquals(
                new String[] {"abab", "abba", "baba", "Amazon", "Google", "Microsoft"},
                actual
        );
    }
}