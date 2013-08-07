package algo.graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * DeptFirstSearch algorithm
 *
 * @author: Artur Khalikov
 */
public class DeptFirstSearch {

    private boolean[] marked;
    private Queue<Integer> postOrder;
    private int[] post;
    private int postCounter = 0;

    public DeptFirstSearch(DiGraph g) {
        int vertices = g.size();
        postOrder = new LinkedList();
        post = new int[vertices];
        marked = new boolean[vertices];
        for (int v = vertices; v > 0; v--) {
            if (!marked[v])
                dfs(g, v);
        }
    }

    private void dfs(DiGraph g, int v) {
        // mark vertex v as explored
        marked[v] = true;

        // explore arcs of the vertex v
        for (Integer w: g.arcs(v)) {
            if (!marked[w])
                dfs(g, w);
        }

        postOrder.add(v);
        post[v] = postCounter++;
    }

    public Iterable<Integer> reversePost() {
        Deque reverseStack = new LinkedList();
        for (int v: postOrder)
            reverseStack.push(v);
        return reverseStack;
    }
}
