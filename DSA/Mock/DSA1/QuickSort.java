package DSA.Mock.DSA1;

public class QuickSort {

  public static void sort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      sort(arr, low, pi - 1);
      sort(arr, pi + 1, high);
    }
  }

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low;
    int j = low;
    while (i <= high) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
      i++;
    }
    return j - 1;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 2, 1, 0, 9, 6, 3, 7, 4, 10, 8 };
    sort(arr, 0, arr.length - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
