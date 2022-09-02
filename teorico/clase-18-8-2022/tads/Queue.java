package tads;

public interface Queue<T> {
   public int size();

   public boolean isEmpty();

   public boolean isFull();

   public void enqueue(T data);

   public void dequeue();

   public T peek();
}