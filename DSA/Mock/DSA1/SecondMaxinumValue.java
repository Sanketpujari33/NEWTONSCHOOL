package DSA.Mock.DSA1;

public class SecondMaxinumValue {

  public static int secondMax(int arr[], int size) {
    int max = Integer.MIN_VALUE;
    int secodMax = Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
      if (arr[i] > max) {
        secodMax = max;
        max = arr[i];
      }
      if (arr[i] > secodMax && arr[i] != max) {
        secodMax = arr[i];
      }
    }
    return secodMax;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 6, 1, 8, 7, 4, 12, 62 };
    int size = arr.length;
    System.out.print(secondMax(arr, size));
  }
}
