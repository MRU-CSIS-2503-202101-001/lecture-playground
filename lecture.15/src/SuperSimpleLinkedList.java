public class SuperSimpleLinkedList {

  private Node head;
  private Node tail;
  private int size;

  public SuperSimpleLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public void prepend(int num) {

    Node newGuy = new Node(num);
    if (isEmpty()) {
      tail = newGuy;
    } else {
      newGuy.next = head.next;
    }
    head = newGuy;
    size++;
  }

  public void append(int num) {

    Node newGuy = new Node(num);

    if (isEmpty()) {
      head = newGuy;
    } else {
      tail.next = newGuy;
    }
    tail = newGuy;
    size++;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  private static class Node {

    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }

    @Override
    public String toString() {
      return String.format("%d", data);
    }
  }
}
