package DSA.Java.Recursion.Recursion1;

//Q1. Print numbers from 5 to 1.

public class PrintNumbers {

  public static void printNumbers(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printNumbers(n - 1);
  }

  public static void main(String[] args) {
    int N = 5;
    printNumbers(N);
  }
}
