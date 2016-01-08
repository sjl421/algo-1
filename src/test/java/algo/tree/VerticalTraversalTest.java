package algo.tree;

import org.junit.Test;

/**
 * Test for {@link VerticalTraversal}
 *
 * @author akhalikov
 */
public class VerticalTraversalTest {
  @Test
  public void testPrintVerticalOrder1() throws Exception {
    System.out.println("Test #1");
    Tree.Node n4 = new Tree.Node(1, null, new Tree.Node(9));
    Tree.Node n7 = new Tree.Node(7, new Tree.Node(8), null);
    Tree.Node n2 = new Tree.Node(5, n4, new Tree.Node(4));
    Tree.Node n3 = new Tree.Node(2, new Tree.Node(6), n7);
    Tree.Node root = new Tree.Node(3, n2, n3);
    VerticalTraversal.printVerticalOrder(root);
  }

  @Test
  public void testPrintVerticalOrder2() throws Exception {
    System.out.println("Test #2");
    Tree.Node n2 = new Tree.Node(2, null,
      new Tree.Node(4, null, new Tree.Node(5, null,
        new Tree.Node(6))));
    Tree.Node root = new Tree.Node(1, n2, new Tree.Node(3));
    VerticalTraversal.printVerticalOrder(root);
  }
}