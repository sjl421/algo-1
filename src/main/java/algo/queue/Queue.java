package algo.queue;

import algo.Collection;

/**
 * Queue interface
 */
public interface Queue<E> extends Collection<E> {

    E dequeue();

    boolean enqueue(E item);
}
