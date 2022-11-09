package DSA.Assignments.Loops;

import java.util.Scanner;

//Problem Statement
//        A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
//        Given a number N, your task is to find the closest Magic number from the given number N.
//
//        Note:- If more than one answer exists return the minimum one
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function MagicNumber() that takes integer N as argument.
//
//        Constraints:-
//        1 <= N <= 100000
//        Output
//        Return a magic number closest to the given number N.
//        Example
//        Sample Input:-
//        8
//
//        Sample Output:-
//        79
//
//        Sample Input:-
//        900
//
//        Sample Output:-
//        897
public class MagicNumber {

  static int MagicNumbers(int N) {
    //Enter your code here
    boolean magicNum = false;
    int belown = N, aboven = N;
    while (true) {
      magicNum = checkMagicNum(belown);
      if (magicNum == true) {
        return belown;
      }
      magicNum = checkMagicNum(aboven);
      if (magicNum == true) {
        return aboven;
      }
      belown--;
      aboven++;
    }
  }

  static boolean checkMagicNum(int n) {
    boolean check1 = false, check2 = false;
    while (n > 0) {
      int r = n % 10;
      if (r == 7) {
        check1 = true;
      }
      if (r == 9) {
        check2 = true;
      }
      n = n / 10;
    }
    if (check1 == true && check2 == true) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = MagicNumbers(N);
    System.out.println(result);
  }
}
