import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.LinkedList;

public class SuperSimpleLinkedList<T> {

  private Node<T> head;
  private Node<T> tail;
  private int size;

  public SuperSimpleLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public Iterator<T> reverseIterator() {
    Queue<T> queue = new LinkedList<>();

    traverseAndDo(queue::add);

    return queue.iterator();
  }

  public void printReverse() {
    traverseAndDo(System.out::println);
  }

  private void traverseAndDo(Consumer<T> actionToDo) {
    traverseAndDo(actionToDo, head);
  }

  private void traverseAndDo(Consumer<T> actionToDo, Node<T> currHead) {
    if (currHead != null) {
      traverseAndDo(actionToDo, currHead.next);
      actionToDo.accept(currHead.data);
    }
  }

  public void prepend(T t) {

    Node<T> newGuy = new Node<>(t);
    if (isEmpty()) {
      tail = newGuy;
    } else {
      newGuy.next = head.next;
    }
    head = newGuy;
    size++;
  }

  public void append(T t) {

    Node<T> newGuy = new Node<>(t);

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

  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    @Override
    public String toString() {
      return String.format("%d", data);
    }
  }
}
