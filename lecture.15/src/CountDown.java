public class CountDown {

  public static void main(String[] args) {
    launchLoopy(3);
    System.out.println("=======");
    launchLoopy(2);
    System.out.println("=======");
    launchLoopy(1);
    System.out.println("=======");
    launchLoopy(0);
    System.out.println("=======");

    System.out.println("\n##### RECURSIVE TIME ########\n");

    launchRecursively(3);
    System.out.println("=======");
    launchRecursively(2);
    System.out.println("=======");
    launchRecursively(1);
    System.out.println("=======");
    launchRecursively(0);
    System.out.println("=======");
  }

  public static void launchRecursively(int countDownFrom) {
    if (countDownFrom == 0) {
      System.out.println("liftoff!");
    } else {
      System.out.println(countDownFrom);
      launchRecursively(countDownFrom - 1);
    }
  }

  public static void launchLoopy(int countDownFrom) {
    for (int n = countDownFrom; n >= 1; n--) {
      System.out.println(n);
    }
    System.out.println("liftoff!");
  }
}
