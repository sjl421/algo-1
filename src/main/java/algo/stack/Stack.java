package algo.stack;

/**
 * Stack interface
 */
public interface Stack<E> extends Iterable<E> {

    boolean push(E item);

    E pop();

    boolean isEmpty();

    int size();
}
