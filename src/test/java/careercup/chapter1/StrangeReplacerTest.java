package careercup.chapter1;

import org.junit.Test;

import static careercup.chapter1.StrangeReplacer.*;
import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class StrangeReplacerTest {

    @Test
    public void testReplaceString() throws Exception {
        assertEquals("", replaceString(""));
        assertEquals("%20", replaceString(" "));
        assertEquals("ab%20%20%20c%20%20d", replaceString("ab   c  d"));
    }

    @Test
    public void testReplaceChars() throws Exception {
        assertArrayEquals(null, replaceChars(null));
        assertArrayEquals(new char[]{}, replaceChars(new char[]{}));
        assertArrayEquals("a%20b".toCharArray(), replaceChars("a b".toCharArray()));
        assertArrayEquals("ab%20%20%20c%20%20d".toCharArray(), replaceChars("ab   c  d".toCharArray()));
    }
}
