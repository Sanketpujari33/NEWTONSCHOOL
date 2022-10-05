package DSA.Playground.Searching.InterPolationSearch.Binnary;

import java.util.Scanner;

public class bhikjh {

  public static void reversing(int arr[]) {
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int Temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = Temp;
        }
      }
    }
  }

  public static void oldAndEven(int arr[]) {
    reversing(arr);
    int even = 0;
    int odd = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        even = (even + arr[i]);
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] % 2 == 0) odd = (arr[j] * odd);
    }
    System.out.println(even + " " + odd);
  }

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    oldAndEven(arr);
  }
}
