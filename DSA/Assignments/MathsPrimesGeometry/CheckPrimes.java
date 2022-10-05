package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

//Check Prime
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer N, your task is to check whether the given number is prime or not
//        Input
//        The input contains a single integer N.
//
//        Constraints:-
//        1 <= N <= 100000000000
//        Output
//        Print "YES" If the given number is prime else print "NO".
//        Example
//        Sample Input:-
//        2
//
//        Sample Output:-
//        YES
//
//        Sample Input:-
//        4
//
//        Sample Output:-
//        NO
// don't change the name of this class
// you can add inner classes if needed
public class CheckPrimes {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean CheckPrime = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        CheckPrime = true;
        break;
      }
    }

    if (!CheckPrime) System.out.println("YES"); else System.out.println("NO");
  }
}
