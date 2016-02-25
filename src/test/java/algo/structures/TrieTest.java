package algo.structures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Trie}
 */
public class TrieTest {
  @Test
  public void testInsert() {
    Trie dict = new Trie();
    dict.insert("are");
    dict.insert("area");
    dict.insert("base");
    dict.insert("cat");
    dict.insert("cater");
    dict.insert("basement");

    assertTrie(dict, "cater", "caterer");
    assertTrie(dict, "basement", "basement");
    assertTrie(dict, "are", "are");
    assertTrie(dict, "are", "arex");
    assertTrie(dict, "base", "basemexz");
    assertTrie(dict, "", "xyz");
  }

  void assertTrie(Trie dict, String test, String input) {
    String actual = dict.getMatchingPrefix(input);
    System.out.println(input + ": " + actual);
    assertEquals(test, actual);
  }
}