package DSA.Assignments.GCD;

import java.util.*; // contains Collections framework

//Special numbers
//
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a number N , you need to calculate number of distinct numbers of gcd(i, N) where i is between 1<=i<=1e18.
//
//        Note:-You need to check for all the possible values of I.
//        Input
//        Input contains a single integer N.
//
//        Constraints:-
//        1<=N<=10^10
//        Output
//        Print the number of distinct numbers of gcd(i, N) where i is between 1<=i<=1e18.
//        Example
//        Input:
//        16
//
//        Output:
//        5
//
//        Explanation:-
//        all disticnt numbers are - 1,2,4,8,16
//
//        Input:
//        3248
//
//        Output:
//        20

// don't change the name of this class
// you can add inner classes if needed
public class SpecialNumbers {

  public static void main(String[] args) {
    // Your code here
    long count = 0;
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    for (long i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        long f = n / i;
        if (i == f) count++; else count += 2;
      }
    }
    System.out.println(count);
  }
}
