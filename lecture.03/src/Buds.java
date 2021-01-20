import java.time.LocalDateTime;
import java.util.ArrayList;

// Make any two types buds.
public class Buds {

  String budOne;
  int budTwo;

  public static void main(String[] args) {
    // pro-tip: using a main inside of a class as tool to test
    // the class in an ad-hoc way is pretty useful

    // make some Buds
    Buds budsForLife = new Buds("Lita", 52);

    System.out.println(budsForLife);
  }

  public Buds(String budOne, int budTwo) {
    this.budOne = budOne;
    this.budTwo = budTwo;
  }

  @Override
  public String toString() {
    return String.format(
        "[[[%s(type: %s)]]] is buds with [[[%d(type: %s)]]]]",
        budOne, budOne.getClass(), budTwo, "int");
  }
}
