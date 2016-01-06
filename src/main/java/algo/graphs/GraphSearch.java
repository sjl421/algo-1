package algo.graphs;

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
    Queue<Graph.Node> queue = new LinkedQueue();
    node.setMarked(true);
    queue.add(node);
    while (!queue.isEmpty()) {
      Graph.Node p = queue.remove();
      visitNode(p);
      p.getAdjacentNodes().forEach(adjacent -> {
        if (!adjacent.isMarked()) {
          adjacent.setMarked(true);
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
    node.setMarked(true);
    visitNode(node);
    node.getAdjacentNodes().forEach(adjacent -> {
      if (!adjacent.isMarked())
        depthFirstSearch(adjacent);
    });
  }

  static void visitNode(Graph.Node node) {
    System.out.print(node.getName() + " ");
  }
}
