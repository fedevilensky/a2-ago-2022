package tads;

import java.lang.Iterable;

public interface List<T> extends Iterable<T> {
  public int size();

  public void add(T data);

  public T get(int pos);

  public void removePos(int pos);

  public void remove(T data);

  public boolean exists(T data);

  public int getPos(T data);
}
