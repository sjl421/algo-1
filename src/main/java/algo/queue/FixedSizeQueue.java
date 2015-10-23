package algo.queue;

import java.util.Iterator;

/**
 * Implementation of queue based on array of fixed size
 *
 * Queue is FIFO (first in - first out) dynamic set
 */
public class FixedSizeQueue<E> implements Queue<E> {

    private Object[] elements;

    private final int capacity;

    private int tail, head;

    public FixedSizeQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[this.capacity];
    }

    @Override
    public E dequeue() {
        E item = (E) elements[head];
        elements[head] = null;
        head = (head == elements.length) ? 0: head + 1;
        return item;
    }

    @Override
    public boolean enqueue(E item) {
        elements[tail] = item;
        tail = (tail == elements.length) ? 0: tail + 1;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return (tail | head) == 0;
    }

    @Override
    public int size() {
        return tail;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return elements;
    }
}
