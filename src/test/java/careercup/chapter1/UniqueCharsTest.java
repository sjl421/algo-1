package careercup.chapter1;

import org.junit.Test;

import static careercup.chapter1.UniqueChars.*;
import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class UniqueCharsTest {

    @Test
    public void testIsUniqueChars() throws Exception {
        assertTrue(isUniqueChars("a"));
        assertFalse(isUniqueChars("aba"));
        assertFalse(isUniqueChars("abacd abab ec 45"));
    }

    @Test
    public void testIsUniqueChars2() throws Exception {
        assertTrue(isUniqueChars2("a"));
        assertFalse(isUniqueChars2("aba"));
        assertFalse(isUniqueChars2("abacd abab ec 45"));
    }
}