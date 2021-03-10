import java.util.List;

public class DisplayList {

  public static void main(String[] args) {

    SuperSimpleLinkedList list = new SuperSimpleLinkedList();

    List.of(4, 2, 1, 0, 9, 10)
        .forEach(list::append); // cool beans. ask me about it if you're interested

    System.out.println(list.displayForward());

    System.out.println(list.displayBackward());
  }
}
