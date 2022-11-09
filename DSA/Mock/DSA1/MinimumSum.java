package DSA.Mock.DSA1;

import java.util.Arrays;

public class MinimumSum {

  public int minimumSum(int num) {
    int size = 4;
    int digits[] = new int[size];
    int i = 0;
    while (i < size) {
      digits[i] = num % 10;
      num /= 10;
      i++;
    }
    Arrays.sort(digits);
    return digits[0] * 10 + digits[3] + digits[1] * 10 + digits[2];
  }

  public static void main(String[] args) {
    int num = 4009;
    MinimumSum s = new MinimumSum();
    System.out.print(s.minimumSum(num));
  }
}
