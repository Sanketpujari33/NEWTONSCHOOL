package DSA.Playground.Arrays.SaiindingWind;

public class maximumSum {

  static int maxSum(int arr[], int N, int K) {
    int Maxsum = Integer.MAX_VALUE;
    for (int i = 0; i < N - K + 1; i++) {
      int currentSum = 0;
      for (int j = 0; j < K; j++) currentSum = currentSum + arr[i + j];
      Maxsum = Math.max(currentSum, Maxsum);
    }
    return Maxsum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
    int N = arr.length;
    int K = 0;
    System.out.println(maxSum(arr, N, K));
  }
}
