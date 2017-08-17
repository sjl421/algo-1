package algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * VerticalTraversal is an algorithm of traversing a binary tree
 * based on the notion of horizontal distance.
 * Horizontal distance (hd) of left child of a node x is equal to horizontal distance of x minus 1,
 * and that of right child is horizontal distance of x plus 1.
 *
 * hd(root) = 0
 * hd(root.left) = -1
 * hd(root.right) = 1
 * hd(root.left.left) = -2
 * hd(root.right.right) = 2
 * ... and so on.
 *
 * Vertical nodes are nodes that have the same hd from the root.
 */
class VerticalTraversal {
  private static Map<Integer, List<Object>> verticalOrderMap;

  /**
   * Map based solution with time-complexity: O(n)
   */
  static void printVerticalOrder(Tree tree) {
    verticalOrderMap = new TreeMap<>();
    fillVerticalOrderMap(tree.getRoot(), 0);
    verticalOrderMap.keySet().forEach(key ->
        System.out.println(verticalOrderMap.get(key))
    );
  }

  private static void fillVerticalOrderMap(Tree.Node root, int hd) {
    if (root == null)
      return;
    final Map<Integer, List<Object>> map = verticalOrderMap;
    if (map.containsKey(hd)) {
      map
        .get(hd)
        .add(root.getData());
    } else {
      List nodes = new ArrayList();
      nodes.add(root.getData());
      map.put(hd, nodes);
    }
    fillVerticalOrderMap(root.getLeft(), hd - 1);
    fillVerticalOrderMap(root.getRight(), hd + 1);
  }
}
