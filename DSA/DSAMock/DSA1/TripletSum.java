package DSA.DSAMock.DSA1;

import java.util.HashSet;

public class TripletSum {

  public static boolean ripletSum(int arr[], int size, int sum) {
    for (int i = 0; i < size - 2; i++) {
      HashSet<Integer> set = new HashSet<>();
      int curr_sum = sum - arr[i];
      for (int j = i + 1; j < size; j++) {
        if (set.contains(curr_sum - arr[j])) {
          System.out.printf(
            "triplet is %d, %d, %d",
            arr[i],
            arr[j],
            curr_sum - arr[j]
          );
          return true;
        }
        set.add(arr[j]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 45, 6, 10, 8 };
    int size = arr.length;
    int sum = 22;
    ripletSum(arr, size, sum);
  }
}
