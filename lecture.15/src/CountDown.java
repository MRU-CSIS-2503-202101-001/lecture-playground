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

    launchRecursively(1);
  }

  public static void launchRecursively(int countDownFrom) {
    //
  }

  public static void launchLoopy(int countDownFrom) {
    for (int n = countDownFrom; n >= 1; n--) {
      System.out.println(n);
    }
    System.out.println("liftoff!");
  }
}
