package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
//        Where in one operation you replace the number with its second-highest divisor.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.
//
//        Constraints:-
//        1 <= N <= 100000
//        Output
//        Return the number of operations required.
//        Example
//        Sample Input:-
//        100
//
//        Sample Output:-
//        4
//
//        Explanation:-
//        100 - > 50
//        50 - > 25
//        25 - > 5
//        5 - > 1
//
//        Sample Input:-
//        10
//
//        Sample Output:-
//        2
public class DivisorsProblem {

  static int DivisorProblems(int N) {
    //Enter your code here
    int x = 0;
    int i;
    for (i = N / 2; i > 0; i--) {
      if (N % i == 0) {
        x = x + 1;
        N = i;
      }
    }
    return x;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = DivisorProblems(N);
    System.out.println(result);
  }
}
