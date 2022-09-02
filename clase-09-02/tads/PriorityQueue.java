package tads;

// c++: template<class E, class P>
public interface PriorityQueue<E, P extends Comparable<P>> {
  public void push(E element, P prio);

  public E pop();

  public E top();

  public boolean isEmpty();

  public boolean isFull();

  public int size();
}
