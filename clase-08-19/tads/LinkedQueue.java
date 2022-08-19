package tads;

public class LinkedQueue<T> implements Queue<T> {
  class Node {
    T data;
    Node next;
  }

  private int elements = 0;
  private Node front = null;
  private Node back = null;

  @Override
  public int size() {
    return elements;
  }

  @Override
  public T top() {
    if (isEmpty()) {
      throw new RuntimeException("top on empty queue");
    }

    return front.data;
  }

  @Override
  public void push(T data) {
    Node newNode = new Node();
    newNode.data = data;
    if (isEmpty()) {
      front = newNode;
      back = newNode;
    } else {
      back.next = newNode;
      back = back.next;
    }

    elements++;
  }

  @Override
  public void pop() {
    if (isEmpty()) {
      return;
    }

    front = front.next;
    if (elements == 1) {
      back = null;
    }
    elements--;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public boolean isEmpty() {
    return elements == 0;
  }

}
