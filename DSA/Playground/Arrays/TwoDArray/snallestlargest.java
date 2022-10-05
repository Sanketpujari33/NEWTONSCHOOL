package DSA.Playground.Arrays.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class snallestlargest {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    long temp = sc.nextInt();
    int N = sc.nextInt();
    long arr[] = new long[N];
    while (temp > 0) {
      for (int i = 0; i < N; i++) {
        arr[i] = sc.nextLong();
      }
      Arrays.sort(arr);
      for (int j = 0; j < N; j++) {
        System.out.print(arr[j] + " ");
      }
      temp--;
    }
  }
}
