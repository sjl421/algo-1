package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Lowest Common Ancestor of two nodes in binary tree
 *
 *          20
 *        /   \
 *      8      22
 *     / \
 *   4   12
 *      /  \
 *    10   14
 *
 * LCA(10, 14) = 12
 * LCA(14, 8)  = 8
 * LCA(10, 22) = 20
 */
class LowestCommonAncestor {
  /**
   * LCA in a BST
   */
  static TreeNode findLcaBst(TreeNode root, int key1, int key2) {
    while (root != null) {
      // if both n1 and n2 are smaller than root, then LCA lies in left
      if (root.data > key1 && root.data > key2)
        root = root.left;
      else if (root.data < key1 && root.data < key2)
        root = root.right;
      else
        break;
    }
    return root;
  }

  /**
   * LCA in a Binary Tree
   */
  static TreeNode findLca(TreeNode root, TreeNode n1, TreeNode n2) {
    LinkedList<TreeNode> path1 = new LinkedList<>();
    LinkedList<TreeNode> path2 = new LinkedList<>();

    if (!findPath(root, n1, path1)
      || findPath(root, n2, path2))
      return null;

    TreeNode prev = null;
    while (!path1.isEmpty() && !path2.isEmpty()) {
      TreeNode a = path1.removeFirst();
      TreeNode b = path2.removeFirst();
      if (a != b)
        break;
      else
        prev = a;
    }
    return prev;
  }

  private static boolean findPath(TreeNode root, TreeNode node,
                                  LinkedList<TreeNode> path) {
    if (root == null)
      return false;

    path.addLast(root);

    // See if the node is same as root
    if (root == node)
      return true;

    // Check if k is found in left or right sub-tree
    if (root.left != null && findPath(root.left, node, path)
      || root.right != null && findPath(root.right, node, path))
      return true;

    // if not present in subtree rooted with root, remove
    // root from path and return false
    path.removeLast();
    return false;
  }
}
