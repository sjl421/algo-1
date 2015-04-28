package algo.stack;

/**
 * Stack data structure (fixed capacity)
 *
 * Stack is LIFO (last in - first out) dynamic set
 *
 * Created by ahalikov on 24/04/15.
 */
public class FixedSizeStack<E> {

    private Object[] elements;

    private int capacity;
    private int size;

    public FixedSizeStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public boolean push(E element) {
        if (size + 1 <= capacity) {
            elements[size++] = element;
            return true;
        }
        return false;
    }

    public E pop() {
        int top = size-1;
        E item = (E) elements[top];
        elements[--size] = null;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
