package DSA.Contests.November2019;

import java.util.*; // contains Collections framework

//Hardworking AL
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Al is given task to build a skyscraper of N floors. He can build 2**i (2 to the power i, where i can be any non-negative integer) floors in one day. Report the minimum number of days required to build the skyscraper.
//        Input
//        First and only line of input contains a single integer N.
//
//        Constraints :
//        1 <= N <= 1000000000000
//        Output
//        Print a single integer, the minimum number of days required to build the skyscraper.
//        Example
//        Sample Input:
//        5
//
//        Sample Output:
//        2
//
//        Sample Input:
//        1
//
//        Sample Output:
//        1

// don't change the name of this class
// you can add inner classes if needed
public class HardworkingAL {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    long N = scanner.nextLong();
    while (N > 0) {
      if (N % 2 == 1) {
        count++;
      }
      N /= 2;
    }
    System.out.println(count);
  }
}
