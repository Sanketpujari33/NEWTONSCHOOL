package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.
//
//        Constraints:-
//        1 <= N <= 10000000
//        Output
//        Print the digits of the number as shown in the example.
//
//        Note:- Print all digits in lowercase English letters
//        Example
//        Sample Input:-
//        1024
//
//        Sample Output:-
//        one zero two four
//
//        Sample Input:-
//        2
//
//        Sample Output:-
//        two
public class PrintDigits {

  static void Print_Digits(int N) {
    //Enter your code here
    String s = String.valueOf(N);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        System.out.print("zero ");
      } else if (s.charAt(i) == '1') {
        System.out.print("one ");
      } else if (s.charAt(i) == '2') {
        System.out.print("two ");
      } else if (s.charAt(i) == '3') {
        System.out.print("three ");
      } else if (s.charAt(i) == '4') {
        System.out.print("four ");
      } else if (s.charAt(i) == '5') {
        System.out.print("five ");
      } else if (s.charAt(i) == '6') {
        System.out.print("six ");
      } else if (s.charAt(i) == '7') {
        System.out.print("seven ");
      } else if (s.charAt(i) == '8') {
        System.out.print("eight ");
      } else if (s.charAt(i) == '9') {
        System.out.print("nine ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    Print_Digits(Num);
  }
}
