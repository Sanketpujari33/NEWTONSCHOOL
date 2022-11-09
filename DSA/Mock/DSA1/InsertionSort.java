package DSA.Mock.DSA1;

public class InsertionSort {

  public static void insertionSort(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      int insert = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > insert) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = insert;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 8, 5, 6, 3, 2, 1, 4, 7, 9, 0, 10 };
    insertionSort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
