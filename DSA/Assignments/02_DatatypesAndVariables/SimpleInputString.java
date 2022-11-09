package DSA.Assignments.DatatypesAndVariables;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//Problem Statement
//        Given a string S, your task is to take input of the given string and print the same string.
//        Input
//        The input contains a single string S.
//        Output
//        Print the string S.
//        Example
//        Sample Input:-
//        NewtonSchool
//
//        Sample Output:-
//        NewtonSchool
//
//        Sample Input:-
//        Hello
//
//        Sample Output:-
//        Hello

public class SimpleInputString {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    System.out.println(S);
  }
}
