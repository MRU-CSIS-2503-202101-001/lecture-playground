import java.util.ArrayList;
import java.util.List;

public class LambdaPlayground {

  public static void main(String[] args) {

    List<WashingMachine> machines = new ArrayList<>();

    machines.add(new WashingMachine("LG", 4));
    machines.add(new WashingMachine("LG", 7));
    machines.add(new WashingMachine("Maytag", 3));
    machines.add(new WashingMachine("Samsung", 5));
  }
}

class WashingMachine {

  private int cubicFeet;
  private String brand;

  public WashingMachine(String brand, int cubicFeet) {
    this.brand = brand;
    this.cubicFeet = cubicFeet;
  }

  @Override
  public String toString() {
    return String.format("%s [%d]", brand, cubicFeet);
  }
}
