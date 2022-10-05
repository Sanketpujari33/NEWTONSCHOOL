package DSA.Playground.Sorting.InsertionSort;

public class IS {

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    printArray(arr);
  }

  public static void main(String[] args) {
    int arr[] = { 9, 8, 5, 6, 1, 4, 3, 7, 2 };
    int size = arr.length;
    insertionSort(arr, size);
  }
}
