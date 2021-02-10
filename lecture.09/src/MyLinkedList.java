public class MyLinkedList<T> implements List<T> {

  private Node<T> head;
  private int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  @Override
  public void prepend(T t) {
    size++;
    Node<T> newGuy = new Node<>(t);
    newGuy.next = head;
    head = newGuy;
  }

  @Override
  public void append(T t) {
    size++;
  }

  @Override
  public void add(int i, T t) {
    size++;
  }

  @Override
  public T get(int i) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int indexOf(T target) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void remove(int i) {
    size--; // what if it's not there, dingus?!?
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }
}
