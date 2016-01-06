package algo.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * A Graph
 *
 * @author akhalikov
 */
public class Graph {
  private List<Node> nodes = new ArrayList();

  public Graph() {
  }

  public Graph(Node... nodes) {
    for (Node node: nodes)
      this.nodes.add(node);
  }

  public List<Node> getNodes() {
    return nodes;
  }

  public Node getNode(int index) {
    return nodes.get(index);
  }

  /**
   * Graph node
   */
  public static class Node {
    public enum State {
      Unvisited,
      Visiting,
      Visited
    }

    private String name;
    private List<Node> adjacentNodes = new ArrayList();
    private State state = State.Unvisited;

    public Node(String name) {
      this.name = name;
    }

    public Node(String name, Node... adjacentNodes) {
      this.name = name;
      setAdjacentNodes(adjacentNodes);
    }

    public String getName() {
      return name;
    }

    public void setAdjacentNodes(Node... adjacentNodes) {
      for (Node node: adjacentNodes)
        this.adjacentNodes.add(node);
    }

    public List<Node> getAdjacentNodes() {
      return adjacentNodes;
    }

    public State getState() {
      return state;
    }

    public void setState(State state) {
      this.state = state;
    }
  }
}
