package algo.lists;

import algo.lists.ListReverse.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link ListReverse}
 *
 * @author akhalikov
 */
public class ListReverseTest {

  @Test
  public void testReverse1() throws Exception {
    Node test = new Node(3, new Node(2, new Node(1, null)));
    Node res = ListReverse.reverse1(test);
    Assert.assertEquals(1, res.data);
    Assert.assertEquals(2, res.next.data);
    Assert.assertEquals(3, res.next.next.data);
    Assert.assertNull(res.next.next.next);
  }

  @Test
  public void testReverse2() throws Exception {
    Node test = new Node(3, new Node(2, new Node(1, null)));
    Node res = ListReverse.reverse2(test, null);
    Assert.assertEquals(1, res.data);
    Assert.assertEquals(2, res.next.data);
    Assert.assertEquals(3, res.next.next.data);
    Assert.assertNull(res.next.next.next);
  }

  @Test
  public void testReverse3() throws Exception {
    // Empty list
    LinkedList.Node head = ListReverse.reverse3(null);
    assertNull(head);

    // 1-element list
    head = ListReverse.reverse3(new LinkedList.Node(3));
    assertEquals(3, head.getItem());

    // 3-element list: null <- 2 <-> 4 <-> 6 -> null
    LinkedList.Node p1 = new LinkedList.Node(2);
    LinkedList.Node p2 = new LinkedList.Node(p1, 4, null);
    LinkedList.Node p3 = new LinkedList.Node(p2, 6, null);
    p1.setNext(p2);
    p2.setNext(p3);
    head = ListReverse.reverse3(p1);
    assertNull(head.getPrev());
    assertEquals(6, head.getItem());
    assertEquals(4, head.getNext().getItem());
    assertEquals(2, head.getNext().getNext().getItem());
    assertNull(head.getNext().getNext().getNext());
  }
}