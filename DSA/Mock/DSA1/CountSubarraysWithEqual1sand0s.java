package DSA.Mock.DSA1;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithEqual1sand0s {

  static int countSubarrWithEqualZeroAndOnes(int[] arr, int n) {
    Map<Integer, Integer> myMap = new HashMap<>();
    int sum = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) arr[i] = -1;
      sum += arr[i];
      if (sum == 0) count++;
      if (myMap.containsKey(sum)) count += myMap.get(sum);
      if (!myMap.containsKey(sum)) myMap.put(sum, 1); else myMap.put(
        sum,
        myMap.get(sum) + 1
      );
    }
    return count;
  }

  static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
    Map<Integer, Integer> um = new HashMap<>();
    int curr_sum = 0;
    for (int i = 0; i < n; i++) {
      curr_sum += (arr[i] == 0) ? -1 : arr[i];
      um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);
    }
    int count = 0;
    for (Map.Entry<Integer, Integer> itr : um.entrySet()) {
      if (itr.getValue() > 1) count +=
        ((itr.getValue() * (itr.getValue() - 1)) / 2);
    }
    if (um.containsKey(0)) count += um.get(0);
    return count;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
    int n = arr.length;
    System.out.println("Count = " + countSubarrWithEqualZeroAndOne(arr, n));
  }
}
