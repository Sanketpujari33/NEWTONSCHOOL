package DSA.Assignments.FunctionalProblems;

import java.util.Scanner;

//Problem Statement
//        N people are standing in a queue in which A of them like apple and B of them like oranges. How many people like both apple and oranges.
//
//        Note:- It is guaranteed that each and every person likes at least one of the given two.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function LikesBoth() that takes integers N, A, and B as arguments.
//
//        Constraints:-
//        1 <= N <= 10000
//        1 <= A <= N
//        1 <= B <= N
//        Output
//        Return the number of people that like both of the fruit.
//        Example
//        Sample Input:-
//        5 3 4
//
//        Sample Output:-
//        2
//
//        Sample Input:-
//        5 5 5
//
//        Sample Output:-
//        5

public class AppleAndOranges {

  static int LikesBoth(int N, int A, int B) {
    //Enter your code here
    return (A + B - N);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Result = LikesBoth(N, A, B);
    System.out.println(Result);
  }
}
