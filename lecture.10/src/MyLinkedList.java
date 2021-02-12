import java.util.ArrayList;

public class MyLinkedList<T> implements List<T> {

  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    System.out.println(list);

    list.prepend(1); // 1

    System.out.println(list);

    list.add(1, 3); //

    System.out.println(list);

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
    if (index == size) {
      append(t);
    } else if (index == 0) {
      prepend(t);
    } else if (outOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    } else {
      Node<T> newGuy = new Node<>(t);
      Node<T> currNode = nodeAt(index - 1);
      newGuy.next = currNode.next;
      currNode.next = newGuy;
      size++;
    }
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
  public T remove(int i) {
    size--; // what if it's not there, dingus?!?
    return null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public String toString() {

    ArrayList<String> nodeContents = new ArrayList<>();

    Node<T> currNode = head;

    while (currNode != null) {
      nodeContents.add(currNode.toString());
      currNode = currNode.next;
    }

    String contents = String.join(",", nodeContents);

    return String.format("[%s] size:%d", contents, size);
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
