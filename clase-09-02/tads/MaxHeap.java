package tads;

public class MaxHeap<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
  class Pair {
    E element;
    P prio;

    Pair(E element, P prio) {
      this.element = element;
      this.prio = prio;
    }
  }

  // arr : Pair[]
  private Object[] arr;
  private int elements;

  private void siftUp(int pos) {
    while (pos != 1) {
      int parentPos = pos / 2;
      Pair child = (Pair) arr[pos];
      Pair parent = (Pair) arr[parentPos];
      if (child.prio.compareTo(parent.prio) > 0) {
        swap(pos, parentPos);
        pos = parentPos;
      } else {
        // pos = 1;
        return;
      }
    }
    // if (pos == 1) {
    // return;
    // }
    // int parentPos = pos / 2;
    // Pair child = (Pair) arr[pos];
    // Pair parent = (Pair) arr[parentPos];
    // if (child.prio.compareTo(parent.prio) > 0) {
    // swap(pos, parentPos);
    // siftUp(parentPos);
    // }
  }

  private void swap(int pos1, int pos2) {
    // arr[pos1],arr[pos2] = arr[pos2],arr[pos1]
    Object aux = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = aux;
  }

  public MaxHeap(int expectedSize) {
    arr = new Object[expectedSize + 1];
    elements = 0;
  }

  @Override
  public void push(E element, P prio) {
    Pair newPair = new Pair(element, prio);
    this.elements++;
    this.arr[this.elements] = newPair;
    this.siftUp(this.elements);
  }

  @Override
  public E pop() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public E top() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

}
