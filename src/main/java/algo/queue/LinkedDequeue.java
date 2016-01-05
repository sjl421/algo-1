package algo.queue;

import java.util.NoSuchElementException;

/**
 * Linked double-ended queue
 * @param <E>
 */
class LinkedDequeue<E> implements Dequeue<E> {
  private QueueNode<E> first;
  private QueueNode<E> last;
  private int size;

  @Override
  public void addFirst(E item) {
    final QueueNode oldFirst = first;
    final QueueNode newNode = new QueueNode(item, oldFirst, null);
    first = newNode;
    if (oldFirst == null)
      last = newNode;
    else
      oldFirst.prev = newNode;
    size++;
  }

  @Override
  public void addLast(E item) {
    final QueueNode oldLast = last;
    final QueueNode newNode = new QueueNode(item, null, oldLast);
    last = newNode;
    if (oldLast == null)
      first = newNode;
    else
      oldLast.next = newNode;
    size++;
  }

  @Override
  public E removeFirst() {
    if (first == null)
      throw new NoSuchElementException("first is null");

    final QueueNode<E> node = first;
    first = node.next;
    node.next = null;
    first.prev = null;
    size--;
    return node.data;
  }

  @Override
  public E removeLast() {
    if (last == null)
      throw new NoSuchElementException("last is null");

    final QueueNode<E> node = last;
    last = node.prev;
    last.next = null;
    node.prev = null;
    size--;
    return node.data;
  }

  @Override
  public E peekFirst() {
    if (first == null)
      throw new NoSuchElementException("first is null");
    return first.data;
  }

  @Override
  public E peekLast() {
    if (last == null)
      throw new NoSuchElementException("last is null");
    return last.data;
  }

  @Override
  public int size() {
    return size;
  }

  private final class QueueNode<E> {
    private E data;
    private QueueNode<E> next;
    private QueueNode<E> prev;

    public QueueNode(E data) {
      this.data = data;
    }

    public QueueNode(E data, QueueNode<E> next, QueueNode<E> prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
    }
  }
}
