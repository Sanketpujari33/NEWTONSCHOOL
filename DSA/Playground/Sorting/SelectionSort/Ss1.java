package DSA.Playground.Sorting.SelectionSort;

public class Ss1 {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void selectionSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int Temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = Temp;
    }
    printArray(arr);
  }

  public static void main(String[] args) {
    int arr[] = { 9, 8, 5, 6, 1, 4, 3, 7, 2 };
    int size = arr.length;
    selectionSort(arr, size);
  }
}
