package algo.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphSearchTest {

  @Test
  public void testBreadthFirstSearch() throws Exception {
    System.out.println();
    System.out.println("testBreadthFirstSearch");
    Graph g = createTestGraph();
    GraphSearch.breadthFirstSearch(g.getNode(0));
  }

  @Test
  public void testDepthFirstSearch() throws Exception {
    System.out.println();
    System.out.println("testDepthFirstSearch");
    Graph g = createTestGraph();
    GraphSearch.depthFirstSearch(g.getNode(0));
  }

  private static Graph createTestGraph() {
    Graph.Node n1 = new Graph.Node("1");
    Graph.Node n2 = new Graph.Node("2");
    Graph.Node n3 = new Graph.Node("3");
    Graph.Node n4 = new Graph.Node("4");
    Graph.Node n5 = new Graph.Node("5");
    n1.setAdjacentNodes(n2, n3);
    n3.setAdjacentNodes(n4, n5);
    n4.setAdjacentNodes(n2);
    n5.setAdjacentNodes(n4);
    return new Graph(n1, n2, n3, n4, n5);
  }
}