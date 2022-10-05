package DSA.Java.Recursion.Recursion2;

//Q7. Print all the subsequences of a string.

public class Subsequences { //Time complexity - O(2^n)

  public static void printSubseq(String str, int idx, String res) {
    if (idx == str.length()) {
      System.out.println(res);
      return;
    }
    //choose
    printSubseq(str, idx + 1, res + str.charAt(idx));
    //don't choose
    printSubseq(str, idx + 1, res);
  }

  public static void main(String args[]) {
    String str1 = "abc";
    String str2 = "aaa";
    printSubseq(str1, 0, "");
  }
}
