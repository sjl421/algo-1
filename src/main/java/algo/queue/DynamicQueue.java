package algo.queue;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Implementation of queue supporting dynamic size
 */
public class DynamicQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements = new Object[DEFAULT_CAPACITY];

    private int capacity = DEFAULT_CAPACITY;

    private int tail, head;

    @Override
    public E dequeue() {
        E item = (E) elements[head];
        elements[head] = null;
        head++;
        return item;
    }

    @Override
    public boolean enqueue(E item) {
        int newTail = tail + 1;
        if (newTail > capacity) {
            capacity += capacity >> 1;
            elements = Arrays.copyOf(elements, capacity);
            // + ensure new capacity is not more MAX_INT
        }
        elements[newTail] = item;
        tail = newTail;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return tail == head && tail == 0;
    }

    @Override
    public int size() {
        return tail - head;
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
