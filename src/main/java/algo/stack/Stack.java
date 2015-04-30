package algo.stack;

import algo.Collection;

/**
 * Stack interface
 */
public interface Stack<E> extends Collection<E> {

    boolean push(E item);

    E pop();
}
