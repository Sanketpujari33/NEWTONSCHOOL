package DSA.Mock.DSA2;

public class ReveseString {

  public static void reveseString(String Str) {
    char[] Chars = Str.toCharArray();
    for (int i = Chars.length - 1; i >= 0; i--) {
      System.out.print(Chars[i]);
    }
  }

  public static void main(String[] args) {
    String str = "Sanket";
    System.out.println(str);
    reveseString(str);
  }
}
