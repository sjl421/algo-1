package interview.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest {
  @Test
  public void testFindLcaBst() {
    TreeNode root = new TreeNode(20);
    root.left = new TreeNode(8);
    root.right = new TreeNode(22);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(12);
    root.left.right.left = new TreeNode(10);
    root.left.right.right = new TreeNode(14);

    TreeNode lca = LowestCommonAncestor.findLcaBst(root, 10, 14);
    assertEquals(12, lca.data);
  }
}