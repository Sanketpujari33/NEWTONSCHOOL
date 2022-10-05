package DSA.Playground.Sorting.InsertionSort;

public class insertionSortingMI {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void insertionSorting(int arr[], int size) {
    for (int i = 1; i < size; i++) {
      int current = arr[i];

      int j = i - 1;
      while (j >= 0 && arr[j] < current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    printArray(arr);
  }

  public static void selectionsorting(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[smallest] < arr[j]) {
          smallest = j;
        }
      }
      int Temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = Temp;
    }
    printArray(arr);
  }

  public static void bubbleSorting(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j + 1] > arr[j]) {
          int Temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = Temp;
        }
      }
    }
    printArray(arr);
  }

  public static void main(String[] args) {
    int arr[] = { 9, 5, 7, -3, -1, 4, 6, 1, 3, 8, 2 - 4, -10 };
    int size = arr.length;
    insertionSorting(arr, size);
    selectionsorting(arr, size);
    bubbleSorting(arr, size);
  }
}
