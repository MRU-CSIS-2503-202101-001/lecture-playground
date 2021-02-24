public class MapEntry<K, V> {

  private K key;
  private V value;

  public MapEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K key() {
    return key;
  }

  public V value() {
    return value;
  }

  @Override
  public String toString() {
    return String.format("[k=%s,v=%s]", key.toString(), value.toString());
  }
}
