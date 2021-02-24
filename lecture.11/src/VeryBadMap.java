public class VeryBadMap<K, V> implements Map<K, V> {

  public static void main(String[] args) {
    Map<String, String> dowToShirt = new VeryBadMap<>();

    dowToShirt.put("Wednesday", "Portal Baseball T");
    dowToShirt.put("Friday", "Talking Heads T");
  }

  private Object[] elements;
  private int size;

  public VeryBadMap() {
    elements = new Object[10];
    size = 0;
  }

  @Override
  public void put(K key, V value) {
    elements[size] = new MapEntry<K, V>(key, value);
    size++;
  }

  @SuppressWarnings("unchecked")
  @Override
  public V get(K targetKey) {

    int currIndex = 0;
    MapEntry<K, V> currEntry = (MapEntry<K, V>) elements[currIndex];

    while (currEntry != null && !currEntry.key().equals(targetKey)) {
      currIndex++;
      currEntry = (MapEntry<K, V>) elements[currIndex];
    }

    if (currEntry == null) {
      return null;
    } else {
      return currEntry.value();
    }
  }

  @Override
  public boolean contains(K key) { // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int size() { // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isEmpty() { // TODO Auto-generated method stub
    return false;
  }
}
