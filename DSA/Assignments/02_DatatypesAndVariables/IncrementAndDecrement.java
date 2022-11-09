package DSA.Assignments.DatatypesAndVariables;

//Problem Statement
//        You must be familiar with various types of operators. One of the most commonly used operators in other languages is increment and decrement operators. Given two numbers X and Y. Your task is to print the value of X decremented by 1 and value of Y after incrementing it by 1.
//        Input
//        The first line of the input contains two integers X and Y.
//
//        Constraints:
//        1 <= X, Y <= 10000
//        Output
//        You need to perform the task as mentioned in the question, and finally, print the result separated by a space.
//        Example
//        Sample Input:
//        4 5
//
//        Sample Output:
//        3 6
//
//        Sample Input:
//        5 6
//
//        Sample Output:
//        4 7
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class IncrementAndDecrement {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    X--;
    Y++;
    System.out.println(X + " " + Y);
  }
}
