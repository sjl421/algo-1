package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link TreeSearch}
 *
 * @author akhalikov
 */
public class TreeSearchTest {
  @Test
  public void testSearch() throws Exception {
    Tree<Integer> tree = new BinarySearchTree<>(12, 5, 9, 2, 17, 19, 18);
    assertEquals(7, tree.size());
    tree.insert(13);

    Tree.Node item = TreeSearch.find(tree, 13);
    assertEquals(13, item.getData());

    item = TreeSearch.find(tree, 5);
    assertEquals(5, item.getData());

    item = TreeSearch.find(tree, 42);
    assertNull(item);
  }
}