package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class FunctionsSmallestDigits {

  public static int next_prime(int A) {
    return A;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    for (int i = n; i <= m; i++) {
      count += F(next_prime(i));
    }
    System.out.println(count);
  }

  public static int F(int i) {
    int m = 9;
    while (i > 0) {
      if (i % 10 < m) m = i % 10;
      i /= 10;
    }
    return m;
  }
}
