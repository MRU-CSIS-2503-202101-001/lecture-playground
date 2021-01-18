import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPlaytime<T> {

  public void run() {

    Baby baba = new Baby("Abba", 3, LocalDateTime.parse("2020-02-03T04:12"));
    Baby bobo = new Baby("Bobo", 1, LocalDateTime.parse("2020-11-25T13:55"));
    Baby bebe = new Baby("Caca", 1, LocalDateTime.parse("2019-11-25T13:55"));

    ArrayList<Baby> babies = new ArrayList<Baby>(List.of(baba, bobo, bebe));

    System.out.printf("%-50s: %s%n", "before", babies);

    System.out.println();

    // here's our natural order sort
    Collections.sort(babies);
    System.out.printf("%-50s: %s%n", "sorted...naturally, with no preservatives:", babies);

    // What if this kind of sort doesn't suit or needs - and the
    // Baby class doesn't belong to us? What's a coder to do??!
    //
    // Well, let's look in Collections.sort and see if there's a clue!
    // ...
    // What's this other Collections.sort here? And WTF is a Comparator?
    // ...
    // Look it up!

    // How do we make one?
    // If the class you want to futz with ain't yours, you'll likely go
    // one of two routes:
    // - make a separate class (top level, or static nested)
    // - make an inline (anonymous or lambda)
    //
    // BUT IF THE FIELDS YOU WANT TO USE FOR COMPARISON AREN'T AVAILABLE
    // SOMEHOW...YOU'RE POOOOOOCHED
    //
    // What if we want to do doubles? Cast? Really?!?
    // Just as some things in Java already implement Comparable...commonly-used numeric classes have
    // compare baked in!

    // If the class *is* yours and you're trying to be all nice, you could
    // offer different Comparators as public constants (which are created
    // inline)

    // our new Collections.sort goes here!

    System.out.println();

    System.out.printf("%-50s: %s%n", "sorted unnaturally, with a vile Comparator:", babies);
  }
}
