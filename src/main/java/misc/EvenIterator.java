package misc;

import java.util.Iterator;

/**
 * Having iterator by numbers,
 * design an iterator that returns even numbers.
 *
 * @author ahalikov
 */
public class EvenIterator implements Iterator<Integer> {

    private Iterator<Integer> numbers;
    private Integer next;

    public EvenIterator(Iterator<Integer> numbers) {
        this.numbers = numbers;
        setNext();
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Integer next() {
        Integer i = next;
        setNext();
        return i;
    }

    private void setNext() {
        while (numbers.hasNext()) {
            Integer n = numbers.next();
            if (n % 2 == 0) {
                next = n;
                return;
            }
        }
        next = null;
    }
}
