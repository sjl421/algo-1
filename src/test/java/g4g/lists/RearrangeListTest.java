package g4g.lists;

import org.junit.Test;

import static org.junit.Assert.*;
import static g4g.lists.RearrangeList.Node;

/**
 * Created by akhalikov on 28.09.2015.
 */
public class RearrangeListTest {
  @Test
  public void testRearrange() throws Exception {
    Node<Integer> list = new Node(1);
    Node<Integer> curr = list;
    for (int i = 2; i < 6; i++) {
      curr.next = new Node(i);
      curr = curr.next;
    }
    Node<Integer> newList = RearrangeList.rearrange(list);
  }
}
