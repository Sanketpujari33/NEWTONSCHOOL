package DSA.Arana.ControlStructures;

import java.util.*; // contains Collections framework

//Conditional statement - Numbers
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer n , your task is to print the lowercase English word corresponding to the number if it is <=5 else print "Greater than 5".
//
//        1 = one
//        2 = two
//        3 = three
//        4 = four
//        5 = five
//        Input
//        The input contains a single integer N.
//
//        Constraint:
//        1 <= n <= 100
//        Output
//        Print a string consisting of the lowercase English word corresponding to the number if it is <=5 else print the string "Greater than 5"
//        Example
//        Sample Input:
//        4
//
//        Sample Output
//        four
//
//        Sample Input:
//        6
//
//        Sample Output:
//        Greater than 5

// don't change the name of this class
// you can add inner classes if needed
public class ConditionalStatementNumbers {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (0 == N) {
            System.out.print("zero");
        } else if (N == 1) {
            System.out.print("one");
        } else if (N == 2) {
            System.out.print("two");
        } else if (N == 3) {
            System.out.print("three");
        } else if (N == 4) {
            System.out.print("four");
        } else if (N == 5) {
            System.out.print("five");
        } else {
            System.out.print("Greater than 5");
        }
    }
}