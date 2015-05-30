package algo.lists;

/**
 * Doubly-linked list
 */
public class DLinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public void addFirst(E item) {
        Node<E> node = new Node<>(item, first, null);
        first.prev = node;
        first = node;
        size++;
    }

    public void addLast(E item) {
        Node<E> node = new Node<>(item, null, last);
        last.next = node;
        last = node;
        size++;
    }

    public void removeFirst(E item) {
        final Node<E> f = first;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null;
        first = next;
        size--;
    }

    public void removeast(E item) {
        final Node<E> p = last;
        final Node<E> prev = p.prev;
        p.item = null;
        p.prev = null;
        last = prev;
        size--;
    }

    public void remove(E item) {

    }

    public E search(E item) {
        return null;
    }

    public int getSize() {
        return size;
    }

    private static final class Node<E> {
        E item;

        Node<E> next;

        Node<E> prev;

        public Node(E item) {
            this.item = item;
        }

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
