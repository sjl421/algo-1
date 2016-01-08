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
    VerticalTraversal.printVerticalOrder(TreeExamples.tree1());
  }

  @Test
  public void testPrintVerticalOrder2() throws Exception {
    System.out.println("Test #2");
    VerticalTraversal.printVerticalOrder(TreeExamples.tree2());
  }
}