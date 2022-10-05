package DSA.Playground.Sorting.InsertionSort;

public class InsertionSort {

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
      int curr = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > curr) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curr;
    }
    print(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 7, 8, 3, 2, 1 };
    int size = arr.length;
    insertionSort(arr, size);
  }
}
