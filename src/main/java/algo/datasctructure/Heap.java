package algo.datasctructure;

/**
 * A heap t is a complete binary tree such that either t is empty or
 *      1. the root element is the smallest element in t , according to some method for comparing elements;
 *      2. the left and right subtrees of t are heaps.
 */
public class Heap {

    private int[] elements;
    private int size;

    public Heap(int initialSize) {
        this.size = initialSize;
        elements = new int[initialSize];
    }

    public void add(int e) {

    }

    private void bubbleUp(int e) {

    }
}