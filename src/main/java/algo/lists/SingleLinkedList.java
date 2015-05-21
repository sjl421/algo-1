package algo.lists;

/**
 * Single linked list
 *
 * Created by ahalikov on 24/04/15.
 */
public class SingleLinkedList<E> {

    private Node<E> first;

    private int size;

    /**
     * Insert item to the head - O(1)
     */
    public void addFirst(E item) {
        Node<E> node = new Node<>(item, first);
        first = node;
        size++;
    }

    public E search(E key) {
        Node<E> node = searchRecursively(key, first);
        return node != null ? node.item : null;
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

    private static final class Node<E> {
        E item;

        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
