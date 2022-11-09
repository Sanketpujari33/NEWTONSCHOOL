package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Compress String
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Groot wants to send a message to Rocket. To make his message look interesting he thought he would compress his message. He decides to do so by replacing consecutive duplicate occurrences with the count of repetitions. Help Groot by writing a program to automatically convert his message.
//        We are given a string. Your task is to compress the consecutive letters of the string
//
//        For example: given string is "AAACCCBBD", thus here
//        A's occurrence 3 times
//        C's occurrence 3 times
//        B's occurrence 2 times
//        D's occurrence 1 time
//        So after compressing string becomes "A3C3B2D1".
//        Input
//        The first line of input contains an integer T denoting the number of test cases. Each test case will have a string provided in the new line.
//
//        Constraints:
//        1 <= T <= 10
//        1 <= sizeof(String) <= 10^6
//        All characters of String are upper case letters. (A-Z)
//
//        Sum of size of Strings over all testcases is <= 10^6
//        Output
//        For each testcase, in a new line, print the compressed string for each test case in a new line.
//        Example
//        Input:
//        2
//        AAACCCBBD
//        ABCD
//
//        Output:
//        A3C3B2D1
//        A1B1C1D1

// don't change the name of this class
// you can add inner classes if needed
public class CompressString {

  public static void main(String[] args) {
    CompressString str = new CompressString();
    String s1, s2;
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();

    while (t-- > 0) {
      s1 = in.next();

      s2 = s1.replaceAll("\\s", "");
      str.Compression(s2);
    }
  }

  public static String Compression(String s) {
    int count = 1;
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        sb.append(s.charAt(i - 1));
        sb.append(count);
        count = 1;
      }
    }

    if (s.length() > 1) {
      if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
        count++;
      } else {
        sb.append(s.charAt(s.length() - 2));
        sb.append(count);
        count = 1;
      }
      sb.append(s.charAt(s.length() - 1));
      sb.append(count);
    }
    s = sb.toString();
    System.out.println(s);
    return s;
  }
}
