package DSA.Java.Function;

import java.util.Scanner;

//Qs. Write a function to calculate the factorial of a number.

public class FactorialOfANumber {

  public static void printFactorial(int n) {
    if (n < 0) {
      System.out.println("Invalid Number");
      return;
    }
    int factorial = 1;
    //loop
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printFactorial(n);
  }
}
