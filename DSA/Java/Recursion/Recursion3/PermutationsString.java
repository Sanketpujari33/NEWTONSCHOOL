package DSA.Java.Recursion.Recursion3;

//Q1. Print all the permutations of a string.

public class PermutationsString { //Time complexity - O(n*n!)

  public static void printPermutation(String str, int idx, String perm) {
    if (str.length() == 0) {
      System.out.println(perm);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      printPermutation(newStr, idx + 1, perm + currChar);
    }
  }

  public static void main(String args[]) {
    String str = "abc";
    printPermutation(str, 0, "");
  }
}
