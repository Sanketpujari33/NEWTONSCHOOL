package DSA.Java.HashMap.RollingHash;

public class Rooling_Of_Hash {

  public static final int d = 256;

  public static void main(String[] args) {
    String text = "aabaabaadaabaaabaa";
    String pat = "aaba";
    int q = 101;
    search(pat, text, q);
  }

  private static void search(String pat, String text, int q) {
    int m = pat.length();
    int n = text.length();

    int i, j;
    // hash value of pattern
    int p = 0;
    // hash value of text
    int t = 0;
    int h = 1;

    //h-> pow(d,m-1)%q
    for (i = 0; i < m - 1; i++) {
      h = (h * d) % q;
    }
    //claculate the hash value of pattern
    //and first window of text
    for (i = 0; i < m; i++) {
      p = (d * p + pat.charAt(i)) % q;
      t = (d * t + text.charAt(i)) % q;
    }
    //slide the pattern over the text window by window
    for (i = 0; i <= n - m; i++) {
      //check the value of crrect window of text and pattern.

      if (p == t) {
        for (j = 0; j < m; j++) {
          if (text.charAt(i + j) != pat.charAt(j)) {
            break;
          }
        }
        if (j == m) {
          System.out.println(i);
        }
      }
      //calculate hash value of text window of text.
      //remove the first digit and add another at the end

      if (i < n - m) {
        t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) & q;
        //if we nageative value, convert to positive
        if (t < 0) {
          t = (t + q);
        }
      }
    }
  }
}
