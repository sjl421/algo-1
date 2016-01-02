package algo.queue;

/**
 * Basic queue interface
 */
public interface Queue<E> {
  E dequeue();
  boolean enqueue(E item);
  boolean isEmpty();
}
