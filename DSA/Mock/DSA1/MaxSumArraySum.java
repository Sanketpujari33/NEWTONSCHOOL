package DSA.Mock.DSA1;

public class MaxSumArraySum {

  public static int maxSubArraySum(int arr[]) {
    int currentSum = arr[0];
    int maxSOFar = arr[0];
    for (int i = 0; i < arr.length; i++) {
      currentSum += arr[i];
      if (arr[i] > currentSum) {
        currentSum = arr[i];
      }
      if (currentSum > maxSOFar) {
        maxSOFar = currentSum;
      }
    }
    return maxSOFar;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 3, -2, 6, -12, 7, -1, 8 };
    int result = maxSubArraySum(arr);
    System.out.print(result);
  }
}
