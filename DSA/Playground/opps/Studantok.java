package DSA.Playground.opps;

public class Studantok {

  public int roll_no;
  public String name;

  Studantok(int roll_no, String name) {
    this.roll_no = roll_no;
    this.name = name;
  }

  // Elements of the array are objects of a class Student.{
  public static void main(String[] args) {
    // declares an Array of integers.
    Studantok[] arr;

    // allocating memory for 5 objects of type Student.
    arr = new Studantok[5];

    // initialize the first elements of the array
    arr[0] = new Studantok(1, "aman");

    // initialize the second elements of the array
    arr[1] = new Studantok(2, "vaibhav");

    // so on...
    arr[2] = new Studantok(3, "shikar");
    arr[3] = new Studantok(4, "dharmesh");
    arr[4] = new Studantok(5, "mohit");

    // accessing the elements of the specified array
    for (int i = 0; i < arr.length; i++) System.out.println(
      "Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name
    );
  }
}
