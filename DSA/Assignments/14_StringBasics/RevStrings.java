package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Rev Strings
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        You are given a string your task is to reverse the given string.
//        Input
//        The first line of the input contains a string.
//
//        Constraints:-
//        1 <= string length <= 100
//        String contains only lowercase english letters
//        Output
//        The output should contain reverse of the input string.
//        Example
//        Sample Input
//        abc
//
//        Sample Output
//        cba

// don't change the name of this class
// you can add inner classes if needed
public class RevStrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String revStr = " ";
    char rv;
    for (int i = 0; i < s.length(); i++) {
      rv = s.charAt(i);
      revStr = rv + revStr;
    }
    System.out.print(revStr);
  }
}
