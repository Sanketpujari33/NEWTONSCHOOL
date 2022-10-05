package DSA.Playground.Sorting.InsertionSort;

public class Insertionsorting {

  public static void printArrays(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 7, 8, 3, 1, 2 };
    int size = arr.length;

    //Insertion sort;
    for (int i = 1; i < size; i++) {
      int current = arr[i];

      int j = i - 1;

      while (i >= 0 && current < arr[j]) {
        arr[j + 1] = arr[j];

        j--;
      }
      arr[j + 1] = current;
    }
    printArrays(arr);
  }
}
