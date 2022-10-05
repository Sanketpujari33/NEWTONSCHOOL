package DSA.Playground.Arrays.OneDArray;

import java.util.Scanner;

public class Printmissingelement {

  public static void findElement(int arr[], int N) {
    int sumOfAll = (N * (N + 1)) / 2;
    int sumOfArray = 0;
    for (int i = 0; i <= N - 2; i++) {
      sumOfArray += arr[i];
    }
    int MissingElement = sumOfAll - sumOfArray;
    System.out.println(MissingElement);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for (int i = 0; i <= N - 2; i++) {
      arr[i] = sc.nextInt();
    }
    findElement(arr, N);
  }
}
