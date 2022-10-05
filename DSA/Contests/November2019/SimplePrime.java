package DSA.Contests.November2019;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

//Simple Prime (Contest)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Let's define P[i] as the ith Prime Number. Therefore, P[1]=2, P[2]=3, P[3]=5, so on.
//        Given two integers L, R (L<=R), find the value of P[L]+P[L+1]+P[L+2]...+P[R].
//        Input
//        The first line of the input contains an integer T denoting the number of test cases.
//        The next T lines contain two integers L and R.
//
//        Constraints
//        1 <= T <= 50000
//        1 <= L <= R <= 50000
//        Output
//        For each test case, print one line corresponding to the required value
//        Example
//        Sample Input
//        4
//        1 3
//        2 4
//        5 5
//        1 5
//
//        Sample Output
//        10
//        15
//        11
//        28

// don't change the name of this class
// you can add inner classes if needed
public class SimplePrime {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<Long> prime = new ArrayList<>();
    sieve(620000, prime);

    while (t-- > 0) {
      int L = sc.nextInt();
      int R = sc.nextInt();
      long sum = 0;
      sum = prime.get(R) - prime.get(L - 1);
      System.out.println(sum);
    }
  }

  public static void sieve(int n, ArrayList<Long> prime1) {
    boolean[] prime = new boolean[n + 1];

    for (int i = 0; i < n; i++) {
      prime[i] = true;
    }
    for (int i = 2; i * i <= n; i++) {
      if (prime[i] == true) {
        for (int j = i * i; j <= n; j += i) {
          prime[j] = false;
        }
      }
    }
    long sum = 0;
    prime1.add(0l);
    for (int i = 2; i <= n; i++) {
      if (prime[i] == true) {
        sum += i;
        prime1.add(sum);
      }
    }
  }
}
