package DSA.Arana.DSAThinkitive;

//Example: Let the input string be “i like this program very much”.
//        The function should change the string to “much very program this like i”
//        Input: s = “geeks quiz practice code”
//        Output: s = “code practice quiz geeks”
//
//        Input: s = “getting good at coding needs a lot of practice”
//        Output: s = “practice of lot a needs coding at good getting”

public class ReverseWords {

  static void reverse(char str[], int start, int end) {
    char temp;
    while (start <= end) {
      temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
  }

  static char[] reverseWords(char[] s) {
    int start = 0;
    for (int end = 0; end < s.length; end++) {
      if (s[end] == ' ') {
        reverse(s, start, end);
        start = end + 1;
      }
    }
    reverse(s, start, s.length - 1);
    reverse(s, 0, s.length - 1);
    return s;
  }

  public static void main(String[] args) {
    String s = "i like this program very much ";
    char[] p = reverseWords(s.toCharArray());
    System.out.print(p);

    ////////////////////////////////////////////////////////////////
    String ss[] = "i like this program very much".split(" ");
    String ans = "";
    for (int i = ss.length - 1; i >= 0; i--) {
      ans += ss[i] + " ";
    }
    System.out.println("Reversed String:");
    System.out.println(ans.substring(0, ans.length() - 1));
  }
}
