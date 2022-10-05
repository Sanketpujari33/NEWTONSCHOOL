package DSA.Arana.VariablesAndOperators;
import java.util.*; // contains Collections framework

//Simple Sum
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given three integers A, B, and C, your task is to print the sum of these three integers.
//        Input
//        The input contains 3 integers separated by spaces A, B, and C.
//
//        Constraints:-
//        1 <= A, B, C <= 100
//        Output
//        Print the sum of A, B and C.
//        Example
//        Sample Input
//        1 2 3
//
//        Sample Output:-
//        6
//
//        Sample Input:-
//        5 4 2
//
//        Sample Output:-
//        11

// don't change the name of this class
// you can add inner classes if needed
public class SimpleSum {
    public static void main (String[] args) {
        // Your code here
        int A, B, C, Sum;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        Sum = A + B + C;
        System.out.println(Sum);
    }
}