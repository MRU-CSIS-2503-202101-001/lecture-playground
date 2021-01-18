import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenericPlaytimeOne<T> {

  ArrayList<T> stuffs;

  public static void main(String[] args) {
    Baby baba = new Baby("Abba", 3, LocalDateTime.parse("2020-02-03T04:12"));
    Baby bobo = new Baby("Bobo", 1, LocalDateTime.parse("2020-11-25T13:55"));
    Baby bebe = new Baby("Caca", 1, LocalDateTime.parse("2019-11-25T13:55"));

    GenericPlaytimeOne<Baby> ptime = new GenericPlaytimeOne<>(List.of());

    ptime.run();
  }

  public GenericPlaytimeOne(List<T> startingStuff) {
    stuffs = new ArrayList<>(startingStuff);
  }

  public void run() {}
}
