package algo.stack;

import java.util.Iterator;

/**
 * Implementation of a stack based on array of fixed size
 *
 * Stack is LIFO (last in - first out) dynamic set
 *
 * Created by ahalikov on 24/04/15.
 */
public class FixedSizeStack<E> implements Stack<E> {

    private Object[] elements;

    private int capacity;

    private int head;

    public FixedSizeStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    @Override
    public boolean push(E item) {
        if (head + 1 <= capacity) {
            elements[head++] = item;
            return true;
        }
        return false;
    }

    @Override
    public E pop() {
        int top = this.head - 1;
        E item = (E) elements[top];
        elements[--this.head] = null;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return head == 0;
    }

    @Override
    public int size() {
        return head;
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
