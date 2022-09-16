package tads;

public interface Graph {
  /**
   * cuantos vertices tiene el grafo
   */
  public int size();

  /**
   * agrega una arista desde v1 hasta v2
   */
  public void addEdge(int v1, int v2);

  public void addWeightedEdge(int v1, int v2, int weight);

  public void removeEdge(int v1, int v2);

  /**
   * me devuelve la cantidad de aristas de un vertice
   */
  public int edgeCount(int v1);

  /**
   * me devuelve la cantidad total de aristas
   */
  public int edgeCount();

  public Iterable<Edge> edges(int v1);

  public boolean hasEdge(int v1, int v2);

  public int weight(int v1, int v2);
}
