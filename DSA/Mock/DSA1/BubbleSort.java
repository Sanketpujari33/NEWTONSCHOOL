package DSA.DSAMock.DSA1;

public class BubbleSort {

  public static void bubbleSort(int[] arr, int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 8, 5, 6, 3, 2, 1, 4, 7, 9, 0, 10 };
    bubbleSort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
