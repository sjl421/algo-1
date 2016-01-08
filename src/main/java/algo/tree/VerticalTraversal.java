package algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * VerticalTraversal is an algorithm of traversing a binary tree
 * based on the notion of horizontal distance (hd).
 *
 * hd(root) = 0
 * hd(root.left) = -1
 * hd(root.right) = 1
 * hd(root.left.left) = -2
 * hd(root.right.right) = 2
 * ... and so on.
 *
 * Vertical nodes are nodes that have the same hd from the root.
 *
 * @author akhalikov
 */
public class VerticalTraversal {
  private static Map<Integer, List<Object>> verticalOrderMap;

  /**
   * Map based solution with time-complexity: O(n)
   * @param root
   */
  static void printVerticalOrder(Tree.Node root) {
    verticalOrderMap = new TreeMap();
    int hd = 0;
    fillVerticalOrderMap(root, hd);
    verticalOrderMap.keySet().forEach(key ->
        System.out.println(verticalOrderMap.get(key))
    );
  }

  private static void fillVerticalOrderMap(Tree.Node root, int hd) {
    if (root == null)
      return;
    if (verticalOrderMap.get(hd) != null) {
      verticalOrderMap
        .get(hd)
        .add(root.getData());
    } else {
      List nodes = new ArrayList();
      nodes.add(root.getData());
      verticalOrderMap.put(hd, nodes);
    }
    fillVerticalOrderMap(root.getLeft(), hd - 1);
    fillVerticalOrderMap(root.getRight(), hd + 1);
  }
}
