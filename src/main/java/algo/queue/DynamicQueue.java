package algo.queue;

import java.util.Iterator;

/**
 * Implementation of queue supporting dynamic size
 */
public class DynamicQueue<E> implements Queue<E> {

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public boolean enqueue(E item) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
