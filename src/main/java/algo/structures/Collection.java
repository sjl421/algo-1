package algo.structures;

public interface Collection<E> extends Iterable<E> {

  boolean isEmpty();

  int size();

  Object[] toArray();
}
