package careercup.chapter10;

import org.junit.Test;
import com.ahalikov.toolkit.utils.ArrayUtils;

import static org.junit.Assert.*;

/**
 * Test for {@link AnagramSort}
 *
 * @author ahalikov
 */
public class AnagramSortTest {
  @Test
  public void testSort() throws Exception {
    String[] a = new String[]{"abab", "Google", "Amazon", "Moo", "abba", "baba"};
    String[] actual = AnagramSort.sort(a);
    ArrayUtils.print(actual);
    assertArrayEquals(
      new String[]{"abab", "abba", "baba", "Amazon", "Google", "Moo"},
      actual
    );
  }
}