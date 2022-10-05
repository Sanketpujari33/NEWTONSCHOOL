package DSA.Playground.Arrays.TwoDArray;

import java.util.Scanner;

//Sample Input:-
//        10
//        1 2 3 2 4 3 6 6 7 6
//
//        Sample Output:-
//        0 0 0 1 0 1 0 0 0 1
//        43
public class Donation {

  public static void equalDonation(int arr[], int size) {
    int start = arr[0];
    long sum = 0;
    int newarr[] = new int[size];
    for (int i = 0; i < size; i++) {
      sum += arr[i];
      if (arr[i] > start) {
        newarr[i] = 0;
        start = arr[i];
      } else newarr[i] = start - arr[i];
      sum += newarr[i];
    }
    for (int j = 0; j < size; j++) {
      System.out.print(newarr[j] + " ");
    }
    System.out.println();
    System.out.println(sum);
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
