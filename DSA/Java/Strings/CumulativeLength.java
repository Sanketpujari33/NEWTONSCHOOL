package DSA.Java.Strings;

import java.util.*;

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

public class CumulativeLength {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String array[] = new String[size];
    int totLength = 0;

    for (int i = 0; i < size; i++) {
      array[i] = sc.next();
      totLength += array[i].length();
    }

    System.out.println(totLength);
  }
}
