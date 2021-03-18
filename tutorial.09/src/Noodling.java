import java.util.Iterator;
import java.util.List;

public class Noodling {

  public static void main(String[] args) {

    SuperSimpleLinkedList<Integer> list = new SuperSimpleLinkedList<>();

    List.of(1, 2, 3, 4, 5).forEach(list::append);

    Iterator<Integer> reverseIterator = list.reverseIterator();

    System.out.println("start iterating");

    while (reverseIterator.hasNext()) {
      System.out.println(reverseIterator.next());
    }

    System.out.println("stop iterating");

    list.printReverse();
  }
}
