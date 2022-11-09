package DSA.Assignments.MathsPrimesGeometry;

import java.util.*;

// contains Collections framework
//Functions- prime
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given two integers N and M, your task is to print the number of primes present between N and M (both included).
//
//        Note:- You have already provided a function that will check if the given number is prime or not. To use the given function you need to call check_prime(x) where x is the number you want to check. If the given number is prime the function will return 1 else it returns 0.
//
//        Note:- Do not close your main class.
//        Input
//        The input contains two space- separated integers depicting the values of N and M.
//
//        Constraints:-
//        1 <= N <= M <= 10000
//        Output
//        Print the count of prime numbers in the given range.
//        Example
//        Sample Input:-
//        1 10
//
//        Sample Output:-
//        4
//
//        Sample Input:-
//        8 10
//
//        Sample Output:-
//        0
// don't change the name of this class
// you can add inner classes if needed
public class FunctionsPrime {

  public static int check_prime(int N) {
    return 1;
  }

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;

    for (int i = n; i <= m; i++) {
      if (check_prime(i) == 1) count++;
    }

    System.out.println(count);
  }
}
