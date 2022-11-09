package DSA.Mock.DSA1;

public class SumFirstThreePositiveNum {

  public static int sum(int arr[], int size) {
    int count = 0;
    int sum = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] > 0) {
        sum += arr[i];
        count++;
        if (count == 3) return sum;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int arr[] = { -1, -5, 6, -5, 2, -5, 1, -5, 6, 9, 6, 4, 5 };
    int re = sum(arr, arr.length);
    System.out.println(re);
  }
}
