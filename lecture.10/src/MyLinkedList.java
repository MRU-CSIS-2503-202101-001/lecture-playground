public class MyLinkedList<T> implements List<T> {

  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();



    System.out.println("success!");
  }

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

    Node<T> newGuy = new Node<>(t);

    if (isEmpty()) {
      head = newGuy;
    } else {
      Node<T> currNode = nodeAt(size - 1);
      currNode.next = newGuy;
    }

    size++;
  }

  @Override
  public void add(int index, T t) {
    if (outOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    } else if (index == 0) {
      prepend(t);
    } else {
      Node<T> newGuy = new Node<>(t);
      Node<T> currNode = nodeAt(index - 1);
      newGuy.next = currNode.next;
      currNode.next = newGuy;
    }
    size++;
  }

  @Override
  public T get(int index) {
    if (outOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    } else {
      Node<T> currNode = nodeAt(index);
      return currNode.data;
    }
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

  private Node<T> nodeAt(int index) {
    Node<T> currNode = head;

    for (int i = 0; i < index; i++) {
      currNode = currNode.next;
    }
    return currNode;
  }

  private boolean outOfBounds(int i) {
    return i < 0 || i >= size;
  }

  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    @Override
    public String toString() {
      return String.format("%s", data.toString());
    }
  }
}
