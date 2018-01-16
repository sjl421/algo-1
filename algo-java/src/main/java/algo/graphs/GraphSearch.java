package algo.graphs;

import algo.graphs.Graph.Node;
import algo.graphs.Graph.Node.State;
import algo.queue.LinkedQueue;
import algo.queue.Queue;
import static java.lang.System.out;

/**
 * Searching a graph: BFS, DFS
 */
class GraphSearch {

  // Iterative queue-based breadth-first search
  static void breadthFirstSearch(Node node) {
    final Queue<Node> queue = new LinkedQueue<>();
    node.setState(State.Visited);
    queue.add(node);
    while (!queue.isEmpty()) {
      Node p = queue.remove();
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

  // Recursive depth-first search
  static void depthFirstSearch(Node node) {
    if (node == null)
      return;
    node.setState(State.Visited);
    visitNode(node);
    node.getAdjacentNodes().forEach(adjacent -> {
      if (State.Unvisited == adjacent.getState())
        depthFirstSearch(adjacent);
    });
  }

  private static void visitNode(Node node) {
    out.print(node.getName() + " ");
  }
}
