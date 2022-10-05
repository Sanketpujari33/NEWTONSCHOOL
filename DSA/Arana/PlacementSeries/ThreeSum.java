package DSA.Arana.PlacementSeries;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

  public static void bruteForce(int arr[], int size, int targrt) {
    int j = 0, k = size - 1;
    for (int i = 0; i < size - 2; i++) {
      while (j <= k) {
        if (arr[i] + arr[j] + arr[k] == targrt) {
          System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
        }
        if (arr[i] + arr[j] + arr[k] < targrt) {
          k--;
        } else {
          j++;
        }
      }
    }
  }

  public static void bruteForce2(int arr[], int size, int target) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size - 1; j++) {
        for (int k = j + 1; k < size - 1; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            System.out.print("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
          }
        }
      }
    }
  }

  public static List<List<Integer>> threeSum(int arr[]) {
    Arrays.sort(arr);
    List<List<Integer>> res = new LinkedList<>();
    for (int i = 0; i < arr.length - 2; i++) {
      if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
        int lo = i + 1, hi = arr.length - 1, sum = 0 - arr[i];
        while (lo < hi) {
          if (arr[lo] + arr[hi] == sum) {
            res.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
            while (lo < hi && arr[lo] == arr[lo + 1]) lo++;
            while (lo < hi && arr[hi] == arr[hi - 1]) hi--;
            lo++;
            hi--;
          } else if (arr[lo] + arr[hi] < sum) lo++; else hi--;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { -1, 0, 1, 2, -1, -4 };
    int size = arr.length;
    int target = 0;
    System.out.println(threeSum(arr));
  }
}
