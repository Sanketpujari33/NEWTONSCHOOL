package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Infinity Stone : The Time Stone in Mystery Box
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        The time stone is hidden inside a sacred box which has a lock of N different rings and each ring has 0-9 serially on it.
//        Initially, all N- rings together show an N- digit integer but there is a particular code only that can open the lock.
//        You can rotate each ring any number of times in either direction.
//        You have to find the minimum number of rotations done on rings of the lock to open the lock.
//        Input
//        First line contains the integer N.
//        Second line contains a string that depicts the digit on rings
//        Third line contains a string that depicts the unlock code
//
//        Constraint :
//        0 <= digit on each ring <= 9
//        1 <= |String| <= 100000
//        Output
//        Print the minimum rotation of rotations done on the rings to unlock the box.
//        Example
//        Sample Input:-
//        4
//        2345
//        5432
//
//        Sample Output:-
//        8
//
//        Explanation:-
//        1st ring is rotated thrice as 2- >3- >4- >5
//        2nd ring is rotated once as 3- >4
//        3rd ring is rotated once as 4- >3
//        4th ring is rotated thrice as 5- >4- >3- >2
//
//        Sample Input:-
//        4
//        1919
//        0000
//
//        Sample Output:-
//        4

// don't change the name of this class
// you can add inner classes if needed
public class InfinityStone {

  public static void main(String[] args) {
    // Your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = new String();
    String str1 = sc.next();
    String str2 = sc.next();
    char[] arr = new char[n];
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    int diff = 0, rotation = 0;
    for (int i = 0; i < n; i++) {
      diff =
        Math.min(Math.abs(arr1[i] - arr2[i]), 10 - Math.abs(arr1[i] - arr2[i]));
      rotation += diff;
    }

    System.out.print(rotation);
  }
}
