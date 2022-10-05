package DSA.Java.DSA1;

public class IsPalindromeNumber {

  public static boolean isPalindrome(int num) {
    int revers = 0;
    while (num != 0) {
      int remander = num % 10;
      revers = revers * 10 + remander;
      num = num / 10;
    }
    return num == revers;
  }

  public static void main(String[] args) {
    int num = 123;
    if (isPalindrome(num)) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}
