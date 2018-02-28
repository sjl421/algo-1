package interview.trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import interview.trees.TreeStat.Node;

public class TreeStatTest {
  @Test
  public void testCountLowerNodes() throws Exception {
    Node root = new Node(5,
        new Node(4,
            new Node(11, new Node(3), null),
            new Node(8)),
        new Node(7,
            new Node(9, new Node(1), new Node(2)),
            new Node(4, null, new Node(5, null, new Node(4))))
    );
    assertEquals(4, TreeStat.countLowerNodes(root));
  }
}