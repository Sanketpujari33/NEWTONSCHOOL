package DSA.Arana.VariablesAndOperators;
import java.util.*; // contains Collections framework

//Simple Input- Integer
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer N, your task is to take input of the given integer and print it.
//        Input
//        The input contains a single integer N.
//
//        Constraints:-
//        1 <= N <= 100
//        Output
//        Print the integer N.
//        Example
//        Sample Input:-
//        3
//
//        Sample Output:_
//        3
//
//        Sample Input:-
//        56
//
//        Sample Output:-
//        56

// don't change the name of this class
// you can add inner classes if needed
public class SimpleInputInteger{
    public static void main (String[] args) {
        // Your code here
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(N);
    }
}