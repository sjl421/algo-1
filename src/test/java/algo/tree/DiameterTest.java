package algo.tree;

import algo.tree.Tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test DiameterTest
 */
public class DiameterTest {
  @Test
  public void testDiameter() {
    Node root = new Node(1,
      new Node(2, new Node(4), new Node(5)), new Node(3));

    assertEquals(4, Diameter.diameter(root));
  }

  @Test
  public void testDiameter2() {
    Node root = new Node(1,
      new Node(2, new Node(4), new Node(5)), new Node(3));

    assertEquals(4, Diameter.diameter2(root));
  }
}