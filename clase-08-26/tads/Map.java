package tads;

public interface Map<K, V> {
  // actualizamos el valor en caso de que la llave ya exista
  public void insert(K key, V value);

  public V get(K key);

  public boolean exists(K key);

  public void remove(K key);
}
