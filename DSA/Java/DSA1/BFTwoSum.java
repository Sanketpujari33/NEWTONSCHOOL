package DSA.Java.DSA1;

import java.util.Arrays;

public class BFTwoSum {

  public static int[] towSum(int arr[], int target) {
    Arrays.sort(arr);
    int first = 0;
    int last = arr.length - 1;
    int pairArr[] = new int[2];
    while (first < last) {
      int sum = arr[first] + arr[last];
      if (sum == target) {
        pairArr[0] = arr[first];
        pairArr[1] = arr[last];
        return pairArr;
      } else if (sum < target) {
        first++;
      } else {
        last--;
      }
    }
    return pairArr;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 4, 5, 1, 6, 2, 3, 9, 8, 10, 7 };
    int target = 18;
    int result[] = towSum(arr, target);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
