package DSA.Assignments.DatatypesAndVariables;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//Problem Statement
//        Given an integer N, your task is to take input of the given integer and print it.
//        Input
//        The input contains a single integer N.
//
//        Constraints:-
//        1 <= N <= 100
//        Output
//        Print the integer N.
//        Example
//        Sample Input:-
//        3
//
//        Sample Output:_
//        3
//
//        Sample Input:-
//        56
//
//        Sample Output:-
//        56
public class SimpleInputInteger {

  public static void main(String[] args) {
    // Your code here
    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    System.out.println(N);
  }
}
