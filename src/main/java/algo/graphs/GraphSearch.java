package algo.graphs;

import algo.graphs.Graph.Node.State;
import algo.queue.LinkedQueue;
import algo.queue.Queue;

/**
 * Searching a graph: BFS, DFS
 *
 * @author akhalikov
 */
public class GraphSearch {
  /**
   * Iterative queue-based breadth-first search
   * @param node
   */
  static void breadthFirstSearch(Graph.Node node) {
    final Queue<Graph.Node> queue = new LinkedQueue();
    node.setState(State.Visited);
    queue.add(node);
    while (!queue.isEmpty()) {
      Graph.Node p = queue.remove();
      p.setState(State.Visited);
      visitNode(p);
      p.getAdjacentNodes().forEach(adjacent -> {
        if (State.Unvisited == adjacent.getState()) {
          adjacent.setState(State.Visiting);
          queue.add(adjacent);
        }
      });
    }
  }

  /**
   * Recursive depth-first search
   * @param node
   */
  static void depthFirstSearch(Graph.Node node) {
    if (node == null)
      return;
    node.setState(State.Visited);
    visitNode(node);
    node.getAdjacentNodes().forEach(adjacent -> {
      if (State.Unvisited == adjacent.getState())
        depthFirstSearch(adjacent);
    });
  }

  static void visitNode(Graph.Node node) {
    System.out.print(node.getName() + " ");
  }
}
