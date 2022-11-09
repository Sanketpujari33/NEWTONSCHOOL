package DSA.Assignments.FunctionalProblems;

import java.util.Scanner;

//Problem Statement
//        You are given a cubic dice with 6 faces. All the individual faces have numbers printed on them.
//        The numbers are in the range of 1 to 6, like any ordinary dice.
//        You will be provided with a face of this cube,
//        your task is to find the number on the opposite face of the cube.
//
//        Note:- The sum of numbers on all opposite faces of the die is constant
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input.
//        You just have to complete the function DiceProblem() that takes the integer N(face) as parameter.
//
//        Constraints:
//        1 <= N <= 6
//        Output
//        Return the number on the opposite side.
//        Example
//        Sample Input:-
//        2
//
//        Sample Output:-
//        5
//
//        Sample Input:-
//        1
//
//        Sample Output:-
//        6
public class TheDiceProblem {

  static int diceProblem(int N) {
    int ans = 7 - N;
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    int result = diceProblem(Num);
    System.out.println(result);
  }
}
