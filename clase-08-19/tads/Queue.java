package tads;

public interface Queue<T> {
  public int size();

  public T top();

  public void push(T data);

  public void pop();

  public boolean isFull();

  public boolean isEmpty();
}
