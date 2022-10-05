package DSA.Java.Sorting.BubbleSorting;

public class BubbleSortingRecursive {

  public static void bubbleRecursive(int arr[], int size) {
    int count = 0;
    if (size == 1) {
      return;
    }
    for (int i = 0; i < size - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        count++;
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
      bubbleRecursive(arr, size - 1);
    }
  }

  public static void arrayPrint(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 9, 6, 7, 3, 1, 5, 2, 4, 8, 10 };
    int size = arr.length;
    bubbleRecursive(arr, size);
    arrayPrint(arr);
  }
}
