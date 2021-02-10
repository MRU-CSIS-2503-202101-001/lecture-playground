public interface List<T> {

  void prepend(T t);

  void append(T t);

  void add(int i, T t);

  T get(int i);

  int indexOf(T target);

  void remove(int i);

  int size();

  boolean isEmpty();
}
