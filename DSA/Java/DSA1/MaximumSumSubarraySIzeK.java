package DSA.Java.DSA1;

public class MaximumSumSubarraySIzeK {

  public static int maxSubarrSum(int arr[], int k) {
    int maxSum = 0;
    int windMax = 0;
    int start = 0;
    for (int end = 0; end < arr.length; end++) {
      windMax += arr[end];
      if (end >= k - 1) {
        maxSum = Math.max(maxSum, windMax);
        windMax -= arr[start];
        start++;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 7, 3, 5, 8, 1 };
    int k = 3;
    System.out.println(maxSubarrSum(arr, k));
  }
}
