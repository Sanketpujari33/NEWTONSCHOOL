package DSA.Assignments.TimeSpaceAndTwoPointers;

import java.io.*; // for handling input/output
import java.lang.*;

//Longest Distinct characters in string
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a string S, you have to find the length of the longest substring of S containing all unique characters, i.e, no character is repeating within that substring.
//        For example, for input string S = "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
//        Input
//        The first line of input contains an integer T denoting the number of test cases.
//        The first and the only line of each test case contains the string S.
//
//        Constraints:
//        1 ≤ T ≤ 100
//        1 ≤ length of S ≤ 1000
//        Output
//        Print length of longest substring containing all the distinct characters of string.
//        Note: The output substring should have all distinct characters.
//        Example
//        Sample Input:
//        2
//        abababcdefababcdab
//        gccksfvrgccks
//
//        Sample Output:
//        6
//        7

// don't change the name of this class
// you can add inner classes if needed
public class LongestDistinctCharactersInString {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] res = new int[n];
      for (int tc = 0; tc < n; tc++) {
        String str = br.readLine();
        res[tc] = getLongestCount(str);
      }
      for (int i = 0; i < n; i++) System.out.println(res[i]);
    } catch (Exception e) {
      return;
    }
  }

  public static int getLongestCount(String str) {
    int max = 0;
    boolean[] chars = new boolean[256];
    int i = 0, j = 0;
    int currCount = 0;
    while (j < str.length()) {
      char curr = str.charAt(j);
      if (!chars[curr]) {
        chars[curr] = true;
        currCount++;
        if (currCount > max) max = currCount;
      } else {
        while (i < j) {
          currCount--;
          if (str.charAt(i) == str.charAt(j)) {
            i++;
            break;
          }
          chars[str.charAt(i)] = false;
          i++;
        }
        currCount++;
      }
      j++;
    }
    return max;
  }
}
