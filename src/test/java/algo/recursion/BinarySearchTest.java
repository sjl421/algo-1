package algo.recursion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Test for {@link BinarySearch}
 * @author ahalikov
 */
public class BinarySearchTest {

    private final static String[] STRINGS = {
            "Ada", "Ben", "Carol", "Dave", "Ed",
            "Frank", "Gerry", "Helen", "Iggy", "Joan"};

    @Test
    public void testSearch() throws Exception {
        assertEquals(0, BinarySearch.search(STRINGS, "Ada"));
        assertEquals(STRINGS.length-1, BinarySearch.search(STRINGS, "Joan"));
        assertEquals(7, BinarySearch.search(STRINGS, "Helen"));

        assertEquals(-2, BinarySearch.search(STRINGS, "Arthur"));

        assertEquals(
                Arrays.binarySearch(STRINGS, "Willy"),
                BinarySearch.search(STRINGS, "Willy"));
    }
}