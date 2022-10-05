package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Max Hamming Distance (Public Contest: December 2020)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a string S. Find a string R which is an anagram of S and the hamming distance between S and R is maximum.
//        An anagram of a string is another string that contains the same characters, only the order of characters can be different.
//        Hamming distance between two strings of equal length is the number of positions at which the corresponding character is different.
//        Input
//        The first and the only line of input contains a single string S.
//
//        Constraints:
//        1 <= |S| <= 100000
//        S contains only lowercase letters of the English alphabet.
//        Output
//        Print the maximum hamming distance between S and R.
//        Example
//        Sample Input 1
//        absba
//
//        Sample Output 1
//        5
//
//        Explanation: R can be "bsaab" which has hamming distance of 5 from S.
//
//        Sample Input 2
//        aaa
//
//        Sample Output 2
//        0
//
//        Explanation: R can be "aaa" which has hamming distance of 0 from S

// don't change the name of this class
// you can add inner classes if needed
public class MaxHammingDistance {

  public static void main(String[] args) {
    // Your code here
    int max = Integer.MIN_VALUE;
    HashMap<Character, Integer> hm = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (hm.containsKey(ch)) {
        int n = hm.get(ch);
        hm.put(ch, n + 1);
        if (n + 1 > max) max = n + 1;
      } else hm.put(ch, 1);
    }
    if (max <= (str.length() / 2)) System.out.println(
      str.length()
    ); else System.out.println(2 * (str.length() - max));
  }
}
