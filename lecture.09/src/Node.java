public class Node<T> {

  public static void main(String[] args) {}

  private T data;
  private Node<T> next;

  public Node(T data) {
    this.data = data;
    this.next = null;
  }
}
