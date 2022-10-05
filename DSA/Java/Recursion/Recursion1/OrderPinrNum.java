package DSA.Java.Recursion.Recursion1;

public class OrderPinrNum {

  public static void printNumbers(int n) {
    if (n == 6) {
      return;
    }
    System.out.println(n);
    printNumbers(n + 1);
  }

  public static void main(String[] args) {
    int N = 5;
    printNumbers(N);
  }
}
