import java.time.LocalDateTime;

public class Baby implements Comparable<Baby>, Eatable {
  private String name;
  private double weight;
  private LocalDateTime dob;
  private boolean hasToPee;

  public Baby(String name, double weight, LocalDateTime dob) {
    this.name = name;
    this.weight = weight;
    this.dob = dob;
    hasToPee = true;
  }

  @Override
  public String toString() {
    return String.format("%s (%2$tY.%2$tb%2$td) (w:%3$.1f)", name, dob, weight);
  }

  @Override
  public void eat() {
    System.out.println("Nom Nom Drool");
  }

  @Override
  public int compareTo(Baby otherBaby) {
    // what is this natural ordering saying in English?
    int comparedByWeight = (int) (otherBaby.weight - this.weight);
    return comparedByWeight != 0 ? comparedByWeight : otherBaby.name.compareToIgnoreCase(this.name);
  }
}
