package algo.graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Depth-First Ordering
 *
 * @author Artur Khalikov
 */
public class DepthFirstOrder {
    /**
     * Input graph
     */
    private Graph graph;
    /**
     * Array for tracking explored vertices
     */
    private boolean explored[];
    /**
     * Vertices in post order
     */
    private Queue<Integer> postOrder;
    /**
     * Vertices in reverse post order
     */
    private Deque<Integer> reversePostOrder;

    public DepthFirstOrder(Graph graph) {
        this.graph = graph;
        explored = new boolean[graph.size()+1];
        postOrder = new LinkedList();
        reversePostOrder = new LinkedList();
        for (int v = 1; v <= graph.size(); v++) {
            if (!explored[v])
                orderNonRecursively(v);
        }
    }

    /**
     * Non recursive Depth-First ordering
     * @param root
     */
    private void orderNonRecursively(int root) {
        Deque<Integer> stack = new LinkedList();
        stack.push(root);
        explored[root] = true;
        while (!stack.isEmpty()) {
            int v = stack.peek();
            Integer w = getUnexploredAdj(v);
            if (w != null) {
                explored[w] = true;
                stack.push(w);
            } else {
                postOrder.add(v);
                reversePostOrder.push(v);
                stack.pop();
            }
        }
    }

    /**
     * Recursive Depth-First ordering routine
     * @param v
     */
    private void order(int v) {
        explored[v] = true;
        for (Integer w: graph.adj(v)) {
            if (!explored[w])
                order(w);
        }
        postOrder.add(v);
        reversePostOrder.push(v);
    }

    private Integer getUnexploredAdj(int v) {
        for (Integer w: graph.adj(v)) {
            if (!explored[w])
                return w;
        }
        return null;
    }

    public Iterable<Integer> getPostOrder() {
        return postOrder;
    }

    public Iterable<Integer> getReversePostOrder() {
        return reversePostOrder;
    }
}
