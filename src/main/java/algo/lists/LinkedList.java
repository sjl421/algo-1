package algo.lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Doubly-linked list
 */
public class LinkedList<E> implements Iterable<E> {
  private Node<E> first;
  private Node<E> last;
  private int size;

  /**
   * Add item as a first element of the list
   * Time/space complexity: O(1)
   * @param item
   */
  public void addFirst(E item) {
    final Node<E> oldFirst = first;
    final Node<E> newNode = new Node(null, item, first);
    first = newNode;
    if (oldFirst != null) {
      oldFirst.prev = newNode;
    } else {
      last = newNode;
    }
    size++;
  }

  /**
   * Add item to the end of the list
   * Time/space complexity: O(1)
   * @param item
   */
  public void add(E item) {
    if (first == null) {
      addFirst(item);
    } else {
      Node<E> oldLast = last;
      Node<E> newNode = new Node(last, item, null);
      last = newNode;
      if (oldLast != null) {
        oldLast.next = newNode;
      } else {
        first = newNode;
      }
      size++;
    }
  }

  /**
   * Remove and return the first item from the list
   * Time/space complexity: O(1)
   */
  public E removeFirst() {
    if (first == null)
      throw new NoSuchElementException("First element is null");

    final Node<E> oldFirst = first;
    final Node<E> next = oldFirst.next;
    final E item = oldFirst.item;
    oldFirst.next = null;
    oldFirst.item = null;
    first = next;
    if (next != null) {
      next.prev = null;
    } else {
      last = null;
    }
    size--;
    return item;
  }

  /**
   * Remove and return the last item from the list
   * Time/space complexity: O(1)
   */
  public E removeLast() {
    if (last == null)
      throw new NoSuchElementException("Last item is null");

    final Node<E> oldLast = last;
    final Node<E> prev = oldLast.prev;
    final E item = oldLast.item;
    oldLast.item = null;
    oldLast.prev = null;
    last = prev;
    if (prev != null) {
      prev.next = null;
    } else {
      first = null;
    }
    size--;
    return item;
  }

  /**
   * Remove the first occurence of the item from the list
   * Time complexity: O(n) - we need to traverse the list to find the item
   * @param item
   * @return true if element returned, false otherwise
   */
  public boolean remove(E item) {
    Node<E> node = findRecursively(item, first);
    if (node == null)
      return false;
    Node<E> prev = node.prev;
    Node<E> next = node.next;
    if (prev == null) {
      first = next;
    } else {
      prev.next = next;
      node.prev = null;
    }
    if (next == null) {
      last = prev;
    } else {
      next.prev = prev;
      node.next = null;
    }
    node.item = null;
    size--;
    return true;
  }

  public boolean contains(E item) {
    return findRecursively(item, first) != null;
  }

  public int getSize() {
    return size;
  }

  @Override
  public Iterator<E> iterator() {
    return new IteratorImpl(first);
  }

  private Node<E> previousNode(E item, Node<E> node) {
    if (item == null)
      throw new NullPointerException("item is null");
    if (node == null || node.next == null)
      throw new NullPointerException("list is null");

    return item.equals(node.next.item)
      ? node : previousNode(item, node.next);
  }

  private Node<E> findRecursively(E item, Node<E> node) {
    if (node == null)
      return null;
    return node.item.equals(item)
      ? node: findRecursively(item, node.next);
  }

  /**
   * List node
   * @param <E> data
   */
  public static final class Node<E> {
    private E item;
    private Node<E> next;
    private Node<E> prev;

    public Node(E item) {
      this.item = item;
    }

    public Node(Node<E> prev, E item, Node<E> next) {
      this.prev = prev;
      this.item = item;
      this.next = next;
    }

    public E getItem() {
      return item;
    }

    public void setItem(E item) {
      this.item = item;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }

    public Node<E> getPrev() {
      return prev;
    }

    public void setPrev(Node<E> prev) {
      this.prev = prev;
    }
  }

  /**
   * List iterator implementation
   */
  protected class IteratorImpl implements Iterator<E> {
    private Node<E> next;
    private Node<E> lastReturned;

    public IteratorImpl(Node<E> next) {
      this.next = next;
    }

    @Override
    public boolean hasNext() {
      return next != null;
    }

    @Override
    public E next() {
      if (hasNext()) {
        lastReturned = next;
        next = next.next;
        return (E) lastReturned.item;
      }
      throw new NoSuchElementException();
    }
  }
}
