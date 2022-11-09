package DSA.Assignments.FunctionalProblems;

import java.util.Scanner;

//Problem Statement
//        Mahesh has won some money K from a lottery, he wants to distribute the money among his three sisters. His sisters already have some money with them. Let's say they have x, y, z amount of money. Now mahesh wants to distribute his money such that all the sisters have the same amount of total money left with them. Your task is to check if it is possible to distribute the money as Mahesh wants.
//        Input
//        User Task:
//        Since this will be a functional problem, you don't have to take input. You just have to complete the function distributingMoney() that takes the integers x, y, z, and K as parameters.
//
//        Constraints:-
//        0 <= x, y, z, K <= 10^7
//        Output
//        Return 1 if possible else return 0.
//        Example
//        Sample Input:-
//        1 2 3 3
//
//        Sample Output:-
//        1
//
//        Explanation:-
//        initial :- 1 2 3
//        Final :- 3 3 3
//
//        Sample Input:-
//        1 2 3 4
//
//        Sample Output:-
//        0
public class DistributingMoney {

  public static int distributingMoney(long x, long y, long z, long K) {
    //Enter your code here
    long avg = x + y + z + K;
    if (x == 0) {
      if (x == y && x == z) {
        return 1;
      } else {
        return 0;
      }
    }
    if (x > (avg / 3) || y > (avg / 3)) {
      return 0;
    }
    if (avg % 3 == 0) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long z = sc.nextLong();
    long k = sc.nextLong();
    int result = distributingMoney(x, y, z, k);
    System.out.println(result);
  }
}
