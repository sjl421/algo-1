package algo.queue;

/**
 * Interface of double-ended queue
 */
public interface Dequeue<E> {
  /**
   * Add first (left) item to a queue
   */
  void addFirst(E item);

  /**
   * Add last (right) item to a queue
   */
  void addLast(E item);

  E removeFirst();

  E removeLast();

  E peekFirst();

  E peekLast();

  int size();
}
