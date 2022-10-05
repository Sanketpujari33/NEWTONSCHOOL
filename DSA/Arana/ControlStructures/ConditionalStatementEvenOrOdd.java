package DSA.Arana.ControlStructures;

import java.util.*; // contains Collections framework

//Conditional statement- Even or Odd
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer, your task is to check whether the integer is even or odd.
//        Input
//        The input contains a single integer N.
//
//        Constraint:
//        1<=N<=10000
//        Output
//        If the integer is even print 0 else if it is odd print 1.
//        Example
//        Sample Input:-
//        15
//
//        Sample Output:-
//        1
//
//        Sample Input:-
//        16
//
//        Sample Output:-
//        0
// don't change the name of this class
// you can add inner classes if needed

public class ConditionalStatementEvenOrOdd {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N % 2 == 0) {
      System.out.print(0);
    } else {
      System.out.print(1);
    }
  }
}
