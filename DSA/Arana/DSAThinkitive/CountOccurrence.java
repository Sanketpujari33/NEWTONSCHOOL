package DSA.Arana.DSAThinkitive;

//Given a string and a character, the task is to make a function which count occurrence of
//        the given character in the string.
//        Examples:
//        Input : str = "geeksforgeeks"
//        c = 'e'
//        Output : 4
//        'e' appears four times in str.
//        Input : str = "abccdefgaa"
//        c = 'a'
//        Output : 3
//        'a' appears three times in str.

public class CountOccurrence {

  static int countinString(char ch, String s) {
    if (s.length() == 0) return 0;
    int count = 0;
    if (s.charAt(0) == ch) count++;
    count += countinString(ch, s.substring(1));
    return count;
  }

  public static int count(String s, char c) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) res++;
    }
    return res;
  }

  public static void main(String args[]) {
    String str = "geeksforgeeks";
    char c = 'e';
    System.out.println(countinString(c, str));

    System.out.println(count(str, c));
  }
}
