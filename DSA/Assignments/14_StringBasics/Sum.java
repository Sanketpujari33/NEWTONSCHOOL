package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Sum(Large)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given two integers a and b your task is to print the summation of these two numbers
//        Input
//        Input contains a single line containing two space separated integers a and b.
//
//        Constraints:-
//        1 <= a, b <= 1020000
//        Output
//        Print the sum of a and b.
//        Example
//        Sample Input:-
//        3 8
//
//        Sample Output:-
//        11
//
//        Sample Input:-
//        15 1
//
//        Sample Output:-
//        16

// don't change the name of this class
// you can add inner classes if needed
public class Sum {

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      String[] strNums = sc.nextLine().split(" ");
      System.out.print(findSum(strNums[0], strNums[1]));
    } catch (Exception e) {
      return;
    }
  }

  static String findSum(String str1, String str2) {
    if (str1.length() > str2.length()) {
      String t = str1;
      str1 = str2;
      str2 = t;
    }

    String str = "";

    int n1 = str1.length(), n2 = str2.length();

    str1 = new StringBuilder(str1).reverse().toString();
    str2 = new StringBuilder(str2).reverse().toString();

    int carry = 0;
    for (int i = 0; i < n1; i++) {
      int sum =
        ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0') + carry);
      str += (char) (sum % 10 + '0');

      carry = sum / 10;
    }

    for (int i = n1; i < n2; i++) {
      int sum = ((int) (str2.charAt(i) - '0') + carry);
      str += (char) (sum % 10 + '0');
      carry = sum / 10;
    }

    if (carry > 0) str += (char) (carry + '0');

    str = new StringBuilder(str).reverse().toString();

    return str;
  }
}
