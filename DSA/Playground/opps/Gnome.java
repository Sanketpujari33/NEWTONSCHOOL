package DSA.Playground.opps;

import java.util.Arrays;
import java.util.Scanner;

public class Gnome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();
    while (temp > 0) {
      int Size = sc.nextInt();
      long arr[] = new long[Size];
      for (int i = 0; i < Size; i++) {
        arr[i] = sc.nextLong();
      }
      Arrays.sort(arr);
      System.out.println(arr[Size - 2] + " ");
      temp--;
    }
  }
}
