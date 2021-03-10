import java.util.Arrays;

public class ArraySum {

  public static void main(String[] args) {

    int[] someNums = {4, 0, 2, 8}; // should sum up to 14

    System.out.println("summed iterably: " + sumLoopy(someNums));

    System.out.println("\n##### RECURSIVE TIME ########\n");

    System.out.println("summed recursively: " + sumRecursively(someNums));
  }

  private static int sumLoopy(int[] someNums) {
    int sum = 0;
    int length = someNums.length;
    for (int i = 0; i < length; i++) {
      sum += someNums[i];
    }

    return sum;
  }

  public static int sumRecursively(int[] someNums) {
    return sumRecursively(someNums, someNums.length);
  }

  private static int sumRecursively(int[] someNums, int length) {
    if (length == 0) {
      return 0;
    } else {
      return someNums[length - 1] + sumRecursively(someNums, length - 1);
    }
  }
}
