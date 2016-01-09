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
  public static int height(Tree.Node node) {
    if (node == null)
      return -1;
    int leftHeight = height(node.getLeft());
    int rightHeight = height(node.getRight());
    return Math.max(leftHeight, rightHeight) + 1;
  }

  /**
   * The depth of a node is the number of edges from the root to the node.
   *
   * @param node
   * @return depth of a node
   */
  public static int depth(Tree.Node node) {
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
   * @return true for BST, false otherwise
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

  /**
   * In a balanced tree the heights of the two subtrees of any node
   * never differ by more than one.
   * Time complexity: O(n log n)
   * @param root Tree.Node
   * @return true if the tree is balanced, false otherwise
   */
  public static boolean isBalanced(Tree.Node root) {
    if (root == null)
      return true;
    int heightDiff = height(root.getLeft()) - height(root.getRight());
    if (Math.abs(heightDiff) > 1)
      return false;
    else
      return isBalanced(root.getLeft()) && isBalanced(root.getRight());
  }
}
