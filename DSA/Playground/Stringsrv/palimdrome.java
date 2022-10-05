package DSA.Playground.Stringsrv;

import java.util.Locale;

public class palimdrome {

  public static boolean isPalimdrome(String str) {
    int i = 0;
    int j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "SANKETTEKNAS";
    str = str.toLowerCase();
    if (isPalimdrome(str)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
