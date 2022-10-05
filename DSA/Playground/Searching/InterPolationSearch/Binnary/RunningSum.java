package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class RunningSum {

  public static int[] runningSum(int arr[]) {
    int Temp[] = new int[arr.length];
    Temp[0] = arr[0];
    for (int i = 1; i < arr.length; i++) Temp[i] = Temp[i - 1] + arr[i];
    return Temp;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 2, 8, 6, 1, 9 };
    int ans[] = runningSum(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
