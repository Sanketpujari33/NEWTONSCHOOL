package DSA.Java.IntroductiontoProgramming;

import java.util.Scanner;

public class IfElse {

  public static void main(String[] args) {
    int age = 30;
    if (age > 18) {
      System.out.println("This is an adult");
    } else {
      System.out.println("This is not an adult");
    }
  }

  public static class StringAndArray {

    public static void main(String[] args) {
      String name = new String("Aman");
      int[] marks = new int[3];
      marks[0] = 97;
      marks[1] = 98;
      marks[2] = 95;
    }
  }

  public static class Conditions {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int operator = sc.nextInt();
      /**
       * 1 -> +
       * 2 -> -
       * 3 -> *
       * 4 -> /
       * 5 -> %
       */
      switch (operator) {
        case 1:
          System.out.println(a + b);
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          if (b == 0) {
            System.out.println("Invalid Division");
          } else {
            System.out.println(a / b);
          }
          break;
        case 5:
          if (b == 0) {
            System.out.println("Invalid Division");
          } else {
            System.out.println(a % b);
          }
          break;
        default:
          System.out.println("Invalid Operator");
      }
    }
  }
}
