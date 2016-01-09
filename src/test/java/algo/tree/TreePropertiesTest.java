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
  public void testHeight1() throws Exception {
    Tree<Integer> tree = new Tree();
    assertEquals("Empty tree", -1, TreeProperties.height(tree.getRoot()));
    tree.insert(12);
    assertEquals("Only root", 0, TreeProperties.height(tree.getRoot()));
    tree.insert(5, 9, 2, 17, 19, 18);
    assertEquals("longest path is 4 nodes", 3, TreeProperties.height(tree.getRoot()));
  }

  @Test
  public void testHeight2() throws Exception {
    Node n6 = new Node(6, new Node(7), null);
    Node n3 = new Node(2, n6, null);
    Node n2 = new Node(5, new Node(1), new Node(4));
    Node root = new Node(3, n2, n3);
    assertEquals(3, TreeProperties.height(root));
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

  @Test
  public void testIsBalanced() throws Exception {
    Node<Integer> tree1 = new Node(7,
      new Node(4,
        new Node(1), new Node(6)),
      new Node(9)
    );
    assertTrue(TreeProperties.isBalanced(tree1));

    Node<Integer> tree2 = new Node(7,
      new Node(4,
        new Node(1), new Node(6, new Node(8, new Node(10), null), null)),
      new Node(9)
    );
    assertFalse(TreeProperties.isBalanced(tree2));
  }
}