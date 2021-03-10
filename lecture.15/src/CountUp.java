public class CountUp {

  public static void main(String[] args) {
    printUpToLoopy(1, 3);
    System.out.println("=======");
    printUpToLoopy(1, 2);
    System.out.println("=======");
    printUpToLoopy(1, 1);
    System.out.println("=======");
    printUpToLoopy(0, 1);
    System.out.println("=======");

    System.out.println("\n##### RECURSIVE TIME ########\n");

    printUpToRecursively(1, 3);
  }

  public static void printUpToLoopy(int numStoStartAt, int numberToStopAt) {
    for (int n = numStoStartAt; n <= numberToStopAt; n++) {
      System.out.println(n);
    }
    System.out.println("WHOA, NELLY!");
  }

  public static void printUpToRecursively(int currentNumber, int numberToStopAt) {
    //
  }
}
