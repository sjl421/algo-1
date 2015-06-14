package algo.tree;

/**
 * Check if a given tree is binary search tree
 *
 * @author ahalikov
 */
class BstCheck {

    static boolean isBinarySearchTree(Node<Integer> root) {
        return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBst(Node<Integer> node, int minValue, int maxValue) {
        if (node == null) return true;
        if (node.data < maxValue
                && node.data > minValue
                && checkBst(node.left, minValue, node.data)
                && checkBst(node.right, node.data, maxValue))
            return true;
        else
            return false;
    }
}
