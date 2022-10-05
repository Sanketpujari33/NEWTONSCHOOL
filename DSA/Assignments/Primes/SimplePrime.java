package DSA.Assignments.Primes;

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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();
    List<Long> primes = new ArrayList<>();
    int len = 700000;

    boolean[] sieve = new boolean[len];
    for (int i = 0; i < sieve.length; i++) sieve[i] = true;
    sieve[0] = false;
    sieve[1] = false;
    primes.add(0L);
    //   System.out.println("here2");
    for (int seed = 2; seed < len; seed++) {
      if (sieve[seed]) {
        primes.add((long) seed);
        for (int j = seed * 2; j < len; j += seed) {
          sieve[j] = false;
        }
      }
    }
    long counter = 0;
    for (int i = 0; i < primes.size(); i++) {
      counter += primes.get(i);
      primes.set(i, counter);
    }
    while (tests-- > 0) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println((primes.get(r) - primes.get(l - 1)));
    }
  }
}
