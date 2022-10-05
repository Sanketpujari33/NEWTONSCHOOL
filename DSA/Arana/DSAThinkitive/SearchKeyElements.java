package DSA.Arana.DSAThinkitive;

//This is a Java Program to Search Key Elements in an Array.
//        Enter the size of array and then enter all the elements of that array.
//        Now enter the element you want to search for. With the help of for loop we can find out the location of the element easily.
//
//        Here is the source code of the Java Program to Search Key Elements in an Array.
//        The Java program is successfully compiled and run on a Windows system. The program output is also shown below.

import java.util.Scanner;

public class SearchKeyElements {

  public static void main(String[] args) {
    int n, x, flag = 0, i = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    System.out.print("Enter the element you want to find:");
    x = s.nextInt();
    for (i = 0; i < n; i++) {
      if (a[i] == x) {
        flag = 1;
        break;
      } else {
        flag = 0;
      }
    }
    if (flag == 1) {
      System.out.println("Element found at position:" + (i + 1));
    } else {
      System.out.println("Element not found");
    }
  }
}
