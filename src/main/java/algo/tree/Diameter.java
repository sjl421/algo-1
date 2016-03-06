package algo.tree;

import utils.Util;

/**
 * Optimized solution to find diameter of a tree.
 *
 * Brute-force quadratic solution is here {@link TreeProperties}
 * This version provides O(n) time complexity.
 *
 * Created by akhalikov on 06/03/16
 */
public class Diameter {

  public static int diameter(Tree.Node root) {
    return diamUtil(root, new Height());
  }

  public static int diameter2(Tree.Node root) {
    Pair p = diamUtil2(root);
    return p.diameter;
  }

  private static int diamUtil(Tree.Node root, Height height) {
    Height lh = new Height(),
           rh = new Height();

    if (root == null) {
      height.h = 0;
      return 0;
    }

    lh.h++;
    rh.h++;
    int ldiameter = diamUtil(root.left, lh);
    int rdiameter = diamUtil(root.right, rh);

    height.h = Math.max(lh.h, rh.h) + 1;

    return Util.max(lh.h + rh.h + 1, ldiameter, rdiameter);
  }

  private static Pair diamUtil2(Tree.Node root) {
    if (root == null)
      return new Pair(0, 0);

    Pair left = diamUtil2(root.left);
    Pair right = diamUtil2(root.right);

    int height = Math.max(left.height, right.height) + 1;
    int diameter = Util.max(left.diameter, right.diameter,
      left.height + right.height + 1);

    return new Pair(diameter, height);
  }

  private static class Height {
    int h;
  }

  /**
   * Pair: Height, Diameter
   */
  private static class Pair {
    int diameter;
    int height;

    public Pair(int diameter, int height) {
      this.diameter = diameter;
      this.height = height;
    }
  }
}
