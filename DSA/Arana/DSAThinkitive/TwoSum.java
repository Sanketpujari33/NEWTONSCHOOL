package DSA.Arana.DSAThinkitive;

import java.util.Arrays;

//        x (aka Two Sum)
//        Write a program that, given an array A[] of n numbers and another number x,
//        determines whether or not there exist two elements in A[] whose sum is exactly x.
//Input: arr[] = {0, -1, 2, -3, 1}
//        x= -2
//        Output: Pair with a given sum -2 is (-3, 1)
//        Valid pair exists
//        Explanation:  If we calculate the sum of the output,1 + (-3) = -2
//
//        Input: arr[] = {1, -2, 1, 0, 5}
//        x = 0
public class TwoSum {

  static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
    int l, r;
    Arrays.sort(A);
    l = 0;
    r = arr_size - 1;
    while (l < r) {
      if (A[l] + A[r] == sum) return true; else if (
        A[l] + A[r] < sum
      ) l++; else r--; // A[i] + A[j] > sum
    }
    return false;
  }

  public static void main(String args[]) {
    int A[] = { 1, 4, 45, 6, 10, -8 };
    int n = 16;
    int arr_size = A.length;
    if (hasArrayTwoCandidates(A, arr_size, n)) System.out.println(
      "Array has two " + "elements with given sum"
    ); else System.out.println(
      "Array doesn't have " + "two elements with given sum"
    );
  }
}
