package algo.queue;

import algo.Collection;
import algo.stack.Stack;

import java.util.Iterator;

/**
 * Basic implementation of double-ended queue
 * @param <E>
 */
class FixedSizeDequeue<E> implements Queue<E>, Stack<E>, Collection<E> {

	@Override
	public boolean add(E item) {
		return false;
	}

	@Override
	public E remove() {
		return null;
	}

	@Override
	public void push(E item) {
	}

	@Override
	public E pop() {
		return null;
	}

	@Override
	public E peek() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}
}