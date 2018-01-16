package strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import strings.CombineTwoStrings;

/**
 * Test for {@link CombineTwoStrings}
 */
public class CombineTwoStringsTest {
  @Test
  public void testIsValidShuffle() throws Exception {
    assertTrue(CombineTwoStrings.isValidShuffle("abc", "def", "dabecf"));
    assertTrue(CombineTwoStrings.isValidShuffle("abc", "", "abc"));
    assertTrue(CombineTwoStrings.isValidShuffle("", "123", "123"));
    assertTrue(CombineTwoStrings.isValidShuffle("abc", "def", "defabc"));
  }
}