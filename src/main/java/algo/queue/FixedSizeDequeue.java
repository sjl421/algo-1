package algo.queue;

import algo.stack.Stack;

import java.util.Iterator;

class FixedSizeDequeue<E> implements Queue<E>, Stack<E> {

	@Override
	public boolean enqueue(E item) {
		return false;
	}

	@Override
	public E dequeue() {
		return null;
	}

	@Override
	public boolean push(E item) {
		return false;
	}

	@Override
	public E pop() {
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