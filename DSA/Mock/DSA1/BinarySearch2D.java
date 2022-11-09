package DSA.Mock.DSA1;

import java.util.Arrays;

public class BinarySearch2D {

  static int[] findAns(int[][] arr, int target) {
    int r = 0;
    int c = arr[r].length - 1;
    while (r < arr.length && c >= 0) {
      if (arr[r][c] == target) {
        return new int[] { r, c };
      }
      // Target lies in further row
      if (arr[r][c] < target) {
        r++;
      }
      // Target lies in previous column
      else {
        c--;
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    // Binary search in sorted matrix
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    int[] ans = findAns(arr, 12);
    System.out.println("Element found at index: " + Arrays.toString(ans));
  }
}
