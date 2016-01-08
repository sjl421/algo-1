package algo.tree;

/**
 * Searching a binary tree
 *
 * @author akhalikov
 */
public class TreeSearch {
  /**
   * Searching item in a tree starting from some node
   * @param tree Tree
   * @param item Object
   * @return Tree node if found, null otherwise
   */
  public static Tree.Node find(Tree tree, Object item) {
    Tree.Node root = tree.getRoot();
    return findRecursively(root, item);
  }

  /**
   * Recursive search based on Pre-Order traverse of a binary tree
   * @param node
   * @param item
   * @return
   */
  private static Tree.Node findRecursively(Tree.Node node, Object item) {
    if (node == null)
      return null;
    Comparable comp = (Comparable) item;
    int value = comp.compareTo(node.getData());
    if (value == 0)
      return node;
    else
      return (value < 0)
        ? findRecursively(node.getLeft(), item)
        : findRecursively(node.getRight(), item);
  }
}
