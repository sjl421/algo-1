package algo.tree;

import algo.tree.Tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link TreeProperties}
 *
 * @author akhalikov
 */
public class TreePropertiesTest {
  @Test
  public void testHeight() throws Exception {
    Tree<Integer> tree = new Tree<>();
    assertEquals(-1, TreeProperties.findHeight(tree.getRoot()));

    tree.insert(12);
    assertEquals(0, TreeProperties.findHeight(tree.getRoot()));

    tree.insert(5, 9, 2, 17, 19, 18);
    assertEquals(3, TreeProperties.findHeight(tree.getRoot()));
  }

  @Test
  public void testIsBinarySearchTree() throws Exception {
    Node<Integer> root = new Node(7,
      new Node(4,
        new Node(1), new Node(6)),
      new Node(9)
    );
    assertTrue(TreeProperties.isBinarySearchTree(root));
  }
}