import java.time.LocalDateTime;
import java.util.ArrayList;

// Make any two types buds.
public class SimpleStomach {

  Carrot carrot;

  public static void main(String[] args) {
    // pro-tip: using a main inside of a class as tool to test
    // the class in an ad-hoc way is pretty useful

    // make some Buds
    SimpleStomach stomach = new SimpleStomach();

    stomach.receives(new Carrot());

    System.out.println(stomach);
  }

  public SimpleStomach() {
    //
  }

  public void receives(Carrot carrot) {
    this.carrot = carrot;
  }

  @Override
  public String toString() {
    return String.format("Here's what's in the stomach: %s", carrot);
  }
}

class Carrot {
  @Override
  public String toString() {
    return "I'm a carrot, dammit!";
  }
}
