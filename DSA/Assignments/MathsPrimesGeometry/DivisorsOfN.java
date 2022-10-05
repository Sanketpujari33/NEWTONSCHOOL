package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

//Divisors Of N
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
//        Input
//        The input line contains T, denoting the number of testcases. First line of each testcase contains integer N
//
//        Constraints:
//        1 <= T <= 50
//        1 <= N <= 10^9
//        Output
//        For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
//        Example
//        Input:
//        2
//        9
//        8
//
//        Output
//        0
//        3
// don't change the name of this class
// you can add inner classes if needed
public class DivisorsOfN {

  public static void main(String[] args) {
    Scanner inputTaker = new Scanner(System.in);
    int u = inputTaker.nextInt();
    while (u > 0) {
      int n = inputTaker.nextInt();
      int count = 0;
      for (int x = 1; x <= Math.sqrt(n); x++) {
        if (n % x == 0) {
          if (x % 2 == 0) {
            count++;
          }
          if (x * x != n) {
            if ((n / x) % 2 == 0) {
              count++;
            }
          }
        }
      }
      System.out.println(count);
      u--;
    }
  }
}
