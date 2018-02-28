package interview.lists;

import interview.lists.RearrangeList.Node;
import org.junit.Test;

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
