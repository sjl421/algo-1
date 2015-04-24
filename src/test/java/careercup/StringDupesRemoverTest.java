package careercup;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Test for {@link StringDupesRemover}
 * Created by ahalikov on 24/04/15.
 */
public class StringDupesRemoverTest {

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDupesNullString() throws Exception {
        StringDupesRemover.removeDupes(null);
    }

    @Test
    public void testRemoveDupes() throws Exception {
        assertEquals("", StringDupesRemover.removeDupes(""));
        assertEquals("a", StringDupesRemover.removeDupes("aa"));
        assertEquals("xyz", StringDupesRemover.removeDupes("xyz"));
        assertEquals("SabrCd", StringDupesRemover.removeDupes("SabraCaddabra"));
    }

    @Test
    public void testRemoveDupes2() throws Exception {
        assertEquals("Empty string", "", StringDupesRemover.removeDupes2(""));
        assertEquals("String without any duplicates", "xyze", StringDupesRemover.removeDupes2("xyze"));
        assertEquals("String: SabraCaddabra", "SabrCd", StringDupesRemover.removeDupes2("SabraCaddabra"));
        assertEquals("Continuous duplicates: aaaaabbbbbbcccccc", "abc", StringDupesRemover.removeDupes2("aaaaabbbbbbcccccc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDupes2NullString() throws Exception {
        StringDupesRemover.removeDupes2(null);
    }

    @Test
    public void testRemoveDupes3() throws Exception {
        assertEquals("Empty string", "", StringDupesRemover.removeDupes3(""));
        assertEquals("String without any duplicates", "xyze", StringDupesRemover.removeDupes3("xyze"));
        assertEquals("String: SabraCaddabra", "SabrCd", StringDupesRemover.removeDupes3("SabraCaddabra"));
        assertEquals("Continuous duplicates: aaaaabbbbbbcccccc", "abc", StringDupesRemover.removeDupes3("aaaaabbbbbbcccccc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDupes3NullString() throws Exception {
        StringDupesRemover.removeDupes3(null);
    }
}