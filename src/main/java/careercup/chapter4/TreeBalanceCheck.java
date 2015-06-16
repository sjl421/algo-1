package careercup.chapter4;

import algo.tree.Node;

/**
 * Implement a function to check if a tree is balanced.
 *
 * Def: tree is said to be balanced if
 *  (1) it is empty, or
 *  (2) its left and right children are height-balanced and the height of the
 *      left tree is within 1 of the height of the right tree.
 *
 *  The idea: max(depth) - min(depth) <= 1
 */
class TreeBalanceCheck {

    static boolean isBalanced(Node root) {
        return maxDepth(root) - minDepth(root) <= 1;
    }

    static int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(maxDepth(node.getLeft()), maxDepth(node.getRight())) + 1;
    }

    static int minDepth(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.min(minDepth(node.getLeft()), minDepth(node.getRight())) + 1;
    }
}
