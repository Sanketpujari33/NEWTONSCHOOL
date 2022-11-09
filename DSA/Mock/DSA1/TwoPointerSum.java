package DSA.Mock.DSA1;

public class TwoPointerSum {

  public static int[] sum(int arr[], int size, int target) {
    int start = 0;
    int end = size - 1;
    int result[] = new int[2];
    while (start < end) {
      int sum = arr[start] + arr[end];
      if (sum == target) {
        result[0] = start + 1;
        result[1] = end + 1;
        break;
      } else if (sum < target) start++; else end--;
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 5, 1, 3, 2 };
    int size = arr.length;
    int target = 3;
    int[] result = sum(arr, size, target);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
