package DSA.Java.Function;

import java.util.Scanner;

//Qs. Write a function to multiply 2 numbers.

public class FunctionToMultiplyTwo {

  //Multiply 2 numbers
  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int result = multiply(a, b);
    System.out.println(result);
  }
}
