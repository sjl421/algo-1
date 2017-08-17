package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterator that takes java.util.Iterator,
 * and uses it to iterate by every third element.
 */
public class EveryThirdIterator implements Iterator {
  private final Iterator itr;
  private Object next;

  EveryThirdIterator(Iterator itr) {
    this.itr = itr;
    setNext();
  }

  @Override
  public boolean hasNext() {
    return next != null;
  }

  @Override
  public Object next() {
    if (hasNext()) {
      Object o = next;
      setNext();
      return o;
    } else {
      throw new NoSuchElementException();
    }
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
