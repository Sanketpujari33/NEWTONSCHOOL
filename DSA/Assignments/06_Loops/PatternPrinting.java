package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        Given a positive integer N, your task is to print a right angle triangle pattern of consecutive numbers of height N.
//
//        For N = 5, the following pattern is printed.
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern() that takes integer n as a parameter.
//
//        Constraint:
//        1 <= N <= 100
//        Output
//        Print a right angle triangle of numbers of height N.
//        Example
//        Sample Input:
//        5
//
//        Sample Output:
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//
//        Sample Input:
//        2
//
//        Sample Output:
//        1
//        1 2
public class PatternPrinting {

  static void pattern(int n) {
    //enter your code here
    {
      for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    pattern(N);
  }
}
