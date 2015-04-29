package algo.queue;

/**
 * Queue interface
 */
public interface Queue<E> extends Iterable<E> {

    E dequeue();

    boolean enqueue(E item);

    boolean isEmpty();

    int size();
}
