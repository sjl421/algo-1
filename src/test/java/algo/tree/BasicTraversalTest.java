package algo.tree;

import algo.tree.Tree.Node;
import org.junit.Test;

public class BasicTraversalTest {

  static final Node<Character> TEST_TREE = new Node('A',
    new Node('B',
      new Node('D'),
      new Node('E')),
    new Node('C',
      new Node('F'),
      new Node('G')));

  @Test
  public void testBreadthFirst() throws Exception {
    System.out.print("Level-Order: ");
    BasicTraversal.levelOrder(TEST_TREE);
  }

  @Test
  public void testPreOrder() throws Exception {
    System.out.print("Pre-Order: ");
    BasicTraversal.preOrder(TEST_TREE);
    System.out.println();
  }

  @Test
  public void testInOrder() throws Exception {
    System.out.print("In-Order: ");
    BasicTraversal.inOrder(TEST_TREE);
    System.out.println();
  }

  @Test
  public void testPostOrder() throws Exception {
    System.out.print("Post-Order: ");
    BasicTraversal.postOrder(TEST_TREE);
    System.out.println();
  }
}