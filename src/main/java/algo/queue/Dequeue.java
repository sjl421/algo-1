package algo.queue;

/**
 * Interface of double-ended queue
 *
 * @param <E>
 * @author akhalikov
 */
public interface Dequeue<E> {
  /**
   * Add first (left) item to a queue
   * @param item
   */
  void addFirst(E item);

  /**
   * Add last (right) item to a queue
   * @param item
   */
  void addLast(E item);

  E removeFirst();

  E removeLast();

  E peekFirst();

  E peekLast();

  int size();
}
