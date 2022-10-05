package DSA.Playground.Sorting.bubbleSort;

public class BubbleSortIT {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubuleSZort(int[] arr, int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int Temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = Temp;
        }
      }
    }
    printArray(arr);
  }

  public static void main(String[] args) {
    int arr[] = { 5, 8, 4, 6, 3, 2, 1 };
    int size = arr.length;
    bubuleSZort(arr, size);
  }
}
