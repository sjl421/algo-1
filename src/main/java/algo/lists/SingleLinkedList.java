package algo.lists;

/**
 * Single linked list
 */
public class SingleLinkedList<E> {

    private Node<E> first;

    private int size;

    public SingleLinkedList(E...items) {
        for (E item: items) {
            add(item);
        }
    }

    /**
     * Insert item to the head - O(1)
     */
    public void addFirst(E item) {
        Node<E> node = new Node<>(item);
        if (first == null) {
            first = node;
        } else {
            first = node;
        }
        size++;
    }

    /**
     * Add item to the tail of the list - O(n)
     */
    public void add(E item) {
        if (first == null) {
            addFirst(item);
        } else {
            Node<E> curr = first;
            Node<E> prev = first;
            while (curr != null) {
                prev = curr;
                curr = curr.next;
            }
            final Node<E> l = new Node<>(item, null);
            prev.next = l;
            size++;
        }
    }

    public E search(E key) {
        Node<E> node = searchRecursively(key, first);
        return node != null ? node.item : null;
    }

    public E getFirst() {
        return first != null ? first.item : null;
    }

    public int size() {
        return size;
    }

    /**
     * Removing first element
     */
    public void removeFirst() {
        final Node<E> f = first;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null;
        first = next;
        size--;
    }

    Node<E> searchRecursively(E item, Node<E> node) {
        if (node == null)
            return null;
        else if (node.item.equals(item))
            return node;
        else
            return searchRecursively(item, node.next);
    }

    static final class Node<E> {
        E item;

        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
