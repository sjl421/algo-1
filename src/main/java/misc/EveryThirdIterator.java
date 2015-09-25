package misc;

import java.util.Iterator;

/**
 * @author ahalikov
 */
public class EveryThirdIterator implements Iterator {

    private final Iterator itr;
    private Object next;

    public EveryThirdIterator(Iterator itr) {
        this.itr = itr;
        setNext();
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Object next() {
        Object o = next;
        setNext();
        return o;
    }

    private void setNext() {
        int counter = 1;
        next = null;
        while (itr.hasNext()) {
            if (counter == 3) {
                next = itr.next();
                return;
            } else {
                counter++;
                itr.next();
            }
        }
    }
}
