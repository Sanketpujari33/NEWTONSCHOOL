package DSA.Playground.Hashing;

import java.util.HashMap;

public class CounPairs {

  public static int countPairs(int arr[], int size, int target) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      int arrj = target - arr[i];
      int freqarrj = map.getOrDefault(arrj, 0);
      count += freqarrj;
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 6, 4, 8, 1, 2, 3, 9, 7, 10 };
    int size = arr.length;
    int target = 15;
    int result = countPairs(arr, size, target);
  }
}
