package careercup.chapter1.strings;

import org.junit.Test;

import static careercup.chapter1.strings.Anagrams.isAnagram;
import static careercup.chapter1.strings.Anagrams.isAnagram2;
import static careercup.chapter1.strings.Anagrams.isAnagram3;
import static org.junit.Assert.assertEquals;

/**
 * @author ahalikov
 */
public class AnagramsTest {
    @Test
    public void testIsAnagram() {
        assertEquals(true, isAnagram("a", "A"));
        assertEquals(false, isAnagram("b", "A"));
        assertEquals(false, isAnagram("b", "BB"));
        assertEquals(true, isAnagram("aaaa", "AAAA"));
        assertEquals(true, isAnagram("Army", "Mary"));
        assertEquals(false, isAnagram("aaaa", "Mary"));
        assertEquals(true, isAnagram("Debit card", "Debitc Ard"));
    }

    @Test
    public void testIsAnagram2() {
        assertEquals(true, isAnagram2("a", "A"));
        assertEquals(false, isAnagram2("b", "A"));
        assertEquals(false, isAnagram2("b", "BB"));
        assertEquals(true, isAnagram2("aaaa", "AAAA"));
        assertEquals(true, isAnagram2("Army", "Mary"));
        assertEquals(false, isAnagram2("aaaa", "Mary"));
        assertEquals(true, isAnagram2("Debit card", "Debitc Ard"));
    }

    @Test
    public void testIsAnagram3() {
        assertEquals(true, isAnagram3("a", "A"));
        assertEquals(false, isAnagram3("b", "A"));
        assertEquals(true, isAnagram3("Army", "Mary"));
        assertEquals(false, isAnagram2("b", "BB"));
        assertEquals(true, isAnagram2("aaaa", "AAAA"));
        assertEquals(true, isAnagram2("Debit card", "Debitc Ard"));
    }
}
