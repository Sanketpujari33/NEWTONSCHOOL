package DSA.Arana.DSAThinkitive;

//Given an array of both positive and negative integers, the task is to compute
//        sum of minimum and maximum elements of all sub-array of size k.
//        Examples:
//
//
//        Input : arr[] = {2, 5, -1, 7, -3, -1, -2}
//        K = 4
//        Output : 18
//        Explanation : Subarrays of size 4 are :
//        {2, 5, -1, 7},   min + max = -1 + 7 = 6
//        {5, -1, 7, -3},  min + max = -3 + 7 = 4
//        {-1, 7, -3, -1}, min + max = -3 + 7 = 4
//        {7, -3, -1, -2}, min + max = -3 + 7 = 4
//        Sum of all min & max = 6 + 4 + 4 + 4
//        = 18

// Java program to find sum of all minimum and maximum
// elements Of Sub-array Size k.
//O(n)
import java.util.Deque;
import java.util.LinkedList;

public class SumOfminimumAndMaximum {

  public static int SumOfKsubArray(int arr[], int k) {
    int sum = 0; // Initialize result
    Deque<Integer> S = new LinkedList<>(), G = new LinkedList<>();
    int i = 0;
    for (i = 0; i < k; i++) {
      while (!S.isEmpty() && arr[S.peekLast()] >= arr[i]) S.removeLast();
      while (!G.isEmpty() && arr[G.peekLast()] <= arr[i]) G.removeLast();
      G.addLast(i);
      S.addLast(i);
    }
    for (; i < arr.length; i++) {
      sum += arr[S.peekFirst()] + arr[G.peekFirst()];
      while (!S.isEmpty() && S.peekFirst() <= i - k) S.removeFirst();
      while (!G.isEmpty() && G.peekFirst() <= i - k) G.removeFirst();
      while (!S.isEmpty() && arr[S.peekLast()] >= arr[i]) S.removeLast();
      while (!G.isEmpty() && arr[G.peekLast()] <= arr[i]) G.removeLast();
      G.addLast(i);
      S.addLast(i);
    }
    sum += arr[S.peekFirst()] + arr[G.peekFirst()];
    return sum;
  }

  public static void main(String args[]) {
    int arr[] = { 2, 5, -1, 7, -3, -1, -2 };
    int k = 3;
    System.out.println(SumOfKsubArray(arr, k));
  }
}
