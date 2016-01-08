package algo.lists;

import algo.lists.ListDuplicates.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link ListDuplicates}
 * 
 * @author akhalikov
 */
public class ListDuplicatesTest {
  @Test
  public void testRemoveDuplicates() throws Exception {
    Node list = new Node(1, new Node(2, new Node(3,
      new Node(3, new Node(3, new Node(6, null))))));

    Node res = ListDuplicates.removeDuplicates(list);
    Assert.assertEquals(1, res.data);
    Assert.assertEquals(2, res.next.data);
    Assert.assertEquals(3, res.next.next.data);
    Assert.assertEquals(6, res.next.next.next.data);
  }
}