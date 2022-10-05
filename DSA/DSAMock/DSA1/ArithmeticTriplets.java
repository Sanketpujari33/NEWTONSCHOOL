package DSA.DSAMock.DSA1;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {

  public int arithmeticTriplets(int[] nums, int diff) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int ans = 0;
    for (int num : nums) {
      if ((set.contains(num + diff) && set.contains(num + 2 * diff))) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    ArithmeticTriplets l = new ArithmeticTriplets();
    int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
    int x = 3;
    System.out.println(l.arithmeticTriplets(arr, x));
  }
}
