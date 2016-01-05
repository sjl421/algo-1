package algo.stack;

/**
 * Implementation of MultiStack interface.
 * Number of stacks is fixed and defined in constructor.
 * Each stack has fixed capacity.
 *
 * @author akhalikov
 */
public class FixedMultiStack<E> implements MultiStack<E> {
  private Object[] elements;
  private int stackCapacity;
  private int numberOfStacks;
  private int[] sizes;

  public FixedMultiStack(int stackCapacity, int numberOfStacks) {
    this.stackCapacity = stackCapacity;
    this.numberOfStacks = numberOfStacks;
    this.elements = new Object[numberOfStacks * stackCapacity];
    this.sizes = new int[numberOfStacks+1]; // 0'th index is not used
  }

  @Override
  public void push(int stackId, E item) {
    validateStackId(stackId);
    if (isFull(stackId))
      throw new RuntimeException("Stack is full");

    sizes[stackId]++;
    elements[getTopIndex(stackId)] = item;
  }

  @Override
  public E pop(int stackId) {
    validateStackId(stackId);
    if (isEmpty(stackId))
      throw new RuntimeException("Stack is empty");

    int top = getTopIndex(stackId);
    final E item = (E) elements[top];
    elements[top] = null;
    sizes[stackId]--;
    return item;
  }

  @Override
  public E peek(int stackId) {
    validateStackId(stackId);
    if (isEmpty(stackId))
      throw new RuntimeException("Stack is empty");

    return (E) elements[getTopIndex(stackId)];
  }

  @Override
  public boolean isEmpty(int stackId) {
    validateStackId(stackId);
    return sizes[stackId] == 0;
  }

  private boolean isFull(int stackId) {
    validateStackId(stackId);
    return sizes[stackId] == stackCapacity;
  }

  private int getTopIndex(int stackId) {
    int offset = stackCapacity * (stackId - 1);
    return offset + sizes[stackId] - 1;
  }

  private void validateStackId(int stackId) {
    if (stackId <= 0)
      throw new IllegalArgumentException("stackId is zero or negative");

    if (stackId > numberOfStacks)
      throw new IllegalArgumentException(
        "stackId is greater than number of stacks: " + numberOfStacks);
  }
}
