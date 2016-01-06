package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Tree}
 *
 * @author ahalikov
 */
public class TreeTest {
  @Test
  public void testInsert() throws Exception {
    Tree<Integer> tree = new Tree<>();
    tree.insert(12, 5, 9, 2, 17, 19, 18);
    assertEquals(7, tree.getSize());
    tree.insert(13);
    assertEquals(8, tree.getSize());
  }
}