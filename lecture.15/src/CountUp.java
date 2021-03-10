public class CountUp {

  public static void main(String[] args) {
    printUpToLoopy(1, 3);
    System.out.println("=======");
    printUpToLoopy(1, 2);
    System.out.println("=======");
    printUpToLoopy(1, 1);
    System.out.println("=======");
    printUpToLoopy(1, 0);
    System.out.println("=======");

    System.out.println("\n##### RECURSIVE TIME ########\n");

    printUpToRecursively(1, 3);
    printUpToRecursively(1, 0);
  }

  public static void printUpToLoopy(int numToStartAt, int numberToStopAt) {
    for (int n = numToStartAt; n <= numberToStopAt; n++) {
      System.out.println(n);
    }
    System.out.println("WHOA, NELLY!");
  }

  public static void printUpToRecursively(int numToStartAt, int numToStopAt) {
    if (numToStartAt > numToStopAt) {
      System.out.println("WHOA, NELLY!");
    } else {
      System.out.println(numToStartAt);
      printUpToRecursively(numToStartAt + 1, numToStopAt);
    }
  }
}
