package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        Sara loves patterns, today she encounters an interesting pattern and wants to write
//        a code that can print the pattern of a given height N.
//        As Sara is weak in programming help her to code it.
//
//        The pattern for height 6:-
//
//        0 4 8 12 16 20
//        6 10 14 18 22 26
//        12 16 20 24 28 32
//        18 22 26 30 34 38
//        24 28 32 36 40 44
//        30 34 38 42 46 50
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input.
//        You just have to complete the function Pattern() that takes integer N as an argument.
//
//        Constraints:-
//        1 <= N <= 100
//        Output
//        Print the given pattern.
//        Example
//        Sample Input:-
//        3
//
//        Sample Output:-
//        0 4 8
//        6 10 14
//        12 16 20
//
//        Sample Input:-
//        5
//
//        Sample Output:-
//        0 4 8 12 16
//        6 10 14 18 22
//        12 16 20 24 28
//        18 22 26 30 34
//        24 28 32 36 40
public class SaraAndPattern {

  static void Pattern(int N) {
    //Enter your code here
    int start = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(start + j * 4);
        System.out.print(" ");
      }
      start = start + 6;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Pattern(N);
  }
}
