package DSA.Mock.DSA1;

import java.util.HashSet;

public class MaxCountSizedSubarrWithSum { // Function to find size of the largest

  // subset of subarrays having given sum
  // and size of each subarray is distinct
  static int maxSubsetSize(int arr[], int N, int K) {
    // Stores starting index
    // of the current window
    int ptr = 0;
    // Stores distinct subarray
    // sizes of the subset
    HashSet<Integer> s = new HashSet<Integer>();
    // Stores the sum of
    // current window
    int curSum = 0;
    // Loop to traverse over array
    for (int i = 0; i < N; i++) {
      // Update current window sum
      curSum += arr[i];
      // If sum is less that K
      if (curSum < K) {
        continue;
      }
      // If sum is more than K
      if (curSum > K) {
        // Decrease window size
        while (curSum > K) {
          curSum -= arr[ptr++];
        }
      }
      if (curSum == K) {
        // Insert size of the
        // current window
        s.add(i - ptr + 1);
        int t = ptr;
        // Iterate over all windows
        // with same sum
        while (arr[t] == 0) {
          s.add(i - t);
          t++;
        }
      }
    }
    // Return Answer
    return s.size();
  }

  // Driver Code
  public static void main(String args[]) {
    int arr[] = { 0, 1, 1, 0 };
    int N = arr.length;
    int K = 2;

    System.out.println(maxSubsetSize(arr, N, K));
  }
}
