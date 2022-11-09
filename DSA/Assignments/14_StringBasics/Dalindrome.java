package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Dalindrome
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Everyone has heard of palindromes, right! A palindrome is a string that remains the same if reversed.
//        Let's define a new term, Dalindrome.
//        A Dalindrome is a string whose atleast one of the substrings is a palindrome.
//        Given a string, find whether it's a Dalindrome.
//        Input
//        The only line of input contains a string to be checked.
//
//        Constraints
//        1 <= length of string <= 100
//        Output
//        Output "Yes" if string is a Dalindrome, else output "No".
//        Example
//        Sample Input
//        cbabcc
//
//        Sample Output
//        Yes
//
//        Explanation: "bab" is one of the substrings of the string that is a palindrome.
//        There may be other substrings that are palindrome as well like "cc", or "cbabc".
//        The question requires atleast one.

// don't change the name of this class
// you can add inner classes if needed
public class Dalindrome {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Yes");
  }
}
