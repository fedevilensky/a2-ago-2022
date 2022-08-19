package tads;

// Binary Search Tree
public interface BST<T extends Comparable<T>> {
  public boolean contains(T data);

  public boolean isEmpty();

  // si ya existe no cambia nada
  public void insert(T data);

  // si data no esta no cambia el estado
  public void remove(T data);

  public int height();

  public int size();
}
