package algo;

/**
 * Collection interface
 */
public interface Collection<E> extends Iterable<E> {

    boolean isEmpty();

    int size();

    Object[] toArray();
}
