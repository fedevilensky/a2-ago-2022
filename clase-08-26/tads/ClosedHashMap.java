package tads;

public class ClosedHashMap<K, V> implements Map<K, V> {
  // Pair[] arr
  private Object[] arr;
  private HashFunc<K> h;
  private HashFunc<K> h_2;
  private int elements = 0;

  public ClosedHashMap(int expectedSize, HashFunc<K> h, HashFunc<K> h_2) {
    this.arr = new Object[expectedSize * 2 - 1];
    this.h = h;
    this.h_2 = h_2;
  }

  @Override
  public void insert(K key, V value) {
    // TODO Auto-generated method stub

  }

  @Override
  public V get(K key) {
    Pair p = new Pair(key);
    int i = 0;
    boolean keepOn = true;
    while (keepOn) {
      int pos = (h.hash(key) + i * h_2.hash(key)) % arr.length;

      if (arr[pos] == null) {
        throw new RuntimeException("key does not exist");
      }
      Pair arrPair = (Pair) arr[pos];
      if (p.equals(arrPair)) {
        return arrPair.value;
      }

      if (i != 0 && pos == h.hash(key) % arr.length) {
        keepOn = false;
      }
      i++;
    }

    throw new RuntimeException("key does not exist");
  }

  @Override
  public boolean exists(K key) {
    Pair p = new Pair(key);
    int i = 0;
    boolean keepOn = true;
    while (keepOn) {
      int pos = (h.hash(key) + i * h_2.hash(key)) % arr.length;

      if (arr[pos] == null) {
        return false;
      }
      Pair arrPair = (Pair) arr[pos];
      if (p.equals(arrPair)) {
        return true;
      }

      if (i != 0 && pos == h.hash(key) % arr.length) {
        keepOn = false;
      }
      i++;
    }

    return false;
  }

  @Override
  public void remove(K key) {
    // TODO Auto-generated method stub

  }

  class Pair {
    K key;
    V value;
    boolean isDeleted = false;

    Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    Pair(K key) {
      this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
      K otherKey = ((Pair) obj).key;
      boolean anyDeleted = this.isDeleted || ((Pair) obj).isDeleted;
      return this.key.equals(otherKey) && !anyDeleted;
    }

  }

}
