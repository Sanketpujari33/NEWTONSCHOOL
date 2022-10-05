package DSA.Playground.Arrays.OneDArray;

import java.util.Scanner;

//        10
//        1 2 3 2 4 3 6 6 7 6
public class Donation {

  public static void equalDonation(int arr[], int size) {
    int start = arr[0];
    long sum = 0;
    int arrNew[] = new int[size];
    for (int i = 0; i < size; i++) {
      sum += arr[i];
      if (arr[i] > start) {
        arrNew[i] = 0;
        start = arr[i];
      } else {
        arrNew[i] = start - arr[i];
        sum += arrNew[i];
      }
    }
    for (int i = 0; i < size; i++) {
      System.out.print(arrNew[i] + " ");
    }
    System.out.println("\n" + sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    equalDonation(arr, size);
  }
}
