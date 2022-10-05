package DSA.DSAMock.DSA1;

import java.util.HashMap;

public class TowSum {

  public static int[] twoSum(int arr[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int pairArr[] = new int[2];
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(target - arr[i])) {
        map.put(arr[i], i);
      } else {
        pairArr[1] = i;
        pairArr[0] = map.get(target - arr[i]);
        return pairArr;
      }
    }
    return pairArr;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 4, 5, 1, 6, 2, 3, 9, 8, 10, 7 };
    int target = 18;
    int result[] = twoSum(arr, target);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
