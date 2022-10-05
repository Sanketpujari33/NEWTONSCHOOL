package DSA.Playground.Arrays.OneDArray;

//        arr = [1,0,0,1,0,0,1]
//        Sort this in O(n).
//        arr = [1,5,2,4,6]
//        output: [18, 17, 12, 10, 6]

public class BinarySort {

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void sortBinaryArray(int arr[]) {
    int n = arr.length;
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 1) {
        j++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    printArray(arr);
  }

  public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = nums[0];
    for (int i = 1; i < nums.length; i++) ans[i] = ans[i - 1] + nums[i];
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 0, 1, 0, 0, 1 };
    sortBinaryArray(arr);
  }
}
