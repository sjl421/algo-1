package interview.lists;

import interview.lists.SortAlternateList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortAlternateListTest {
  @Test
  public void testSort() {
    // 10->40->53->30->67->12->89->NULL
    Node list = new Node(10, new Node(40, new Node(53, new Node(30,
      new Node(67, new Node(12, new Node(89)))))));
    SortAlternateList.sort(list);

    int[] expected = {10, 12, 30, 40, 53, 67, 89};
    int i = 0;
    while (list != null) {
      assertEquals(expected[i++], list.data);
      list = list.next;
    }
  }
}