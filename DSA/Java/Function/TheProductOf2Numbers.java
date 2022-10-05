package DSA.Java.Function;

import java.util.Scanner;

//Qs. Write a function to calculate the product of 2 numbers.

public class TheProductOf2Numbers {

  public static int calculateProduct(int a, int b) {
    return a * b;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Price of Product");
    int a = sc.nextInt();
    System.out.println("Number of Product");
    int b = sc.nextInt();
    System.out.println("All Product Total");
    System.out.println(calculateProduct(a, b));
  }
}
