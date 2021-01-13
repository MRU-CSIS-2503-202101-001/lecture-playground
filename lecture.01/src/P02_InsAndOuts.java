public class P02_InsAndOuts {

  public static void main(String[] args) {

    /*
     * - all those defaults in a new array are not always useful
     * - so let's fix that by putting stuff in!
     */

    System.out.println("here we go!");

    int capacity = 3;
    String[] names = new String[capacity]; // just learned something there!

    names[0] = "Mr. Tibbs";

    /*
     * - what are our "safe" indexes in this array?
     * - what happens if we go outside those? let's see!
     */

    /*
     * - what if we want to see what's at a given index and don't want to use the debugger?
     */

    System.out.println("The name at index 2 is..." + "???");

    /*
     * - what if we try and display a custom object?
     */

    System.out.println("that was FUN");
  }
}
