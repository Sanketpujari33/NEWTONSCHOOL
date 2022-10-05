package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

//Nth number made of prime digits
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
//        Input
//        The first line contains a single integer T i.e. the number of test cases. The first and only line of each test case consists of a single integer N.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= N <= 100000
//        Output
//        For each testcase print the nth number of the given sequence made of prime digits in a new line.
//        Example
//        Input:
//        2
//        10
//        21
//
//        Output:
//        33
//        222
//
//        Explanation:
//        Testcase 1: 10th number in the sequence of numbers whose each digit is prime is 33.
//        Testcase 2: 21th number in the sequence of numbers whose each digit is prime is 222.
// don't change the name of this class
// you can add inner classes if needed
public class NthNumberMadeOfPrimeDigits {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      Solution ob = new Solution();
      System.out.println(ob.primeDigits(n));
    }
  }
}

// } Driver Code Ends

//User function Template for Java

class Solution {

  //Function to find nth number made of only prime digits.
  public static int primeDigits(int n) {
    char[] numbers = { '7', '2', '3', '5' };
    String ans = "";

    while (n > 0) {
      ans = numbers[n % 4] + ans;
      if (n % 4 == 0) n = n / 4 - 1; else n = n / 4;
    }

    return Integer.parseInt(ans);
  }
}
