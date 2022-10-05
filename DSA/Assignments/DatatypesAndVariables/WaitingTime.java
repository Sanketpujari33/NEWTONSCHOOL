package DSA.Assignments.DatatypesAndVariables;

//Problem Statement
//        Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. Since Sara is weak in maths, your task is to calculate the time for her.
//        Input
//        Th input contains two integers N and X.
//
//        Constraints:-
//        1 <= N <= 1000
//        1 <= X <= 1000
//        Output
//        Return the total time Sara needs to wait before her turn in minutes.
//        Example
//        Sample Input:-
//        5 3
//
//        Sample Output:-
//        15
//
//        Sample Input:-
//        3 2
//
//        Sample Output:-
//        6
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class WaitingTime {

  public static void main(String[] args) {
    // Your code here
    int N, X, P;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    X = sc.nextInt();
    P = N * X;
    System.out.println(P);
  }
}
