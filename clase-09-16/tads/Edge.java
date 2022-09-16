package tads;

public class Edge {
  int vDest;
  int weight;

  public Edge(int v) {
    vDest = v;
  }

  public Edge(int v, int weight) {
    vDest = v;
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    Edge other = (Edge) o;
    return this.vDest == other.vDest;
  }
}
