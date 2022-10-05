package DSA.Playground.Hashing;

public class FrequnceOfArray {

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int swop = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = swop;
        }
      }
    }
    printArr(arr);
  }

  public static void selectionSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      int swop = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = swop;
    }
    printArr(arr);
  }

  public static void inserctionSort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    printArr(arr);
  }

  public static void main(String[] args) {
    int arr[] = { 10, 1, 2, 3, 3, 2, 1, 4, 5, 6, 7, 8, 9, 4, 6, 5, 5, 2, 5, 6 };
    int size = arr.length;
    bubbleSort(arr, size);
    //        selectionSort(arr, size);
    //        inserctionSort(arr, size);

  }
}
