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
        recursuveInsert(root, null, key);
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
    
    private void recursuveInsert(Entry<K> node, Entry<K> parent, K key) {
        if (node == null) {
            Entry<K> newEntry = new Entry();
            newEntry.key = key;
            newEntry.left = newEntry.right = null;
            newEntry.parent = parent;
        } else {
            Comparable k = (Comparable) key;
            int cmp = k.compareTo(node.key);
            if (cmp < 0)
                recursuveInsert(node.left, );
            else
                recursuveInsert();
        }
    }

    static final class Entry<K> {
        K key;

        Entry<K> parent;

        Entry<K> left;

        Entry<K> right;
    }
}
