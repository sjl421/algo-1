package algo.tree;

/**
 * Binary tree implementation
 *
 * @author ahalikov
 */
public class Tree<K> {

    private Entry<K> root;

    public Tree() {
    }

    public Entry<K> search(K key) {
        return recursiveSearch(root, key);
    }

    public void insert(K key) {

    }

    private Entry<K> recursiveSearch(Entry<K> node, K key) {
        if (node == null)
            return null;

        Comparable k = (Comparable) key;
        int cmp = k.compareTo(node.key);
        if (cmp == 0)
            return node;
        else
            return (cmp < 0)
                    ? recursiveSearch(node.left, key)
                    : recursiveSearch(node.right, key);
    }

    static final class Entry<K> {
        K key;

        Entry<K> parent;

        Entry<K> left;

        Entry<K> right;
    }
}