package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//FLAMES ?
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        They say friendship is greater than love. Why not play the famous game "FLAMES".
//        The rules are super simple. Given two strings (all lowercase), remove all the letters that are common to both the strings from both the strings. You cannot erase two characters corresponding to one character.
//        For example, in the case
//        String 1: saumya
//        String 2: ansh
//        You can remove only 1 'a' and 1 's' from both the strings.
//        Remaining strings are:
//        String 1: umya
//        String 2: nh
//
//        Now all you need to do is find the sum of the remaining strings length % 6.
//
//        Output:
//        If obtained value is 1, output "Friends"
//        If obtained value is 2, output "Love"
//        If obtained value is 3, output "Affection"
//        If obtained value is 4, output "Marriage"
//        If obtained value is 5, output "Enemy"
//        If obtained value is 0, output "Siblings"
//        Input
//        You will be given two strings on different lines.
//
//        Constraints
//        1 <= Length of both the strings <= 100000
//        Output
//        Output a single string, the result of FLAMES test.
//        Example
//        Sample Input:-
//        saumya
//        ansh
//
//        Sample Output:-
//        Siblings
//
//        Explanation:-
//        after deleting characters :-
//        str1 = umya
//        str2 = nh
//        sum = 4+2
//        sum%6=0
// don't change the name of this class
// you can add inner classes if needed
public class FLAMES {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    StringBuffer s1 = new StringBuffer(sc.next());
    StringBuffer s2 = new StringBuffer(sc.next());
    char c, d;
    for (int i = 0; i < s1.length(); i++) {
      c = s1.charAt(i);
      for (int j = 0; j < s2.length(); j++) {
        d = s2.charAt(j);
        if (c == d) {
          s1.deleteCharAt(i);
          s2.deleteCharAt(j);
          i--;
          j--;
          break;
        }
      }
    }
    int n1 = s1.length();
    int n2 = s2.length();
    int n = n1 + n2;
    int m = n % 6;

    switch (m) {
      case 1:
        System.out.println("Friends");
        break;
      case 2:
        System.out.println("Love");
        break;
      case 3:
        System.out.println("Affection");
        break;
      case 4:
        System.out.println("Marriage");
        break;
      case 5:
        System.out.println("Enemy");
        break;
      case 0:
        System.out.println("Siblings");
        break;
      default:
        break;
    }
  }
}
