package DSA.Assignments.Primes;

import java.util.*; // contains Collections framework

//sprime
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Sara has developed a new algorithm to find sprime for a given range starting with 2
//
//        She will start from the end mark it sprime, and mark all its factors (excluding itself) as not sprime. Then she will find the next greatest unmarked number, mark it as sprime, and mark all its factors (excluding itself) as not sprime
//
//        Your task is to calculate the the number of sprimes that are actually prime
//        Input
//        The first line contains T the number of test cases.
//        Each of the next T lines contain an integer n.
//
//        Constraint:-
//        1 <= T <= 100
//        2 <= n <= 10000000
//        Output
//        Output T lines, one for each test case, containing the required answer.
//        Example
//        Sample Input :
//        3
//        2
//        4
//        7
//
//        Sample Output :
//        1
//        1
//        2
//
//        Explanation:-
//        For test 3:- 7 and 5 are the required primes

// don't change the name of this class
// you can add inner classes if needed
public class Sprime {

  public static void main(String[] args) {
    // Your code here
    boolean[] isPrime = new boolean[10000001];
    for (int i = 2; i <= 10000000; i++) isPrime[i] = true;
    for (int i = 2; i * i <= 10000000; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= 10000000; j += i) {
          isPrime[j] = false;
        }
      }
    }
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      int count = 0;
      for (int i = n; i > n / 2; i--) {
        if (isPrime[i]) count++;
      }
      System.out.println(count);
      t--;
    }
  }
}
