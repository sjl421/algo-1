package algo.queue;

/**
 * Basic FIFO queue based on linked list
 *
 * @author akhalikov
 */
public class LinkedQueue<E> implements Queue<E> {
  private QueueNode<E> first;
  private QueueNode<E> last;

  @Override
  public boolean add(E item) {
    final QueueNode<E> node = new QueueNode(item);
    if (last != null) {
      last.next = node;
    }
    last = node;
    if (first == null) {
      first = last;
    }
    return true;
  }

  @Override
  public E remove() {
    if (first == null)
      throw new RuntimeException("Queue is empty");
    final E data = first.data;
    first = first.next;
    if (first == null)
      last = null;
    return data;
  }

  @Override
  public E peek() {
    if (first == null)
      throw new RuntimeException("Queue is empty");
    return first.data;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }

  private static class QueueNode<E> {
    private E data;
    private QueueNode<E> next;

    public QueueNode(E data) {
      this.data = data;
    }
  }
}
