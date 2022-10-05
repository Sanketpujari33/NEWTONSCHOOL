package DSA.Playground.Sorting.bubbleSort;

public class BubblesortDeccrement {

  public static void printArray(int Arr[]) {
    for (int i = 0; i < Arr.length; i++) {
      System.out.print(Arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int Temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = Temp;
        }
      }
    }
    printArray(arr);
  }

  public static void main(String[] args) {
    int Arr[] = { 5, 9, 7, 6, 8, 4, 2, 3, 1 };
    int size = Arr.length;
    bubbleSort(Arr, size);
  }
}
