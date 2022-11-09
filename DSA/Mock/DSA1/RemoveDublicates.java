package DSA.Mock.DSA1;

import java.util.HashMap;
import java.util.Map;

public class RemoveDublicates {

  public static void remveDublication(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) { //Time Complexity -> O(N)
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); //Space Complexity -> O(N)
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.print(entry.getKey() + " ");
    }

    // This we can also traverse through map but only keys are accessible
    for (int val : map.keySet()) {
      System.out.print(val + " ");
    }
  }

  public static int removeDublicates(int arr[], int size) {
    int j = 0;
    if (size == 0 || size == 1) {
      return size;
    }
    for (int i = 0; i < size - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }
    arr[j++] = arr[size - 1];
    return j;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 4, 5, 8, 1, 4, 1, 2, 3, 1 };
    //        removeDublicates(arr);
    remveDublication(arr);
  }
}
