package algo.lists;

import algo.lists.Loops.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Loops}
 *
 * @author akhalikov
 */
public class LoopsTest {

  @Test
  public void testHasLoop() throws Exception {
    Assert.assertFalse("null list", Loops.hasLoop(null));
    Assert.assertFalse("1 node", Loops.hasLoop(new Node(1, null)));

    // Head node cycle
    Node head = new Node(1, null);
    head.next = head;
    Assert.assertTrue("head cycle", Loops.hasLoop(head));

    // 3-element list, no cycle
    head = new Node(1, new Node(2, new Node(3, null)));
    Assert.assertFalse("3-element list no cycle", Loops.hasLoop(head));

    // 3-element list cycle
    head = new Node(1, new Node(2, new Node(3, null)));
    head.next.next.next = head.next;
    Assert.assertTrue("3-element list cycle", Loops.hasLoop(head));

    // 6-element list with cycle
    head = new Node(1, new Node(2, new Node(3, null)));
    Node p4 = new Node(4, null);
    Node p5 = new Node(5, null);
    Node p6 = new Node(6, null);
    head.next = p4;
    p4.next = p5;
    p5.next = p6;
    p6.next = p4; // cycle
    Assert.assertTrue("6-element list with cycle", Loops.hasLoop(head));
  }

  @Test
  public void testFindLoop() throws Exception {

  }
}