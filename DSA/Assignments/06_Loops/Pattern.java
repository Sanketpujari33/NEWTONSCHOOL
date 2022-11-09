package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        Given an integer N, you have to print the given below pattern for N >= 3.
//
//        Pattern for N = 4:-
//        *
//        *^*
//        *^^*
//        *****
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input.
//        You just have to complete the function Pattern() that takes integers N as argument.
//
//        Constraints:-
//        1 <= N <= 100
//        Output
//        Print the given pattern for size N.
//        Example
//        Sample input:-
//        N = 3
//
//        Sample Output:-
//        *
//        *^*
//        ****
//
//        Sample Input:-
//        N = 6
//
//        Sample Output:-
//        *
//        *^*
//        *^^*
//        *^^^*
//        *^^^^*
//        ******
public class Pattern {

  static void Patterns(int N) {
    //Enter your code here
    for (int i = 1; i <= N; i++) {
      if (i == 1 || i == N) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        if (i == N) {
          System.out.print("*");
        }
      } else {
        System.out.print("*");
        for (int j = 1; j < i; j++) {
          System.out.print("^");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Patterns(N);
  }
}
