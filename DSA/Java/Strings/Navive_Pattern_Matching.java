package DSA.Java.Strings;

public class Navive_Pattern_Matching {

  public static void search(String text, String pat) {
    int m = text.length();
    int n = pat.length();

    //A Loop to slide over the text one by one
    for (int i = 0; i < m - n; i++) {
      int j;

      //Iterating over the pattern
      for (j = 0; j < n; j++) {
        if (text.charAt(i + j) != pat.charAt(j)) {
          break;
        }
      }
      if (j == n) {
        System.out.println("Index of pattern:- " + i + " " + pat);
      }
    }
  }

  public static void main(String[] args) {
    //Time complexity
    //O(n*(m - n +1))
    String text = "aabaabaadaabaaabaa";
    String pat = "aaba";
    System.out.println(text);
    search(text, pat);
  }
}
