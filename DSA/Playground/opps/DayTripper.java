package DSA.Playground.opps;

public class DayTripper {

  public enum Day {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN,
  }

  public static void main(String[] args) {
    Day d = Day.MON;
    System.out.println("Initially d is" + d);
    d = Day.WED;
    System.out.println("Then it is" + d);
    Day t = Day.valueOf("WED");
    System.out.println("I say d and t are the some: " + (d == t));
    //     Initially d isMON
    //     Then it isWED
    //     I say d and t are the some: true
  }
}
