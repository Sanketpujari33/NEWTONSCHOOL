package DSA.DSAMock.DSA1;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatingElem {

  public static int findNonRepeating(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      int j;
      for (j = 0; j < size; j++) if (i != j && arr[i] == arr[j]) break;
      if (j == size) return arr[i];
    }
    return -1;
  }

  public static void find(int arr[], int size) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> x : map.entrySet()) if (x.getValue() > 1) {
      System.out.print(x.getKey() + " ");
    }
    //            return arr[i];
    //    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 9, 4, 9, 6, 7, 4 };
    int n = arr.length;
    find(arr, n);
  }
}
