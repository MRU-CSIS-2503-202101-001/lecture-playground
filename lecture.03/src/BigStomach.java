import java.time.LocalDateTime;
import java.util.ArrayList;

// Make any two types buds.
public class BigStomach<A, B> {

  A budOne;
  B budTwo;

  public static void main(String[] args) {
    // pro-tip: using a main inside of a class as tool to test
    // the class in an ad-hoc way is pretty useful

    // make some Buds
    BigStomach budsForLife =
        new BigStomach(new Baby("Abba", 3, LocalDateTime.parse("2020-02-03T04:12")), new Snail(5.3, 0.4));

    System.out.println(budsForLife);
  }

  public BigStomach(A budOne, B budTwo) {
    this.budOne = budOne;
    this.budTwo = budTwo;
  }

  @Override
  public String toString() {
    return String.format(
        "[[[%s(type: %s)]]] is buds with [[[%s(type: %s)]]]]",
        budOne, budOne.getClass(), budTwo, budTwo.getClass());
  }
}
