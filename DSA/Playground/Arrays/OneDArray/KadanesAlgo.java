package DSA.Playground.Arrays.OneDArray;

public class KadanesAlgo {

  public static int subArraySum(int arr[], int size) {
    int maxSum = 0;
    int currSum = 0;
    for (int i = 0; i < size; i++) {
      currSum = currSum + arr[i];
      if (currSum > maxSum) {
        maxSum = currSum;
      } else if (currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { -5, -6, -3, -7, -1, -6, -2 };
    int size = arr.length;
    int result = subArraySum(arr, size);
    System.out.println(result);
  }
}
