package tads;

/**
 * ABBI
 */
public interface ABBI<T extends Comparable<T>> {
  public int height();

  public int size();

  public void insert(T data);

  public void remove(T data);

  public void inOrderPrint();
}
