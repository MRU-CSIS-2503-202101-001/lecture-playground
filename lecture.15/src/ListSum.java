import java.util.List;

public class ListSum {

  public static void main(String[] args) {
    SuperSimpleLinkedList list = new SuperSimpleLinkedList();

    List.of(4, 2, 1, 0, 9, 10) // sum should be 26
        .forEach(list::append); // cool beans. ask me about it if you're interested

    System.out.println("The sum of all the nums is: " + list.sumLoopy());

    System.out.println("\n##### RECURSIVE TIME ########\n");

    System.out.println("The sum of all the nums is: " + list.sumRecursively());
  }
}
