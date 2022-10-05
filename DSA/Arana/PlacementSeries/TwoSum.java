package DSA.Arana.PlacementSeries;

import java.util.HashMap;

public class TwoSum {

  public static int[] bruteForce(int arr[], int size, int target) {
    int[] newarr = new int[2];
    for (int i = 0; i < size - 1; i++) {
      for (int j = 1; j < size; j++) {
        if (arr[i] + arr[j] == target) {
          newarr[1] = i;
          newarr[0] = j;
        }
      }
    }
    return newarr;
  }

  public static int[] twoSum(int arr[], int size, int target) {
    int newArr[] = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      if (map.containsKey(target - arr[i])) {
        newArr[1] = i;
        newArr[0] = map.get(target - arr[i]);
        return newArr;
      }
      map.put(arr[i], i);
    }
    return newArr;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 6, 5, 8, 11 };
    int size = arr.length;
    int target = 14;
    int result[] = bruteForce(arr, size, target);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
