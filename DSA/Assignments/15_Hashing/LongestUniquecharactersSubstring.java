import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class LongestUniquecharactersSubstring {

  public static void main(String[] args) {
    int max = 0;
    String str = "";
    Scanner s = new Scanner(System.in);
    String s1 = s.nextLine();
    Hashtable<Character, Integer> ht1 = new Hashtable<>();
    for (int i = 0; i < s1.length(); i++) {
      for (int j = i; j < s1.length(); j++) {
        if (ht1.containsKey(s1.charAt(j))) break; else {
          //if(!Character.isWhitespace(s1.charAt(j)))
          //{
          ht1.put(s1.charAt(j), 1);
          str = s1.substring(i, j + 1);
          if (str.length() > max) max = str.length();
          //}

        }
      }
      ht1.clear();
    }
    System.out.print(max);
  }
}
