import java.util.ArrayList;
import java.util.Scanner;

public class GenericStomach {

  //  private T thingInStomach;

  public static void main(String[] args) {
    // pro-tip: using a main inside of a class as tool to test
    // the class in an ad-hoc way is pretty useful

    GenericStomach stomach = new GenericStomach();

    // hmmm...this stomach isn't type safe!

    //    stomach.receives("A String!");
    //    stomach.receives(31);
    //    stomach.receives(new Scanner("scan this, you scanner, you!"));

    //    GenericStomach<HunkOfMeat> saferStomach = new GenericStomach();

    // saferStomach.receives("A String!");

    //    saferStomach.receives(new HunkOfMeat());

    // but why not just toss in *anything* digestable?!?

    //    GenericStomach<Digestable> flexibleStomach = new GenericStomach();

    // System.out.println(saferStomach);
  }

  public GenericStomach() {
    //
  }

  //  public void receives(T t) {
  //    this.thingInStomach = t;
  //  }
  //
  //  @Override
  //  public String toString() {
  //    return String.format("Here's what's in the stomach: %s", thingInStomach);
  //  }
}
