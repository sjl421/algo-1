package algo.tree;

/**
 * Tree height, depth and other properties
 * {@see https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html}
 *
 * @author akhalikov
 */
public class TreeProperties {
  /**
   * Height of a tree: number of edges from the root to the deepest leaf.
   * Time complexity: O(n)
   */
  public static int findHeight(Tree.Node node) {
    if (node == null)
      return -1;
    int leftHeight = findHeight(node.getLeft());
    int rightHeight = findHeight(node.getRight());
    return Math.max(leftHeight, rightHeight) + 1;
  }

  /**
   * The depth of a node is the number of edges from the root to the node.
   *
   * @param node
   * @return depth of a node
   */
  public static int findDepth(Tree.Node node) {
    return 0;
  }

  /**
   * Check if a tree is a binary search tree (BST)
   *
   * A BST is a binary tree where nodes are ordered in the following way:
   *  - each node contains one key (also known as data)
   *  - the keys in the left subtree are less then the key in its parent node, in short L < P;
   *  - the keys in the right subtree are greater the key in its parent node, in short P < R;
   *  - duplicate keys are not allowed.
   *
   * @param root
   * @return
   */
  public static boolean isBinarySearchTree(Tree.Node<Integer> root) {
    return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean checkBst(Tree.Node<Integer> node, int minValue, int maxValue) {
    if (node == null) return true;
    if (node.getData() < maxValue
      && node.getData() > minValue
      && checkBst(node.getLeft(), minValue, node.getData())
      && checkBst(node.getRight(), node.getData(), maxValue))
      return true;
    else
      return false;
  }
}
