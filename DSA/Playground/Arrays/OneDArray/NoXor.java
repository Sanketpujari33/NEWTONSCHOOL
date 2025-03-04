package DSA.Playground.Arrays.OneDArray;

import java.util.Scanner;

public class NoXor {

  public static void noXorsum(int[] arr, int size) {
    long sum = 0;
    for (int i = 1; i <= size; i++) {
      sum += ((size - i) ^ arr[i - 1]);
    }
    System.out.print(sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    noXorsum(arr, size);
  }
}
