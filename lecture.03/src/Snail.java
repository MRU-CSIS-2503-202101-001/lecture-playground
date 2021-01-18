public class Snail implements Comparable<Snail>, Eatable {
  double speed;
  double weight;

  public void oozeSlime() {
    System.out.println("....oooooze....");
  }

  public Snail(double speed, double weight) {
    this.speed = speed;
    this.weight = weight;
  }

  @Override
  public int compareTo(Snail otherSnail) {
    // - ascending order of speed
    // - slower snails come before faster ones
    if (this.speed < otherSnail.speed) {
      return -1;
    } else if (this.speed > otherSnail.speed) {
      return 1;
    } else {
      return 0;
    }
  }

  @Override
  public void eat() {
    System.out.println("BOOOOM!");
  }

  public boolean goesAfter(Snail otherSnail) {
    if (this.speed >= otherSnail.speed) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format("speed = %.1f (%.2f)", speed, weight);
  }
}
