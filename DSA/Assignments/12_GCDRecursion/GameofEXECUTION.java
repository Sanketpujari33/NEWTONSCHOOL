package DSA.Assignments.GCDRecursion;

import java.util.*; // contains Collections framework

//Game of EXECUTION:
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        To seek revenge on Midgard, Loki devises a plan to torture the humans by making them take part in one of his silly games.
//        He makes N people sit in a circle. He says he will kill every kth person sitting in the circle,
//        starting from 1st person.
//        Loki performs his revenge prank until and unless 1 survivor remains.
//        What is the initial position of the survivor, if the indexing is clockwise?
//        Input
//        The first line of input contains a single integer T.
//        The next T line of input contains Two space separated integers each containing value of N and k.
//
//
//        Constraints:
//        1 <= T <= 100
//        1 <= k, N <= 20
//        Output
//        Print the initial position of the survivor.
//        Example
//        Sample Input:
//        2
//        3 2
//        5 3
//
//        Sample Output
//        3
//        4
//
//        Explanation:
//        Test case 1: There are 3 people so skipping 1 person i.e
//        1st person 2nd person will be killed in next step 3rd person will be skipped and 1st person will be killed.
//        hus the safe position is 3.
//        Test case 2: 2 people i.e 1and 2 are skipped and person 3 will be killed in next step 4 and 5
//        will be skipped and 1st person will be killed next step 2 and 4 will be skipped and 5th person
//        will be killed next step first 2 will be skipped then 4 will be skipped and so coming back to 2
//        therefore person 2 will be killed.Thus the safe position is 4.

// don't change the name of this class
// you can add inner classes if needed
public class GameofEXECUTION {

  static int remaining(int n, int k) {
    int r = 0;
    for (int i = 2; i <= n; i++) r = (r + k) % i;

    return r + 1;
  }

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      System.out.println(remaining(n, k));
    }
  }
}
