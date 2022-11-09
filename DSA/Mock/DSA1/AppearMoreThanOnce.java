package DSA.Mock.DSA1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AppearMoreThanOnce {

  public static void printRepating(int arr[], int size) {
    Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    for (int i = 0; i < size; i++) {
      try {
        map.put(arr[i], map.get(arr[i]) + 1);
      } catch (Exception e) {
        map.put(arr[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() > 1) {
        System.out.print(e.getKey() + " ");
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
    int size = arr.length;
    printRepating(arr, size);
  }
}
