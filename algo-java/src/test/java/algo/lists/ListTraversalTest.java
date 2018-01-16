package algo.lists;

import algo.lists.ListTraversal.Node;
import org.junit.Assert;
import org.junit.Test;

public class ListTraversalTest {
  @Test
  public void tesGetNode1() {
    Node list = new Node(1, new Node(2, new Node(3,
      new Node(4, new Node(5, new Node(6, null))))));
    Assert.assertEquals(4, ListTraversal.getNode1(list, 3));
  }

  @Test
  public void tesGetNode2() {
    Node list = new Node(1, new Node(2, new Node(3,
      new Node(4, new Node(5, new Node(6, null))))));
    Assert.assertEquals(6, ListTraversal.getNode2(list, 0));
    Assert.assertEquals(4, ListTraversal.getNode2(list, 2));
    Assert.assertEquals(1, ListTraversal.getNode2(list, 5));
  }
}