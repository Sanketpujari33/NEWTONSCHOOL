package DSA.Playground.Arrays.OneDArray;

import java.util.Arrays;

public class FrequnceOfArray {

  public static void main(String[] args) {
    int arr[] = { 10, 1, 2, 3, 3, 2, 1, 4, 5, 6, 7, 8, 9, 4, 6, 5, 5, 2, 5, 6 };
    int size = arr.length;

    int visitedArr[] = new int[size];
    int visiter = -1;
    for (int i = 0; i < size; i++) {
      int count = 1;
      for (int j = i + 1; j < size; j++) {
        if (arr[i] == arr[j]) {
          count++;
          visitedArr[j] = visiter;
        }
      }
      if (visitedArr[i] != visiter) {
        visitedArr[i] = count;
      }
    }
    for (int i = 0; i < visitedArr.length; i++) {
      if (visitedArr[i] != visiter) {
        System.out.println(arr[i] + "-:-" + visitedArr[i]);
      }
    }
  }
}
