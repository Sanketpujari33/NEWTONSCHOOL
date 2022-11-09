package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

//Check if prime
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer, print whether that integer is a prime number or not.
//        Input
//        First line of input contains an integer T, showing the number of test cases. Every test case is a single integer A.
//
//        Constraints
//        1 <= T <= 100
//        1 <= A <= 10^8
//        Output
//        If the given integer is prime, print 'Yes', else print 'No'.
//        Example
//        Sample Input
//        3
//        5
//        9
//        13
//
//        Output
//        Yes
//        No
//        Yes
// don't change the name of this class
// you can add inner classes if needed
public class CheckIfPrime {

  static boolean checkPrime(int n) {
    // Check if number is less than
    // equal to 1
    if (n <= 1) return false;
    // Check if number is 2
    else if (n == 2) return true;
    // Check if n is a multiple of 2
    else if (n % 2 == 0) return false;

    // If not, then just check the odds
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      //int no = sc.nextInt();
      //	boolean isPrime = checkPrime(sc.nextInt())
      if (checkPrime(sc.nextInt())) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
