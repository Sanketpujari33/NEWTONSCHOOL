package DSA.Playground.Sorting.QuikSort;

public class QSorting {

  public static void swap(int arr[], int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static int partition(int arr[], int low, int high) {
    int i = (low - 1);
    int pivot = arr[high];
    for (int j = low; j <= high - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return (i + 1);
  }

  static void quckSorting(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quckSorting(arr, low, pi - 1);
      quckSorting(arr, pi + 1, high);
    }
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 8, 3, 1, 9, 7, 2, 5, 10 };
    int size = arr.length;
    quckSorting(arr, 0, size - 1);
    printArray(arr);
  }
}
