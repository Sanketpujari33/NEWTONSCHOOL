package DSA.Mock.DSA1;

public class ReverseNumber {

  public static long reverse(int num) {
    boolean isNegative = num < 0;
    if (isNegative) {
      num *= -1;
    }
    long reverse = 0;
    int lastDigit;
    while (num > 0) {
      lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num = num / 10;
    }
    return isNegative ? reverse * -1 : reverse;
  }

  public static void main(String[] args) {
    int number = -1234;
    System.out.println(reverse(number));
  }
}
