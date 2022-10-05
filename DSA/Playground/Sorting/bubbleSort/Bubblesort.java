package DSA.Playground.Sorting.bubbleSort;

public class Bubblesort {

  public static void bubuleSort(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      //            System.out.print(arr[i] +" ");
    }
    System.out.println("\n" + sum);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 8, 3, 5, 7, 9, 6, 4, 1 };
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    bubuleSort(arr);
  }
}
