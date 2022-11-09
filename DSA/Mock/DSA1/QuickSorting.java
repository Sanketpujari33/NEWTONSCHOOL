package DSA.Mock.DSA1;

public class QuickSorting {

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        int Temp = arr[i];
        arr[i] = arr[j];
        arr[j] = Temp;
      }
    }
    i++;
    int Temp = arr[i];
    arr[i] = arr[high];
    arr[high] = Temp;
    return i;
  }

  public static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 41, 6, 4, 8, 1, 21, 26, 41, 3, 74, 65 };
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
