package DSA.Java.Recursion.Recursion1;

//Q6. Print x^n (with stack height = n)

public class Printxn {

  public static int printPower(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }

    int x_ = printPower(x, n - 1);
    int xn = x * x_;
    return xn;
  }

  public static void main(String args[]) {
    int x = 2, n = 5;
    int output = printPower(x, n);
    System.out.println(output);
  }
}
