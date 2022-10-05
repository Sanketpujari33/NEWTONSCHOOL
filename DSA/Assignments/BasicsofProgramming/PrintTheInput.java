package DSA.Assignments.BasicsofProgramming;

//        Problem Statement
//        Take an integer as input and print it.
//        Input
//        The first line contains integer as input.
//
//        Constraints
//        1 <= N <= 10
//        Output
//        Print the input integer in a single line
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class PrintTheInput {

  public static void main(String[] args) {
    // Your code here
    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    System.out.print(N);
  }
}
