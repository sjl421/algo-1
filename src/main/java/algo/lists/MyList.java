package algo.lists;

/**
 * @author ahalikov
 */
public interface MyList<E> extends Iterable<E> {

    E getFirst();

    void addFirst(E item);

    void removeFirst();

    void add(E item);

    void remove(E item);

    E search(E key);

    int size();
}
