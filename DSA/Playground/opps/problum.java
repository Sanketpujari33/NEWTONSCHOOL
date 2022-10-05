package DSA.Playground.opps;

public class problum {

  // Instance variables
  public String name;
  public int age;
  public problum gnomeBuddy;
  private boolean magical = false;
  protected double height = 2.6;
  public static final int MAX_HEIGHT = 3;

  //maximum height
  //Constructors;
  problum(String nm, int ag, problum bud, double hgt) {
    //Full parameterized
    name = nm;
    age = ag;
    gnomeBuddy = bud;
    height = hgt;
  }

  problum() { //Default constructor
    name = "Sanket";
    age = 24;
    gnomeBuddy = null;
    height = 2.1;
  }

  //Methods;
  public static void makeKing(problum h) {
    h.name = "King" + h.getRealName();
    h.magical = true; //Only the product class can reference this field.
  }

  public void makeMeKing() {
    name = "King" + getRealName();
    magical = true;
  }

  public boolean isMagical() {
    return magical;
  }

  public void setHeight(int newHeight) {
    height = newHeight;
  }

  public String getName() {
    return "I won't tell !";
  }

  public String getRealName() {
    return name;
  }

  public void renameproblum(String s) {
    name = s;
  }
}
