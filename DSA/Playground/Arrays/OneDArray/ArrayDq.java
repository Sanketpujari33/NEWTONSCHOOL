package DSA.Playground.Arrays.OneDArray;

public class ArrayDq {

  public static void main(String[] args) {
    int arr[] = { -7, 6, 13, 9, 14, 2 };
    int k = 2;
    int ans = 0;
    for (int i = 0; i < arr.length - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += arr[j];
      }
      if (sum > ans) {
        ans = sum;
      }
    }
    System.out.println(ans);
  }
}
