package tads;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
  class Node {
    Node next;
    T data;

    Node(T data) {
      this.data = data;
    }
  }

  private Node head;
  private Node tail;
  private int elements;

  public LinkedList() {
    this.elements = 0;
  }

  @Override
  public int size() {
    return elements;
  }

  @Override
  public void add(T data) {
    if (head == null) {
      head = new Node(data);
      tail = head;
    } else {
      Node newTail = new Node(data);
      tail.next = newTail;
      tail = newTail;
    }
    elements++;
  }

  @Override
  public T get(int pos) {
    if (pos >= size()) {
      throw new RuntimeException("index out of range");
    }
    Node aux = head;
    while (pos > 0) {
      aux = aux.next;
      pos--;
    }
    return aux.data;
  }

  @Override
  public void removePos(int pos) {
    // TODO Auto-generated method stub

  }

  @Override
  public void remove(T data) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean exists(T data) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int getPos(T data) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public Iterator<T> iterator() {
    return new LinkedListIterator(head);
  }

  class LinkedListIterator implements Iterator<T> {
    Node curr;

    LinkedListIterator(Node start) {
      curr = start;
    }

    @Override
    public boolean hasNext() {
      return curr != null;
    }

    @Override
    public T next() {
      T data = curr.data;
      curr = curr.next;
      return data;
    }
  }

}
