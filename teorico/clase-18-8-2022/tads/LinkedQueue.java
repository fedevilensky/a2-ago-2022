package tads;

public class LinkedQueue<T> implements Queue<T> {
   class Node{
      T data;
      Node next = null;
   }

   private int size;
   private Node front;
   private Node back;

   public LinkedQueue(){
      size = 0;
      front = null;
      back = null;
   }

   @Override
   public int size(){
      return size;
   }

   @Override
   public boolean isEmpty() {
      return size == 0;
   }

   @Override
   public boolean isFull(){
      return false;
   }

   @Override
   public void enqueue(T data){
      Node newNode = new Node();
      newNode.data = data;

      if(isEmpty()){
         front = newNode;
         back = newNode;
      } else{
         back.next = newNode;
         back = newNode;
      }

      size++;
   }

   @Override
   public void dequeue(){
      if(isEmpty()){
         return;
      }
      front = front.next;
   }

   @Override
   public T peek() {
      if(isEmpty()){
         throw new RuntimeException("peek on empty queue");
      }
      return front.data;
   }

}
