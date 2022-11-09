package DSA.Assignments.DatatypesAndVariables;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//Problem Statement
//        Some Data types are given below:-
//        Integer
//        Long
//        float
//        Double
//        char
//        Your task is to take input in the given format and print them in the same order.
//        Input
//        The input contains the following values separated by lines:- integer, Long, float, double, char
//        Output
//        Print each element in a new line in the same order as input.
//
//        Note:- Print float round off to two decimal places and double to 4 decimal places.
//        Example
//        Sample Input:-
//        2
//        2312351235
//        1.21
//        543.1321
//        c
//
//        Sample Output:-
//        2
//        2312351235
//        1.21
//        543.1321
//        c
public class DataTypes {

  public static void main(String[] args) {
    // Your code here
    //Some Data types are given below:-
    Scanner sc = new Scanner(System.in);
    //Integer
    int a = sc.nextInt();
    //Long
    long b = sc.nextLong();
    //float
    float f = sc.nextFloat();
    //Double
    double d = sc.nextDouble();
    //char
    char c = sc.next().charAt(0);
    //Print each element in a new line in the same order as input.
    System.out.println(a);
    System.out.println(b);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
  }
}
