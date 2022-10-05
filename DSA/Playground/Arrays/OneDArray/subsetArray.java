package DSA.Playground.Arrays.OneDArray;

import java.util.Arrays;

public class subsetArray {

  public static void getSortedArrays(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubuleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    getSortedArrays(arr);
  }

  public static void duplicateElementremove(int arr[], int size) {
    if (size == 0 || size == 1) {
      System.out.println(size);
      return;
    }
    int temp[] = new int[size];
    int j = 0;
    for (int i = 0; i < size - 1; i++) if (arr[i] != arr[i + 1]) temp[j++] =
      arr[i];
    temp[j++] = arr[size - 1];
    for (int i = 0; i < j; i++) arr[i] = temp[i];
    System.out.println("\nthis are remove Duplicates in this Array input");
    for (int i = 0; i < j; i++) System.out.print(arr[i] + " ");
    return;
  }

  public static void findLast2Element(int arr[], int size) {
    if (size < 2) {
      System.out.println("invled Input");
      return;
    }
    Arrays.sort(arr);
    for (int i = size - 2; i >= 0; i--) {
      if (arr[i] != arr[size - 1]) {
        System.out.println("\nThe second largest element:- " + arr[i]);
        return;
      }
    }
    System.out.println("There is no second largest element");
  }

  public static void getPairOfSum(int arr[], int size, int sum) {
    System.out.println("\nThis are Pair of sum:- " + sum);
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) if (
        arr[i] + arr[j] == sum
      ) System.out.println(arr[i] + " " + arr[j]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 8, 7, 6, 4, 7, 8, 5, 2, 1 };
    int size = arr.length;
    int sum = 13;
    System.out.println("This are sorted Arrays");
    bubuleSort(arr, size);
    System.out.println("it is givan Array");
    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
    duplicateElementremove(arr, size);
    findLast2Element(arr, size);
    getPairOfSum(arr, size, sum);
  }
}
