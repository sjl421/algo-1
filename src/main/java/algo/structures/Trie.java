package algo.structures;

import java.util.HashMap;
import java.util.Map;

/**
 * Trie data structure
 *
 * Also called digital tree and sometimes radix tree or prefix tree
 * (as they can be searched by prefixes), is an ordered tree data structure
 * that is used to store a dynamic set or associative array where the keys
 * are usually strings.
 *
 * {@see https://en.wikipedia.org/wiki/Trie}
 *
 * Created by akhalikov on 24/02/16
 */
public class Trie {
  private TrieNode root = TrieNode.EMPTY;

  public Trie() {
  }

  public Trie(String[] words) {
    for (String word: words) {
      insert(word);
    }
  }

  /**
   * Method to insert a new word to Trie
   * @param word
   */
  public void insert(String word) {
    // Find length of the given word
    int length = word.length();
    TrieNode crawl = root;

    for (int level = 0; level < length; level++) {
      final Map<Character, TrieNode> child = crawl.getChildren();
      char ch = word.charAt(level);

      // If there is already a child for current character of given word
      if (child.containsKey(ch))
        crawl = child.get(ch);
      else {
        TrieNode temp = new TrieNode(ch);
        child.put(ch, temp);
        crawl = temp;
      }
    }
    // Set isEnd true for last character
    crawl.setIsEnd(true);
  }

  /**
   * The main method that finds out the longest string 'input'
   */
  public String getMatchingPrefix(String input) {
    String result = "";
    int length = input.length();

    // Initialize reference to traverse through Trie
    TrieNode crawl = root;

    // Iterate through all characters of input string 'str' and traverse
    // down the Trie
    int level, prevMatch = 0;
    for (level = 0 ; level < length; level++) {
      // Find current character of str
      char ch = input.charAt(level);

      // HashMap of current Trie node to traverse down
      final Map<Character,TrieNode> child = crawl.getChildren();

      // See if there is a Trie edge for the current character
      if( child.containsKey(ch)) {
        result += ch;          //Update result
        crawl = child.get(ch); //Update crawl to move down in Trie

        // If this is end of a word, then update prevMatch
        if (crawl.isEnd())
          prevMatch = level + 1;
      }
      else
        break;
    }

    // If the last processed character did not match end of a word,
    // return the previously matching prefix
    return !crawl.isEnd() ? result.substring(0, prevMatch) : result;
  }

  final static class TrieNode {
    public static final TrieNode EMPTY = new TrieNode((char) 0);

    private char value;
    private boolean isEnd;
    private Map<Character, TrieNode> children;

    public TrieNode(char ch) {
      this.value = ch;
      children = new HashMap<>();
      isEnd = false;
    }

    public char getValue() {
      return value;
    }

    public void setValue(char value) {
      this.value = value;
    }

    public boolean isEnd() {
      return isEnd;
    }

    public void setIsEnd(boolean isEnd) {
      this.isEnd = isEnd;
    }

    public Map<Character, TrieNode> getChildren() {
      return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
      this.children = children;
    }
  }
}
