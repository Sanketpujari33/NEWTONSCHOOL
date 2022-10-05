package DSA.Java.Function;

//        main function
//        The main function is a special function as the computer starts running the code
//        from the beginning of the main function. Main function serves as the entry point
//        for the program.
public class sum {

  //A METHOD to calculate sum of 2 numbers - a & b
  public static void sum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    sum(a, b); // Function Call
  }
}
