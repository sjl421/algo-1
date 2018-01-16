package algo.graphs;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
  private List<Node> nodes = new ArrayList<>();

  Graph(Node... nodes) {
    this.nodes.addAll(asList(nodes));
  }

  Node getNode(int index) {
    return nodes.get(index);
  }

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

    String getName() {
      return name;
    }

    void setAdjacentNodes(Node... adjacentNodes) {
      this.adjacentNodes.addAll(asList(adjacentNodes));
    }

    List<Node> getAdjacentNodes() {
      return adjacentNodes;
    }

    State getState() {
      return state;
    }

    void setState(State state) {
      this.state = state;
    }
  }
}
