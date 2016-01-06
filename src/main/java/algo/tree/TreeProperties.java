package algo.tree;

/**
 * Tree height
 *
 * @author akhalikov
 */
public class TreeProperties {
  /**
   * Height of a tree
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
   * Check if a tree is a binary search tree
   * @param tree
   * @return
   */
  public static boolean isBinarySearchTree(Tree<Integer> tree) {
    return checkBst(tree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  /**
   * Check if a tree is a binary search tree
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
