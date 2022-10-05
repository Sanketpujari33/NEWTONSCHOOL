package DSA.Assignments.FunctionalProblems;

import java.util.Scanner;

//Problem Statement
//        Mohit has three integers A, B, and C with him he wants to find the average of these three integers however he is weak in maths, so help him to find the average. You need to report the floor of the average value.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Average() that takes integers A, B, and C as arguments.
//
//        Constraints:-
//        1 <= A, B, and C <= 10000
//        Output
//        Return the floor of average of these numbers.
//        Example
//        Sample Input:-
//        3 4 5
//
//        Sample Output:-
//        4
//
//        Sample Input:-
//        3 4 4
//
//        Sample Output:-
//        3
public class MohitAndAverage {

  static int Average(int A, int B, int C) {
    //Enter your code here
    return (A + B + C) / 3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int result = Average(A, B, C);
    System.out.println(result);
  }
}
